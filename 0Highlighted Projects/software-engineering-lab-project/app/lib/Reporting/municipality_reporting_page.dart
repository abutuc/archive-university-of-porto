import 'dart:convert';
import 'dart:ui';

import 'package:firebase_auth/firebase_auth.dart';
import 'package:flutter/foundation.dart';
import 'package:flutter/material.dart';
import 'package:flutter/rendering.dart';
import 'package:syncfusion_flutter_charts/charts.dart';
import 'package:tapa_buracos/Customs/custom_app_bar.dart';
import 'package:tapa_buracos/Customs/custom_bottom_bar.dart';

import 'package:http/http.dart' as http;

import 'package:syncfusion_flutter_datepicker/datepicker.dart';
import 'package:intl/intl.dart';
import 'package:tapa_buracos/Models/municipality_reporting_model.dart';

import 'package:pdf/pdf.dart';
import 'package:pdf/widgets.dart' as pw;
import 'package:printing/printing.dart';

import '../API/api_config.dart';

class MunicipalityReportingPage extends StatefulWidget {
  const MunicipalityReportingPage({super.key});

  @override
  State<MunicipalityReportingPage> createState() =>
      _MunicipalityReportingPageState();
}

class _MunicipalityReportingPageState extends State<MunicipalityReportingPage>
    with SingleTickerProviderStateMixin {
  late MunicipalityReporting report = MunicipalityReporting(
    numberOfReportedIssues: 0,
    averageResponseTimes: Duration.zero,
    resolutionRates: "0%",
    graphData: [],
  );
  bool isCalendarOpen = false;
  DateTime startDate = DateTime.now().subtract(const Duration(days: 7));
  DateTime endDate = DateTime.now();
  String _range =
      '${DateFormat('dd/MM/yyyy').format(DateTime.now().subtract(const Duration(days: 7)))} -'
      ' ${DateFormat('dd/MM/yyyy').format(DateTime.now())}';
  bool _generatedReport = false;
  final bool _isDownloadable = false;
  bool _isLoading = false;
  final GlobalKey _graphKey = GlobalKey();

  late TabController _tabController;

  @override
  void initState() {
    super.initState();
    _tabController = TabController(length: 2, vsync: this);
  }

  @override
  void dispose() {
    _tabController.dispose();
    super.dispose();
  }

  void _onSelectionChanged(DateRangePickerSelectionChangedArgs args) {
    setState(() {
      if (args.value is PickerDateRange) {
        startDate = args.value.startDate;
        endDate = args.value.endDate;
        _range = '${DateFormat('dd/MM/yyyy').format(args.value.startDate)} -'
            ' ${DateFormat('dd/MM/yyyy').format(args.value.endDate)}';
      }
    });
  }

  Future<void> _fetchMunicipalityReporting() async {
    setState(() {
      _isLoading = true; // Start loader
    });

    try {
      final user = FirebaseAuth.instance.currentUser;
      if (user == null) {
        throw Exception("Nenhum utilizador autenticado");
      }

      final municipalityId = user.uid;
      final apiUrl = EnvironmentConfig.getMunicipalityReporting(municipalityId);

      final requestBody = jsonEncode({
        "startDate":
            DateFormat("yyyy-MM-ddTHH:mm:ss.SSS'Z'").format(startDate.toUtc()),
        "endDate":
            DateFormat("yyyy-MM-ddTHH:mm:ss.SSS'Z'").format(endDate.toUtc()),
      });

      final response = await http.post(
        Uri.parse(apiUrl),
        headers: {
          'Content-Type': 'application/json',
        },
        body: requestBody,
      );

      if (response.statusCode == 200) {
        final data = json.decode(response.body);
        final MunicipalityReporting reportResponse =
            MunicipalityReporting.fromMap(data);

        setState(() {
          report = reportResponse;
          _generatedReport = true;
          _isLoading = false; // Stop loader
        });
      } else {
        throw Exception("Failed to fetch report: ${response.statusCode}");
      }
    } catch (e) {
      setState(() {
        _isLoading = false; // Stop loader in case of error
      });
      // Optionally, show an error message using a SnackBar or AlertDialog
      if (mounted) {
        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(content: Text("Error fetching report: $e")),
        );
      }
    }
  }

  Future<Uint8List> _captureGraphAsImage() async {
    try {
      final boundary = _graphKey.currentContext?.findRenderObject()
          as RenderRepaintBoundary?;
      if (boundary != null) {
        final image = await boundary.toImage(
            pixelRatio: 1.0); // Higher pixel ratio for better quality
        final byteData = await image.toByteData(format: ImageByteFormat.png);
        return byteData!.buffer.asUint8List();
      }
    } catch (e) {
      if (kDebugMode) {
        print('Error capturing graph: $e');
      }
    }
    throw Exception("Failed to capture the graph.");
  }

  Future<Uint8List> _generatePDF() async {
    final user = FirebaseAuth.instance.currentUser;
    if (user == null) {
      throw Exception("Nenhum utilizador autenticado");
    }

    final municipalityId = user.displayName;

    final pdf = pw.Document();

    // Sample data
    var tableData = [
      ['Metric', 'Value'],
      ['Number of Reported Issues', report.numberOfReportedIssues],
      [
        'Average Response Times',
        '${report.averageResponseTimes.inMinutes} minutes'
      ],
      ['Resolution Rates', report.resolutionRates]
    ];

    final graphImage = await _captureGraphAsImage();

    // Add content to the PDF
    pdf.addPage(
      pw.MultiPage(
        pageFormat: PdfPageFormat.a4,
        build: (context) => [
          pw.Text("Municipality Report - $municipalityId",
              style: const pw.TextStyle(fontSize: 24)),
          pw.Text(_range),
          pw.SizedBox(height: 16),

          // Add Table
          pw.TableHelper.fromTextArray(
            headers: tableData[0],
            data: tableData.sublist(1),
            border: pw.TableBorder.all(),
            headerStyle: pw.TextStyle(fontWeight: pw.FontWeight.bold),
            cellAlignment: pw.Alignment.center,
          ),
          pw.SizedBox(height: 16),

          // Add Graph Placeholder (for now)
          pw.Center(
            child: pw.Image(
              pw.MemoryImage(graphImage),
              fit: pw.BoxFit.contain,
              height: 200,
            ),
          ),
        ],
      ),
    );

    return pdf.save();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: const CustomAppBar(title: "Relatórios do Município"),
      bottomNavigationBar: const CustomBottomBar(),
      body: LayoutBuilder(builder: (context, constraints) {
        final isWideScreen = constraints.maxWidth > 600;
        return Padding(
          padding: const EdgeInsets.all(16.0),
          child: Column(
            crossAxisAlignment: isWideScreen
                ? CrossAxisAlignment.start
                : CrossAxisAlignment.center,
            children: [
              isWideScreen
                  ? Row(
                      mainAxisAlignment: MainAxisAlignment.spaceBetween,
                      children: [
                        Row(
                          children: [
                            const Text("Intervalo temporal: "),
                            Text(_range),
                            IconButton(
                              onPressed: () {
                                setState(() {
                                  isCalendarOpen = !isCalendarOpen;
                                  _generatedReport = false;
                                });
                              },
                              icon: const Icon(Icons.calendar_month),
                            ),
                          ],
                        ),
                        ElevatedButton(
                          onPressed: () => {
                            _fetchMunicipalityReporting(),
                            setState(() {
                              _generatedReport = true;
                            })
                          },
                          child: const Text("Gerar Relatório"),
                        ),
                      ],
                    )
                  : Column(
                      children: [
                        Row(
                          mainAxisAlignment: MainAxisAlignment.center,
                          children: [
                            Text(_range),
                          ],
                        ),
                        IconButton(
                          onPressed: () {
                            setState(() {
                              isCalendarOpen = !isCalendarOpen;
                              _generatedReport = false;
                            });
                          },
                          icon: const Icon(Icons.calendar_month),
                        ),
                        if (!isCalendarOpen)
                          ElevatedButton(
                            onPressed: () => {
                              setState(() {
                                _generatedReport = true;
                              })
                            },
                            child: const Text("Gerar Relatório"),
                          ),
                      ],
                    ),
              if (isCalendarOpen)
                Column(
                  children: [
                    SfDateRangePicker(
                      onSelectionChanged: _onSelectionChanged,
                      selectionMode: DateRangePickerSelectionMode.range,
                      initialSelectedRange: PickerDateRange(startDate, endDate),
                    ),
                    const SizedBox(height: 16),
                    ElevatedButton(
                      onPressed: () {
                        setState(() {
                          isCalendarOpen = !isCalendarOpen;
                        });
                      },
                      child: const Text("Submeter Intervalo"),
                    ),
                  ],
                ),
              const SizedBox(height: 16),
              if (_isLoading)
                const Center(
                  child: CircularProgressIndicator(),
                ),
              if (!_isLoading && _generatedReport)
                Expanded(
                  // Ensures TabBarView expands properly
                  child: Column(
                    children: [
                      TabBar(
                        controller: _tabController,
                        tabs: [
                          const Tab(
                              icon: Icon(Icons.table_chart), text: "Tabela"),
                          if (isWideScreen)
                            const Tab(
                                icon: Icon(Icons.bar_chart), text: "Gráfico")
                        ],
                      ),
                      Expanded(
                        // Makes TabBarView take the remaining space
                        child: TabBarView(
                          controller: _tabController,
                          children: [
                            // Table View
                            Column(
                                crossAxisAlignment: CrossAxisAlignment.center,
                                children: [
                                  SizedBox(
                                    width: isWideScreen
                                        ? constraints.maxWidth * 0.8
                                        : constraints.maxWidth * 0.9,
                                    child: DataTable(
                                      columns: const <DataColumn>[
                                        DataColumn(
                                          label: Expanded(
                                            child: Text(
                                              'Medida',
                                              style: TextStyle(
                                                  fontStyle: FontStyle.italic),
                                            ),
                                          ),
                                        ),
                                        DataColumn(
                                          label: Expanded(
                                            child: Text(
                                              'Valor',
                                              style: TextStyle(
                                                  fontStyle: FontStyle.italic),
                                            ),
                                          ),
                                        ),
                                      ],
                                      rows: <DataRow>[
                                        DataRow(
                                          cells: <DataCell>[
                                            DataCell(isWideScreen
                                                ? const Text(
                                                    'Number of Reported Issues')
                                                : const Text(
                                                    'Nr. of Reported Issues')),
                                            DataCell(Text(
                                                '${report.numberOfReportedIssues}')),
                                          ],
                                        ),
                                        DataRow(
                                          cells: <DataCell>[
                                            DataCell(isWideScreen
                                                ? const Text(
                                                    'Average Response Times')
                                                : const Text(
                                                    'Avg. Response Times')),
                                            DataCell(Text(
                                                '${report.averageResponseTimes.inMinutes} minutes')),
                                          ],
                                        ),
                                        DataRow(
                                          cells: <DataCell>[
                                            DataCell(isWideScreen
                                                ? const Text('Resolution Rates')
                                                : const Text('Res. Rates')),
                                            DataCell(
                                                Text(report.resolutionRates)),
                                          ],
                                        ),
                                      ],
                                    ),
                                  ),
                                ]),
                            // Graph View
                            if (isWideScreen)
                              Column(
                                children: [
                                  Center(
                                    child: SizedBox(
                                        width: isWideScreen
                                            ? constraints.maxWidth * 0.8
                                            : constraints.maxWidth * 0.9,
                                        child: RepaintBoundary(
                                          key: _graphKey,
                                          child: SfCartesianChart(
                                            primaryXAxis: const CategoryAxis(),
                                            // Chart title
                                            title: const ChartTitle(
                                                text:
                                                    'Number of Reported Issues'),
                                            // Enable legend
                                            legend:
                                                const Legend(isVisible: true),
                                            // Enable tooltip
                                            tooltipBehavior:
                                                TooltipBehavior(enable: true),
                                            series: <CartesianSeries<
                                                ReportGraphData, String>>[
                                              LineSeries<ReportGraphData,
                                                  String>(
                                                dataSource: report.graphData,
                                                xValueMapper:
                                                    (ReportGraphData data, _) =>
                                                        data.interval,
                                                yValueMapper:
                                                    (ReportGraphData data, _) =>
                                                        data.value,
                                                name: 'Reported Issues',
                                                // Enable data label
                                                dataLabelSettings:
                                                    const DataLabelSettings(
                                                        isVisible: true),
                                                // Enable markers (dots) at each data point
                                                markerSettings:
                                                    const MarkerSettings(
                                                  isVisible: true, // Show dots
                                                  width: 6, // Size of the dots
                                                  height: 6, // Size of the dots
                                                ),
                                              ),
                                            ],
                                          ),
                                        )),
                                  ),
                                  const SizedBox(height: 45),
                                  ElevatedButton(
                                    onPressed: () async {
                                      final pdfData = await _generatePDF();
                                      await Printing.layoutPdf(
                                        onLayout:
                                            (PdfPageFormat format) async =>
                                                pdfData,
                                      );
                                    },
                                    child: const Text("Descarregar PDF"),
                                  ),
                                ],
                              )
                          ],
                        ),
                      ),
                    ],
                  ),
                )
            ],
          ),
        );
      }),
    );
  }
}
