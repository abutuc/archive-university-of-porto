import 'package:flutter_test/flutter_test.dart';
import 'package:tapa_buracos/Models/evaluation_model.dart'
    as Evaluation; // Replace with your file path

void main() {
  group('Evaluation Tests', () {
    test('Evaluation should initialize with correct values', () {
      final evaluation = Evaluation.Evaluation(
        id: '123',
        userId: 'user_1',
        rating: 5,
        comment: 'Great service!',
        municipalityId: 'municipality_1',
        issueId: 'issue1',
      );

      expect(evaluation.id, equals('123'));
      expect(evaluation.userId, equals('user_1'));
      expect(evaluation.rating, equals(5));
      expect(evaluation.comment, equals('Great service!'));
      expect(evaluation.municipalityId, equals('municipality_1'));
    });

    test('Evaluation.fromMap should create a valid object', () {
      final map = {
        'id': '123',
        'userId': 'user_1',
        'rating': 5,
        'comment': 'Great service!',
        'municipalityId': 'municipality_1',
        'issueId': 'issue1',
      };

      final evaluation = Evaluation.Evaluation.fromMap(map);

      expect(evaluation.id, equals('123'));
      expect(evaluation.userId, equals('user_1'));
      expect(evaluation.rating, equals(5));
      expect(evaluation.comment, equals('Great service!'));
      expect(evaluation.municipalityId, equals('municipality_1'));
    });

    test('Evaluation.toMap should convert to correct map', () {
      final evaluation = Evaluation.Evaluation(
        id: '123',
        userId: 'user_1',
        rating: 5,
        comment: 'Great service!',
        municipalityId: 'municipality_1',
        issueId: 'issue1',
      );

      final map = evaluation.toMap();

      expect(map['id'], equals('123'));
      expect(map['userId'], equals('user_1'));
      expect(map['rating'], equals(5));
      expect(map['comment'], equals('Great service!'));
      expect(map['municipalityId'], equals('municipality_1'));
    });

    test('Evaluation.fromMap should handle null municipalityId', () {
      final map = {
        'id': '123',
        'userId': 'user_1',
        'rating': 5,
        'comment': 'Great service!',
        'municipalityId': null, // Simulating optional field
        'issueId': 'issue1',
      };

      final evaluation = Evaluation.Evaluation.fromMap(map);

      expect(evaluation.municipalityId, isNull);
    });
  });
}
