import 'dart:convert';

import 'package:firebase_auth/firebase_auth.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:tapa_buracos/API/api_config.dart';
import 'package:tapa_buracos/Customs/custom_app_bar.dart';
import 'package:tapa_buracos/Customs/custom_navigation.dart';
import 'package:http/http.dart' as http;

class LoginPage extends StatefulWidget {
  final bool isMunicipality;

  const LoginPage({super.key, required this.isMunicipality});

  @override
  State<LoginPage> createState() => _LoginPageState();
}

class _LoginPageState extends State<LoginPage> {
  final _formKey = GlobalKey<FormState>();
  final TextEditingController _emailController = TextEditingController();
  final TextEditingController _passwordController = TextEditingController();
  bool _obscurePassword = true;
  bool _isLoading = false;

  final FirebaseAuth _auth = FirebaseAuth.instance;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: CustomAppBar(
        showBackButton: true,
        title: widget.isMunicipality ? 'Login Município' : 'Login Utilizador',
      ),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Form(
          key: _formKey,
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              // Email Field
              TextFormField(
                controller: _emailController,
                decoration: const InputDecoration(
                  labelText: 'Email',
                  prefixIcon: Icon(Icons.email),
                ),
                keyboardType: TextInputType.emailAddress,
                validator: (value) {
                  if (value == null || value.isEmpty) {
                    return 'Por favor, insira o seu email';
                  }
                  return null;
                },
              ),
              const SizedBox(height: 16),

              // Password Field
              TextFormField(
                controller: _passwordController,
                decoration: InputDecoration(
                  labelText: 'Palavra-passe',
                  prefixIcon: const Icon(Icons.lock),
                  suffixIcon: IconButton(
                    icon: Icon(
                      _obscurePassword
                          ? Icons.visibility
                          : Icons.visibility_off,
                    ),
                    onPressed: () {
                      setState(() {
                        _obscurePassword = !_obscurePassword;
                      });
                    },
                  ),
                ),
                obscureText: _obscurePassword,
                validator: (value) {
                  if (value == null || value.isEmpty) {
                    return 'Por favor, insira a sua palavra-passe';
                  }
                  return null;
                },
              ),
              const SizedBox(height: 32),

              // Login Button with Loading Indicator
              ElevatedButton(
                onPressed: _isLoading
                    ? null
                    : () {
                        if (_formKey.currentState!.validate()) {
                          _loginWithEmailPassword();
                        }
                      },
                style: ElevatedButton.styleFrom(
                  minimumSize: const Size(double.infinity, 50),
                ),
                child: _isLoading
                    ? const CircularProgressIndicator(color: Colors.white)
                    : const Text('Iniciar Sessão'),
              ),
            ],
          ),
        ),
      ),
    );
  }

  Future<void> _loginWithEmailPassword() async {
    setState(() {
      _isLoading = true; // Start loading
    });

    try {
      // Attempt to sign in with Firebase Authentication
      await _auth.signInWithEmailAndPassword(
        email: _emailController.text,
        password: _passwordController.text,
      );

      // If login is successful, check if the account matches the expected type
      final user = _auth.currentUser;
      if (user != null) {
        bool isAccountValid = await _verifyAccountType(user.uid);

        if (isAccountValid) {
          // Show success message
          if (mounted) {
            ScaffoldMessenger.of(context).showSnackBar(
              SnackBar(
                content: Text(
                  widget.isMunicipality
                      ? 'Sessão iniciada com sucesso para o município!'
                      : 'Sessão iniciada com sucesso!',
                ),
              ),
            );
          }

          // Navigate to the main page or perform additional actions after login
          if (mounted) {
            checkEmailVerification(context);
          }
        } else {
          // Log out if the account type does not match
          await _auth.signOut();
          if (mounted) {
            ScaffoldMessenger.of(context).showSnackBar(
              const SnackBar(
                content: Text('Nenhuma conta encontrada com esses dados.'),
              ),
            );
          }
        }
      }
    } on FirebaseAuthException catch (e) {
      String message = '';
      if (e.code == 'user-not-found') {
        'Nenhuma conta encontrada com esse email.';
      } else if (e.code == 'wrong-password') {
        message = widget.isMunicipality
            ? 'Palavra-passe incorreta para o município.'
            : 'Palavra-passe incorreta.';
      } else {
        message = 'Ocorreu um erro. Por favor, tente novamente.';
      }
      if (mounted) {
        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(content: Text(message)),
        );
      }
    }
    if (mounted) {
      setState(() {
        _isLoading = false; // Stop loading
      });
    }
  }

  Future<bool> _verifyAccountType(String userId) async {
    try {
      final apiUrl = widget.isMunicipality
          ? EnvironmentConfig.getMunicipalityById(userId)
          : EnvironmentConfig.getUserById(userId);

      final response = await http.get(
        Uri.parse(apiUrl),
        headers: {'Content-Type': 'application/json'},
      );

      if (response.statusCode == 200) {
        final data = jsonDecode(response.body);
        // If `id` exists in the response, the account is valid
        return data['id'] != null;
      } else {
        return false; // Account type mismatch
      }
    } catch (e) {
      if (kDebugMode) {
        print("Erro ao verificar o tipo de conta: $e");
      }
      return false;
    }
  }

  @override
  void dispose() {
    _emailController.dispose();
    _passwordController.dispose();
    super.dispose();
  }
}
