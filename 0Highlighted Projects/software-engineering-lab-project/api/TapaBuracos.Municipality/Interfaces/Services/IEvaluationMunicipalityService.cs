using TapaBuracos.Core.Models;

namespace TapaBuracos.Municipality.Interfaces.Services
{
    public interface IEvaluationMunicipalityService
    {
        Task<List<Evaluation>> ObtainUserEvaluationsAsync(string userId);
        Task<List<Evaluation>> ObtainEvaluationsOfMunicipalityAsync(string municipalityId);
        Task<List<Evaluation>> ObtainEvaluationsByIssueAndMunicipalityAsync(string issueId, string municipalityId);
    }
}
