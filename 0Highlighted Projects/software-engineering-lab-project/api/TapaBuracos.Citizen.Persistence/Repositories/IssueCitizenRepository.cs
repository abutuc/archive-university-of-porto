using Coelho.Arc.Bosporus.Firestore.Repositories;
using Google.Cloud.Firestore;
using Mapster;
using TapaBuracos.Citizen.Interfaces.Repositories;
using TapaBuracos.Citizen.Persistence.Helpers;
using TapaBuracos.Core.Enums;
using TapaBuracos.Core.Interfaces.Models;
using TapaBuracos.Core.Models;
using TapaBuracos.Persistence.Models;

namespace TapaBuracos.Citizen.Persistence.Repositories
{
    public class IssueCitizenRepository : FirestoreRepositoryBase<IssuePersistence>, IIssueCitizenRepository
    {

        protected override string CollectionName => "Issues";

        public IssueCitizenRepository(FirestoreDb database) : base(database)
        {
        }

        public async Task RegisterIssueAsync(IIssue issue)
        {
            var persistence = issue.Adapt<IssuePersistence>();
            await AddAsync(persistence);
        }

        public async Task<Issue> FindIssueById(string issueId)
        {
            var result = await GetAsync(issueId);
            return result?.Adapt<Issue>();
        }

        public async Task DeleteIssueById(string issueId)
        {
            await DeleteAsync(issueId);
        }
        
        public async Task<bool> CheckIfDuplicatedIssueAsync(IIssue issue)
        {
            //TODO: distance is hardcoded as of yet
            //var geoPoints = GeoLocator.GetLowerAndUpperPointsByDistanceInMeters(issue.Location.Latitude, issue.Location.Longitude, 100);
            var latitudes = GeoLocator.GetLowerAndUpperLatitudesByDistanceInMeters(issue.Location.Latitude, 100);
            var longitudes = GeoLocator.GetLowerAndUpperLongitudesByDistanceInMeters(issue.Location.Longitude, 100);

            var query = Collection.WhereEqualTo(nameof(IssuePersistence.Type), issue.Type)
                                  .WhereEqualTo(nameof(IssuePersistence.MunicipalityId), issue.MunicipalityId);

            var snapshot = await query.GetSnapshotAsync();
            if (!snapshot.Documents.Any())
                return false;

            //TODO: Temporary util a better way is found to identify through the driver.
            //Try to create a struct in the collection to use it as query in the future
            List<IssuePersistence> result = [];
            foreach (var d in snapshot.Documents) result.Add(d.ConvertTo<IssuePersistence>());
            return result.Any(i => i.Location.Latitude >= latitudes.LowerLatitude && i.Location.Latitude <= latitudes.UpperLatitude &&
                                   i.Location.Longitude >= longitudes.LowerLongitude && i.Location.Longitude <= longitudes.UpperLongitude);
        }

        public async Task ApproveIssueAsync(string issueId)
        {
            var document = await Collection.Document(issueId)
                                           .GetSnapshotAsync();
            if (!document.Exists) return;
            var occurrences = document.GetValue<int>(nameof(IssuePersistence.Occurrences));

            // this threshold should be in the future retrieved using the municipality id
            //const int approvalThreshold = 5;
            //if (occurrences < approvalThreshold) return;
            var update = new Dictionary<string, object>
            {
                { nameof(IssuePersistence.Status), IssueStatus.Approved },
                { nameof(IssuePersistence.DateApproved), DateTime.UtcNow }
            };

            await document.Reference.UpdateAsync(update);
        }
        

        public async Task IncrementIssueOccurenceAsync(string issueId)
        {
            var document = await Collection.Document(issueId)
                                           .GetSnapshotAsync();

            if (!document.Exists) return;
            var update = new Dictionary<string, object>
            {
                { nameof(IssuePersistence.Occurrences), FieldValue.Increment(1) }
            };
            await document.Reference.UpdateAsync(update);
        }

        public async Task<IEnumerable<Issue>> ObtainActiveIssuesAsync()
        {
            var filterValues = new List<IssueStatus> { IssueStatus.Resolved, IssueStatus.New };
            var query = Collection.WhereIn(nameof(IssuePersistence.Status), filterValues);
            var snapshot = await query.GetSnapshotAsync();
            List<IssuePersistence> result = [];
            foreach (var d in snapshot.Documents) result.Add(d.ConvertTo<IssuePersistence>());
            return result.Adapt<IEnumerable<Issue>>();
        }

        public async Task<IEnumerable<Issue>> ObtainUserIssues(string userId)
        {
            var query = Collection.WhereArrayContains(nameof(IssuePersistence.ReporterIds), userId);
            var snapshot = await query.GetSnapshotAsync();
            List<IssuePersistence> result = [];
            foreach (var d in snapshot.Documents) result.Add(d.ConvertTo<IssuePersistence>());
            return result.Adapt<IEnumerable<Issue>>();
        }

        public async Task AddWatcher(string issueId, string userId)
        {
            var document = await Collection.Document(issueId)
                .GetSnapshotAsync();
            
            if (!document.Exists) return;

            List<string> watchers = document.GetValue<List<string>>(nameof(IssuePersistence.Watchers));

            if (watchers.Any(w => w == userId)) return;
            
            watchers.Add(userId);
            
            var update = new Dictionary<string, object>
            {
                { nameof(IssuePersistence.Watchers), watchers }
            };
            
            await document.Reference.UpdateAsync(update);
        }

        public async Task RemoveWatcher(string issueId, string userId)
        {
            var document = await Collection.Document(issueId)
                .GetSnapshotAsync();
            
            if (!document.Exists) return;

            List<string> watchers = document.GetValue<List<string>>(nameof(IssuePersistence.Watchers));

            watchers.Remove(userId);
            
            var update = new Dictionary<string, object>
            {
                { nameof(IssuePersistence.Watchers), watchers }
            };
            
            await document.Reference.UpdateAsync(update);
        }
    }
}

