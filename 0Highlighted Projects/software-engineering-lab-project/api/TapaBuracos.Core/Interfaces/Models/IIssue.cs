using TapaBuracos.Core.Enums;
using TapaBuracos.Core.Models;

namespace TapaBuracos.Core.Interfaces.Models
{
    public interface IIssue
    {
        public string Id { get; }
        public IssueType Type { get; }
        public string OtherTypeDescription { get; }
        public Location Location { get; }
        public string Description { get; }
        public List<string> ReporterIds { get; }
        public DateTimeOffset DateReported { get; }
        public IssueStatus Status { get; }
        public string MunicipalityId { get; }
        public int Occurrences { get; }
        public string ImageUrl { get; }
        public string AssignedTeam { get; }
        public List<string> Watchers { get; }
    }
}