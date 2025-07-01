import 'dart:convert';

import 'package:firebase_auth/firebase_auth.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:go_router/go_router.dart';
import 'package:http/http.dart' as http;
import 'package:tapa_buracos/API/api_config.dart';
import 'package:tapa_buracos/Customs/custom_app_bar.dart';
import 'package:tapa_buracos/Customs/custom_bottom_bar.dart';
import 'package:tapa_buracos/IssueListing/address_methods.dart';

import '../Models/issue_model.dart';

class ReportListPage extends StatefulWidget {
  const ReportListPage({super.key});

  @override
  State<ReportListPage> createState() => _ReportListPageState();
}

class _ReportListPageState extends State<ReportListPage> {
  List<Issue> _issues = [];
  List<Issue> _filteredIssues = [];
  bool _isLoading = false;
  String _searchQuery = "";
  String _dateSortOption = "newest"; // Default sort by newest
  String _statusFilterOption =
      "unresolved"; // Show all by default (resolved + unresolved)

  @override
  void initState() {
    _fetchUserIssues();
    super.initState();
  }

  Future<void> _fetchUserIssues() async {
    if (mounted) {
      setState(() {
        _isLoading = true;
        _issues = [];
        _filteredIssues = [];
      });
    }

    try {
      final user = FirebaseAuth.instance.currentUser;
      if (user == null) {
        throw Exception("Nenhum utilizador autenticado");
      }

      final userId = user.uid;
      final apiUrl = EnvironmentConfig.obtainUserIssues(userId);

      final response = await http.get(Uri.parse(apiUrl));

      if (response.statusCode == 200) {
        final List<dynamic> data = jsonDecode(response.body);
        if (mounted) {
          setState(() {
            _issues = data.map((json) => Issue.fromMap(json)).toList();
            _sortAndFilterIssues();
          });
        }

        if (kDebugMode) {
          print("User issues fetched successfully: ${response.body}");
        }

        for (var issue in _issues) {
          _fetchAddress(issue);
        }
      } else {
        throw Exception(
            'Falha ao carregar incidentes do utilizador: ${response.statusCode}');
      }
    } catch (e) {
      if (kDebugMode) {
        print('Erro ao procurar incidentes do utilizador: $e');
      }
    }

    if (mounted) {
      setState(() {
        _isLoading = false;
      });
    }
  }

  Future<void> _fetchAddress(Issue issue) async {
    final address = await fetchAddress(issue);

    if (address != null && mounted) {
      if (mounted) {
        setState(() {
          issue.address = address;
        });
      }
    }
  }

  void _sortAndFilterIssues() {
    if (mounted) {
      setState(() {
        // Filter issues by status (unresolved or resolved)
        if (_statusFilterOption == "unresolved") {
          _filteredIssues = _issues
              .where((issue) => issue.status != IssueStatus.resolved)
              .toList();
        } else if (_statusFilterOption == "resolved") {
          _filteredIssues = _issues
              .where((issue) => issue.status == IssueStatus.resolved)
              .toList();
        } else {
          _filteredIssues = List.from(_issues); // Show all
        }

        // Filter further by search query
        _filteredIssues = _filteredIssues.where((issue) {
          final query = _searchQuery.toLowerCase();
          return issue.type.displayName.toLowerCase().contains(query) ||
              issue.description.toLowerCase().contains(query) ||
              issue.address.toLowerCase().contains(query);
        }).toList();

        // Sort issues by date
        _filteredIssues.sort((a, b) {
          if (_dateSortOption == "newest") {
            return b.dateReported.compareTo(a.dateReported);
          } else {
            return a.dateReported.compareTo(b.dateReported);
          }
        });

        _isLoading = false;
      });
    }
  }

  void _onSearch(String query) {
    if (mounted) {
      setState(() {
        _searchQuery = query;
        _sortAndFilterIssues();
      });
    }
  }

  void _onDateSortOptionChanged(String? option) {
    if (option != null) {
      if (mounted) {
        setState(() {
          _dateSortOption = option;
          _sortAndFilterIssues();
        });
      }
    }
  }

  void _onStatusFilterOptionChanged(String? option) {
    if (option != null) {
      if (mounted) {
        setState(() {
          _statusFilterOption = option;
          _sortAndFilterIssues();
        });
      }
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: const CustomAppBar(title: "Os Seus Incidentes"),
      bottomNavigationBar: const CustomBottomBar(),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: _isLoading
            ? const Center(child: CircularProgressIndicator())
            : Column(
                children: [
                  _buildSearchAndSortBar(),
                  Expanded(
                    child: _filteredIssues.isEmpty
                        ? const Center(
                            child: Text("Nenhum incidente encontrado."),
                          )
                        : ListView.builder(
                            itemCount: _filteredIssues.length,
                            padding: const EdgeInsets.symmetric(vertical: 8),
                            itemBuilder: (context, index) {
                              final issue = _filteredIssues[index];
                              return Container(
                                margin: const EdgeInsets.symmetric(
                                    vertical: 0.0, horizontal: 0.0),
                                decoration: BoxDecoration(
                                    border: Border.all(
                                        color: Theme.of(context)
                                            .colorScheme
                                            .primary),
                                    borderRadius: BorderRadius.vertical(
                                      top: Radius.circular(index == 0 ? 12 : 0),
                                      bottom: Radius.circular(
                                          index == _filteredIssues.length - 1
                                              ? 12
                                              : 0),
                                    ),
                                    color: Theme.of(context)
                                        .colorScheme
                                        .onPrimary),
                                child: ListTile(
                                  title: Text(issue.type.displayName),
                                  subtitle: Column(
                                    crossAxisAlignment:
                                        CrossAxisAlignment.start,
                                    children: [
                                      /*
                                    Text(
                                      issue.description.length > 30
                                          ? '${issue.description.substring(0, 30)}...'
                                          : issue.description,
                                    ),
                                    const SizedBox(height: 4),

                                     */
                                      Text(
                                        issue.address.isNotEmpty
                                            ? issue.address
                                            : "Morada não encontrada",
                                        style: TextStyle(
                                            color: Colors.grey[700],
                                            fontSize: 14),
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
                                        color:
                                            issue.status == IssueStatus.resolved
                                                ? Colors.green
                                                : Colors.red,
                                      ),
                                      Text(
                                        issue.status.displayName,
                                        style: TextStyle(
                                          color: issue.status ==
                                                  IssueStatus.resolved
                                              ? Colors.green
                                              : Colors.red,
                                        ),
                                      ),
                                    ],
                                  ),
                                  onTap: () {
                                    context.push(
                                      '/issue-details/${issue.id}',
                                      extra: {
                                        'issue': issue,
                                        'isMunicipality': false
                                      },
                                    );
                                  },
                                ),
                              );
                            },
                          ),
                  ),
                ],
              ),
      ),
    );
  }

  Widget _buildSearchAndSortBar() {
    return Column(
      children: [
        Row(
          children: [
            Expanded(
              child: TextField(
                onChanged: _onSearch,
                decoration: const InputDecoration(
                  labelText: "Pesquisar",
                  prefixIcon: Icon(Icons.search),
                  border: OutlineInputBorder(),
                ),
              ),
            ),
            //IconButton(onPressed: () {}, icon: Icon(Icons.pin_drop))
          ],
        ),
        const SizedBox(height: 8),
        Row(
          children: [
            Expanded(
              child: DropdownButtonFormField<String>(
                isExpanded: true,
                value: _dateSortOption,
                onChanged: _onDateSortOptionChanged,
                decoration: const InputDecoration(labelText: "Data"),
                items: const [
                  DropdownMenuItem(
                      value: "newest",
                      child: Text(
                        "Mais Recentes",
                        style: TextStyle(fontSize: 16),
                      )),
                  DropdownMenuItem(
                      value: "oldest",
                      child: Text(
                        "Mais Antigos",
                        style: TextStyle(fontSize: 16),
                      )),
                ],
              ),
            ),
            const SizedBox(width: 8),
            Expanded(
              child: DropdownButtonFormField<String>(
                isExpanded: true,
                decoration: const InputDecoration(labelText: "Estado"),
                value: _statusFilterOption,
                onChanged: _onStatusFilterOptionChanged,
                items: const [
                  DropdownMenuItem(
                      value: "all",
                      child: Text(
                        "Todos",
                        style: TextStyle(fontSize: 16),
                      )),
                  DropdownMenuItem(
                      value: "unresolved",
                      child: Text(
                        "Não Resolvidos",
                        style: TextStyle(fontSize: 16),
                      )),
                  DropdownMenuItem(
                      value: "resolved",
                      child: Text(
                        "Resolvidos",
                        style: TextStyle(fontSize: 16),
                      )),
                ],
              ),
            ),
          ],
        ),
      ],
    );
  }
}
