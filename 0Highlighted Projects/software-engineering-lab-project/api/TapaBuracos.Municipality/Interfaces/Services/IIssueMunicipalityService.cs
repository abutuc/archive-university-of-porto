using Coelho.Arc.Constantinople.Interfaces;
using FluentValidation.Results;
using TapaBuracos.Core.Helpers;
using TapaBuracos.Core.Interfaces.Filters;
using TapaBuracos.Core.Models;
using TapaBuracos.Municipality.Models;

namespace TapaBuracos.Municipality.Interfaces.Services
{
    public interface IIssueMunicipalityService
    {
        [Obsolete("Method is here only for retrocompatibility and will be removed in the future")]
        Task<List<Issue>> ObtainIssuesAsync(string municipalityId);
        Task<List<Issue>> ObtainIssuesAsync(string municipalityId, IIssueFilter filter, IPaginator paginator);
        Task<List<Issue>> ObtainIssuesAsync(IIssueFilter filter, IPaginator paginator);
        Task<Issue> ObtainIssueAsync(string issueId, string municipalityId);
        Task<ValidationResult> InitiateResolutionAsync(InitializeIssueResolutionVO initializeIssueResolutionVO);
        Task<ValidationResult> ConcludeResolutionAsync(ConcludeIssueVO concludeIssueVO);
        Task<MunicipalityIssueReportDTO> GenerateIssueReportAsync(string municipalityId, MunicipalityIssueInterval issueInterval);
    }
}
