import 'package:flutter_test/flutter_test.dart';
import 'package:tapa_buracos/Models/issue_model.dart';

void main() {
  group('Issue Tests', () {
    test('Issue should initialize with correct values', () {
      final issue = Issue(
        id: 'issue_1',
        type: IssueType.roadHole,
        location: InfoLocation(latitude: 40.7128, longitude: -74.0060),
        description: 'A large road hole near the main street.',
        reporterIds: ['user_1'],
        watchers: ['user_2', 'user_3'],
        dateReported: DateTime.parse('2024-06-01T12:00:00Z'),
        status: IssueStatus.newIssue,
        municipalityId: 'postal_code_123',
        occurrences: 1,
        imageUrl: 'http://example.com/image.jpg',
        assignedTeam: 'Team A',
        priority: IssuePriority.high,
        address: '123 Main Street',
        municipalityObservations: 'Urgent repair needed.',
        dateApproved: DateTime.parse('2024-06-02T10:00:00Z'),
        dateResolved: null,
      );

      expect(issue.id, equals('issue_1'));
      expect(issue.type, equals(IssueType.roadHole));
      expect(issue.location.latitude, equals(40.7128));
      expect(issue.location.longitude, equals(-74.0060));
      expect(
          issue.description, equals('A large road hole near the main street.'));
      expect(issue.reporterIds, contains('user_1'));
      expect(issue.watchers, containsAll(['user_2', 'user_3']));
      expect(issue.dateReported, DateTime.parse('2024-06-01T12:00:00Z'));
      expect(issue.status, equals(IssueStatus.newIssue));
      expect(issue.municipalityId, equals('postal_code_123'));
      expect(issue.occurrences, equals(1));
      expect(issue.imageUrl, equals('http://example.com/image.jpg'));
      expect(issue.assignedTeam, equals('Team A'));
      expect(issue.priority, equals(IssuePriority.high));
      expect(issue.address, equals('123 Main Street'));
      expect(issue.municipalityObservations, equals('Urgent repair needed.'));
      expect(issue.dateApproved, DateTime.parse('2024-06-02T10:00:00Z'));
      expect(issue.dateResolved, isNull);
    });

    test('Issue.toMap should convert to correct map', () {
      final issue = Issue(
        id: 'issue_1',
        type: IssueType.accident,
        location: InfoLocation(latitude: 10.0, longitude: 20.0),
        description: 'Minor accident reported.',
        reporterIds: ['user_1', 'user_2'],
        watchers: ['user_3'],
        dateReported: DateTime.parse('2024-06-01T12:00:00Z'),
        status: IssueStatus.inProgress,
        municipalityId: 'postal_code_456',
        occurrences: 2,
        imageUrl: null,
        assignedTeam: null,
        priority: null,
        address: '456 Elm Street',
        municipalityObservations: null,
        dateApproved: null,
        dateResolved: null,
      );

      final map = issue.toMap();

      expect(map['id'], equals('issue_1'));
      expect(map['type'], equals(IssueType.accident.index));
      expect(map['location']['latitude'], equals(10.0));
      expect(map['location']['longitude'], equals(20.0));
      expect(map['description'], equals('Minor accident reported.'));
      expect(map['reporterIds'], containsAll(['user_1', 'user_2']));
      expect(map['status'], equals(IssueStatus.inProgress.index));
      expect(map['municipalityId'], equals('postal_code_456'));
      expect(map['occurrences'], equals(2));
      expect(map['address'], equals('456 Elm Street'));
      expect(map['dateApproved'], isNull);
      expect(map['priority'], isNull);
    });

    test('Issue.fromMap should create a valid Issue object', () {
      final map = {
        'id': 'issue_2',
        'type': 3, // IssueType.publicLightingFailure
        'location': {'latitude': 35.0, 'longitude': 45.0},
        'description': 'Public lights are not working.',
        'reporterIds': ['user_5'],
        'watchers': ['user_6'],
        'dateReported': '2024-06-01T12:00:00Z',
        'status': 2, // IssueStatus.inProgress
        'municipalityId': 'postal_code_789',
        'occurrences': 0,
        'address': '789 Pine Avenue',
      };

      final issue = Issue.fromMap(map);

      expect(issue.id, equals('issue_2'));
      expect(issue.type, equals(IssueType.publicLightingFailure));
      expect(issue.location.latitude, equals(35.0));
      expect(issue.location.longitude, equals(45.0));
      expect(issue.description, equals('Public lights are not working.'));
      expect(issue.reporterIds, contains('user_5'));
      expect(issue.watchers, contains('user_6'));
      expect(issue.dateReported, DateTime.parse('2024-06-01T12:00:00Z'));
      expect(issue.status, equals(IssueStatus.inProgress));
      expect(issue.municipalityId, equals('postal_code_789'));
      expect(issue.occurrences, equals(0));
      expect(issue.address, equals('789 Pine Avenue'));
    });

    test('IssueType.displayName should return correct name', () {
      expect(IssueType.roadHole.displayName, equals('Buraco na Estrada'));
      expect(IssueType.accident.displayName, equals('Acidente'));
      expect(IssueType.other.displayName, equals('Outro'));
    });

    test('IssueStatus.displayName should return correct name', () {
      expect(IssueStatus.newIssue.displayName, equals('Novo'));
      expect(IssueStatus.resolved.displayName, equals('Resolvido'));
    });

    test('IssuePriority.displayName should return correct name', () {
      expect(IssuePriority.low.displayName, equals('Baixa'));
      expect(IssuePriority.urgent.displayName, equals('Urgente'));
    });
  });
}
