class MunicipalityReporting {
  final int numberOfReportedIssues;
  final Duration averageResponseTimes;
  final String resolutionRates;
  final List<ReportGraphData> graphData;

  MunicipalityReporting(
      {required this.numberOfReportedIssues,
      required this.averageResponseTimes,
      required this.resolutionRates,
        required this.graphData});

  factory MunicipalityReporting.fromMap(Map<String, dynamic> map) {
    return MunicipalityReporting(
        numberOfReportedIssues: map['numberOfReportedIssues'] as int,
        averageResponseTimes: parseTimeSpan(map["averageResponseTimes"] as String),
        resolutionRates: map["resolutionRates"] as String,
        graphData: (map["graphData"] as List).map((e) => ReportGraphData.fromMap(e as Map<String, dynamic>)).toList()
    );
  }

  @override
  String toString() {
    return 'MunicipalityReporting(numberOfReportedIssues: $numberOfReportedIssues, averageResponseTimes: $averageResponseTimes, resolutionRates: $resolutionRates)';
  }
}

class ReportGraphData {
  final String interval;
  final double value;

  ReportGraphData({required this.interval, required this.value});

  factory ReportGraphData.fromMap(Map<String, dynamic> map) {
    return ReportGraphData(
      interval: map['item1'] as String,
        value: (map['item2'] as num).toDouble());
  }

}

Duration parseTimeSpan(String timeSpan) {
  final parts = timeSpan.split(':');
  if (parts.length != 3) {
    throw const FormatException("Invalid time span format. Expected HH:mm:ss");
  }

  final hours = int.parse(parts[0]);
  final minutes = int.parse(parts[1]);

  final secondsParts = parts[2].split('.');
  final seconds = int.parse(secondsParts[0]);
  final milliseconds = secondsParts.length > 1
      ? int.parse(secondsParts[1].substring(0, 3))
      : 0;

  return Duration(
    hours: hours,
    minutes: minutes,
    seconds: seconds,
    milliseconds: milliseconds,
  );
}