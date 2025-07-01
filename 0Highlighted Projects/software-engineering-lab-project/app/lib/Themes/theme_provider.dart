import 'package:flutter/material.dart';
import 'app_themes.dart'; // Import the themes you created

class ThemeProvider with ChangeNotifier {
  bool _isMunicipality = false; // Default to regular user theme

  // Getter for the current theme
  ThemeData get themeData =>
      _isMunicipality ? municipalityTheme : regularUserTheme;

  bool get isMunicipality => _isMunicipality;

  // Toggle theme between municipality and regular user
  void toggleTheme(bool isMunicipality) {
    _isMunicipality = isMunicipality;
    notifyListeners(); // Notify widgets listening to this provider to rebuild
  }
}
