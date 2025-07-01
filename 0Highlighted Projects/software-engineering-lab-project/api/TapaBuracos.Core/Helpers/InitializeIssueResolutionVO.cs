using TapaBuracos.Core.Enums;

namespace TapaBuracos.Core.Helpers
{
    public record InitializeIssueResolutionVO
    {
        public InitializeIssueResolutionVO(string issueId, string assignedTeam, string observations, Priority priority)
        {
            IssueId = issueId;
            AssignedTeam = assignedTeam;
            Observations = observations;
            Priority = priority;
        }

        public string IssueId { get; }
        public string AssignedTeam { get; }
        public string Observations { get; }
        public Priority Priority { get; }
    }
}
