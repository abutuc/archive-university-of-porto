import 'package:flutter_test/flutter_test.dart';
import 'package:tapa_buracos/Models/municipality_model.dart';

void main() {
  group('Municipality Tests', () {
    test('Municipality.toMap should handle null dateBlocked', () {
      final municipality = Municipality(
        id: 'mun_1',
        name: 'Springfield',
        email: 'email@example.com',
        photoUrl: 'http://example.com/photo.png',
        minOccurrences: 10,
        postalCodes: ['12345'],
        blocked: false,
        dateBlocked: null,
      );

      final map = municipality.toMap();
      expect(map['DateBlocked'], isNull);
      expect(map['Blocked'], isFalse);
    });

    test('Municipality.fromMap should throw if map is missing fields', () {
      final map = {
        'Name': 'Springfield',
        'Blocked': true,
      };

      expect(
        () => Municipality.fromMap('mun_2', map),
        throwsA(
            isA<TypeError>()), // Missing required fields will throw an error
      );
    });
  });
}
