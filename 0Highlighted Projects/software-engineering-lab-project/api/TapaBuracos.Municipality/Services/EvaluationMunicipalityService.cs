using TapaBuracos.Core.Interfaces.Repositories;
using TapaBuracos.Core.Models;
using TapaBuracos.Municipality.Interfaces.Services;

namespace TapaBuracos.Municipality.Services
{
    public class EvaluationMunicipalityService : IEvaluationMunicipalityService
    {
        protected IEvaluationRepository Repository { get; }
        public EvaluationMunicipalityService(IEvaluationRepository repository)
        {
            Repository = repository;
        }
        

        public async Task<List<Evaluation>> ObtainEvaluationsOfMunicipalityAsync(string municipalityId)
        {
            return await Repository.ObtainEvaluationsOfMunicipalityAsync(municipalityId);
        }

        public async Task<List<Evaluation>> ObtainUserEvaluationsAsync(string userId)
        {
            return await Repository.ObtainUserEvaluationsAsync(userId);
        }

        public async Task<List<Evaluation>> ObtainEvaluationsByIssueAndMunicipalityAsync(string issueId, string municipalityId)
        {
            return await Repository.ObtainEvaluationsByIssueAndMunicipalityAsync(issueId, municipalityId);
        }
    }
}
