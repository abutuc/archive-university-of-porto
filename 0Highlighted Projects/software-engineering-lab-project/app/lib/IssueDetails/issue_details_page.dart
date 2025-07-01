import 'package:flutter/material.dart';
import 'package:tapa_buracos/Customs/custom_app_bar.dart';
import 'package:tapa_buracos/Customs/custom_bottom_bar.dart';
import 'package:tapa_buracos/Models/issue_model.dart';
import 'issue_details_widget.dart';

class IssueDetailsPage extends StatelessWidget {
  final Issue issue;
  final bool isMunicipality;

  const IssueDetailsPage(
      {super.key, required this.issue, required this.isMunicipality});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: const CustomAppBar(
        title: "Detalhes do Incidente",
        showBackButton: true,
      ),
      bottomNavigationBar: const CustomBottomBar(),
      body: IssueDetailsWidget(
        issue: issue,
        isMunicipality: isMunicipality,
      ),
    );
  }
}
