using FluentValidation.Results;
using Newtonsoft.Json;

namespace TapaBuracos.Citizen.Models
{
    public record ReportIssueResponseDTO
    {
        public ReportIssueResponseDTO(bool isDuplicatedIssue)
        {
            IsDuplicatedIssue = isDuplicatedIssue;
        }

        public ReportIssueResponseDTO(ValidationResult validationResult)
        {
            ValidationResult = validationResult;
        }

        [JsonConstructor]
        protected ReportIssueResponseDTO(bool isDuplicatedIssue, ValidationResult validationResult)
        {
            IsDuplicatedIssue = isDuplicatedIssue;
            ValidationResult = validationResult;
        }

        public bool IsDuplicatedIssue { get; }
        public ValidationResult ValidationResult { get; }
    }
}
