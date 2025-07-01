import 'dart:convert';
import 'package:flutter/foundation.dart';
import 'package:geocoding/geocoding.dart';
import 'package:http/http.dart' as http;
import 'package:tapa_buracos/Models/issue_model.dart';

Future<String?> fetchAddress(Issue issue) async {
  try {
    // Check if we are on the web platform (or use API for all platforms)
    if (kIsWeb) {
      // Use GEO API PT
      final String apiUrl =
          'https://json.geoapi.pt/gps/${issue.location.latitude},${issue.location.longitude}?json=1';

      final response = await http.get(Uri.parse(apiUrl));

      if (response.statusCode == 200) {
        // Parse the JSON response
        final Map<String, dynamic> data = jsonDecode(response.body);

        // Construct the address
        final String address = [
          data['rua'] ?? '',
          data['freguesia'] ?? '',
          data['concelho'] ?? '',
          data['distrito'] ?? '',
          data['CP'] ?? ''
        ].where((element) => element.isNotEmpty).join(', ');

        return address;
      } else {
        if (kDebugMode) {
          print('GEO API PT Error: ${response.statusCode}');
        }
        return 'Erro ao obter morada (API)';
      }
    } else {
      // Use Geocoding for non-web platforms

      List<Placemark> placemarks = await placemarkFromCoordinates(
        issue.location.latitude,
        issue.location.longitude,
      );

      if (placemarks.isNotEmpty) {
        final Placemark place = placemarks.first;
        return "${place.street}, ${place.locality}, ${place.country}";
      }

      return null;
    }
  } catch (e) {
    if (kDebugMode) {
      print("Erro ao encontrar morada: $e");
    }
    return 'Erro ao obter morada';
  }
}
