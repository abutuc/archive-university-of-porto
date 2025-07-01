import 'package:firebase_auth/firebase_auth.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:tapa_buracos/API/api_config.dart';
import 'package:tapa_buracos/API/error_handling.dart';
import 'package:tapa_buracos/Customs/custom_app_bar.dart';
import 'package:tapa_buracos/Customs/custom_navigation.dart';

class SignInPage extends StatefulWidget {
  const SignInPage({super.key, required this.isMunicipality});

  final bool isMunicipality;

  @override
  State<SignInPage> createState() => _SignInPageState();
}

class _SignInPageState extends State<SignInPage> {
  final _formKey = GlobalKey<FormState>();
  final TextEditingController _nameController = TextEditingController();
  final TextEditingController _emailController = TextEditingController();
  final TextEditingController _passwordController = TextEditingController();
  final TextEditingController _confirmPasswordController =
      TextEditingController();
  bool _obscurePassword = true;
  bool _obscureConfirmPassword = true;
  bool _isLoading = false; // Estado de carregamento

  // Instância do FirebaseAuth
  final FirebaseAuth _auth = FirebaseAuth.instance;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: const CustomAppBar(
        title: 'Criar Conta',
        showBackButton: true,
      ),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Form(
          key: _formKey,
          child: Column(
            children: [
              // Campo Nome
              TextFormField(
                controller: _nameController,
                decoration: const InputDecoration(
                  labelText: 'Nome',
                  prefixIcon: Icon(Icons.person),
                ),
                validator: (value) {
                  if (value == null || value.isEmpty) {
                    return 'Por favor, insira o seu nome';
                  }
                  return null;
                },
              ),
              const SizedBox(height: 16),

              // Campo Email
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

              // Campo Password
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
                  if (value.length < 6) {
                    return 'A palavra-passe deve ter pelo menos 6 caracteres';
                  }
                  return null;
                },
              ),
              const SizedBox(height: 16),

              // Campo Confirmar Palavra-passe
              TextFormField(
                controller: _confirmPasswordController,
                decoration: InputDecoration(
                  labelText: 'Confirmar Palavra-passe',
                  prefixIcon: const Icon(Icons.lock),
                  suffixIcon: IconButton(
                    icon: Icon(
                      _obscureConfirmPassword
                          ? Icons.visibility
                          : Icons.visibility_off,
                    ),
                    onPressed: () {
                      setState(() {
                        _obscureConfirmPassword = !_obscureConfirmPassword;
                      });
                    },
                  ),
                ),
                obscureText: _obscureConfirmPassword,
                validator: (value) {
                  if (value == null || value.isEmpty) {
                    return 'Por favor, confirme a sua palavra-passe';
                  }
                  if (value != _passwordController.text) {
                    return 'As palavras-passe não coincidem';
                  }
                  return null;
                },
              ),
              const SizedBox(height: 32),

              // Botão Criar Conta com indicador de carregamento
              ElevatedButton(
                onPressed: _isLoading
                    ? null
                    : () {
                        if (_formKey.currentState!.validate()) {
                          _signUpWithEmailPassword();
                        }
                      },
                style: ElevatedButton.styleFrom(
                  minimumSize: const Size(double.infinity, 50),
                ),
                child: _isLoading
                    ? const CircularProgressIndicator()
                    : const Text('Criar Conta'),
              ),
            ],
          ),
        ),
      ),
    );
  }

  Future<void> _signUpWithEmailPassword() async {
    setState(() {
      _isLoading = true; // Iniciar carregamento
    });

    UserCredential? userCredential;

    try {
      // Step 1: Authenticate with Firebase to get the `uid`
      userCredential = await _auth.createUserWithEmailAndPassword(
        email: _emailController.text,
        password: _passwordController.text,
      );

      final String uid = userCredential.user?.uid ?? '';

      // Optionally update the display name with the entered name
      await userCredential.user?.updateDisplayName(_nameController.text);

      // Step 2: Register the user or municipality with the API using Firebase `uid`
      final apiSuccess = await _registerUserWithApi(
          uid, _nameController.text, _emailController.text, context);

      if (apiSuccess) {
        // Step 3: Send email verification if registration is successful
        await userCredential.user?.sendEmailVerification();
        if (mounted) {
          ScaffoldMessenger.of(context).showSnackBar(
            SnackBar(
              content: Text(
                widget.isMunicipality
                    ? 'Pedido de registo de município criado! Um email de verificação foi enviado. Verifique para concluir o registo.'
                    : 'Conta de utilizador criada! Um email de verificação foi enviado. Verifique para concluir o registo.',
              ),
            ),
          );

          checkEmailVerification(context);
        }
      } else {
        // Step 4: Revert Firebase account creation if API registration fails
        await userCredential.user?.delete();
        if (mounted) {
          ScaffoldMessenger.of(context).showSnackBar(
            SnackBar(
              content: Text(
                widget.isMunicipality
                    ? 'Falha ao registar o município na plataforma. A criação da conta foi revertida.'
                    : 'Falha ao registar o utilizador na app. A criação da conta foi revertida.',
              ),
            ),
          );
        }
      }
    } on FirebaseAuthException catch (e) {
      String message;
      if (kDebugMode) {
        print("Error - $e");
      }
      if (e.code == 'email-already-in-use') {
        message = widget.isMunicipality
            ? 'Este email de município já está registado. Use um email diferente.'
            : 'Este email já está registado. Use um email diferente.';
      } else if (e.code == 'weak-password') {
        message = widget.isMunicipality
            ? 'A palavra-passe é demasiado fraca para uma conta de município. Insira uma palavra-passe mais forte.'
            : 'A palavra-passe é demasiado fraca. Insira uma palavra-passe mais forte.';
      } else {
        message = 'Ocorreu um erro. Tente novamente.';
      }

      // Clean up if Firebase account creation fails but user object exists
      if (userCredential != null) {
        await userCredential.user?.delete();
      }
      if (mounted) {
        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(content: Text(message)),
        );
      }
    } finally {
      setState(() {
        _isLoading = false; // Stop loading
      });
    }
  }

  // Função para registar utilizador na API
  Future<bool> _registerUserWithApi(
      String id, String name, String email, BuildContext context) async {
    // Get the correct API URL based on whether it's a municipality or a user
    final apiUrl = widget.isMunicipality
        ? EnvironmentConfig.registerMunicipalityAssociation
        : EnvironmentConfig.registerUserAssociation;

    try {
      // Prepare the request body
      Map<String, dynamic> requestBody = {
        "id": id, // UID from Firebase
        "name": name,
        "email": email,
      };

      /*
      if (widget.isMunicipality) {
        requestBody['minOccurrences'] = 1;
        requestBody['postalCodes'] = ["4350-020"];
      } */

      // Use handleApiCall for the API request
      final response = await handleApiCall<ValidationResult>(
        url: apiUrl,
        requestBody: requestBody,
        context: context,
        fromJson: (json) => ValidationResult.fromJson(json),
      );

      if (response == null) {
        // If the response is null, error handling has already been done
        return false;
      }

      if (response.isValid) {
        if (kDebugMode) {
          print(
              '${widget.isMunicipality ? "Pedido de registo de Município" : "Utilizador"} registado na API com sucesso.');
        }
        return true; // Registration successful
      } else {
        if (context.mounted) {
          showValidationErrorsDialog(context, response.errors ?? []);
        }
        // Handle validation errors (already done in handleApiCasll)
        return false;
      }
    } catch (e) {
      if (kDebugMode) {
        print(
            'Erro ao registar ${widget.isMunicipality ? "Município" : "Utilizador"}: $e');
      }
      if (context.mounted) {
        showGenericErrorDialog(context,
            'Ocorreu um erro ao processar sua solicitação. Por favor, tente novamente.');
      }
      return false; // Handle unexpected errors
    }
  }

  @override
  void dispose() {
    _nameController.dispose();
    _emailController.dispose();
    _passwordController.dispose();
    _confirmPasswordController.dispose();
    super.dispose();
  }
}
