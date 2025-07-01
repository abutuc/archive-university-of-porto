using TapaBuracos.Citizen.Models;
using TapaBuracos.Core.Interfaces.Models;
using TapaBuracos.Core.Models;

namespace TapaBuracos.Citizen.Interfaces.Services
{
    public interface IIssueCitizenService
    {
        Task<ReportIssueResponseDTO> ReportIssueAsync(IIssue issue);
        Task ConfirmIncrementOfIssueAsync(string issueId);
        Task<Issue> ObtainIssue(string issueId);
        Task<List<Issue>> ObtainActiveIssuesAsync();
        Task<List<Issue>> ObtainUserIssuesAsync(string userId);
        Task AddWatcher(string issueId, string userId);
        Task RemoveWatcher(string issueId, string userId);
    }  
}

