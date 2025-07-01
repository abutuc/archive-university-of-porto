import 'package:flutter/material.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:go_router/go_router.dart';
import 'package:provider/provider.dart';
import 'package:tapa_buracos/Customs/custom_widgets.dart';
import 'package:tapa_buracos/Themes/theme_provider.dart';
import 'package:tapa_buracos/Authentication/home_page.dart';

void main() {
  late GoRouter router;

  setUpAll(() {
    // Initialize GoRouter for navigation
    router = GoRouter(
      initialLocation: '/',
      routes: [
        GoRoute(
          path: '/',
          builder: (context, state) => const HomePage(),
        ),
        GoRoute(
          path: '/login',
          name: 'login',
          builder: (context, state) => const Scaffold(body: Text('Login Page')),
        ),
        GoRoute(
          path: '/sign-in',
          name: 'sign-in',
          builder: (context, state) =>
              const Scaffold(body: Text('Sign-In Page')),
        ),
      ],
    );
  });

  // Helper method to wrap the `HomePage` with providers and routing
  Widget createHomePageTestWidget() {
    return ChangeNotifierProvider(
      create: (_) => ThemeProvider(),
      child: MaterialApp.router(
        routerConfig: router,
      ),
    );
  }

  group('HomePage Widget Tests', () {
    testWidgets('Should display logo, titles, and buttons',
        (WidgetTester tester) async {
      await tester.pumpWidget(createHomePageTestWidget());

      // Verify logo
      expect(find.byType(AppLogo), findsOneWidget);

      // Verify titles
      expect(find.text('Tapa'), findsOneWidget);
      expect(find.text('Buracos'), findsOneWidget);

      // Verify buttons
      expect(find.byKey(const Key('create_account_button')), findsOneWidget);
      expect(find.byKey(const Key('login_button')), findsOneWidget);
    });

    testWidgets('Should show role selection dialog on "Criar Conta" tap',
        (WidgetTester tester) async {
      await tester.pumpWidget(createHomePageTestWidget());

      // Tap "Criar Conta" using key
      await tester.tap(find.byKey(const Key('create_account_button')));
      await tester.pumpAndSettle();

      // Verify the dialog appears
      expect(find.byType(SimpleDialog), findsOneWidget);
      expect(find.byKey(const Key('municipio_button')), findsOneWidget);
      expect(find.byKey(const Key('cidadao_button')), findsOneWidget);
    });

    testWidgets('Should navigate to sign-in page for Município',
        (WidgetTester tester) async {
      await tester.pumpWidget(createHomePageTestWidget());

      // Tap "Criar Conta" using key
      await tester.tap(find.byKey(const Key('create_account_button')));
      await tester.pumpAndSettle();

      // Tap "Município" using key
      await tester.tap(find.byKey(const Key('municipio_button')));
      await tester.pumpAndSettle();

      // Verify navigation
      expect(find.text('Sign-In Page'), findsOneWidget);
    });
  });
}
