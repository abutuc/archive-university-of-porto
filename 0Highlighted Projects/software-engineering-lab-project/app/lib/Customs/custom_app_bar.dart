import 'package:firebase_auth/firebase_auth.dart';
import 'package:flutter/material.dart';
import 'package:flutter_svg/svg.dart';
import 'package:go_router/go_router.dart';
import 'package:tapa_buracos/Customs/custom_widgets.dart';

class CustomAppBar extends StatelessWidget implements PreferredSizeWidget {
  final String title;
  final bool showBackButton;
  final bool showNotificationsButton;
  final bool hasNotifications;

  const CustomAppBar({
    super.key,
    required this.title,
    this.showBackButton = false,
    this.showNotificationsButton = false,
    this.hasNotifications = false
  });

  @override
  Widget build(BuildContext context) {
    final String initialRoute =
        FirebaseAuth.instance.currentUser != null ? 'report' : 'home';
    const String notificationRoute = 'notifications';

    return AppBar(
      elevation: 5,
      shadowColor: Colors.black,
      leadingWidth: 30,
      title: Row(
        children: [
          GestureDetector(
            onTap: () {
              context.goNamed(
                  initialRoute); // Assumes the home route is named 'home' in GoRouter
            },
            child: const Padding(
              padding: EdgeInsets.only(right: 8.0),
              child: AppLogo(size: 45,), // The logo widget that serves as a button
            ),
          ),
          Text(title),
          const Spacer(),
          if (showNotificationsButton && hasNotifications)
              IconButton(
                onPressed: () {
                  context.goNamed(
                    notificationRoute
                  );
                },
                icon: SvgPicture.asset(
                  'assets/notifications_unread_24dp_FFFFFF_FILL1_wght400_GRAD0_opsz24.svg',
                  width: 28,
                  height: 28,
                ),
                color: Colors.white
              ),
            if (showNotificationsButton && !hasNotifications)
              IconButton(
                  onPressed: () {
                    context.goNamed(
                        notificationRoute
                    );
                  },
                  icon: const Icon(Icons.notifications),
                  color: Colors.white
              ),

        ],
      ),
      centerTitle: false,
      automaticallyImplyLeading: showBackButton, // Show back button if true
    );
  }

  @override
  Size get preferredSize => const Size.fromHeight(kToolbarHeight);
}
