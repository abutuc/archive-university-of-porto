
import 'package:flutter/material.dart';


// Enum for Severity
enum Severity { low, medium, high }

extension SeverityExtension on Severity {
  int get value {
    switch (this) {
      case Severity.low:
        return 0;
      case Severity.medium:
        return 1;
      case Severity.high:
        return 2;
    }
  }

  static Severity fromValue(int value) {
    switch (value) {
      case 0:
        return Severity.low;
      case 1:
        return Severity.medium;
      case 2:
        return Severity.high;
      default:
        throw Exception('Invalid Severity value: $value');
    }
  }
}

// ValidationFailure Class
class ValidationFailure {
  final String? propertyName;
  final String? errorMessage;
  final dynamic attemptedValue;
  final dynamic customState;
  final Severity? severity;
  final String? errorCode;
  final Map<String, dynamic>? formattedMessagePlaceholderValues;

  ValidationFailure({
    this.propertyName,
    this.errorMessage,
    this.attemptedValue,
    this.customState,
    this.severity,
    this.errorCode,
    this.formattedMessagePlaceholderValues,
  });

  factory ValidationFailure.fromJson(Map<String, dynamic> json) {
    return ValidationFailure(
      propertyName: json['propertyName'],
      errorMessage: json['errorMessage'],
      attemptedValue: json['attemptedValue'],
      customState: json['customState'],
      severity: json['severity'] != null
          ? SeverityExtension.fromValue(json['severity'])
          : null,
      errorCode: json['errorCode'],
      formattedMessagePlaceholderValues:
          json['formattedMessagePlaceholderValues'],
    );
  }

  Map<String, dynamic> toJson() {
    return {
      'propertyName': propertyName,
      'errorMessage': errorMessage,
      'attemptedValue': attemptedValue,
      'customState': customState,
      'severity': severity?.value,
      'errorCode': errorCode,
      'formattedMessagePlaceholderValues': formattedMessagePlaceholderValues,
    };
  }
}

// ValidationResult Class
class ValidationResult {
  final bool isValid;
  final List<ValidationFailure>? errors;
  final List<String>? ruleSetsExecuted;

  ValidationResult({
    required this.isValid,
    this.errors,
    this.ruleSetsExecuted,
  });

  factory ValidationResult.fromJson(Map<String, dynamic> json) {
    return ValidationResult(
      isValid: json['isValid'],
      errors: json['errors'] != null
          ? (json['errors'] as List)
              .map((e) => ValidationFailure.fromJson(e as Map<String, dynamic>))
              .toList()
          : null,
      ruleSetsExecuted: json['ruleSetsExecuted']?.cast<String>(),
    );
  }

  Map<String, dynamic> toJson() {
    return {
      'isValid': isValid,
      'errors': errors?.map((e) => e.toJson()).toList(),
      'ruleSetsExecuted': ruleSetsExecuted,
    };
  }
}

// ConcludeIssueVO Class
class ConcludeIssueVO {
  final String? issueId;
  final String? observations;
  final DateTime? dateResolved;

  ConcludeIssueVO({
    this.issueId,
    this.observations,
    this.dateResolved,
  });

  factory ConcludeIssueVO.fromJson(Map<String, dynamic> json) {
    return ConcludeIssueVO(
      issueId: json['issueId'],
      observations: json['observations'],
      dateResolved: json['dateResolved'] != null
          ? DateTime.parse(json['dateResolved'])
          : null,
    );
  }

  Map<String, dynamic> toJson() {
    return {
      'issueId': issueId,
      'observations': observations,
      'dateResolved': dateResolved?.toIso8601String(),
    };
  }
}

// ErrorResponse Class
class ErrorResponse {
  final String? message;
  final String? errorCode;

  ErrorResponse({
    this.message,
    this.errorCode,
  });

  factory ErrorResponse.fromJson(Map<String, dynamic> json) {
    return ErrorResponse(
      message: json['message'],
      errorCode: json['errorCode'],
    );
  }

  Map<String, dynamic> toJson() {
    return {
      'message': message,
      'errorCode': errorCode,
    };
  }
}

// Enum for Priority
enum Priority { low, medium, high, critical }

extension PriorityExtension on Priority {
  int get value {
    switch (this) {
      case Priority.low:
        return 0;
      case Priority.medium:
        return 1;
      case Priority.high:
        return 2;
      case Priority.critical:
        return 3;
    }
  }

  static Priority fromValue(int value) {
    switch (value) {
      case 0:
        return Priority.low;
      case 1:
        return Priority.medium;
      case 2:
        return Priority.high;
      case 3:
        return Priority.critical;
      default:
        throw Exception('Invalid Priority value: $value');
    }
  }
}

// InitializeIssuesResolutionVO Class
class InitializeIssuesResolutionVO {
  final String? issueId;
  final String? assignedTeam;
  final String? observations;
  final Priority? priority;

  InitializeIssuesResolutionVO({
    this.issueId,
    this.assignedTeam,
    this.observations,
    this.priority,
  });

  factory InitializeIssuesResolutionVO.fromJson(Map<String, dynamic> json) {
    return InitializeIssuesResolutionVO(
      issueId: json['issueId'],
      assignedTeam: json['assignedTeam'],
      observations: json['observations'],
      priority: json['priority'] != null
          ? PriorityExtension.fromValue(json['priority'])
          : null,
    );
  }

  Map<String, dynamic> toJson() {
    return {
      'issueId': issueId,
      'assignedTeam': assignedTeam,
      'observations': observations,
      'priority': priority?.value,
    };
  }
}

class ReportIssueResponseDTO {
  final bool isDuplicatedIssue;
  final ValidationResult validationResult;

  ReportIssueResponseDTO({
    required this.isDuplicatedIssue,
    required this.validationResult,
  });

  factory ReportIssueResponseDTO.fromJson(Map<String, dynamic> json) {
    return ReportIssueResponseDTO(
      isDuplicatedIssue: json['isDuplicatedIssue'] ?? false,
      validationResult: ValidationResult.fromJson(json['validationResult']),
    );
  }

  Map<String, dynamic> toJson() {
    return {
      'isDuplicatedIssue': isDuplicatedIssue,
      'validationResult': validationResult.toJson(),
    };
  }
}

/// Displays a dialog with validation errors.
/// Displays a dialog with validation errors in PT-PT.
void showValidationErrorsDialog(
    BuildContext context, List<ValidationFailure> errors) {
  showDialog(
    context: context,
    builder: (BuildContext context) {
      return AlertDialog(
        title: const Text('Erro de Validação'),
        content: Column(
          mainAxisSize: MainAxisSize.min,
          crossAxisAlignment: CrossAxisAlignment.start,
          children: errors.map((error) {
            return Padding(
              padding: const EdgeInsets.only(bottom: 8.0),
              child: Text(
                '• ${error.propertyName}: ${error.errorMessage}',
                style: TextStyle(
                  color: error.severity == Severity.high
                      ? Colors.red
                      : Colors.orange, // Different colors for severity
                ),
              ),
            );
          }).toList(),
        ),
        actions: [
          OutlinedButton(
            onPressed: () => Navigator.of(context).pop(),
            child: const Text('OK'),
          ),
        ],
      );
    },
  );
}

/// Helper function to translate severity to PT-PT.
String _translateSeverity(Severity? severity) {
  switch (severity) {
    case Severity.low:
      return 'Baixa';
    case Severity.medium:
      return 'Média';
    case Severity.high:
      return 'Alta';
    default:
      return 'Indefinida';
  }
}

/// Displays a generic error dialog.
void showGenericErrorDialog(BuildContext context, String message) {
  showDialog(
    context: context,
    builder: (BuildContext context) {
      return AlertDialog(
        title: const Text('Erro'),
        content: Text(message),
        actions: [
          OutlinedButton(
            onPressed: () => Navigator.of(context).pop(),
            child: const Text('OK'),
          ),
        ],
      );
    },
  );
}
