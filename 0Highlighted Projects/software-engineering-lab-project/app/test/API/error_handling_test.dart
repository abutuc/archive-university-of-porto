import 'package:flutter/material.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:tapa_buracos/API/error_handling.dart';

void main() {
  group('Severity Extension Tests', () {
    test('Severity value should return correct integer', () {
      expect(Severity.low.value, equals(0));
      expect(Severity.medium.value, equals(1));
      expect(Severity.high.value, equals(2));
    });

    test('Severity fromValue should return correct Severity', () {
      expect(SeverityExtension.fromValue(0), equals(Severity.low));
      expect(SeverityExtension.fromValue(1), equals(Severity.medium));
      expect(SeverityExtension.fromValue(2), equals(Severity.high));
    });

    test('Severity fromValue should throw exception for invalid value', () {
      expect(() => SeverityExtension.fromValue(3), throwsException);
    });
  });

  group('Priority Extension Tests', () {
    test('Priority value should return correct integer', () {
      expect(Priority.low.value, equals(0));
      expect(Priority.medium.value, equals(1));
      expect(Priority.high.value, equals(2));
      expect(Priority.critical.value, equals(3));
    });

    test('Priority fromValue should return correct Priority', () {
      expect(PriorityExtension.fromValue(0), equals(Priority.low));
      expect(PriorityExtension.fromValue(3), equals(Priority.critical));
    });

    test('Priority fromValue should throw exception for invalid value', () {
      expect(() => PriorityExtension.fromValue(4), throwsException);
    });
  });

  group('ValidationFailure Tests', () {
    test('ValidationFailure toJson and fromJson should work correctly', () {
      final failure = ValidationFailure(
        propertyName: 'Field',
        errorMessage: 'Invalid value',
        severity: Severity.high,
        errorCode: '123',
      );

      final json = failure.toJson();
      expect(json['propertyName'], equals('Field'));
      expect(json['errorMessage'], equals('Invalid value'));
      expect(json['severity'], equals(2));
      expect(json['errorCode'], equals('123'));

      final fromJson = ValidationFailure.fromJson(json);
      expect(fromJson.propertyName, equals('Field'));
      expect(fromJson.errorMessage, equals('Invalid value'));
      expect(fromJson.severity, equals(Severity.high));
    });
  });

  group('ValidationResult Tests', () {
    test('ValidationResult toJson and fromJson should work correctly', () {
      final failure = ValidationFailure(
        propertyName: 'Field',
        errorMessage: 'Invalid value',
        severity: Severity.medium,
      );

      final result = ValidationResult(
        isValid: false,
        errors: [failure],
        ruleSetsExecuted: ['rule1', 'rule2'],
      );

      final json = result.toJson();
      expect(json['isValid'], equals(false));
      expect(json['errors'][0]['propertyName'], equals('Field'));
      expect(json['ruleSetsExecuted'], equals(['rule1', 'rule2']));

      final fromJson = ValidationResult.fromJson(json);
      expect(fromJson.isValid, equals(false));
      expect(fromJson.errors![0].propertyName, equals('Field'));
    });
  });

  group('ConcludeIssueVO Tests', () {
    test('ConcludeIssueVO toJson and fromJson should work correctly', () {
      final issue = ConcludeIssueVO(
        issueId: '123',
        observations: 'Resolved',
        dateResolved: DateTime.parse('2024-06-15T10:00:00Z'),
      );

      final json = issue.toJson();
      expect(json['issueId'], equals('123'));
      expect(json['observations'], equals('Resolved'));
      expect(json['dateResolved'], equals('2024-06-15T10:00:00.000Z'));

      final fromJson = ConcludeIssueVO.fromJson(json);
      expect(fromJson.issueId, equals('123'));
      expect(fromJson.observations, equals('Resolved'));
    });
  });

  group('Dialog Tests', () {
    testWidgets('showGenericErrorDialog displays correct message',
        (WidgetTester tester) async {
      const testMessage = 'Something went wrong';

      await tester.pumpWidget(
        MaterialApp(
          home: Builder(
            builder: (context) {
              WidgetsBinding.instance.addPostFrameCallback((_) {
                showGenericErrorDialog(context, testMessage);
              });
              return Container();
            },
          ),
        ),
      );

      await tester.pumpAndSettle();

      expect(find.text('Erro'), findsOneWidget);
      expect(find.text(testMessage), findsOneWidget);
      expect(find.text('OK'), findsOneWidget);
    });

    testWidgets('showValidationErrorsDialog displays errors',
        (WidgetTester tester) async {
      final errors = [
        ValidationFailure(
          propertyName: 'Field1',
          errorMessage: 'Must not be empty',
          severity: Severity.low,
        ),
        ValidationFailure(
          propertyName: 'Field2',
          errorMessage: 'Invalid format',
          severity: Severity.high,
        ),
      ];

      await tester.pumpWidget(
        MaterialApp(
          home: Builder(
            builder: (context) {
              WidgetsBinding.instance.addPostFrameCallback((_) {
                showValidationErrorsDialog(context, errors);
              });
              return Container();
            },
          ),
        ),
      );

      await tester.pumpAndSettle();

      expect(find.text('Erro de Validação'), findsOneWidget);
      expect(find.text('• Field1: Must not be empty'), findsOneWidget);
      expect(find.text('• Field2: Invalid format'), findsOneWidget);
      expect(find.text('OK'), findsOneWidget);
    });
  });
}
