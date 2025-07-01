using Newtonsoft.Json;
using TapaBuracos.Core.Enums;
using TapaBuracos.Core.Interfaces.Models;

namespace TapaBuracos.Core.Models
{
    public record Issue : IIssue
    {

        [JsonConstructor]
        public Issue(string id, IssueType type, string otherTypeDescription, Location location, string description, List<string> reporterIds, DateTimeOffset dateReported, IssueStatus status, string municipalityId, int occurrences, string imageUrl, string assignedTeam, string municipalityObservations, DateTimeOffset? dateApproved, DateTimeOffset? dateResolved, Priority? priority, List<string> watchers)
        {
            Id = id;
            Type = type;
            OtherTypeDescription = otherTypeDescription;
            Location = location;
            Description = description;
            ReporterIds = reporterIds;
            DateReported = dateReported;
            Status = status;
            MunicipalityId = municipalityId;
            Occurrences = occurrences;
            ImageUrl = imageUrl;
            AssignedTeam = assignedTeam;
            MunicipalityObservations = municipalityObservations;
            DateApproved = dateApproved;
            DateResolved = dateResolved;
            Priority = priority;
            Watchers = watchers;
        }

        public string Id { get; }
        public IssueType Type { get; }
        public string OtherTypeDescription { get;  }
        public Location Location { get; }
        public string Description { get; }
        public List<string> ReporterIds { get; }
        public DateTimeOffset DateReported { get; }
        public IssueStatus Status { get; }
        public string MunicipalityId { get; }
        public int Occurrences { get; }
        public string ImageUrl { get; }
        public string AssignedTeam { get; }
        public string MunicipalityObservations { get; }
        public DateTimeOffset? DateApproved { get; }
        public DateTimeOffset? DateResolved { get; }
        public Priority? Priority { get; }
        public List<string> Watchers { get; }
    }
}