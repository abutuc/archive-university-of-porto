enum IssueType {
  roadHole,
  fallenTree,
  accident,
  publicLightingFailure,
  accumulatedGarbage,
  trafficSignsDamaged,
  other,
}

extension IssueTypeExtension on IssueType {
  String get displayName {
    switch (this) {
      case IssueType.roadHole:
        return 'Buraco na Estrada';
      case IssueType.fallenTree:
        return 'Árvore Caída';
      case IssueType.accident:
        return 'Acidente';
      case IssueType.publicLightingFailure:
        return 'Falta de Iluminação Pública';
      case IssueType.accumulatedGarbage:
        return 'Lixo Acumulado';
      case IssueType.trafficSignsDamaged:
        return 'Sinais de Trânsito Danificados';
      case IssueType.other:
        return 'Outro';
      default:
        return '';
    }
  }
}

enum IssueStatus {
  newIssue, // Renamed to avoid reserved word conflict
  approved,
  inProgress,
  resolved,
}

extension IssueStatusExtension on IssueStatus {
  String get displayName {
    switch (this) {
      case IssueStatus.newIssue:
        return 'Novo';
      case IssueStatus.approved:
        return 'Aprovado';
      case IssueStatus.inProgress:
        return 'Em Progresso';
      case IssueStatus.resolved:
        return 'Resolvido';
      default:
        return '';
    }
  }
}

class InfoLocation {
  final double latitude;
  final double longitude;

  InfoLocation({
    required this.latitude,
    required this.longitude,
  });

  Map<String, dynamic> toMap() {
    return {
      'latitude': latitude,
      'longitude': longitude,
    };
  }

  factory InfoLocation.fromMap(Map<String, dynamic> map) {
    return InfoLocation(
      latitude: map['latitude'] as double,
      longitude: map['longitude'] as double,
    );
  }
}

enum IssuePriority {
  low,
  medium,
  high,
  urgent,
}

extension IssuePriorityExtension on IssuePriority {
  String get displayName {
    switch (this) {
      case IssuePriority.low:
        return 'Baixa';
      case IssuePriority.medium:
        return 'Média';
      case IssuePriority.high:
        return 'Alta';
      case IssuePriority.urgent:
        return 'Urgente';
      default:
        return '';
    }
  }
}

class Issue {
  final String id;
  final IssueType type;
  final String? otherTypeDescription; // Optional for 'other' type
  final InfoLocation location;
  final String description;
  final List<String> reporterIds; // Updated to handle multiple reporters
  final List<String> watchers;
  final DateTime dateReported;
  final IssueStatus status;
  final String municipalityId;
  final int occurrences;
  final String? imageUrl;
  final String? assignedTeam; // Added field
  final IssuePriority? priority; // Added field
  String address;
  final String? municipalityObservations;
  final DateTime? dateApproved;
  final DateTime? dateResolved;

  Issue({
    required this.id,
    required this.type,
    this.otherTypeDescription,
    required this.location,
    required this.description,
    required this.reporterIds,
    required this.watchers,
    required this.dateReported,
    required this.status,
    required this.municipalityId,
    this.occurrences = 0,
    this.imageUrl,
    this.assignedTeam, // New field
    this.priority, // New field
    required this.address,
    this.municipalityObservations,
    this.dateApproved,
    this.dateResolved,
  });

  Map<String, dynamic> toMap() {
    return {
      'id': id,
      'type': type.index,
      'otherTypeDescription': otherTypeDescription,
      'location': location.toMap(),
      'description': description,
      'reporterIds': reporterIds,
      'dateReported': dateReported.toIso8601String(),
      'status': status.index,
      'municipalityId': municipalityId,
      'occurrences': occurrences,
      'imageUrl': imageUrl,
      'assignedTeam': assignedTeam, // New field
      'priority': priority?.index, // New field
      'address': address,
      'conclusionObservations': municipalityObservations,
      'dateApproved': dateApproved?.toIso8601String(),
      'dateResolved': dateResolved?.toIso8601String(),
      'watchers': watchers,
    };
  }

  factory Issue.fromMap(Map<String, dynamic> map) {
    return Issue(
      id: map['id'] as String,
      type: IssueType.values[map['type'] as int],
      otherTypeDescription: map['otherTypeDescription'] as String?,
      location: InfoLocation.fromMap(map['location'] as Map<String, dynamic>),
      description: map['description'] as String,
      reporterIds: List<String>.from(map['reporterIds'] as List),
      watchers: List<String>.from(map['watchers'] as List),
      dateReported: DateTime.parse(map['dateReported'] as String),
      status: IssueStatus.values[map['status'] as int],
      municipalityId: map['municipalityId'] as String,
      occurrences: map['occurrences'] ?? 0,
      imageUrl: map['imageUrl'] as String?,
      assignedTeam: map['assignedTeam'] as String?, // New field
      priority: map['priority'] != null
          ? IssuePriority.values[map['priority'] as int]
          : null, // New field
      address: map['address'] ?? '',
      municipalityObservations: map['conclusionObservations'] as String?,
      dateApproved: map['dateApproved'] != null
          ? DateTime.parse(map['dateApproved'] as String)
          : null,
      dateResolved: map['dateResolved'] != null
          ? DateTime.parse(map['dateResolved'] as String)
          : null,
    );
  }
}
