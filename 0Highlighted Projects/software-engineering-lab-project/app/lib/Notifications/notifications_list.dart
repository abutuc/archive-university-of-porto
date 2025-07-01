import 'dart:convert';

import 'package:firebase_auth/firebase_auth.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:go_router/go_router.dart';
import 'package:http/http.dart' as http;
import 'package:tapa_buracos/API/api_config.dart';
import 'package:tapa_buracos/Customs/custom_app_bar.dart';
import 'package:tapa_buracos/Customs/custom_bottom_bar.dart';

import '../Models/issue_model.dart';
import '../Models/issue_notification.dart';


class NotificationsList extends StatefulWidget {
  const NotificationsList({super.key});

  @override
  State<NotificationsList> createState() => _NotificationsListState();
}

class _NotificationsListState extends State<NotificationsList> {
  List<IssueNotification> _issueNotifications = [];
  bool _isLoading = false;

  @override
  void initState() {
    super.initState();
    _fetchUserNotifications();
  }

  Future<void> _fetchUserNotifications() async {
    setState(() {
      _isLoading = true;
      _issueNotifications = [];
    });

    try {
      final user = FirebaseAuth.instance.currentUser;
      if (user == null) {
        throw Exception("Nenhum utilizador autenticado");
      }

      final userId = user.uid;
      final apiUrl = EnvironmentConfig.obtainUserIssueNotifications(userId);

      final response = await http.get(Uri.parse(apiUrl));

      if (response.statusCode == 200) {
        final List<dynamic> data = jsonDecode(response.body);
        setState(() {
          _issueNotifications = data.map((json) => IssueNotification.fromMap(json)).toList();
        });
        _isLoading = false;

        if (kDebugMode) {
          print("User issues notifications fetched successfully: ${response.body}");
        }

      } else {
        throw Exception(
            'Falha ao carregar notificações do utilizador: ${response.statusCode}');
      }
    } catch (e) {
      if (kDebugMode) {
        print('Erro ao procurar notificações do utilizador: $e');
      }
      if (mounted) {
        setState(() {
          _isLoading = false;
        });
      }
    }
  }

  Future<void> _readNotification(String notificationId) async {

    final apiUrl = EnvironmentConfig.markIssueNotificationAsRead(notificationId);

    final response = await http.post(Uri.parse(apiUrl));

    if (response.statusCode == 200) {

      if (kDebugMode) {
        print("Notification read succesfully.");
      }

      IssueNotification? removableNotification;
      for (var notification in _issueNotifications) {
        if (notification.id == notificationId) {
          removableNotification = notification;
        }
      }

      if (removableNotification != null) {
        setState(() {
          _issueNotifications.remove(removableNotification);
        });
      }

    } else {
      throw Exception(
          'Falha ao carregar notificações do utilizador: ${response.statusCode}');
    }
  }

  Future<Issue?> _getIssueById(String issueId) async {
    try {
      final apiUrl = EnvironmentConfig.obtainIssueDetails(issueId);

      final response = await http.get(Uri.parse(apiUrl));

      Issue? issue;

      if (response.statusCode == 200) {
        final Map<String, dynamic> data = jsonDecode(response.body);

        issue = Issue.fromMap(data);

        if (kDebugMode) {
          print("Issue fetched successfully: ${response.body}");
        }

        return issue;

      } else {
        throw Exception(
            'Falha ao buscar issue: ${response.statusCode}');
      }
    } catch (e) {
      if (kDebugMode) {
        print('Erro ao buscar issue: $e');
      }
      if (mounted) {
        setState(() {
          _isLoading = false;
        });
      }
    }
    return null;
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: const CustomAppBar(title: "Notificações", showBackButton: true,),
      bottomNavigationBar: const CustomBottomBar(),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          children: [
            Expanded(
              child: _isLoading
                  ? const Center(child: CircularProgressIndicator())
                  : _issueNotifications.isEmpty
                  ? const Center(
                child: Text("Nenhuma notificação encontrada."),
              )
                  : ListView.builder(
                itemCount: _issueNotifications.length,
                padding: const EdgeInsets.symmetric(vertical: 8),
                itemBuilder: (context, index) {
                  final notification = _issueNotifications[index];
                  return Container(
                    margin: const EdgeInsets.symmetric(
                        vertical: 4.0,
                        horizontal: 8.0),
                    decoration: BoxDecoration(
                        border: Border.all(
                            color: Theme.of(context)
                                .colorScheme
                                .tertiaryContainer),
                        borderRadius: BorderRadius.vertical(
                          top: Radius.circular(index == 0 ? 12 : 0),
                          bottom: Radius.circular(
                              index == _issueNotifications.length - 1
                                  ? 12
                                  : 0),
                        ),
                        color:
                        Theme.of(context).colorScheme.onPrimary),
                    child: ListTile(
                      title: Text(notification.issueType.displayName),
                      subtitle: Column(
                        crossAxisAlignment: CrossAxisAlignment.start,
                        children: [
                          Text(
                            notification.issueDescription,
                            style: TextStyle(
                                color: Colors.grey[700],
                                fontSize: 14),
                          ),
                          Text(
                            notification.createdDate.toString().split('.')[0],
                            style: TextStyle(
                                color : Colors.grey[700],
                                fontSize: 14),
                          )
                        ],
                      ),
                      trailing: IconButton(onPressed: () => {
                        _readNotification(notification.id)
                      }, icon: const Icon(Icons.check)),
                        onTap: () async {
                        // it should also mark the notification as read
                  context.push(
                  '/issue-details/${notification.issueId}',
                  extra: {
                  'issue': await _getIssueById(notification.issueId),
                  'isMunicipality': false
                  },
                  );
                  },
                    ),
                  );
                },
              ),
            ),
          ],
        ),
      ),
    );
  }
}
