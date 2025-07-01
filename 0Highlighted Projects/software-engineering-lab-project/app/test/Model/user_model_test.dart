import 'package:flutter_test/flutter_test.dart';
import 'package:tapa_buracos/Models/user_model.dart';

void main() {
  group('User Tests', () {
    test('User.toMap should handle null dateBlocked', () {
      final user = User(
        id: 'user_1',
        name: 'John Doe',
        email: 'john.doe@example.com',
        photoUrl: 'http://example.com/photo.jpg',
        blocked: true,
        dateBlocked: null,
      );

      final map = user.toMap();
      expect(map['DateBlocked'], isNull);
      expect(map['Blocked'], isTrue);
    });

    test('User.fromMap should throw on missing fields', () {
      final map = {
        'Name': 'John Doe',
      };

      expect(
        () => User.fromMap('user_1', map),
        throwsA(isA<TypeError>()),
      );
    });
  });
}
