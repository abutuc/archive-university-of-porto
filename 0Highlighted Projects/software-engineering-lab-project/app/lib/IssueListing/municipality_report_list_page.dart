import 'package:firebase_auth/firebase_auth.dart';
import 'package:flutter/material.dart';
import 'package:go_router/go_router.dart';
import 'package:tapa_buracos/API/api_config.dart';
import 'package:tapa_buracos/Customs/custom_app_bar.dart';
import 'package:tapa_buracos/Customs/custom_bottom_bar.dart';
import 'package:tapa_buracos/IssueDetails/issue_details_widget.dart';
import 'package:tapa_buracos/Models/issue_model.dart';

import 'package:tapa_buracos/Models/municipality_model.dart';

class MunicipalityReportListPage extends StatefulWidget {
  const MunicipalityReportListPage({super.key});

  @override
  State<MunicipalityReportListPage> createState() =>
      _MunicipalityReportListPageState();
}

class _MunicipalityReportListPageState
    extends State<MunicipalityReportListPage> {
  List<Issue> _issues = [];
  bool _isLoading = false;
  String _searchQuery = "";
  int? _priorityFilter; // Default to all priorities (null)
  int? _typeFilter; // Default to all statuses (null)
  bool _sortNewest = true; // Sort newest by default

  int _currentPage = 1;
  int _totalPages = 1;
  bool _isFetchingMore = false; // To prevent duplicate fetches

  late ScrollController _scrollController;

  @override
  void initState() {
    super.initState();
    _scrollController = ScrollController();
    _scrollController.addListener(_onScroll);
    _fetchMunicipalityIssues();
  }

  void _onScroll() {
    if (_scrollController.position.pixels >=
            _scrollController.position.maxScrollExtent &&
        !_isFetchingMore) {
      _fetchMunicipalityIssues(loadMore: true);
    }
  }

  @override
  void dispose() {
    _scrollController.dispose();
    super.dispose();
  }

  Future<void> _fetchMunicipalityIssues({bool loadMore = false}) async {
    if (_isFetchingMore) return;

    if (loadMore) {
      if (_currentPage >= _totalPages) return; // No more pages to load
      _currentPage++;
    } else {
      _currentPage = 1;
      _issues = []; // Reset issues list if not loading more
    }

    if (mounted) {
      setState(() {
        _isFetchingMore = true;
        if (!loadMore) _isLoading = true; // Show loader for initial fetch
      });
    }

    try {
      final user = FirebaseAuth.instance.currentUser;
      if (user == null) {
        throw Exception("Nenhum utilizador autenticado");
      }

      // Step 1: Fetch municipality postal codes
      final municipalityId = user.uid; // Replace with your logic
      final municipalityResponse = await handleApiCall<Map<String, dynamic>>(
        url: EnvironmentConfig.getMunicipalityById(municipalityId),
        requestBody: {}, // Empty body for a GET-like call
        context: context,
        fromJson: (responseJson) => responseJson,
        method: "GET",
      );

      if (municipalityResponse == null) {
        throw Exception("Falha ao obter dados do município.");
      }

      final municipality =
          Municipality.fromMap(municipalityId, municipalityResponse);
      final postalCodes = municipality.postalCodes;

      if (postalCodes.isEmpty) {
        throw Exception("O município não tem códigos postais associados.");
      }

      // Step 2: Fetch issues using postal codes
      final apiUrl = EnvironmentConfig.obtainMunicipalityPostalCodesIssues();

      final requestBody = {
        "paginator": {
          "page": _currentPage,
          "recordsPerPage": 20,
        },
        "filter": {
          "newest": _sortNewest,
          "text": _searchQuery.isNotEmpty ? _searchQuery : null,
          "priority": _priorityFilter,
          "type": _typeFilter,
          "postalCodes": postalCodes, // Use postal codes from the municipality
        },
      };

      final response = await handleApiCall<Map<String, dynamic>>(
        url: apiUrl,
        requestBody: requestBody,
        context: context,
        fromJson: (responseJson) => responseJson,
      );

      // Step 3: Handle response and update the state
      if (response != null) {
        final issuesData = response['issues'] as List<dynamic>;
        final totalPages = response['paginator']['totalPages'] as int;
        if (mounted) {
          setState(() {
            _issues
                .addAll(issuesData.map((json) => Issue.fromMap(json)).toList());
            _totalPages = totalPages;
          });
        }
      }
    } catch (e) {
      debugPrint('Erro ao procurar incidentes do município: $e');
    }
    if (mounted) {
      setState(() {
        _isFetchingMore = false;
        _isLoading = false;
      });
    }
  }

  void _onSearchChanged(String query) {
    if (mounted) {
      setState(() {
        _searchQuery = query;
      });
    }
    _fetchMunicipalityIssues();
  }

  void _onPriorityFilterChanged(int? priority) {
    if (mounted) {
      setState(() {
        _priorityFilter = priority;
      });
    }
    _fetchMunicipalityIssues();
  }

  void _onTypeFilterChanged(int? status) {
    if (mounted) {
      setState(() {
        _typeFilter = status;
      });
    }
    _fetchMunicipalityIssues();
  }

  void _onSortOrderChanged(bool? newest) {
    if (newest != null) {
      if (mounted) {
        setState(() {
          _sortNewest = newest;
        });
      }
      _fetchMunicipalityIssues();
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: const CustomAppBar(title: "Incidentes do Município"),
      bottomNavigationBar: const CustomBottomBar(),
      body: LayoutBuilder(builder: (context, constraints) {
        final isWideScreen = constraints.maxWidth > 1000;
        return Padding(
          padding: const EdgeInsets.all(16.0),
          child: Column(
            children: [
              _buildFilters(),
              Expanded(
                child: _isLoading
                    ? const Center(child: CircularProgressIndicator())
                    : _issues.isEmpty
                        ? const Center(
                            child: Text("Nenhum incidente encontrado."))
                        : isWideScreen
                            ? _buildTableView(constraints.maxWidth)
                            : _buildListView(),
              ),
            ],
          ),
        );
      }),
    );
  }

  Widget _buildFilters() {
    return Column(
      children: [
        TextField(
          onChanged: _onSearchChanged,
          decoration: const InputDecoration(
            labelText: "Pesquisar",
            prefixIcon: Icon(Icons.search),
            border: OutlineInputBorder(),
          ),
        ),
        const SizedBox(height: 8),
        Row(
          children: [
            Expanded(
              child: DropdownButtonFormField<int?>(
                isExpanded: true,
                value: _priorityFilter,
                onChanged: _onPriorityFilterChanged,
                items: const [
                  DropdownMenuItem(value: null, child: Text("Todas")),
                  DropdownMenuItem(value: 0, child: Text("Baixa")),
                  DropdownMenuItem(value: 1, child: Text("Média")),
                  DropdownMenuItem(value: 2, child: Text("Alta")),
                  DropdownMenuItem(value: 3, child: Text("Urgente")),
                ],
                decoration: const InputDecoration(labelText: "Prioridade"),
              ),
            ),
            const SizedBox(width: 8),
            Expanded(
              child: DropdownButtonFormField<int?>(
                isExpanded: true,
                value: _typeFilter,
                onChanged: _onTypeFilterChanged,
                hint: const Text("Tipo"),
                items: [
                  const DropdownMenuItem(value: null, child: Text("Todos")),
                  ...IssueType.values.map((type) => DropdownMenuItem(
                      value: type.index, child: Text(type.displayName))),
                ],
                decoration: const InputDecoration(labelText: "Tipo"),
              ),
            ),
            const SizedBox(width: 8),
            Expanded(
              child: DropdownButtonFormField<bool>(
                isExpanded: true,
                value: _sortNewest,
                onChanged: _onSortOrderChanged,
                hint: const Text("Ordem"),
                items: const [
                  DropdownMenuItem(value: true, child: Text("Mais Recentes")),
                  DropdownMenuItem(value: false, child: Text("Mais Antigos")),
                ],
                decoration: const InputDecoration(labelText: "Ordenar"),
              ),
            ),
          ],
        ),
      ],
    );
  }

  ListView _buildListView() {
    return ListView.builder(
      controller: _scrollController, // Attach the scroll controller
      itemCount: _issues.length + 1, // Add one for the loading indicator
      padding: const EdgeInsets.symmetric(vertical: 8),
      itemBuilder: (context, index) {
        if (index == _issues.length) {
          // Show loading indicator if fetching more
          return _isFetchingMore
              ? const Padding(
                  padding: EdgeInsets.all(16.0),
                  child: Center(child: CircularProgressIndicator()),
                )
              : const SizedBox.shrink(); // No more data
        }

        final issue = _issues[index];
        return Container(
          margin: const EdgeInsets.symmetric(vertical: 0.0, horizontal: 0.0),
          decoration: BoxDecoration(
            border: Border.all(color: Theme.of(context).colorScheme.primary),
            borderRadius: BorderRadius.vertical(
              top: Radius.circular(index == 0 ? 12 : 0),
              bottom: Radius.circular(index == _issues.length - 1 ? 12 : 0),
            ),
            color: Theme.of(context).colorScheme.onPrimary,
          ),
          child: ListTile(
            title: Text(issue.type.displayName),
            subtitle: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                if (issue.priority != null)
                  Text("Prioridade: ${issue.priority!.displayName}"),
                Text(
                  issue.address.isNotEmpty
                      ? issue.address
                      : "Morada não encontrada",
                  style: TextStyle(color: Colors.grey[700], fontSize: 14),
                ),
              ],
            ),
            trailing: Row(
              mainAxisSize: MainAxisSize.min,
              children: [
                Icon(
                  issue.status == IssueStatus.resolved
                      ? Icons.check_circle
                      : Icons.error,
                  color: issue.status == IssueStatus.resolved
                      ? Colors.green
                      : Colors.red,
                ),
                Text(
                  issue.status.displayName,
                  style: TextStyle(
                    color: issue.status == IssueStatus.resolved
                        ? Colors.green
                        : Colors.red,
                  ),
                ),
              ],
            ),
            onTap: () {
              context.push(
                '/issue-details/${issue.id}',
                extra: {'issue': issue, 'isMunicipality': true},
              );
            },
          ),
        );
      },
    );
  }

  Issue? selectedIssue;

  Widget _buildTableView(final double width) {
    return Row(
      children: [
        Expanded(
          flex: 4,
          child: Column(
            children: [
              // Data Table
              Container(
                alignment: Alignment.topLeft,
                margin: const EdgeInsets.symmetric(vertical: 16),
                child: Scrollbar(
                  thumbVisibility: true,
                  trackVisibility: true,
                  child: SingleChildScrollView(
                    primary: true,
                    scrollDirection: Axis.horizontal,
                    child: DataTable(
                      showCheckboxColumn: false,
                      decoration: BoxDecoration(
                        borderRadius: const BorderRadius.vertical(
                            bottom: Radius.circular(12)),
                        border: Border(
                          left: BorderSide(
                              color: Theme.of(context).colorScheme.primary,
                              width: 2),
                          right: BorderSide(
                              color: Theme.of(context).colorScheme.primary,
                              width: 2),
                          bottom: BorderSide(
                              color: Theme.of(context).colorScheme.primary,
                              width: 2),
                        ),
                      ),
                      columns: const [
                        DataColumn(label: Text("Estado")),
                        DataColumn(label: Text("Situação")),
                        DataColumn(label: Text("Descrição")),
                        DataColumn(label: Text("Nº Reportes")),
                        DataColumn(label: Text("Data Reportado")),
                        DataColumn(label: Text("Prioridade")),
                      ],
                      rows: _issues.map((issue) {
                        return DataRow(
                          selected:
                              selectedIssue == issue, // Highlight selected row
                          onSelectChanged: (isSelected) {
                            if (mounted) {
                              setState(() {
                                if (selectedIssue == issue) {
                                  // Unset if the same issue is clicked again
                                  selectedIssue = null;
                                } else {
                                  selectedIssue =
                                      issue; // Set the selected issue
                                }
                              });
                            }
                          },
                          cells: [
                            DataCell(Text(issue.status.displayName)),
                            DataCell(Text(issue.type.displayName)),
                            DataCell(Text(issue.description)),
                            DataCell(Text(issue.occurrences.toString())),
                            DataCell(Text(
                                "${issue.dateReported.day}/${issue.dateReported.month}/${issue.dateReported.year}")),
                            DataCell(Text(issue.priority?.displayName ??
                                "Sem Prioridade")),
                          ],
                        );
                      }).toList(),
                    ),
                  ),
                ),
              ),
              // Pagination Controls
              if (_totalPages > 1)
                Padding(
                  padding: const EdgeInsets.all(8.0),
                  child: Row(
                    mainAxisAlignment: MainAxisAlignment.spaceBetween,
                    children: [
                      ElevatedButton(
                        onPressed: (_currentPage > 1)
                            ? () {
                                setState(() {
                                  _currentPage--;
                                });
                                _fetchMunicipalityIssues();
                              }
                            : null,
                        child: const Text("Anterior"),
                      ),
                      Text("Página $_currentPage de $_totalPages"),
                      ElevatedButton(
                        onPressed: (_currentPage < _totalPages)
                            ? () {
                                setState(() {
                                  _currentPage++;
                                });
                                _fetchMunicipalityIssues();
                              }
                            : null,
                        child: const Text("Próxima"),
                      ),
                    ],
                  ),
                ),
              if (_isFetchingMore)
                const Padding(
                  padding: EdgeInsets.all(8.0),
                  child: CircularProgressIndicator(),
                ),
            ],
          ),
        ),
        if (selectedIssue != null)
          Expanded(
            flex: 2,
            child: Container(
              alignment: Alignment.topLeft,
              margin: const EdgeInsets.symmetric(vertical: 16),
              decoration: BoxDecoration(
                borderRadius:
                    const BorderRadius.vertical(bottom: Radius.circular(12)),
                border: Border(
                  left: BorderSide(
                      color: Theme.of(context).colorScheme.secondary, width: 2),
                  right: BorderSide(
                      color: Theme.of(context).colorScheme.secondary, width: 2),
                  bottom: BorderSide(
                      color: Theme.of(context).colorScheme.secondary, width: 2),
                ),
              ),
              child: IssueDetailsWidget(
                issue: selectedIssue!,
                key: Key(selectedIssue!.id),
                isMunicipality: true,
                onUpdate: (updatedIssue) {
                  if (mounted) {
                    setState(() {
                      // Update the issue in the lists
                      int index =
                          _issues.indexWhere((i) => i.id == updatedIssue.id);
                      if (index != -1) {
                        _issues[index] = updatedIssue;
                      }

                      index =
                          _issues.indexWhere((i) => i.id == updatedIssue.id);
                      if (index != -1) {
                        _issues[index] = updatedIssue;
                      }

                      // Update the selected issue
                      if (selectedIssue?.id == updatedIssue.id) {
                        selectedIssue = updatedIssue;
                      }
                    });
                  }
                },
              ),
            ),
          ),
      ],
    );
  }
}
