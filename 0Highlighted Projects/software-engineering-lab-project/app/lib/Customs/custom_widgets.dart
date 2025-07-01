import 'dart:math';
import 'package:flutter/material.dart';

class AppLogo extends StatelessWidget {
  final double? size;

  const AppLogo({super.key, this.size});

  @override
  Widget build(BuildContext context) {
    final width = MediaQuery.of(context).size.width;
    final logoSize = size ?? max(width / 4, 100);

    return Image.asset(
      'assets/logo.png', // Replace with your logo asset path
      height: logoSize,
      width: logoSize,
    );
  }
}
