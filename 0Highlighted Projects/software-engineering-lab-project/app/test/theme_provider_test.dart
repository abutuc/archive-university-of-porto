import 'package:flutter/material.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:tapa_buracos/Themes/theme_provider.dart';
import 'package:tapa_buracos/Themes/app_themes.dart';

void main() {
  group('ThemeProvider Tests', () {
    test('Should initialize with regular user theme', () {
      final themeProvider = ThemeProvider();

      // Verify initial theme is regularUserTheme
      expect(themeProvider.isMunicipality, isFalse);
      expect(themeProvider.themeData, equals(regularUserTheme));
    });

    test('Should toggle to municipality theme', () {
      final themeProvider = ThemeProvider();

      // Toggle to municipality theme
      themeProvider.toggleTheme(true);

      // Verify the theme has been updated
      expect(themeProvider.isMunicipality, isTrue);
      expect(themeProvider.themeData, equals(municipalityTheme));
    });

    test('Should toggle back to regular user theme', () {
      final themeProvider = ThemeProvider();

      // Toggle to municipality theme first
      themeProvider.toggleTheme(true);
      expect(themeProvider.isMunicipality, isTrue);

      // Toggle back to regular user theme
      themeProvider.toggleTheme(false);

      // Verify the theme has been updated
      expect(themeProvider.isMunicipality, isFalse);
      expect(themeProvider.themeData, equals(regularUserTheme));
    });

    test('Should notify listeners when theme changes', () {
      final themeProvider = ThemeProvider();

      bool listenerNotified = false;

      // Add a listener to check if notifyListeners() is called
      themeProvider.addListener(() {
        listenerNotified = true;
      });

      // Toggle the theme
      themeProvider.toggleTheme(true);

      // Verify the listener was notified
      expect(listenerNotified, isTrue);
    });
  });
}
