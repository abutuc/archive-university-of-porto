import 'package:flutter/foundation.dart';
import 'dart:convert';

import 'package:flutter/material.dart';

import 'package:http/http.dart' as http;

import 'package:tapa_buracos/API/error_handling.dart';

class EnvironmentConfig {
  // Base API URL based on the environment
  static String apiBaseUrl = const String.fromEnvironment(
    'API_BASE_URL',
    defaultValue: kReleaseMode
        ? 'https://webapp-api-tapaburacos.azurewebsites.net' // Main (Production)
        : 'https://webapp-api-tapaburacos-staging.azurewebsites.net', // Staging
  );

  static void setTestBaseUrl(String testUrl) {
    apiBaseUrl = testUrl;
  }

  // Endpoint paths
  static const String issueCitizenBase = '/api/IssueCitizen';
  static const String issueMunicipalityBase = '/api/IssueMunicipality';
  static const String userBase = '/api/User';
  static const String municipalityBase = '/api/Municipality';
  static const String issueNotificationBase = '/api/IssueNotification';

  static const String evaluationCitizenBase = '/api/EvaluationCitizen';
  static const String evaluationMunicipalityBase =
      '/api/EvaluationMunicipality';

  static const String systemBase = '/api/System';

  // Complete endpoints
  static String get obtainActiveIssues =>
      '$apiBaseUrl$issueCitizenBase/ObtainActiveIssues';
  static String obtainUserIssues(String userId) =>
      '$apiBaseUrl$issueCitizenBase/ObtainUserIssues/$userId';
  static String obtainIssueDetails(String issueId) =>
      '$apiBaseUrl$issueCitizenBase/ObtainIssueDetails/$issueId';
  static String get registerIssue =>
      '$apiBaseUrl$issueCitizenBase/RegisterIssue';
  static String confirmIncrementOfIssue(String issueId) =>
      '$apiBaseUrl$issueCitizenBase/ConfirmIncrementOfIssue/$issueId';
  static String addWatcher(String issueId, String userId) =>
      '$apiBaseUrl$issueCitizenBase/$issueId/AddWatcher/$userId';
  static String removeWatcher(String issueId, String userId) =>
      '$apiBaseUrl$issueCitizenBase/$issueId/RemoveWatcher/$userId';

  static String obtainMunicipalityIssues(String municipalityId) =>
      '$apiBaseUrl$issueMunicipalityBase/ObtainIssues/$municipalityId';
  static String obtainMunicipalityPaginatedIssues(String municipalityId) =>
      '$apiBaseUrl$issueMunicipalityBase/ObtainPaginatedIssues/$municipalityId';
  static String obtainMunicipalityPostalCodesIssues() =>
      '$apiBaseUrl$issueMunicipalityBase/ObtainIssuesByPostalCodes';
  static String obtainMunicipalityIssueDetails(
          String municipalityId, String issueId) =>
      '$apiBaseUrl$issueMunicipalityBase/ObtainIssue/$municipalityId/$issueId';
  static String get initializeResolution =>
      '$apiBaseUrl$issueMunicipalityBase/InitializeResolution';
  static String get concludeResolution =>
      '$apiBaseUrl$issueMunicipalityBase/ConcludeResolution';

  static String get getUserByEmail => '$apiBaseUrl$userBase/GetUserByEmail';
  static String getUserById(String id) =>
      '$apiBaseUrl$userBase/GetUserById/$id';
  static String get registerUserAssociation =>
      '$apiBaseUrl$userBase/RegisterAssociation';

  static String get registerMunicipalityAssociation =>
      '$apiBaseUrl$municipalityBase/RegisterAssociation';
  static String getMunicipalityById(String id) =>
      '$apiBaseUrl$municipalityBase/GetMunicipalityById/$id';

  static String getMunicipalityReporting(String municipalityId) =>
      '$apiBaseUrl$issueMunicipalityBase/IssueReporting/$municipalityId';

  static String get systemStatus => '$apiBaseUrl$systemBase/Status';

  static String obtainUserIssueNotifications(String userId) =>
      '$apiBaseUrl$issueNotificationBase/GetUserIssueNotifications/$userId';
  static String markIssueNotificationAsRead(String notificationId) =>
      '$apiBaseUrl$issueNotificationBase/MarkIssueNotificationAsRead/$notificationId';

  static String obtainUserEvaluations(String userId) =>
      '$apiBaseUrl$evaluationCitizenBase/ObtainUserEvaluations/$userId';

  static String get registerUserEvaluation =>
      '$apiBaseUrl$evaluationCitizenBase/RegisterUserEvaluation';

  static String obtainMunicipalityEvaluations(String municipalityId) =>
      '$apiBaseUrl$evaluationMunicipalityBase/ObtainEvaluationsOfMunicipality/$municipalityId';

  static String obtainMunicipalityEvaluationsByIssueId(
          String municipalityId, String issueId) =>
      '$apiBaseUrl$evaluationMunicipalityBase/ObtainEvaluationsOfMunicipality/$issueId/$municipalityId';
}

/// A generic method to handle API responses.
/// It takes the `url`, `requestBody`, and optional `headers`.
Future<T?> handleApiCall<T>({
  required String url,
  Map<String, dynamic>? requestBody, // Optional for GET requests
  required BuildContext context,
  required T Function(Map<String, dynamic>) fromJson,
  String method = 'POST', // Allow specifying HTTP method
}) async {
  try {
    // Convert request body to JSON
    final requestBodyJson = jsonEncode(requestBody);
    if (kDebugMode) {
      print("Request URL: $url");
      print("Request Body: $requestBodyJson");
    }

    http.Response response;
    if (method == 'POST') {
      response = await http.post(
        Uri.parse(url),
        headers: {'Content-Type': 'application/json'},
        body: requestBodyJson,
      );
    } else if (method == 'GET') {
      response = await http.get(
        Uri.parse(url),
        headers: {'Content-Type': 'application/json'},
      );
    } else {
      throw Exception('Unsupported HTTP method: $method');
    }

    // Log the response details
    if (kDebugMode) {
      print("Response Status Code: ${response.statusCode}");
      print("Response Headers: ${response.headers}");
      print("Response Body: ${response.body}");
    }

    if (response.statusCode == 200) {
      // Safely parse the response body if it's not empty
      if (response.body.isNotEmpty) {
        final responseJson = jsonDecode(response.body) as Map<String, dynamic>;
        return fromJson(responseJson);
      } else {
        throw const FormatException("Empty response body for 200 OK.");
      }
    } else if (response.statusCode == 400) {
      // Handle validation errors
      if (response.body.isNotEmpty) {
        final responseJson = jsonDecode(response.body) as Map<String, dynamic>;
        if (responseJson['validationResult'] != null) {
          final validationResult =
              ValidationResult.fromJson(responseJson['validationResult']);
          if (!validationResult.isValid && validationResult.errors != null) {
            if (context.mounted) {
              showValidationErrorsDialog(context, validationResult.errors!);
            }
          }
        } else {
          if (context.mounted) {
            showGenericErrorDialog(
                context, 'Erro de validação. Verifique os dados fornecidos.');
          }
        }
      }
      return null;
    } else if (response.statusCode == 500) {
      // Handle empty 500 error response gracefully
      if (context.mounted) {
        showGenericErrorDialog(
            context, 'Erro interno no servidor. Tente novamente mais tarde.');
      }
      return null;
    } else if (response.statusCode == 404) {
      // Handle "not found" error
      if (context.mounted) {
        showGenericErrorDialog(context, 'Recurso solicitado não encontrado.');
      }
      return null;
    } else {
      // Handle unexpected errors
      if (context.mounted) {
        showGenericErrorDialog(
            context, 'Erro inesperado. Código: ${response.statusCode}');
      }
      return null;
    }
  } catch (e) {
    if (kDebugMode) {
      print('Erro ao chamar a API: $e');
    }
    if (context.mounted) {
      showGenericErrorDialog(context,
          'Erro ao processar sua solicitação. Tente novamente mais tarde.');
    }
    return null;
  }
}
