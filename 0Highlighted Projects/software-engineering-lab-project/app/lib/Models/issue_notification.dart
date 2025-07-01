import 'issue_model.dart';

class IssueNotification {
  final String id;
  final String issueId;
  final String issueDescription;
  final IssueType issueType;
  final String description;
  final IssueStatus issueStatus;
  final String userId;
  final bool readNotification;
  final DateTime createdDate;

  IssueNotification({
    required this.id,
    required this.issueId,
    required this.issueDescription,
    required this.issueType,
    required this.description,
    required this.issueStatus,
    required this.userId,
    required this.readNotification,
    required this.createdDate
  });

  factory IssueNotification.fromMap(Map<String, dynamic> map) {
    return IssueNotification(
        id: map['id'] as String,
        issueId: map['issueId'] as String,
        issueDescription: map['issueDescription'] as String,
        issueType: IssueType.values[map['issueType'] as int],
        description: map['description'] as String,
        issueStatus: IssueStatus.values[map['issueStatus'] as int],
        userId: map['userId'] as String,
        readNotification: map['readNotification'] as bool,
        createdDate: DateTime.parse(map['createdDate'] as String));
  }
}