namespace TapaBuracos.Core.Models
{
    public record Evaluation
    {
        public Evaluation(string id, string userId, string issueId, int rating, string comment, string municipalityId)
        {
            Id = id;
            UserId = userId;
            IssueId = issueId;
            Rating = rating;
            Comment = comment;
            MunicipalityId = municipalityId;
        }

        public string Id { get; }
        public string UserId { get; }
        public string IssueId { get; }
        public int Rating { get; }
        public string Comment { get; }
        public string MunicipalityId { get; }
    }
}
