import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:go_router/go_router.dart';
import 'package:provider/provider.dart';
import 'package:tapa_buracos/Customs/custom_widgets.dart';
import 'package:tapa_buracos/Themes/app_themes.dart';
import 'package:tapa_buracos/Themes/theme_provider.dart';

class HomePage extends StatelessWidget {
  const HomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            // Logo no topo
            const Padding(
              padding: EdgeInsets.only(top: 40.0),
              child: AppLogo(),
            ),
            const SizedBox(height: 20),

            // Título estilizado "Tapa Buracos"
            Padding(
              padding: const EdgeInsets.symmetric(horizontal: 40.0),
              child: Column(
                mainAxisSize: MainAxisSize.min,
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Text(
                    'Tapa',
                    style: Theme.of(context).textTheme.headlineLarge?.copyWith(
                          fontStyle: FontStyle.italic,
                          color: Colors.black87,
                        ),
                  ),
                  Padding(
                    padding: const EdgeInsets.only(left: 50.0),
                    child: Text(
                      'Buracos',
                      style:
                          Theme.of(context).textTheme.headlineLarge?.copyWith(
                                fontStyle: FontStyle.italic,
                                color: Colors.black54,
                              ),
                    ),
                  ),
                ],
              ),
            ),
            const SizedBox(height: 40),

            // Botão "Criar Conta"
            OutlinedButton(
              key: const Key('create_account_button'),
              onPressed: () {
                kIsWeb
                    ? _navigateToAuthPage(context, "sign-in", true)
                    : _showRoleSelectionDialog(context, isSignIn: true);
              },
              style: ElevatedButton.styleFrom(
                minimumSize: const Size(200, 40),
              ),
              child: const Text('Criar Conta'),
            ),
            const SizedBox(height: 10),

            // Botão "Iniciar Sessão"
            ElevatedButton(
              key: const Key('login_button'),
              onPressed: () {
                kIsWeb
                    ? _navigateToAuthPage(context, "login", true)
                    : _showRoleSelectionDialog(context, isSignIn: false);
              },
              style: OutlinedButton.styleFrom(
                minimumSize: const Size(200, 40),
              ),
              child: const Text('Iniciar Sessão'),
            ),
          ],
        ),
      ),
    );
  }

  void _showRoleSelectionDialog(BuildContext context,
      {required bool isSignIn}) {
    String routeName = isSignIn ? "sign-in" : "login";

    showDialog(
      context: context,
      builder: (BuildContext context) {
        return SimpleDialog(
          shape: RoundedRectangleBorder(
            borderRadius: BorderRadius.circular(15.0),
          ),
          contentPadding:
              const EdgeInsets.symmetric(vertical: 10, horizontal: 15),
          children: [
            Align(
              alignment: Alignment.topRight,
              child: GestureDetector(
                onTap: () {
                  Navigator.pop(context);
                },
                child: const Icon(Icons.close, size: 20),
              ),
            ),
            const SizedBox(height: 10),

            // Botão "Município"
            ElevatedButton(
              key: const Key('municipio_button'),
              style: ElevatedButton.styleFrom(backgroundColor: orangeColor),
              onPressed: () {
                // Change theme to municipality (orange theme)
                // Set to municipality theme

                Navigator.pop(context);
                _navigateToAuthPage(context, routeName, true);
              },
              child: const Text(
                'Município',
              ),
            ),
            const SizedBox(height: 10),

            // Botão "Cidadão"
            ElevatedButton(
              key: const Key('cidadao_button'),
              style: ElevatedButton.styleFrom(backgroundColor: greenColor),
              onPressed: () {
                // Change theme to citizen (green theme)

                Navigator.pop(context);
                _navigateToAuthPage(context, routeName, false);
              },
              child: const Text(
                'Cidadão',
              ),
            ),
            const SizedBox(height: 10),
          ],
        );
      },
    );
  }

  void _navigateToAuthPage(
      BuildContext context, String routeName, bool isMunicipality) {
    Provider.of<ThemeProvider>(context, listen: false)
        .toggleTheme(isMunicipality);
    context.goNamed(routeName, extra: isMunicipality);
  }
}
