using FluentValidation.Results;
using Mapster;
using TapaBuracos.Api.Models.Interfaces.Services;
using TapaBuracos.Api.Models.Models;
using TapaBuracos.Core.Models;

namespace TapaBuracos.Api.Models.Services
{
    public class EvaluationCitizenService : IEvaluationCitizenService
    {
        protected Citizen.Interfaces.Services.IEvaluationCitizenService DomainService { get; }
        public EvaluationCitizenService(Citizen.Interfaces.Services.IEvaluationCitizenService domainService)
        {
            DomainService = domainService;
        }
        public async Task<List<Evaluation>> ObtainUserEvaluationsAsync(string userId)
        {
            return await DomainService.ObtainUserEvaluationsAsync(userId);
        }

        public async Task<ValidationResult> RegisterReviewAsync(NewEvaluationDTO evaluation)
        {
            var domainModel = evaluation.Adapt<Evaluation>();
            return await DomainService.RegisterReviewAsync(domainModel);
        }
    }
}
