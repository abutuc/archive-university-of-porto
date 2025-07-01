using TapaBuracos.Core.Enums;
using TapaBuracos.Core.Models;

namespace TapaBuracos.Tests.TypeInitializers
{
    internal record IssueInitializer : Issue
    {
        public IssueInitializer(string id, IssueType type, string otherTypeDescription, Location location, string description, List<string> reporterIds, DateTimeOffset dateReported, IssueStatus status, string municipalityId, int occurrences, string imageUrl, string asignedTeam, string municipalityObeservations, DateTime? dateApproved, DateTime? dateResolved, Priority? priority, List<string> watchers) : base(id, type, otherTypeDescription, location, description, reporterIds, dateReported, status, municipalityId, occurrences, imageUrl, asignedTeam, municipalityObeservations, dateApproved, dateResolved, priority, watchers)
        {
        }

        protected IssueInitializer(Issue issue, double newLat, double newLon) : base(issue.Id, issue.Type, issue.OtherTypeDescription, new Location(newLat, newLon), issue.Description, issue.ReporterIds, issue.DateReported, issue.Status, issue.MunicipalityId, issue.Occurrences, issue.ImageUrl, issue.AssignedTeam, issue.MunicipalityObservations, issue.DateApproved, issue.DateResolved, issue.Priority, issue.Watchers)
        {
        }

        public IssueInitializer DeviateLocationByMetersReturningDeviatedIssue(double meters)
        {
            var distanceInMiles = meters / 1609.344;

            // ~1 mile of lat and lon in degrees
            double lat = 0.0144927536231884;
            double lon = 0.0181818181818182;

            return new IssueInitializer(this, Location.Latitude + (distanceInMiles * lat), Location.Longitude + (distanceInMiles * lon));
        }
    }
}
