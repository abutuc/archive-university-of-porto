class Evaluation {
  final String? id;
  final String userId;
  final String issueId; // New field
  final int rating;
  final String comment;
  final String? municipalityId;

  Evaluation({
    this.id,
    required this.userId,
    required this.issueId, // Updated constructor
    required this.rating,
    required this.comment,
    this.municipalityId,
  });

  // Factory method to create Evaluation from JSON
  factory Evaluation.fromMap(Map<String, dynamic> json) {
    return Evaluation(
      id: json['id'] as String,
      userId: json['userId'] as String,
      issueId: json['issueId'] as String, // New mapping
      rating: json['rating'] as int,
      comment: json['comment'] as String,
      municipalityId: json['municipalityId'] as String?,
    );
  }

  // Convert Evaluation instance to JSON
  Map<String, dynamic> toMap() {
    return {
      'id': id,
      'userId': userId,
      'issueId': issueId, // New mapping
      'rating': rating,
      'comment': comment,
      'municipalityId': municipalityId,
    };
  }
}
