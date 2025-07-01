using FluentValidation.Results;
using TapaBuracos.Citizen.Interfaces.Services;
using TapaBuracos.Core.Interfaces.Repositories;
using TapaBuracos.Core.Models;

namespace TapaBuracos.Citizen.Services
{
    public class EvaluationCitizenService : IEvaluationCitizenService
    {
        protected IEvaluationRepository Repository { get; }
        protected Coelho.Arc.Constantinople.Interfaces.IValidator<Evaluation> Validator { get; }
        public EvaluationCitizenService(IEvaluationRepository repository, Coelho.Arc.Constantinople.Interfaces.IValidator<Evaluation> validator)
        {
            Repository = repository;
            Validator = validator;
        }

        public async Task<List<Evaluation>> ObtainUserEvaluationsAsync(string userId)
        {
            return await Repository.ObtainUserEvaluationsAsync(userId);
        }

        public async Task<ValidationResult> RegisterReviewAsync(Evaluation evaluation)
        {
            var validationResult = await Validator.ValidateAsync(evaluation);
            if (!validationResult.IsValid)
                return validationResult;

            await Repository.RegisterReviewAsync(evaluation);
            return validationResult;
        }
    }
}
