namespace TapaBuracos.Core.Helpers
{
    public record ConcludeIssueVO
    {
        public ConcludeIssueVO(string issueId, string observations, DateTime dateResolved)
        {
            IssueId = issueId;
            Observations = observations;
            DateResolved = dateResolved;
        }

        public string IssueId { get; }
        public string Observations { get; }
        public DateTime DateResolved { get; }
    }
}
