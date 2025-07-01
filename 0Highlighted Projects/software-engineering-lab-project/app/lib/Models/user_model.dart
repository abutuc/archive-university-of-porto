class User {
  final String id;
  final String name;
  final String email;
  final String photoUrl;
  final bool blocked;
  final DateTime? dateBlocked;

  User({
    required this.id,
    required this.name,
    required this.email,
    required this.photoUrl,
    required this.blocked,
    this.dateBlocked,
  });

  // Factory constructor to create a User instance from a map with an external id (e.g., Firestore doc ID)
  factory User.fromMap(String id, Map<String, dynamic> map) {
    return User(
      id: id,
      name: map['Name'] as String,
      email: map['Email'] as String,
      photoUrl: map['PhotoUrl'] as String,
      blocked: map['Blocked'] as bool,
      dateBlocked: map['DateBlocked'] != null
          ? DateTime.parse(map['DateBlocked'] as String)
          : null,
    );
  }

  // Convert User instance to a map, useful for saving back to Firestore
  Map<String, dynamic> toMap() {
    return {
      'Name': name,
      'Email': email,
      'PhotoUrl': photoUrl,
      'Blocked': blocked,
      'DateBlocked': dateBlocked?.toIso8601String(),
    };
  }

  // Optional: Override toString for better debugging
  @override
  String toString() {
    return 'User(id: $id, name: $name, email: $email, photoUrl: $photoUrl, blocked: $blocked, dateBlocked: $dateBlocked)';
  }
}
