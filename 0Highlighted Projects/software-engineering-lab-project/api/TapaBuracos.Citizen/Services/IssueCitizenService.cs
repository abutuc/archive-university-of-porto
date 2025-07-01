using TapaBuracos.Citizen.Interfaces.Repositories;
using TapaBuracos.Citizen.Interfaces.Services;
using TapaBuracos.Citizen.Models;
using TapaBuracos.Core.Interfaces.Models;
using TapaBuracos.Core.Interfaces.Services;
using TapaBuracos.Core.Models;

namespace TapaBuracos.Citizen.Services
{
    public class IssueCitizenService : IIssueCitizenService
    {
        protected IIssueCitizenRepository Repository { get; }
        protected IMunicipalityService MunicipalityService { get; }
        protected Coelho.Arc.Constantinople.Interfaces.IValidator<IIssue> Validator { get; }
        protected IIssueNotificationService NotificationService { get; }
        public IssueCitizenService(IIssueCitizenRepository repository, Coelho.Arc.Constantinople.Interfaces.IValidator<IIssue> validator, IMunicipalityService municipalityService, IIssueNotificationService notificationService)
        {
            Repository = repository;
            Validator = validator;
            MunicipalityService = municipalityService;
            NotificationService = notificationService;
        }
        public async Task ConfirmIncrementOfIssueAsync(string issueId)
        {
            await Repository.IncrementIssueOccurenceAsync(issueId);
            //TODO: Since we don't have a periodic runner like AzureFunctions, this method is being called here as of yet
            //The proper way is to save the original issue on a MemoryCache (key => issueId, value => issue) in case a duplicate is found
            //Then ON THIS METHOD recover from the cache using the issueId, so that we don't have to call FindByIssue
            //Then continue normaly by looking for the municipality and so forth.
            //ALSO remember that this process being done here is already wrong. It should be delegated to an external Function
            //like an AzFunc or the AWS equivalent, but since those do not have a free use quota, then it's left here.
            var issue = await Repository.FindIssueById(issueId);
            var municipality = await MunicipalityService.FindByIdAsync(issue.MunicipalityId);
            if (issue.Occurrences < municipality.MinOccurrences) return;
            await Repository.ApproveIssueAsync(issueId);
            foreach (var watcher in issue.Watchers)
                await NotificationService.CreateIssueNotificationAsync(new IssueNotification(Guid.NewGuid().ToString(), issueId,
                    issue.Description, issue.Type, "O estado do issue mudou para aprovado", issue.Status, watcher,
                    false, DateTimeOffset.Now));
        }

        public async Task<ReportIssueResponseDTO> ReportIssueAsync(IIssue issue)
        {
            var validationResults = await Validator.ValidateAsync(issue);
            if (!validationResults.IsValid)
                return new ReportIssueResponseDTO(validationResults);

            //TODO: revisit and validate if there's a better treatment
            var duplicated = await Repository.CheckIfDuplicatedIssueAsync(issue);
            if (duplicated) return new ReportIssueResponseDTO(duplicated);
            await Repository.RegisterIssueAsync(issue);
            return new ReportIssueResponseDTO(validationResults);
        }

        public async Task<Issue> ObtainIssue(string issueId)
        {
            return await Repository.FindIssueById(issueId);
        }

        public async Task<List<Issue>> ObtainActiveIssuesAsync()
        {
            var result = await Repository.ObtainActiveIssuesAsync();
            return result.ToList();
        }

        public async Task<List<Issue>> ObtainUserIssuesAsync(string userId)
        {
            var result = await Repository.ObtainUserIssues(userId);
            return result.ToList();
        }

        public async Task AddWatcher(string issueId, string userId)
        {
            await Repository.AddWatcher(issueId, userId);
        }

        public async Task RemoveWatcher(string issueId, string userId)
        {
            await Repository.RemoveWatcher(issueId, userId);
        }
    }
}
