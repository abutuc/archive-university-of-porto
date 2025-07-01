import 'dart:convert';

import 'package:firebase_auth/firebase_auth.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:geocoding/geocoding.dart';
import 'package:http/http.dart' as http;
import 'package:tapa_buracos/API/api_config.dart';
import 'package:tapa_buracos/API/error_handling.dart';
import 'package:tapa_buracos/Customs/custom_fullscreen_image.dart';
import 'package:tapa_buracos/Models/evaluation_model.dart';
import 'package:tapa_buracos/Models/issue_model.dart';

class IssueDetailsWidget extends StatefulWidget {
  final Issue issue;
  final bool isMunicipality;
  final Function(Issue)? onUpdate; // Callback to update issue in the parent

  const IssueDetailsWidget(
      {super.key,
      required this.issue,
      required this.isMunicipality,
      this.onUpdate});

  @override
  State<IssueDetailsWidget> createState() => _IssueDetailsWidgetState();
}

class _IssueDetailsWidgetState extends State<IssueDetailsWidget> {
  String? _address;
  bool _isFetchingAddress = true;
  final user = FirebaseAuth.instance.currentUser;
  late Issue currentIssue;

  Evaluation? _existingFeedback;
  bool _isLoadingFeedback = true;

  @override
  void initState() {
    currentIssue = widget.issue;
    super.initState();
    _fetchAddress();
    if (!widget.isMunicipality) _checkFeedbackStatus();
  }

  Future<void> _checkFeedbackStatus() async {
    final feedback = await _getExistingFeedback();
    setState(() {
      _existingFeedback = feedback;
      _isLoadingFeedback = false;
    });
  }

  Future<Evaluation?> _getExistingFeedback() async {
    try {
      final userId = user?.uid;
      if (userId == null) return null;

      final apiUrl = EnvironmentConfig.obtainUserEvaluations(userId);

      final response = await http.get(Uri.parse(apiUrl));
      if (response.statusCode == 200 && response.body.isNotEmpty) {
        final List<dynamic> evaluationsJson = jsonDecode(response.body);

        // Parse and find the evaluation for the current issue
        for (var json in evaluationsJson) {
          final evaluation = Evaluation.fromMap(json as Map<String, dynamic>);
          if (evaluation.issueId == currentIssue.id) {
            return evaluation;
          }
        }
      }
    } catch (e) {
      if (kDebugMode) print("Erro ao obter avaliação: $e");
    }
    return null;
  }

  Future<void> _updateIssue(Issue updatedIssue, BuildContext context) async {
    try {
      // Determine API URL and request body based on issue status
      String apiUrl;
      Map<String, dynamic> requestBody;

      if (updatedIssue.status == IssueStatus.inProgress) {
        apiUrl = EnvironmentConfig.initializeResolution;
        requestBody = {
          "issueId": updatedIssue.id,
          "assignedTeam": updatedIssue.assignedTeam ?? '',
          "observations": updatedIssue.municipalityObservations ?? '',
          "priority": updatedIssue.priority?.index ?? 0,
        };
      } else if (updatedIssue.status == IssueStatus.resolved) {
        apiUrl = EnvironmentConfig.concludeResolution;
        requestBody = {
          "issueId": updatedIssue.id,
          "observations": updatedIssue.municipalityObservations ?? '',
          "dateResolved": "${DateTime.now().toIso8601String()}Z",
        };
      } else {
        return; // Unsupported status, do nothing
      }

      // Call the API using handleApiCall
      final response = await handleApiCall<ValidationResult>(
        url: apiUrl,
        requestBody: requestBody,
        context: context,
        fromJson: (json) => ValidationResult.fromJson(json),
      );

      if (response == null) {
        // If response is null, error handling has already been done
        return;
      }

      // Update the issue if validation succeeds
      if (response.isValid) {
        setState(() {
          currentIssue = updatedIssue;
        });

        // Notify parent widget if callback exists
        widget.onUpdate?.call(updatedIssue);

        // Show success message
        if (context.mounted) {
          Navigator.of(context).pop(); // Close dialog
          ScaffoldMessenger.of(context).showSnackBar(
            const SnackBar(content: Text('Incidente atualizado com sucesso!')),
          );
        }
      } else {
        if (context.mounted) {
          showValidationErrorsDialog(context, response.errors ?? []);
        }
      }
    } catch (e) {
      if (kDebugMode) {
        print('Erro ao atualizar incidente: $e');
      }
      if (context.mounted) {
        showGenericErrorDialog(
            context, 'Ocorreu um erro inesperado. Por favor, tente novamente.');
      }
    }
  }

  Future<void> _addAsWatcher() async {
    try {
      final user = FirebaseAuth.instance.currentUser;
      if (user == null) {
        throw Exception("Nenhum utilizador autenticado");
      }

      final userId = user.uid;
      final apiUrl = EnvironmentConfig.addWatcher(currentIssue.id, userId);

      final response = await http.post(Uri.parse(apiUrl));

      if (response.statusCode == 200) {
        setState(() {
          currentIssue.watchers.add(userId);
        });

        if (kDebugMode) {
          print("Added as watcher successfully: ${response.body}");
        }
      } else {
        throw Exception(
            'Falha ao adicionar utilizador como watcher: ${response.statusCode}');
      }
    } catch (e) {
      if (kDebugMode) {
        print('Erro ao adicionar utilizador como watcher: $e');
      }
    }
  }

  Future<void> _removeAsWatcher() async {
    try {
      final user = FirebaseAuth.instance.currentUser;
      if (user == null) {
        throw Exception("Nenhum utilizador autenticado");
      }

      final userId = user.uid;
      final apiUrl = EnvironmentConfig.removeWatcher(currentIssue.id, userId);

      final response = await http.delete(Uri.parse(apiUrl));

      if (response.statusCode == 200) {
        setState(() {
          currentIssue.watchers.remove(userId);
        });

        if (kDebugMode) {
          print("Removed as watcher successfully: ${response.body}");
        }
      } else {
        throw Exception(
            'Falha ao remover utilizador como watcher: ${response.statusCode}');
      }
    } catch (e) {
      if (kDebugMode) {
        print('Erro ao remover utilizador como watcher: $e');
      }
    }
  }

  bool _isUpdating = false;

  void _showEditDialog() {
    if (widget.isMunicipality && currentIssue.status != IssueStatus.resolved) {
      final TextEditingController observationsController =
          TextEditingController(
        text: currentIssue.municipalityObservations,
      );
      final TextEditingController assignedTeamController =
          TextEditingController(
        text: currentIssue.assignedTeam,
      );
      IssuePriority? selectedPriority = currentIssue.priority;

      showDialog(
        context: context,
        builder: (BuildContext context) {
          return AlertDialog(
            title: Text(currentIssue.status == IssueStatus.approved
                ? "Iniciar Resolução"
                : "Concluir Resolução"),
            content: SingleChildScrollView(
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  if (currentIssue.status == IssueStatus.newIssue ||
                      currentIssue.status == IssueStatus.approved) ...[
                    Padding(
                      padding: const EdgeInsets.only(bottom: 8),
                      child: TextField(
                        controller: assignedTeamController,
                        decoration: const InputDecoration(
                          labelText: 'Equipa Atribuída',
                        ),
                      ),
                    ),
                    Padding(
                      padding: const EdgeInsets.only(bottom: 8),
                      child: DropdownButtonFormField<IssuePriority>(
                        value: selectedPriority,
                        decoration:
                            const InputDecoration(labelText: 'Prioridade'),
                        onChanged: (value) {
                          selectedPriority = value;
                        },
                        items: IssuePriority.values.map((priority) {
                          return DropdownMenuItem(
                            value: priority,
                            child: Text(priority.displayName),
                          );
                        }).toList(),
                      ),
                    ),
                  ],
                  Padding(
                    padding: const EdgeInsets.only(bottom: 8),
                    child: TextField(
                      controller: observationsController,
                      decoration: const InputDecoration(
                        labelText: 'Observações',
                      ),
                      maxLines: 3,
                    ),
                  ),
                ],
              ),
            ),
            actions: [
              ElevatedButton(
                onPressed: () {
                  Navigator.of(context).pop();
                },
                child: const Text('Cancelar'),
              ),
              ElevatedButton(
                onPressed: !_isUpdating
                    ? () async {
                        setState(() {
                          _isUpdating = true;
                        });
                        final updatedIssue = Issue(
                          id: currentIssue.id,
                          type: currentIssue.type,
                          location: currentIssue.location,
                          description: currentIssue.description,
                          otherTypeDescription:
                              currentIssue.otherTypeDescription,
                          reporterIds: currentIssue.reporterIds,
                          watchers: currentIssue.watchers,
                          dateReported: currentIssue.dateReported,
                          status: currentIssue.status != IssueStatus.inProgress
                              ? IssueStatus.inProgress
                              : IssueStatus.resolved,
                          municipalityId: currentIssue.municipalityId,
                          occurrences: currentIssue.occurrences,
                          imageUrl: currentIssue.imageUrl,
                          assignedTeam: assignedTeamController.text,
                          priority: selectedPriority,
                          address: currentIssue.address,
                          municipalityObservations: observationsController.text,
                          dateApproved: currentIssue.dateApproved,
                          dateResolved:
                              currentIssue.status == IssueStatus.inProgress
                                  ? DateTime.now()
                                  : currentIssue.dateResolved,
                        );

                        await _updateIssue(updatedIssue, context);

                        setState(() {
                          _isUpdating = false;
                        });
                      }
                    : null,
                child: _isUpdating
                    ? const CircularProgressIndicator()
                    : const Text('Guardar'),
              ),
            ],
          );
        },
      );
    }
  }

  Future<void> _fetchAddress() async {
    try {
      List<Placemark> placemarks = await placemarkFromCoordinates(
        currentIssue.location.latitude,
        currentIssue.location.longitude,
      );

      if (placemarks.isNotEmpty) {
        Placemark place = placemarks.first;
        setState(() {
          _address = [
            place.street,
            place.postalCode,
            place.subLocality,
            place.locality,
            place.administrativeArea,
            place.country
          ]
              .where((element) => element != null && element.isNotEmpty)
              .join(', ');
          _isFetchingAddress = false;
        });
      }
    } catch (e) {
      setState(() {
        _address = "Morada não encontrada";
        _isFetchingAddress = false;
      });
      if (kDebugMode) print("Erro ao procurar morada: $e");
    }
  }

  void _showFeedbackDialog() {
    final TextEditingController commentController = TextEditingController();
    int? selectedRating;

    showDialog(
      context: context,
      builder: (BuildContext context) {
        final theme = Theme.of(context);

        return StatefulBuilder(
          builder: (BuildContext context, StateSetter setDialogState) {
            return AlertDialog(
              title: Text(
                "Avaliar Resolução do Incidente",
                style: theme.textTheme.titleMedium?.copyWith(
                  color: theme.colorScheme.primary,
                ),
              ),
              content: SingleChildScrollView(
                child: Column(
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children: [
                    Text(
                      "Avaliação (1 a 5)",
                      style: theme.textTheme.bodyLarge,
                    ),
                    Row(
                      mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                      children: List.generate(5, (index) {
                        final ratingValue = index + 1;
                        return GestureDetector(
                          onTap: () {
                            setDialogState(() {
                              selectedRating = ratingValue;
                            });
                          },
                          child: Icon(
                            Icons.star,
                            size: 36,
                            color: selectedRating != null &&
                                    selectedRating! >= ratingValue
                                ? Colors.amber
                                : Colors.grey,
                          ),
                        );
                      }),
                    ),
                    const SizedBox(height: 16),
                    Text(
                      "Comentário",
                      style: theme.textTheme.bodyMedium,
                    ),
                    const SizedBox(height: 8),
                    TextField(
                      controller: commentController,
                      decoration: const InputDecoration(
                        border: OutlineInputBorder(),
                        hintText: "Escreva a sua opinião aqui...",
                      ),
                      maxLines: 3,
                    ),
                  ],
                ),
              ),
              actions: [
                TextButton(
                  onPressed: () {
                    Navigator.of(context).pop(); // Close dialog
                  },
                  child: const Text("Cancelar"),
                ),
                ElevatedButton(
                  onPressed: selectedRating != null
                      ? () async {
                          final feedback = {
                            "id": currentIssue.id,
                            "userId": user?.uid ?? '',
                            "rating": selectedRating!,
                            "comment": commentController.text.trim(),
                            "municipalityId": currentIssue.municipalityId,
                          };

                          // Send feedback to API or Firestore
                          await _submitFeedback(feedback);
                          if (context.mounted) {
                            Navigator.of(context).pop(); // Close dialog

                            ScaffoldMessenger.of(context).showSnackBar(
                              const SnackBar(
                                  content:
                                      Text("Avaliação enviada com sucesso!")),
                            );
                          }
                        }
                      : null,
                  child: const Text("Enviar"),
                ),
              ],
            );
          },
        );
      },
    );
  }

  Future<void> _submitFeedback(Map<String, dynamic> feedbackData) async {
    try {
      final apiUrl = EnvironmentConfig.registerUserEvaluation;

      // Convert feedback data to an Evaluation object
      final evaluation = Evaluation(
        issueId: currentIssue.id,
        userId: user?.uid ?? '',
        rating: feedbackData['rating'] as int,
        comment: feedbackData['comment'] as String,
        municipalityId: currentIssue.municipalityId,
      );

      await handleApiCall<void>(
        url: apiUrl,
        requestBody: evaluation.toMap(), // Convert Evaluation to JSON
        context: context,
        fromJson: (_) {}, // No need to process a response for submission
      );
      if (mounted) {
        setState(() {
          _existingFeedback = evaluation;
        });
      }
    } catch (e) {
      if (kDebugMode) {
        print("Erro ao enviar avaliação: $e");
      }
      if (mounted) {
        showGenericErrorDialog(
            context, "Erro ao enviar avaliação. Tente novamente.");
      }
    }
  }

  void _showExistingFeedbackDialog(Evaluation feedback) {
    final theme = Theme.of(context);
    showDialog(
      context: context,
      builder: (context) => AlertDialog(
        title: Text(
          "Resolução Já Avaliada",
          style: theme.textTheme.titleMedium?.copyWith(
            color: theme.colorScheme.primary,
          ),
        ),
        content: Column(
          mainAxisSize: MainAxisSize.min,
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Row(
              children: List.generate(5, (index) {
                return Icon(
                  Icons.star,
                  color: index < feedback.rating ? Colors.amber : Colors.grey,
                );
              }),
            ),
            const SizedBox(height: 16),
            Text(
              "Comentário:",
              style: theme.textTheme.bodyLarge,
            ),
            const SizedBox(height: 8),
            Text(
              feedback.comment,
              style: theme.textTheme.bodyMedium,
            ),
          ],
        ),
        actions: [
          TextButton(
            onPressed: () => Navigator.of(context).pop(),
            child: const Text("Fechar"),
          ),
        ],
      ),
    );
  }

  @override
  Widget build(BuildContext context) {
    return SingleChildScrollView(
      padding: const EdgeInsets.all(16.0),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          Wrap(
            spacing: 10,
            runSpacing: 5,
            children: [
              if (widget.isMunicipality)
                OutlinedButton.icon(
                  onPressed: _showEditDialog,
                  icon: const Icon(Icons.edit),
                  label: Text(
                    currentIssue.status == IssueStatus.newIssue
                        ? "Aprovar e Atribuir"
                        : currentIssue.status == IssueStatus.approved
                            ? "Iniciar Resolução"
                            : currentIssue.status == IssueStatus.inProgress
                                ? "Concluir Resolução"
                                : currentIssue.status == IssueStatus.resolved
                                    ? "Resolvido"
                                    : "Editar",
                  ),
                )
              else if (currentIssue.reporterIds.contains(user?.uid ?? '')) ...[
                OutlinedButton.icon(
                  onPressed: () {},
                  label: const Text("Reportado"),
                  icon: const Icon(
                    Icons.check_circle,
                  ),
                ),
              ],
              // Add History button

              if (currentIssue.dateApproved != null ||
                  currentIssue.dateResolved != null ||
                  currentIssue.municipalityObservations != null)
                OutlinedButton.icon(
                  onPressed: _showHistoryDialog,
                  label: const Text("Histórico"),
                  icon: const Icon(Icons.history),
                ),
              if (currentIssue.reporterIds.contains(user?.uid ?? '') &&
                  currentIssue.status == IssueStatus.resolved)
                _buildFeedbackButton(),

              if (currentIssue.watchers.contains(user?.uid ?? ''))
                IconButton(
                  onPressed: () {
                    _removeAsWatcher();
                  },
                  icon: const Icon(Icons.notifications_on),
                )
              else
                IconButton(
                  onPressed: () {
                    _addAsWatcher();
                  },
                  icon: const Icon(Icons.notifications_off),
                ),
            ],
          ),
          _buildSectionHeader(context, "Informações Gerais"),
          Row(
            mainAxisAlignment: MainAxisAlignment.spaceBetween,
            children: [
              _buildIconDetailRow(
                context,
                label: "Estado",
                value: currentIssue.status.displayName,
                icon: currentIssue.status == IssueStatus.resolved
                    ? Icons.check_circle
                    : Icons.error,
                valueColor: currentIssue.status == IssueStatus.resolved
                    ? Colors.green
                    : Colors.red,
              ),
              _buildIconDetailRow(
                context,
                label: "Data de Reporte",
                value:
                    "${currentIssue.dateReported.day}/${currentIssue.dateReported.month}/${currentIssue.dateReported.year}",
                icon: Icons.calendar_today,
              ),
            ],
          ),
          _buildIconDetailRow(
            context,
            label: "Situação:",
            value:
                "${currentIssue.type.displayName}${currentIssue.type == IssueType.other ? ": ${currentIssue.otherTypeDescription}" : ""}",
            icon: Icons.category,
          ),
          _buildIconDetailRow(
            context,
            label: "Reportado por:",
            value: "${currentIssue.occurrences.toString()} Pessoa(s)",
            icon: Icons.group,
          ),
          if (currentIssue.assignedTeam != null)
            _buildIconDetailRow(
              context,
              label: "Equipa Atribuída:",
              value: currentIssue.assignedTeam!,
              icon: Icons.group_work,
            ),
          _buildIconDetailRow(
            context,
            label: "Localização:",
            value: _isFetchingAddress
                ? "A obter morada..."
                : _address ?? "Morada não encontrada",
            icon: Icons.home,
          ),
          _buildIconDetailRow(
            context,
            label: "Descrição:",
            value: currentIssue.description,
            icon: Icons.notes,
          ),
          if (currentIssue.municipalityObservations != null)
            _buildIconDetailRow(
              context,
              label: "Observações Municipais",
              value: currentIssue.municipalityObservations!,
              icon: Icons.comment,
            ),
          const SizedBox(height: 16),
          if (currentIssue.imageUrl != null)
            _buildImageSection(currentIssue.imageUrl!),
        ],
      ),
    );
  }

  Widget _buildIconDetailRow(BuildContext context,
      {required String label,
      required String value,
      required IconData icon,
      Color? valueColor}) {
    final theme = Theme.of(context);
    return Padding(
      padding: const EdgeInsets.symmetric(vertical: 8.0),
      child: Row(
        mainAxisSize: MainAxisSize.min,
        children: [
          Icon(icon, size: 24, color: theme.colorScheme.primary),
          const SizedBox(width: 8),
          Flexible(
            fit: FlexFit.loose,
            child: Column(
              mainAxisSize: MainAxisSize.min,
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Text(
                  label,
                  style: theme.textTheme.bodySmall?.copyWith(
                    color: theme.colorScheme.primary,
                    fontWeight: FontWeight.bold,
                  ),
                ),
                Text(
                  value,
                  style: theme.textTheme.bodyMedium?.copyWith(
                    color: valueColor ?? theme.colorScheme.onSurface,
                  ),
                ),
              ],
            ),
          ),
        ],
      ),
    );
  }

  Widget _buildSectionHeader(BuildContext context, String title) {
    final theme = Theme.of(context);
    return Padding(
      padding: const EdgeInsets.symmetric(vertical: 8.0),
      child: Text(
        title,
        style: theme.textTheme.titleLarge?.copyWith(
          color: theme.colorScheme.primary,
          fontWeight: FontWeight.bold,
        ),
      ),
    );
  }

  Widget _buildImageSection(String imageUrl) {
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: [
        _buildSectionHeader(context, "Imagem do Incidente"),
        const SizedBox(height: 8),
        GestureDetector(
          onTap: () {
            // Open the full-screen image dialog
            Navigator.of(context).push(
              MaterialPageRoute(
                builder: (context) => FullScreenImageDialog(imageUrl: imageUrl),
              ),
            );
          },
          child: Hero(
            tag: imageUrl, // Hero animation tag
            child: ClipRRect(
              borderRadius: BorderRadius.circular(12),
              child: Image.network(
                imageUrl,
                fit: BoxFit.cover,
                width: double.infinity,
                height: 400,
              ),
            ),
          ),
        ),
      ],
    );
  }

  Widget _buildFeedbackButton() {
    if (_isLoadingFeedback) {
      return const CircularProgressIndicator();
    }

    if (_existingFeedback != null) {
      return OutlinedButton.icon(
        onPressed: () => _showExistingFeedbackDialog(_existingFeedback!),
        icon: const Icon(Icons.feedback),
        label: const Text("Incidente Avaliado"),
      );
    }

    return OutlinedButton.icon(
      onPressed: _showFeedbackDialog,
      icon: const Icon(Icons.feedback),
      label: const Text("Avaliar Incidente"),
    );
  }

  void _showHistoryDialog() {
    showDialog(
      context: context,
      builder: (BuildContext context) {
        final theme = Theme.of(context);

        return AlertDialog(
          title: Text(
            "Histórico do Incidente",
            style: theme.textTheme.titleMedium?.copyWith(
              color: theme.colorScheme.primary,
            ),
          ),
          content: Column(
            mainAxisSize: MainAxisSize.min,
            crossAxisAlignment: CrossAxisAlignment.start,
            children: [
              Text(
                "Reportado: ${currentIssue.dateReported.day}/${currentIssue.dateReported.month}/${currentIssue.dateReported.year}",
                style: theme.textTheme.bodyMedium,
              ),
              if (currentIssue.dateApproved != null)
                Text(
                  "Aprovado: ${currentIssue.dateApproved!.day}/${currentIssue.dateApproved!.month}/${currentIssue.dateApproved!.year}",
                  style: theme.textTheme.bodyMedium,
                ),
              if (currentIssue.dateResolved != null)
                Text(
                  "Resolvido: ${currentIssue.dateResolved!.day}/${currentIssue.dateResolved!.month}/${currentIssue.dateResolved!.year}",
                  style: theme.textTheme.bodyMedium,
                ),
              if (currentIssue.municipalityObservations != null)
                TextFormField(
                  initialValue:
                      "Observações Municipais: ${currentIssue.municipalityObservations!}",
                  readOnly: true,
                  style: theme.textTheme.bodyMedium,
                ),
            ],
          ),
          actions: [
            TextButton(
              onPressed: () => Navigator.of(context).pop(),
              child: const Text("Fechar"),
            ),
          ],
        );
      },
    );
  }
}
