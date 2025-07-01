using Coelho.Arc.Constantinople.Interfaces;
using TapaBuracos.Core.Helpers;
using TapaBuracos.Core.Interfaces.Filters;
using TapaBuracos.Core.Models;
using TapaBuracos.Municipality.Models;

namespace TapaBuracos.Municipality.Interfaces.Repositories
{
    public interface IIssueMunicipalityRepository
    {
        Task<List<Issue>> ObtainIssuesAsync(string municipalityId);
        Task<List<Issue>> ObtainIssuesAsync(string municipalityId, IIssueFilter filter, IPaginator paginator);
        Task<List<Issue>> ObtainIssuesAsync(IIssueFilter filter, IPaginator paginator);
        Task<Issue> ObtainIssueAsync(string issueId, string municipalityId);
        Task InitiateResolutionAsync(InitializeIssueResolutionVO initializeIssueResolutionVO);
        Task ConcludeResolutionAsync(ConcludeIssueVO concludeIssueVO);

        Task<List<Issue>> ObtainMunicipalityIssuesBetweenIntervalAsync(string municipalityId,
            MunicipalityIssueInterval issueInterval);
        Task<List<Issue>> ObtainMunicipalityIssuesBetweenIntervalAsync(List<string> postalCodes, MunicipalityIssueInterval issueInterval);

	}
}
