using FluentValidation.Results;
using TapaBuracos.Api.Models.Models;
using TapaBuracos.Core.Helpers;
using TapaBuracos.Core.Models;
using TapaBuracos.Municipality.Models;

namespace TapaBuracos.Api.Models.Interfaces.Services
{
    public interface IIssueMunicipalityService
    {
        [Obsolete("Method is here only for retrocompatibility and will be removed in the future")]
        Task<List<Issue>> ObtainIssuesAsync(string municipalityId);
        Task<ObtainIssuesMunicipalityReponseDTO> ObtainIssuesAsync(string municipalityId, ObtainIssuesMunicipalityRequestDTO request);
        Task<ObtainIssuesMunicipalityReponseDTO> ObtainIssuesAsync(ObtainIssuesMunicipalityRequestDTO request);
        Task<Issue> ObtainIssueAsync(string issueId, string municipalityId);
        Task<ValidationResult> InitiateResolutionAsync(InitializeIssueResolutionVO initializeIssueResolutionVO);
        Task<ValidationResult> ConcludeResolutionAsync(ConcludeIssueVO concludeIssueVO);

        Task<MunicipalityIssueReportDTO> GenerateIssueReport(string municipalityId,
            MunicipalityIssueInterval issueInterval);
    }
}
