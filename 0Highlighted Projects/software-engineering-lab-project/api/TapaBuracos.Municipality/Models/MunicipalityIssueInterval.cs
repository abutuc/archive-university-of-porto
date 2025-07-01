using Newtonsoft.Json;

namespace TapaBuracos.Municipality.Models
{
    public record MunicipalityIssueInterval
    {
        [JsonConstructor]
        public MunicipalityIssueInterval(DateTime startDate, DateTime endDate)
        {
            StartDate = startDate;
            EndDate = endDate;
        }
        
        public DateTime StartDate { get; }
        public DateTime EndDate { get; }
        
    }
}
