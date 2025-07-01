import 'package:flutter/material.dart';
import 'package:go_router/go_router.dart';
import 'package:provider/provider.dart';

import '../Themes/theme_provider.dart';

class CustomBottomBar extends StatelessWidget {
  const CustomBottomBar({super.key});

  @override
  Widget build(BuildContext context) {
    final double barHeight = MediaQuery.of(context).size.height * 0.08;
    final isMunicipality =
        Provider.of<ThemeProvider>(context, listen: false).isMunicipality;

    return Container(
      padding: EdgeInsets.zero,
      height: barHeight,
      decoration: BoxDecoration(
        color: Theme.of(context).colorScheme.primary,
        boxShadow: [
          BoxShadow(
            color: Colors.black.withOpacity(0.1),
            spreadRadius: 5,
            blurRadius: 10,
            offset: const Offset(0, 3),
          ),
        ],
      ),
      child: Row(
        mainAxisAlignment: MainAxisAlignment.spaceAround,
        children: [
          Expanded(
            child: _buildBarItem(context,
                icon: Icons.list_alt_rounded,
                routeName: isMunicipality ? 'municipalityReports' : 'reports',
                tooltip: "Relatórios",
                height: barHeight),
          ),
          if (isMunicipality)
            Expanded(
                child: _buildBarItem(context,
                    icon: Icons.show_chart,
                    routeName: 'municipalityReporting',
                    tooltip: 'Relatórios ',
                    height: barHeight)
            ),
          if (!isMunicipality)
            Expanded(
              child: _buildBarItem(context,
                  icon: Icons.format_list_bulleted_add,
                  routeName: 'report',
                  tooltip: "Reportar",
                  height: barHeight),
            ),
          Expanded(
            child: _buildBarItem(
              context,
              icon: Icons.account_circle,
              routeName: 'profile',
              tooltip: "Perfil",
              height: barHeight,
            ),
          ),
        ],
      ),
    );
  }

  Widget _buildBarItem(
    BuildContext context, {
    required IconData icon,
    required String routeName,
    required String tooltip,
    required double height,
  }) {
    final isSelected = _isSelectedRoute(context, routeName);
    final isMunicipality =
        Provider.of<ThemeProvider>(context, listen: false).isMunicipality;

    return GestureDetector(
      onTap: () => context.goNamed(routeName, extra: isMunicipality),
      child: Container(
        height: height,
        padding: EdgeInsets.zero,
        decoration: BoxDecoration(
          color: isSelected
              ? Theme.of(context).colorScheme.secondary
              : Colors.transparent,
          border: Border.all(
            color: isSelected
                ? Theme.of(context).colorScheme.secondary
                : Colors.transparent,
            width: 2,
          ),
        ),
        child: Icon(
          icon,
          color: Theme.of(context).colorScheme.onPrimary,
          size: 35,
        ),
      ),
    );
  }

  bool _isSelectedRoute(BuildContext context, String route) {
    final currentLocation =
        GoRouter.of(context).routerDelegate.currentConfiguration.uri.toString();
    return currentLocation == "/$route";
  }
}
