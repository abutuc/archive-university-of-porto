import 'dart:convert';
import 'package:firebase_auth/firebase_auth.dart';
import 'package:firebase_core/firebase_core.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:http/http.dart' as http;
import 'package:provider/provider.dart';
import 'package:tapa_buracos/API/api_config.dart';
import 'package:tapa_buracos/Themes/theme_provider.dart';
import 'package:tapa_buracos/firebase_options.dart';
import 'package:tapa_buracos/routing/routes.dart';
import 'package:url_strategy/url_strategy.dart';

void main() async {
  WidgetsFlutterBinding.ensureInitialized();
  await Firebase.initializeApp(options: DefaultFirebaseOptions.currentPlatform);
  SystemChrome.setPreferredOrientations([
    DeviceOrientation.portraitUp,
    DeviceOrientation.portraitDown,
  ]);

  // Perform the municipality check
  final isMunicipality = await _initializeMunicipalityCheck();

  final themeProvider = ThemeProvider();

  themeProvider.toggleTheme(isMunicipality);

  setPathUrlStrategy();

  runApp(
    ChangeNotifierProvider(
      create: (_) => themeProvider,
      child: MyApp(isMunicipality: isMunicipality),
    ),
  );
}

Future<bool> _initializeMunicipalityCheck() async {
  try {
    if (kIsWeb) return true;
    final curUser = FirebaseAuth.instance.currentUser;
    if (curUser == null) {
      return false; // Default to non-municipality if no user is logged in
    }

    // API call to check if the user is a municipality
    final response = await http.get(
      Uri.parse(EnvironmentConfig.getMunicipalityById(curUser.uid)),
      headers: {'Content-Type': 'application/json'},
    );

    if (response.statusCode == 200) {
      final data = jsonDecode(response.body);
      // Check if the `id` exists in the response to verify it's a municipality
      return data['id'] != null;
    } else {
      return false;
    }
  } catch (e) {
    debugPrint("Error checking municipality: $e");
    return false;
  }
}

class MyApp extends StatelessWidget {
  final bool isMunicipality;

  const MyApp({super.key, required this.isMunicipality});

  @override
  Widget build(BuildContext context) {
    final router = goRouter(isMunicipality);
    return Consumer<ThemeProvider>(
      builder: (context, themeProvider, child) {
        return MaterialApp.router(
          title: 'Tapa-Buracos!',
          theme: themeProvider.themeData,
          routeInformationParser: router.routeInformationParser,
          routerDelegate: router.routerDelegate,
          routeInformationProvider: router.routeInformationProvider,
        );
      },
    );
  }
}
