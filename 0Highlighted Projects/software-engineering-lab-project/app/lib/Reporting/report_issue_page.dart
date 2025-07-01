import 'dart:convert';
import 'dart:io';

import 'package:firebase_auth/firebase_auth.dart';
import 'package:firebase_storage/firebase_storage.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:flutter_osm_plugin/flutter_osm_plugin.dart';
import 'package:geocoding/geocoding.dart';
import 'package:image_picker/image_picker.dart';
import 'package:tapa_buracos/API/api_config.dart';
import 'package:tapa_buracos/API/error_handling.dart';
import 'package:tapa_buracos/Customs/custom_app_bar.dart';
import 'package:tapa_buracos/Customs/custom_bottom_bar.dart';
import 'package:http/http.dart' as http;
import 'package:tapa_buracos/Models/issue_model.dart';
import 'package:tapa_buracos/Models/issue_notification.dart';

class CreateReportPage extends StatefulWidget {
  const CreateReportPage({super.key});

  @override
  State<CreateReportPage> createState() => _CreateReportPageState();
}

class _CreateReportPageState extends State<CreateReportPage> {
  final _formKey = GlobalKey<FormState>();
  IssueType? _issueType;
  String? _imageUrl;
  XFile? _selectedImage;
  GeoPoint? _selectedLocation;
  String? _selectedAddress;
  late MapController _mapController;
  Placemark? _selectedPlace;

  final List<IssueType> _issueTypes = IssueType.values;

  bool _isSubmitting = false;

  final TextEditingController _titleController = TextEditingController();
  final TextEditingController _descriptionController = TextEditingController();
  final TextEditingController _issueOtherController = TextEditingController();

  bool _haveNotifications = false;

  @override
  void initState() {
    super.initState();
    _mapController = MapController(
      initMapWithUserPosition: const UserTrackingOption(enableTracking: true),
    );
    _fetchUserNotifications();
  }

  @override
  void dispose() {
    try {
      _mapController.dispose();
    } catch (e) {
      if (kDebugMode) {
        print('Error disposing map controller: $e');
      }
    }
    _titleController.dispose();
    _descriptionController.dispose();
    super.dispose();
  }

  Future<void> _updateAddress(GeoPoint location) async {
    try {
      List<Placemark> placemarks =
          await placemarkFromCoordinates(location.latitude, location.longitude);
      Placemark place = placemarks[0];
      if (mounted) {
        setState(() {
          _selectedAddress = [
            place.street,
            place.postalCode,
            place.subLocality,
            place.locality,
            place.administrativeArea,
            place.country
          ]
              .where((element) => element != null && element.isNotEmpty)
              .join(', ');

          _selectedPlace = place;
        });
      }
    } catch (e) {
      if (kDebugMode) {
        print("Erro ao obter Morada: $e");
      }
      if (mounted) {
        setState(() {
          _selectedAddress =
              "Não foi possível obter o Morada. Verifique a sua conexão à internet e tente novamente.";
        });
      }
    }
  }

  Future<void> _getImage() async {
    final pickedImage = await ImagePicker()
        .pickImage(source: ImageSource.camera, imageQuality: 80);
    if (pickedImage != null && mounted) {
      setState(() {
        _selectedImage = pickedImage;
      });
    }
  }

  Future<void> _uploadImage() async {
    if (_selectedImage != null) {
      final ref = FirebaseStorage.instance
          .ref()
          .child('issues_images')
          .child('${DateTime.now().millisecondsSinceEpoch}.jpg');
      await ref.putFile(File(_selectedImage!.path));
      _imageUrl = await ref.getDownloadURL();
    }
  }

  Future<void> _deleteImageFromStorage(String? imagePath) async {
    try {
      if (imagePath == null) return;
      final ref = FirebaseStorage.instance.refFromURL(imagePath);
      await ref.delete();
      if (kDebugMode) {
        print('Image deleted from Firebase Storage: $imagePath');
      }
    } catch (e) {
      if (kDebugMode) {
        print('Error deleting image: $e');
      }
    }
  }

  Future<void> _pickLocation() async {
    // Fetch current location first before showing picker
    GeoPoint? pickedLocation = await showSimplePickerLocation(
      context: context,
      isDismissible: true,
      title: "Selecionar Localização do Incidente",
      textConfirmPicker: "Selecionar",
      initCurrentUserPosition: _selectedLocation == null
          ? const UserTrackingOption(enableTracking: true)
          : null,
      initPosition: _selectedLocation,
      zoomOption: const ZoomOption(initZoom: 18),
    );

    if (pickedLocation != null && mounted) {
      setState(() {
        _selectedLocation = pickedLocation;
      });
      await _updateAddress(pickedLocation);
    }
  }

  Future<void> _submitForm() async {
    // Verifica se localização e imagem foram definidas
    if (_selectedLocation == null) {
      _showErrorDialog('Por favor, selecione a localização do incidente.');
      return;
    }

    if (_selectedImage == null) {
      _showErrorDialog('Por favor, adicione uma imagem do incidente.');
      return;
    }

    setState(() {
      _isSubmitting = true;
    });

    if (_formKey.currentState!.validate()) {
      _formKey.currentState!.save();
      await _uploadImage();

      if (_selectedLocation != null &&
          _descriptionController.text.isNotEmpty &&
          _issueType != null) {
        final issue = Issue(
          id: DateTime.now().millisecondsSinceEpoch.toString(),
          type: _issueType!,
          otherTypeDescription: _issueOtherController.text.isNotEmpty
              ? _issueOtherController.text
              : null,
          location: InfoLocation(
            latitude: _selectedLocation!.latitude,
            longitude: _selectedLocation!.longitude,
          ),
          description: _descriptionController.text.trim(),
          reporterIds: [FirebaseAuth.instance.currentUser?.uid ?? 'unknown'],
          watchers: [FirebaseAuth.instance.currentUser?.uid ?? 'unknown'],
          dateReported: DateTime.now(),
          // Simplified date format
          status: IssueStatus.newIssue,

          municipalityId: _selectedPlace?.postalCode ?? '',
          // Placeholder value instead of an empty string
          occurrences: 1,
          // Placeholder instead of an empty array if required
          imageUrl: _imageUrl,
          address: _selectedAddress ?? '',
        );

        final response = await _registerIssue(issue, context);
        _showResponseDialog(response);

        if (response) {
          if (mounted) {
            setState(() {
              _descriptionController.clear();
              _issueType = null;
              _imageUrl = null;
              _selectedImage = null;
              _selectedLocation = null;
              _selectedAddress = null;
            });
          }
        } else {
          _deleteImageFromStorage(_imageUrl);
        }
      }
    }
    setState(() {
      _isSubmitting = false;
    });
  }

  void _showErrorDialog(String message) {
    showDialog(
      context: context,
      builder: (BuildContext context) {
        return AlertDialog(
          title: const Text('Erro'),
          content: Text(message),
          actions: <Widget>[
            TextButton(
              child: const Text('OK'),
              onPressed: () {
                Navigator.of(context).pop();
              },
            ),
          ],
        );
      },
    );
  }

  Future<bool> _registerIssue(Issue issue, BuildContext context) async {
    final registerUrl = EnvironmentConfig.registerIssue;
    final incrementUrl = EnvironmentConfig.confirmIncrementOfIssue(issue.id);

    try {
      // Register the issue using the generalized API handler
      final reportIssueResponse = await handleApiCall<ReportIssueResponseDTO>(
        url: registerUrl,
        requestBody: issue.toMap(), // Convert issue to Map
        context: context,
        fromJson: (json) => ReportIssueResponseDTO.fromJson(json),
      );

      if (reportIssueResponse == null) {
        // If the response is null, an error has already been handled
        return false;
      }

      // Check validation results
      if (!reportIssueResponse.validationResult.isValid) {
        if (context.mounted) {
          showValidationErrorsDialog(
              context, reportIssueResponse.validationResult.errors ?? []);
        }
        return false; // Validation errors have already been displayed
      }

      // Check for duplicate issue
      if (reportIssueResponse.isDuplicatedIssue) {
        // Handle duplicate issue increment
        final incrementResponse = await handleApiCall<bool>(
          url: incrementUrl,
          requestBody: issue.toMap(),
          context: context,
          fromJson: (json) => true, // Dummy parser as we only care about status
        );

        return incrementResponse ?? false;
      }

      // Registration successful
      return true;
    } catch (e) {
      if (kDebugMode) {
        print('Erro ao registar o incidente: $e');
      }
      if (context.mounted) {
        showGenericErrorDialog(context,
            'Ocorreu um erro inesperado. Por favor, tente novamente mais tarde.');
      }
      return false;
    }
  }

  void _showResponseDialog(bool success) {
    showDialog(
      context: context,
      builder: (BuildContext context) {
        return AlertDialog(
          title: Text(success ? 'Sucesso' : 'Erro'),
          content: Text(
            success
                ? 'Incidente reportado com sucesso!'
                : 'Falha ao reportar o incidente. Por favor, tente novamente mais tarde.',
          ),
          actions: <Widget>[
            TextButton(
              child: const Text('OK'),
              onPressed: () {
                Navigator.of(context).pop();
              },
            ),
          ],
        );
      },
    );
  }

  Future<void> _fetchUserNotifications() async {
    try {
      final user = FirebaseAuth.instance.currentUser;
      if (user == null) {
        throw Exception("Nenhum utilizador autenticado");
      }

      final userId = user.uid;
      final apiUrl = EnvironmentConfig.obtainUserIssueNotifications(userId);

      final response = await http.get(Uri.parse(apiUrl));

      if (response.statusCode == 200) {
        final List<dynamic> data = jsonDecode(response.body);
        var issueNotifications =
            data.map((json) => IssueNotification.fromMap(json)).toList();

        if (issueNotifications.isNotEmpty) {
          setState(() {
            _haveNotifications = true;
          });
        } else {
          setState(() {
            _haveNotifications = false;
          });
        }
        if (kDebugMode) {
          print(
              "User issues notifications fetched successfully: ${response.body}");
        }
      } else {
        throw Exception(
            'Falha ao carregar notificações do utilizador: ${response.statusCode}');
      }
    } catch (e) {
      if (kDebugMode) {
        print('Erro ao procurar notificações do utilizador: $e');
      }
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: CustomAppBar(
          title: "Reportar um Incidente",
          showNotificationsButton: true,
          hasNotifications: _haveNotifications),
      bottomNavigationBar: const CustomBottomBar(),
      body: Form(
        key: _formKey,
        child: ListView(
          padding: const EdgeInsets.all(16.0),
          children: [
            // Category dropdown
            // Category dropdown
            DropdownButtonFormField<IssueType>(
              decoration: const InputDecoration(labelText: 'Categoria'),
              items: _issueTypes.map((type) {
                return DropdownMenuItem(
                  value: type,
                  child: Text(
                      type.displayName), // Use displayName from the extension
                );
              }).toList(),
              onChanged: (value) => setState(() => _issueType = value),
              validator: (value) =>
                  value == null ? 'Por favor, selecione uma categoria' : null,
            ),

            if (_issueType == IssueType.other) ...[
              const SizedBox(height: 8),
              TextFormField(
                controller: _issueOtherController,
                decoration:
                    const InputDecoration(labelText: 'Escreva a categoria'),
                validator: (value) => value!.isEmpty
                    ? 'Por favor, introduza uma categoria'
                    : null,
              ),
            ],

            const SizedBox(height: 16),

            // Description
            TextFormField(
              controller: _descriptionController,
              decoration: const InputDecoration(labelText: 'Descrição'),
              maxLines: 3,
              validator: (value) =>
                  value!.isEmpty ? 'Por favor, introduza uma descrição' : null,
            ),
            const SizedBox(height: 8),

            // Address and coordinates
            if (_selectedAddress != null) ...[
              Padding(
                padding: const EdgeInsets.symmetric(vertical: 8.0),
                child: Card(
                  color: Colors.grey[200],
                  margin: const EdgeInsets.symmetric(horizontal: 8.0),
                  child: Padding(
                    padding: const EdgeInsets.all(12.0),
                    child: Row(
                      children: [
                        Icon(Icons.location_on, color: Colors.grey[600]),
                        const SizedBox(width: 8.0),
                        Expanded(
                          child: Text(
                            "Morada: $_selectedAddress",
                            style: const TextStyle(
                              color: Colors.black87,
                              fontWeight: FontWeight.w500,
                              fontSize: 16,
                            ),
                          ),
                        ),
                      ],
                    ),
                  ),
                ),
              ),
            ],
            if (_selectedLocation != null) ...[
              Padding(
                padding: const EdgeInsets.symmetric(vertical: 8.0),
                child: Card(
                  color: Colors.grey[200],
                  margin: const EdgeInsets.symmetric(horizontal: 8.0),
                  child: Padding(
                    padding: const EdgeInsets.all(12.0),
                    child: Column(
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        Row(
                          children: [
                            Icon(Icons.map, color: Colors.grey[600]),
                            const SizedBox(width: 8.0),
                            const Text(
                              "Coordenadas:",
                              style: TextStyle(
                                color: Colors.black87,
                                fontWeight: FontWeight.w500,
                                fontSize: 16,
                              ),
                            ),
                          ],
                        ),
                        const SizedBox(height: 8.0),
                        Row(
                          children: [
                            const Text(
                              "Latitude: ",
                              style: TextStyle(
                                color: Colors.grey,
                                fontWeight: FontWeight.w400,
                              ),
                            ),
                            Text(
                              _selectedLocation!.latitude.toStringAsFixed(5),
                              style: const TextStyle(
                                color: Colors.black87,
                                fontWeight: FontWeight.w500,
                                fontSize: 16,
                              ),
                            ),
                          ],
                        ),
                        const SizedBox(height: 4.0),
                        Row(
                          children: [
                            const Text(
                              "Longitude: ",
                              style: TextStyle(
                                color: Colors.grey,
                                fontWeight: FontWeight.w400,
                              ),
                            ),
                            Text(
                              _selectedLocation!.longitude.toStringAsFixed(5),
                              style: const TextStyle(
                                color: Colors.black87,
                                fontWeight: FontWeight.w500,
                                fontSize: 16,
                              ),
                            ),
                          ],
                        ),
                      ],
                    ),
                  ),
                ),
              ),
            ],

            const SizedBox(height: 8),

            // Location selection button
            OutlinedButton.icon(
              onPressed: _pickLocation,
              icon: const Icon(Icons.place),
              label: Text(
                  '${_selectedLocation == null ? "Selecionar" : "Mudar"} Localização no Mapa'),
            ),
            const SizedBox(height: 16),

            // Image selection

            IconButton(
              icon: const Icon(Icons.camera_alt),
              tooltip: "Tirar foto",
              onPressed: _getImage,
            ),

            if (_selectedImage != null)
              Image.file(File(_selectedImage!.path), height: 150),
            const SizedBox(height: 16),

            // Submit button
            ElevatedButton(
              onPressed: _isSubmitting ? null : _submitForm,
              child: _isSubmitting
                  ? const CircularProgressIndicator()
                  : const Text('Submeter Incidente'),
            ),
          ],
        ),
      ),
    );
  }
}
