using TapaBuracos.Core.Interfaces.Models;
using TapaBuracos.Core.Models;

namespace TapaBuracos.Citizen.Interfaces.Repositories
{
    public interface IIssueCitizenRepository
    {
        Task RegisterIssueAsync(IIssue issue);
        Task<Issue> FindIssueById(string issueId);
        Task DeleteIssueById(string issueId);
        Task<bool> CheckIfDuplicatedIssueAsync(IIssue issue);
        Task ApproveIssueAsync(string issueId);
        Task IncrementIssueOccurenceAsync(string issueId);
        Task<IEnumerable<Issue>> ObtainActiveIssuesAsync();
        Task<IEnumerable<Issue>> ObtainUserIssues(string userId);
        Task AddWatcher(string issueId, string userId);
        Task RemoveWatcher(string issueId, string userId);
    }
}
