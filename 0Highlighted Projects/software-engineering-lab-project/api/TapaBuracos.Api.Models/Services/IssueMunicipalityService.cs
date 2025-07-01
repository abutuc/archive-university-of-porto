using FluentValidation.Results;
using TapaBuracos.Api.Models.Interfaces.Services;
using TapaBuracos.Api.Models.Models;
using TapaBuracos.Core.Helpers;
using TapaBuracos.Core.Models;
using TapaBuracos.Municipality.Models;

namespace TapaBuracos.Api.Models.Services
{
    public class IssueMunicipalityService : IIssueMunicipalityService
    {
        protected Municipality.Interfaces.Services.IIssueMunicipalityService ServiceDomain { get; }
        public IssueMunicipalityService(Municipality.Interfaces.Services.IIssueMunicipalityService serviceDomain)
        {
            ServiceDomain = serviceDomain;
        }
        public async Task<ValidationResult> ConcludeResolutionAsync(ConcludeIssueVO concludeIssueVO)
        {
            return await ServiceDomain.ConcludeResolutionAsync(concludeIssueVO);
        }

        public async Task<ValidationResult> InitiateResolutionAsync(InitializeIssueResolutionVO initializeIssueResolutionVO)
        {
            return await ServiceDomain.InitiateResolutionAsync(initializeIssueResolutionVO);
        }

        public async Task<Issue> ObtainIssueAsync(string issueId, string municipalityId)
        {
            return await ServiceDomain.ObtainIssueAsync(issueId, municipalityId);
        }
        [Obsolete("Method is here only for retrocompatibility and will be removed in the future")]
        public async Task<List<Issue>> ObtainIssuesAsync(string municipalityId)
        {
            return await ServiceDomain.ObtainIssuesAsync(municipalityId); 
        }

        public async Task<ObtainIssuesMunicipalityReponseDTO> ObtainIssuesAsync(string municipalityId, ObtainIssuesMunicipalityRequestDTO request)
        {
            var result = await ServiceDomain.ObtainIssuesAsync(municipalityId, request.Filter, request.Paginator);
            return new ObtainIssuesMunicipalityReponseDTO(request.Paginator, result);
        }

        public async Task<ObtainIssuesMunicipalityReponseDTO> ObtainIssuesAsync(ObtainIssuesMunicipalityRequestDTO request)
        {
            var result = await ServiceDomain.ObtainIssuesAsync(request.Filter, request.Paginator);
            return new ObtainIssuesMunicipalityReponseDTO(request.Paginator, result);
        }

        public async Task<MunicipalityIssueReportDTO> GenerateIssueReport(string municipalityId,
            MunicipalityIssueInterval issueInterval)
        {
            return await ServiceDomain.GenerateIssueReportAsync(municipalityId, issueInterval);
        }

        
    }
}
