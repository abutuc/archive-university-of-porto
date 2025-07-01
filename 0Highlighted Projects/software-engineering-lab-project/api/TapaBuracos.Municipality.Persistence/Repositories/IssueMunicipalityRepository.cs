using Coelho.Arc.Bosporus.Firestore.Repositories;
using Coelho.Arc.Constantinople.Interfaces;
using Google.Cloud.Firestore;
using Mapster;
using System.Text;
using TapaBuracos.Core.Interfaces.Services;
using TapaBuracos.Core.Enums;
using TapaBuracos.Core.Helpers;
using TapaBuracos.Core.Interfaces.Filters;
using TapaBuracos.Core.Models;
using TapaBuracos.Municipality.Interfaces.Repositories;
using TapaBuracos.Municipality.Models;
using TapaBuracos.Persistence.Models;

namespace TapaBuracos.Municipality.Persistence.Repositories
{
    public class IssueMunicipalityRepository : FirestoreRepositoryBase<IssuePersistence>, IIssueMunicipalityRepository
    {
        protected override string CollectionName => "Issues";
        protected IIssueNotificationService NotificationService { get; }
        
        public IssueMunicipalityRepository(FirestoreDb database, IIssueNotificationService notificationService) : base(database)
        {
            NotificationService = notificationService;
        }

        public async Task<Issue> ObtainIssueAsync(string issueId, string municipalityId)
        {
            var snapshot = await Collection.WhereEqualTo(nameof(IssuePersistence.MunicipalityId), municipalityId)
                                           .WhereNotEqualTo(nameof(IssuePersistence.Status), IssueStatus.New)
                                           .GetSnapshotAsync();
            return snapshot.Documents.FirstOrDefault(d => d.Id == issueId)?.ConvertTo<IssuePersistence>()?.Adapt<Issue>() ?? null;
        }

        public async Task<List<Issue>> ObtainIssuesAsync(string municipalityId)
        {
            var snapshot = await Collection.WhereEqualTo(nameof(IssuePersistence.MunicipalityId), municipalityId)
                                           .WhereNotEqualTo(nameof(IssuePersistence.Status), IssueStatus.New)
                                           .GetSnapshotAsync();

            List<Issue> result = [];
            foreach (var d in snapshot.Documents) result.Add(d.ConvertTo<IssuePersistence>().Adapt<Issue>());
            return result;
        }

        public async Task InitiateResolutionAsync(InitializeIssueResolutionVO initializeIssueResolutionVO)
        {
            var document = await Collection.Document(initializeIssueResolutionVO.IssueId)
                                           .GetSnapshotAsync();

            var sb = new StringBuilder();
            sb.AppendLine(Core.Properties.Resources.OnIssueInitializationMessageBodyStart);
            sb.AppendLine(string.IsNullOrWhiteSpace(initializeIssueResolutionVO.Observations) ? " - - - " : initializeIssueResolutionVO.Observations);

            var update = new Dictionary<string, object>
            {
                { nameof(IssuePersistence.Status), IssueStatus.InProgress },
                { nameof(IssuePersistence.MunicipalityObservations), sb.ToString() },
                { nameof(IssuePersistence.Priority), initializeIssueResolutionVO.Priority }
            };
            
            foreach (var watcher in document.GetValue<List<string>>(nameof(IssuePersistence.Watchers)))
                await NotificationService.CreateIssueNotificationAsync(new IssueNotification(Guid.NewGuid().ToString(), initializeIssueResolutionVO.IssueId,
                    document.GetValue<string>(nameof(IssuePersistence.Description)), document.GetValue<IssueType>(nameof(IssuePersistence.Type)), "O estado do issue mudou para em progresso", document.GetValue<IssueStatus>(nameof(IssuePersistence.Status)), watcher,
                    false, DateTimeOffset.Now));

            await document.Reference.UpdateAsync(update);
        }

        public async Task ConcludeResolutionAsync(ConcludeIssueVO concludeIssueVO)
        {
            var document = await Collection.Document(concludeIssueVO.IssueId)
                                           .GetSnapshotAsync();

            var observations = document.GetValue<string>(nameof(IssuePersistence.MunicipalityObservations));
            var sb = new StringBuilder(observations);
            sb.AppendLine(Core.Properties.Resources.OnIssueConclusionMessageBodyStart);
            sb.AppendLine(string.IsNullOrWhiteSpace(concludeIssueVO.Observations) ? " - - - " : concludeIssueVO.Observations);

            var update = new Dictionary<string, object>
            {
                { nameof(IssuePersistence.Status), IssueStatus.Resolved },
                { nameof(IssuePersistence.DateResolved), concludeIssueVO.DateResolved},
                { nameof(IssuePersistence.MunicipalityObservations), sb.ToString()}
            };
            
            foreach (var watcher in document.GetValue<List<string>>(nameof(IssuePersistence.Watchers)))
                await NotificationService.CreateIssueNotificationAsync(new IssueNotification(Guid.NewGuid().ToString(), concludeIssueVO.IssueId,
                    document.GetValue<string>(nameof(IssuePersistence.Description)), document.GetValue<IssueType>(nameof(IssuePersistence.Type)), "O estado do issue mudou para resolvido", document.GetValue<IssueStatus>(nameof(IssuePersistence.Status)), watcher,
                    false, DateTimeOffset.Now));

            await document.Reference.UpdateAsync(update);
        }

        [Obsolete("Marked to removal")]
        public async Task<List<Issue>> ObtainMunicipalityIssuesBetweenIntervalAsync(string municipalityId,
            MunicipalityIssueInterval issueInterval)
        {
            var snapshot = await Collection
                .WhereEqualTo(nameof(IssuePersistence.MunicipalityId), municipalityId)
                .WhereGreaterThanOrEqualTo(nameof(IssuePersistence.DateReported), issueInterval.StartDate)
                .WhereLessThanOrEqualTo(nameof(IssuePersistence.DateReported), issueInterval.EndDate)
                .GetSnapshotAsync();

            return snapshot.Documents
                .Select(d => d.ConvertTo<IssuePersistence>().Adapt<Issue>())
                .ToList();
        }

		public async Task<List<Issue>> ObtainMunicipalityIssuesBetweenIntervalAsync(List<string> postalCodes, MunicipalityIssueInterval issueInterval)
		{
			var snapshot = await Collection
				.WhereIn(nameof(IssuePersistence.MunicipalityId), postalCodes)
				.WhereGreaterThanOrEqualTo(nameof(IssuePersistence.DateReported), issueInterval.StartDate)
				.WhereLessThanOrEqualTo(nameof(IssuePersistence.DateReported), issueInterval.EndDate)
				.GetSnapshotAsync();

			return snapshot.Documents
				.Select(d => d.ConvertTo<IssuePersistence>().Adapt<Issue>())
				.ToList();
		}

		public async Task<List<Issue>> ObtainIssuesAsync(string municipalityId, IIssueFilter filter, IPaginator paginator)
        {
			//Collection.WhereIn(nameof(IssuePersistence.MunicipalityId), filter.PostalCodes);
			var query = Collection.WhereEqualTo(nameof(IssuePersistence.MunicipalityId), municipalityId);
            if (filter.Type != null)
                query = query.WhereEqualTo(nameof(IssuePersistence.Type), filter.Type);
            if (filter.Priority != null)
                query = query.WhereEqualTo(nameof(IssuePersistence.Priority), filter.Priority);
            if (!string.IsNullOrEmpty(filter.Text))
                query = query.WhereEqualTo(nameof(IssuePersistence.Description), filter.Text);
            query = filter.Newest ? query.OrderByDescending(nameof(IssuePersistence.DateApproved)) 
                                  : query.OrderBy(nameof(IssuePersistence.DateApproved));

            var snapshot = await query.GetSnapshotAsync();
            //var pagedSnapshot = snapshot.Skip(paginator.Page > 0 ? paginator.Page * paginator.RecordsPerPage : 0)
            //                            .Take(paginator.RecordsPerPage);
            //paginator.TotalRecords = pagedSnapshot.Count();

            List<Issue> result = [];
            foreach (var d in snapshot.Documents) result.Add(d.ConvertTo<IssuePersistence>().Adapt<Issue>());

            //TEMP, maybe there's a better way to do probably
            paginator.TotalRecords = result.Count;
            result = result.Skip(paginator.Page > 0 ? (paginator.Page - 1) * paginator.RecordsPerPage : 0)
                           .Take(paginator.RecordsPerPage).ToList();
            return result;
        }

        public async Task<List<Issue>> ObtainIssuesAsync(IIssueFilter filter, IPaginator paginator)
        {
            if (filter.PostalCodes == null) return new List<Issue>();
            var query = Collection.WhereIn(nameof(IssuePersistence.MunicipalityId), filter.PostalCodes);
            if (filter.Type != null)
                query = query.WhereEqualTo(nameof(IssuePersistence.Type), filter.Type);
            if (filter.Priority != null)
                query = query.WhereEqualTo(nameof(IssuePersistence.Priority), filter.Priority);
            //if (!string.IsNullOrEmpty(filter.Text))
            //    query = query.WhereEqualTo(nameof(IssuePersistence.Description), filter.Text);
            query = filter.Newest ? query.OrderByDescending(nameof(IssuePersistence.DateApproved))
                                  : query.OrderBy(nameof(IssuePersistence.DateApproved));

            var snapshot = await query.GetSnapshotAsync();

            List<Issue> result = [];
            foreach (var d in snapshot.Documents) result.Add(d.ConvertTo<IssuePersistence>().Adapt<Issue>());
            if (!string.IsNullOrEmpty(filter.Text))
                result = result.Where(a => a.Description.Contains(filter.Text)).ToList();
            //TEMP, maybe there's a better way to do probably
            paginator.TotalRecords = result.Count;
            result = result.Skip(paginator.Page > 0 ? (paginator.Page - 1) * paginator.RecordsPerPage : 0)
                           .Take(paginator.RecordsPerPage).ToList();
            return result;
        }
    }
}
