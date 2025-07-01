using FluentValidation.Results;
using Newtonsoft.Json;

namespace TapaBuracos.Municipality.Models
{
    public record MunicipalityIssueReportDTO
    {
        public MunicipalityIssueReportDTO(int numberOfReportedIssues, TimeSpan averageResponseTimes,
            string resolutionRates, List<(string, int)> graphData)
        {
            NumberOfReportedIssues = numberOfReportedIssues;
            AverageResponseTimes = averageResponseTimes;
            ResolutionRates = resolutionRates;
            GraphData = graphData;
        }


        public MunicipalityIssueReportDTO(ValidationResult validationResult)
        {
            ValidationResult = validationResult;
        }

        [JsonConstructor]
        protected MunicipalityIssueReportDTO(int numberOfReportedIssues, TimeSpan averageResponseTimes,
            string resolutionRates, List<(string, int)> graphData, ValidationResult validationResult)
        {
            NumberOfReportedIssues = numberOfReportedIssues;
            AverageResponseTimes = averageResponseTimes;
            ResolutionRates = resolutionRates;
            GraphData = graphData;
            ValidationResult = validationResult;

        }
        
        public int NumberOfReportedIssues { get; }
        public TimeSpan AverageResponseTimes { get; }
        public string ResolutionRates { get; }
        
        public List<(string, int)> GraphData { get; }
        public ValidationResult ValidationResult { get; }
    }
}
