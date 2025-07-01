import 'package:flutter_test/flutter_test.dart';
import 'package:tapa_buracos/API/api_config.dart';

void main() {
  group('EnvironmentConfig Tests', () {
    const productionUrl = 'https://webapp-api-tapaburacos.azurewebsites.net';

    // Override base URL for testing
    setUpAll(() {
      EnvironmentConfig.setTestBaseUrl(productionUrl);
    });

    test('EnvironmentConfig API Base URL', () {
      expect(EnvironmentConfig.apiBaseUrl, equals(productionUrl));
    });

    group('IssueCitizen Endpoints', () {
      test('obtainActiveIssues should return correct endpoint', () {
        expect(
          EnvironmentConfig.obtainActiveIssues,
          '$productionUrl/api/IssueCitizen/ObtainActiveIssues',
        );
      });

      test('obtainUserIssues should return correct endpoint', () {
        const userId = 'user_123';
        expect(
          EnvironmentConfig.obtainUserIssues(userId),
          '$productionUrl/api/IssueCitizen/ObtainUserIssues/user_123',
        );
      });

      test('obtainIssueDetails should return correct endpoint', () {
        const issueId = 'issue_456';
        expect(
          EnvironmentConfig.obtainIssueDetails(issueId),
          '$productionUrl/api/IssueCitizen/ObtainIssueDetails/issue_456',
        );
      });

      test('registerIssue should return correct endpoint', () {
        expect(
          EnvironmentConfig.registerIssue,
          '$productionUrl/api/IssueCitizen/RegisterIssue',
        );
      });

      test('confirmIncrementOfIssue should return correct endpoint', () {
        const issueId = 'issue_789';
        expect(
          EnvironmentConfig.confirmIncrementOfIssue(issueId),
          '$productionUrl/api/IssueCitizen/ConfirmIncrementOfIssue/issue_789',
        );
      });

      test('addWatcher should return correct endpoint', () {
        const issueId = 'issue_123';
        const userId = 'user_456';
        expect(
          EnvironmentConfig.addWatcher(issueId, userId),
          '$productionUrl/api/IssueCitizen/issue_123/AddWatcher/user_456',
        );
      });

      test('removeWatcher should return correct endpoint', () {
        const issueId = 'issue_999';
        const userId = 'user_888';
        expect(
          EnvironmentConfig.removeWatcher(issueId, userId),
          '$productionUrl/api/IssueCitizen/issue_999/RemoveWatcher/user_888',
        );
      });
    });

    group('IssueMunicipality Endpoints', () {
      test('obtainMunicipalityIssues should return correct endpoint', () {
        const municipalityId = 'mun_123';
        expect(
          EnvironmentConfig.obtainMunicipalityIssues(municipalityId),
          '$productionUrl/api/IssueMunicipality/ObtainIssues/mun_123',
        );
      });

      test('obtainMunicipalityPaginatedIssues should return correct endpoint',
          () {
        const municipalityId = 'mun_456';
        expect(
          EnvironmentConfig.obtainMunicipalityPaginatedIssues(municipalityId),
          '$productionUrl/api/IssueMunicipality/ObtainPaginatedIssues/mun_456',
        );
      });

      test('obtainMunicipalityIssueDetails should return correct endpoint', () {
        const municipalityId = 'mun_789';
        const issueId = 'issue_321';
        expect(
          EnvironmentConfig.obtainMunicipalityIssueDetails(
              municipalityId, issueId),
          '$productionUrl/api/IssueMunicipality/ObtainIssue/mun_789/issue_321',
        );
      });

      test('initializeResolution should return correct endpoint', () {
        expect(
          EnvironmentConfig.initializeResolution,
          '$productionUrl/api/IssueMunicipality/InitializeResolution',
        );
      });

      test('concludeResolution should return correct endpoint', () {
        expect(
          EnvironmentConfig.concludeResolution,
          '$productionUrl/api/IssueMunicipality/ConcludeResolution',
        );
      });

      test('getMunicipalityReporting should return correct endpoint', () {
        const municipalityId = 'mun_321';
        expect(
          EnvironmentConfig.getMunicipalityReporting(municipalityId),
          '$productionUrl/api/IssueMunicipality/IssueReporting/mun_321',
        );
      });
    });

    group('User Endpoints', () {
      test('getUserByEmail should return correct endpoint', () {
        expect(
          EnvironmentConfig.getUserByEmail,
          '$productionUrl/api/User/GetUserByEmail',
        );
      });

      test('getUserById should return correct endpoint', () {
        const userId = 'user_123';
        expect(
          EnvironmentConfig.getUserById(userId),
          '$productionUrl/api/User/GetUserById/user_123',
        );
      });

      test('registerUserAssociation should return correct endpoint', () {
        expect(
          EnvironmentConfig.registerUserAssociation,
          '$productionUrl/api/User/RegisterAssociation',
        );
      });
    });

    group('Municipality Endpoints', () {
      test('registerMunicipalityAssociation should return correct endpoint',
          () {
        expect(
          EnvironmentConfig.registerMunicipalityAssociation,
          '$productionUrl/api/Municipality/RegisterAssociation',
        );
      });

      test('getMunicipalityById should return correct endpoint', () {
        const municipalityId = 'mun_456';
        expect(
          EnvironmentConfig.getMunicipalityById(municipalityId),
          '$productionUrl/api/Municipality/GetMunicipalityById/mun_456',
        );
      });
    });

    group('IssueNotification Endpoints', () {
      test('obtainUserIssueNotifications should return correct endpoint', () {
        const userId = 'user_123';
        expect(
          EnvironmentConfig.obtainUserIssueNotifications(userId),
          '$productionUrl/api/IssueNotification/GetUserIssueNotifications/user_123',
        );
      });

      test('markIssueNotificationAsRead should return correct endpoint', () {
        const notificationId = 'notif_123';
        expect(
          EnvironmentConfig.markIssueNotificationAsRead(notificationId),
          '$productionUrl/api/IssueNotification/MarkIssueNotificationAsRead/notif_123',
        );
      });
    });

    group('Evaluation Endpoints', () {
      test('obtainUserEvaluations should return correct endpoint', () {
        const userId = 'user_321';
        expect(
          EnvironmentConfig.obtainUserEvaluations(userId),
          '$productionUrl/api/EvaluationCitizen/ObtainUserEvaluations/user_321',
        );
      });

      test('registerUserEvaluation should return correct endpoint', () {
        expect(
          EnvironmentConfig.registerUserEvaluation,
          '$productionUrl/api/EvaluationCitizen/RegisterUserEvaluation',
        );
      });

      test('obtainMunicipalityEvaluations should return correct endpoint', () {
        const municipalityId = 'mun_123';
        expect(
          EnvironmentConfig.obtainMunicipalityEvaluations(municipalityId),
          '$productionUrl/api/EvaluationMunicipality/ObtainEvaluationsOfMunicipality/mun_123',
        );
      });
    });

    group('System Endpoints', () {
      test('systemStatus should return correct endpoint', () {
        expect(
          EnvironmentConfig.systemStatus,
          '$productionUrl/api/System/Status',
        );
      });
    });
  });
}
