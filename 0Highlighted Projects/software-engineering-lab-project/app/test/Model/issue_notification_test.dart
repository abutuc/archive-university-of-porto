import 'package:flutter_test/flutter_test.dart';
import 'package:tapa_buracos/Models/issue_model.dart';
import 'package:tapa_buracos/Models/issue_notification.dart';

void main() {
  group('IssueNotification Tests', () {
    test('IssueNotification should initialize with correct values', () {
      final notification = IssueNotification(
        id: 'notif_1',
        issueId: 'issue_123',
        issueDescription: 'Road hole on Main Street',
        issueType: IssueType.roadHole,
        description: 'Urgent repair needed',
        issueStatus: IssueStatus.newIssue,
        userId: 'user_1',
        readNotification: false,
        createdDate: DateTime.parse('2024-06-01T12:00:00Z'),
      );

      expect(notification.id, equals('notif_1'));
      expect(notification.issueId, equals('issue_123'));
      expect(notification.issueDescription, equals('Road hole on Main Street'));
      expect(notification.issueType, equals(IssueType.roadHole));
      expect(notification.issueStatus, equals(IssueStatus.newIssue));
      expect(notification.userId, equals('user_1'));
      expect(notification.readNotification, isFalse);
      expect(notification.createdDate, DateTime.parse('2024-06-01T12:00:00Z'));
    });

    test('IssueNotification.fromMap should create a valid object', () {
      final map = {
        'id': 'notif_2',
        'issueId': 'issue_456',
        'issueDescription': 'Fallen tree blocking the road',
        'issueType': 1, // fallenTree
        'description': 'Needs cleanup',
        'issueStatus': 2, // inProgress
        'userId': 'user_2',
        'readNotification': true,
        'createdDate': '2024-06-02T08:00:00Z',
      };

      final notification = IssueNotification.fromMap(map);

      expect(notification.id, equals('notif_2'));
      expect(notification.issueType, equals(IssueType.fallenTree));
      expect(notification.issueStatus, equals(IssueStatus.inProgress));
      expect(notification.readNotification, isTrue);
    });
  });
}
