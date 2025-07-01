import 'package:firebase_auth/firebase_auth.dart';
import 'package:flutter/material.dart';
import 'package:go_router/go_router.dart';
import 'package:provider/provider.dart';
import 'package:tapa_buracos/Themes/theme_provider.dart';

Future<void> checkEmailVerification(
  BuildContext context,
) async {
  final provider = Provider.of<ThemeProvider>(context, listen: false);
  final isMunicipality = provider.isMunicipality;
  User? user = FirebaseAuth.instance.currentUser;
  await user?.reload(); // Refresh the user's status
  user = FirebaseAuth.instance.currentUser;
  if (context.mounted) {
    if (user != null && user.emailVerified) {
      // If verified, navigate to LandingPage
      isMunicipality
          ? context.goNamed("municipalityReports", extra: isMunicipality)
          : context.goNamed('report');
    } else {
      // If not verified, navigate to VerificationPage
      context.goNamed('verification');
    }
  }
}
