using TapaBuracos.Core.Models;

namespace TapaBuracos.Core.Interfaces.Repositories
{
    public interface IEvaluationRepository
    {
        Task RegisterReviewAsync(Evaluation evaluation);
        Task<List<Evaluation>> ObtainUserEvaluationsAsync(string userId);
        Task<List<Evaluation>> ObtainEvaluationsOfMunicipalityAsync(string municipalityId);
        Task<List<Evaluation>> ObtainEvaluationsByIssueAndMunicipalityAsync(string issueId, string municipalityId);

    }
}
