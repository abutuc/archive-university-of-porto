import 'package:flutter/material.dart';

const Color greenColor = Color(0xFF2E7D32); // #2E7D32 (Green)
const Color blueColor = Color(0xFF0070E0); // #0070E0 (Blue)
const Color orangeColor = Color(0xFFB64F00); // #B64F00 (Orange)

// Regular user theme (Primary: Green, Secondary: Blue)
ThemeData regularUserTheme = ThemeData(
  colorScheme: const ColorScheme(
    primary: greenColor, // Green for primary
    onPrimary: Colors.white,
    secondary: orangeColor, // Blue for secondary
    onSecondary: Colors.white,
    surface: Color(0xFFF5F5F5),
    onSurface: Color(0xFF212121),
    error: Color(0xFFD32F2F),
    onError: Colors.white,
    brightness: Brightness.light,
  ),
  fontFamily: 'NotoSans',
  textTheme: _textTheme,
  appBarTheme: const AppBarTheme(
    backgroundColor: greenColor, // Green AppBar
    titleTextStyle: TextStyle(
        fontSize: 20, fontWeight: FontWeight.bold, color: Colors.white),
    iconTheme: IconThemeData(color: Colors.white),
  ),
  elevatedButtonTheme: ElevatedButtonThemeData(
    style: ElevatedButton.styleFrom(
      backgroundColor: greenColor,
      foregroundColor: Colors.white,
      textStyle: const TextStyle(fontSize: 16, fontWeight: FontWeight.bold),
      shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(8)),
    ),
  ),
  outlinedButtonTheme: OutlinedButtonThemeData(
    style: OutlinedButton.styleFrom(
      foregroundColor: orangeColor, // Blue for outline
      side: const BorderSide(color: orangeColor),
      textStyle: const TextStyle(fontSize: 16, fontWeight: FontWeight.bold),
      shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(8)),
    ),
  ),
  inputDecorationTheme: InputDecorationTheme(
    filled: true,
    fillColor: Colors.white,
    floatingLabelStyle: const TextStyle(color: greenColor),
    labelStyle: const TextStyle(color: Color(0xFF757575)),
    border: OutlineInputBorder(
      borderRadius: BorderRadius.circular(8),
      borderSide: const BorderSide(color: Color(0xFFBDBDBD)),
    ),
    focusedBorder: OutlineInputBorder(
      borderRadius: BorderRadius.circular(8),
      borderSide: const BorderSide(color: greenColor, width: 2),
    ),
    errorBorder: OutlineInputBorder(
      borderRadius: BorderRadius.circular(8),
      borderSide: const BorderSide(color: Colors.red, width: 2),
    ),
  ),
  floatingActionButtonTheme: const FloatingActionButtonThemeData(
    backgroundColor: greenColor, // Green FAB
    foregroundColor: Colors.white,
  ),
  iconTheme: const IconThemeData(color: greenColor),
  iconButtonTheme: IconButtonThemeData(
    style: IconButton.styleFrom(
      foregroundColor: orangeColor, // Orange for secondary action icons
      padding: const EdgeInsets.all(8.0),
      iconSize: 28,
      shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(8)),
    ),
  ),
  progressIndicatorTheme: const ProgressIndicatorThemeData(
    color: greenColor,
    circularTrackColor: Color(0xFFBDBDBD),
  ),
  bottomNavigationBarTheme: const BottomNavigationBarThemeData(
    backgroundColor: Colors.white,
    selectedItemColor: greenColor,
    unselectedItemColor: Color(0xFF757575),
    showUnselectedLabels: true,
  ),
  snackBarTheme: SnackBarThemeData(
    backgroundColor: greenColor,
    contentTextStyle: const TextStyle(color: Colors.white, fontSize: 16),
    behavior: SnackBarBehavior.floating,
    shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(8)),
  ),
  scaffoldBackgroundColor: const Color(0xFFF5F5F5),
);

// Municipality theme (Primary: Orange, Secondary: Blue)
ThemeData municipalityTheme = ThemeData(
  colorScheme: const ColorScheme(
    primary: orangeColor, // Orange for primary
    onPrimary: Colors.white,
    secondary: greenColor, // Blue for secondary
    onSecondary: Colors.white,
    surface: Color(0xFFF5F5F5),
    onSurface: Color(0xFF212121),
    error: Color(0xFFD32F2F),
    onError: Colors.white,
    brightness: Brightness.light,
  ),
  fontFamily: 'NotoSans',
  textTheme: _textTheme,
  appBarTheme: const AppBarTheme(
    backgroundColor: orangeColor, // Orange AppBar
    titleTextStyle: TextStyle(
        fontSize: 20, fontWeight: FontWeight.bold, color: Colors.white),
    iconTheme: IconThemeData(color: Colors.white),
  ),
  elevatedButtonTheme: ElevatedButtonThemeData(
    style: ElevatedButton.styleFrom(
      backgroundColor: orangeColor, // Orange buttons
      foregroundColor: Colors.white,
      textStyle: const TextStyle(fontSize: 16, fontWeight: FontWeight.bold),
      shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(8)),
    ),
  ),
  outlinedButtonTheme: OutlinedButtonThemeData(
    style: OutlinedButton.styleFrom(
      foregroundColor: greenColor,
      side: const BorderSide(color: greenColor),
      textStyle: const TextStyle(fontSize: 16, fontWeight: FontWeight.bold),
      shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(8)),
    ),
  ),
  inputDecorationTheme: InputDecorationTheme(
    filled: true,
    fillColor: Colors.white,
    floatingLabelStyle: const TextStyle(color: greenColor),
    labelStyle: const TextStyle(color: Color(0xFF757575)),
    border: OutlineInputBorder(
      borderRadius: BorderRadius.circular(8),
      borderSide: const BorderSide(color: Color(0xFFBDBDBD)),
    ),
    focusedBorder: OutlineInputBorder(
      borderRadius: BorderRadius.circular(8),
      borderSide: const BorderSide(color: orangeColor, width: 2),
    ),
    errorBorder: OutlineInputBorder(
      borderRadius: BorderRadius.circular(8),
      borderSide: const BorderSide(color: Colors.red, width: 2),
    ),
  ),
  floatingActionButtonTheme: const FloatingActionButtonThemeData(
    backgroundColor: orangeColor, // Orange FAB
    foregroundColor: Colors.white,
  ),
  iconTheme: const IconThemeData(color: orangeColor),
  iconButtonTheme: IconButtonThemeData(
    style: IconButton.styleFrom(
      foregroundColor: greenColor, // Green for secondary action icons
      padding: const EdgeInsets.all(8.0),
      iconSize: 28,
      shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(8)),
    ),
  ),
  progressIndicatorTheme: const ProgressIndicatorThemeData(
    color: orangeColor,
    circularTrackColor: Color(0xFFBDBDBD),
  ),
  bottomNavigationBarTheme: const BottomNavigationBarThemeData(
    backgroundColor: Colors.white,
    selectedItemColor: orangeColor,
    unselectedItemColor: Color(0xFF757575),
    showUnselectedLabels: true,
  ),
  snackBarTheme: SnackBarThemeData(
    backgroundColor: orangeColor,
    contentTextStyle: const TextStyle(color: Colors.white, fontSize: 16),
    behavior: SnackBarBehavior.floating,
    shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(8)),
  ),
  scaffoldBackgroundColor: const Color(0xFFF5F5F5),
);

// Shared TextTheme
const TextTheme _textTheme = TextTheme(
  displayLarge: TextStyle(
      fontSize: 48, fontWeight: FontWeight.bold, color: Color(0xFF212121)),
  displayMedium: TextStyle(
      fontSize: 36, fontWeight: FontWeight.bold, color: Color(0xFF212121)),
  displaySmall: TextStyle(
      fontSize: 28, fontWeight: FontWeight.bold, color: Color(0xFF212121)),
  headlineLarge: TextStyle(
      fontSize: 32, fontWeight: FontWeight.bold, color: Color(0xFF212121)),
  headlineMedium: TextStyle(
      fontSize: 24, fontWeight: FontWeight.w600, color: Color(0xFF212121)),
  headlineSmall: TextStyle(
      fontSize: 20, fontWeight: FontWeight.w500, color: Color(0xFF212121)),
  titleLarge: TextStyle(
      fontSize: 22, fontWeight: FontWeight.bold, color: Color(0xFF212121)),
  titleMedium: TextStyle(
      fontSize: 18, fontWeight: FontWeight.w500, color: Color(0xFF212121)),
  titleSmall: TextStyle(
      fontSize: 16, fontWeight: FontWeight.w500, color: Color(0xFF212121)),
  bodyLarge: TextStyle(fontSize: 16, color: Color(0xFF212121)),
  bodyMedium: TextStyle(fontSize: 14, color: Color(0xFF757575)),
  bodySmall: TextStyle(fontSize: 12, color: Color(0xFF757575)),
  labelLarge:
      TextStyle(fontSize: 16, fontWeight: FontWeight.bold, color: Colors.white),
  labelMedium: TextStyle(
      fontSize: 14, fontWeight: FontWeight.bold, color: Color(0xFF212121)),
  labelSmall: TextStyle(
      fontSize: 12, fontWeight: FontWeight.bold, color: Color(0xFF212121)),
);
