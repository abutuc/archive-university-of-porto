class Municipality {
  final String id;
  final String name;
  final String email;
  final String? photoUrl;
  final int minOccurrences;
  final List<String> postalCodes;
  final bool blocked;
  final DateTime? dateBlocked;

  Municipality({
    required this.id,
    required this.name,
    required this.email,
    required this.photoUrl,
    required this.minOccurrences,
    required this.postalCodes,
    required this.blocked,
    this.dateBlocked,
  });

  // Factory constructor to create a Municipality instance from a map with an external id (e.g., Firestore doc ID)
  factory Municipality.fromMap(String id, Map<String, dynamic> map) {
    return Municipality(
      id: id,
      name: map['name'] as String,
      email: map['email'] as String,
      photoUrl: map['PhotoUrl'],
      minOccurrences: map['minOccurrences'] as int,
      postalCodes: List<String>.from(map['postalCodes'] as List<dynamic>),
      blocked: map['blocked'] as bool,
      dateBlocked: map['dateBlocked'] != null
          ? DateTime.parse(map['dateBlocked'] as String)
          : null,
    );
  }

  // Convert Municipality instance to a map, useful for saving back to Firestore
  Map<String, dynamic> toMap() {
    return {
      'Name': name,
      'Email': email,
      'PhotoUrl': photoUrl,
      'MinOccurrences': minOccurrences,
      'PostalCodes': postalCodes,
      'Blocked': blocked,
      'DateBlocked': dateBlocked?.toIso8601String(),
    };
  }

  // Optional: Override toString for better debugging
  @override
  String toString() {
    return 'Municipality(id: $id, name: $name, email: $email, photoUrl: $photoUrl, minOccurrences: $minOccurrences, postalCodes: $postalCodes, blocked: $blocked, dateBlocked: $dateBlocked)';
  }
}
