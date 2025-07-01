import 'package:flutter_test/flutter_test.dart';
import 'package:tapa_buracos/Models/municipality_reporting_model.dart';

void main() {
  group('MunicipalityReporting Tests', () {
    test('MunicipalityReporting.fromMap should create a valid object', () {
      final map = {
        'numberOfReportedIssues': 10,
        'averageResponseTimes': '02:30:15',
        'resolutionRates': '85%',
        'graphData': [
          {'item1': 'Week 1', 'item2': 10},
          {'item1': 'Week 2', 'item2': 15},
        ],
      };

      final report = MunicipalityReporting.fromMap(map);

      expect(report.numberOfReportedIssues, equals(10));
      expect(report.averageResponseTimes,
          const Duration(hours: 2, minutes: 30, seconds: 15));
      expect(report.resolutionRates, equals('85%'));
      expect(report.graphData.length, equals(2));
      expect(report.graphData.first.interval, equals('Week 1'));
      expect(report.graphData.first.value, equals(10.0));
    });

    test('parseTimeSpan should parse correct Duration', () {
      final duration = parseTimeSpan('01:45:30.123');
      expect(
          duration,
          equals(const Duration(
              hours: 1, minutes: 45, seconds: 30, milliseconds: 123)));
    });
  });
}
