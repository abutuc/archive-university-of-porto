namespace TapaBuracos.Api.Models.Models
{
    public record NewEvaluationDTO
    {
        public NewEvaluationDTO(string userId, string issueId, int rating, string comment, string municipalityId)
        {
            UserId = userId;
            IssueId = issueId;
            Rating = rating;
            Comment = comment;
            MunicipalityId = municipalityId;
        }

        public string UserId { get; }
        public string IssueId { get; }
        public int Rating { get; }
        public string Comment { get; }
        public string MunicipalityId { get; }
    }
}
