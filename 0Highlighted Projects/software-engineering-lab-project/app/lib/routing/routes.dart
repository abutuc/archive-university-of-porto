import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:go_router/go_router.dart';
import 'package:firebase_auth/firebase_auth.dart'; // Import Firebase Auth
import 'package:tapa_buracos/Authentication/home_page.dart';
import 'package:tapa_buracos/Authentication/login_page.dart';
import 'package:tapa_buracos/Authentication/signin_page.dart';
import 'package:tapa_buracos/Authentication/verification_page.dart';
import 'package:tapa_buracos/IssueDetails/issue_details_page.dart';
import 'package:tapa_buracos/IssueListing/municipality_report_list_page.dart';
import 'package:tapa_buracos/Notifications/notifications_list.dart';
import 'package:tapa_buracos/Reporting/municipality_reporting_page.dart';
import 'package:tapa_buracos/profile_page.dart';
import 'package:tapa_buracos/Reporting/report_issue_page.dart';
import 'package:tapa_buracos/IssueListing/report_list_page.dart';

// Determine initial route based on authentication state
final String initialRoute =
    FirebaseAuth.instance.currentUser != null ? '/report' : '/';

GoRouter goRouter(bool isMunicipality) => GoRouter(
      initialLocation: FirebaseAuth.instance.currentUser == null
          ? '/'
          : isMunicipality
              ? '/municipalityReports'
              : '/report',
      routes: <GoRoute>[
        GoRoute(
          name: 'home',
          path: '/',
          builder: (BuildContext context, GoRouterState state) =>
              const HomePage(),
        ),
        GoRoute(
          name: 'sign-in',
          path: '/sign-in',
          builder: (BuildContext context, GoRouterState state) => SignInPage(
            isMunicipality: state.extra as bool,
          ),
        ),
        GoRoute(
          name: 'login',
          path: '/login',
          builder: (BuildContext context, GoRouterState state) => LoginPage(
            isMunicipality: kIsWeb ? true : state.extra as bool? ?? false,
          ),
        ),
        GoRoute(
          name: 'verification',
          path: '/verification',
          builder: (context, state) => const VerificationPage(),
        ),
        GoRoute(
          name: 'profile',
          path: '/profile',
          builder: (context, state) => const ProfilePage(),
        ),
        GoRoute(
          name: 'report',
          path: '/report',
          builder: (context, state) => isMunicipality
              ? const MunicipalityReportListPage()
              : const CreateReportPage(),
        ),
        GoRoute(
          name: 'reports',
          path: '/reports',
          builder: (context, state) {
            return const ReportListPage();
          },
        ),
        GoRoute(
          name: 'municipalityReports',
          path: '/municipalityReports',
          builder: (context, state) {
            return const MunicipalityReportListPage();
          },
        ),
        GoRoute(
          name: 'municipalityReporting',
          path: '/municipalityReporting',
          builder: (context, state) {
            return const MunicipalityReportingPage();
          },
        ),
        GoRoute(
          name: 'issue-details',
          path: '/issue-details/:issueId', // Include issueId in the path
          builder: (context, state) {
            final data = state.extra as Map<String, dynamic>;
            final issue = data['issue']; // Retrieve the Issue object
            final isMunicipality = data['isMunicipality'];
            return IssueDetailsPage(
              issue: issue,
              isMunicipality: isMunicipality,
            );
          },
        ),
        GoRoute(
          name: "notifications",
          path: '/notifications',
          builder: (context, state) {
            return const NotificationsList();
          }
        )
      ],
      errorPageBuilder: (BuildContext context, GoRouterState state) {
        return MaterialPage<void>(
          child: Scaffold(
            floatingActionButton: const Align(
              alignment: Alignment.centerRight,
              child: CircularProgressIndicator(),
            ),
            body: Center(child: Text(state.error.toString())),
          ),
        );
      },
      redirect: (BuildContext context, GoRouterState state) {
        final isLoggedIn = FirebaseAuth.instance.currentUser != null;
        final isGoingToReportPage = state.uri.toString() == '/report';

        // Redirect to home if not logged in and trying to access the report page
        if (!isLoggedIn && isGoingToReportPage) {
          return '/';
        }

        // If logged in and accessing the home page, redirect to the report page
        if (isLoggedIn && state.uri.toString() == '/') {
          return '/report';
        }

        // No redirect needed
        return null;
      },
    );
