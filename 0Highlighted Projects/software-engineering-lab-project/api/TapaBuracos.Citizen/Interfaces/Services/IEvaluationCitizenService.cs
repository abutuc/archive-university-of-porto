using FluentValidation.Results;
using TapaBuracos.Core.Models;

namespace TapaBuracos.Citizen.Interfaces.Services
{
    public interface IEvaluationCitizenService
    {
        Task<List<Evaluation>> ObtainUserEvaluationsAsync(string userId);
        Task<ValidationResult> RegisterReviewAsync(Evaluation evaluation);
    }
}
