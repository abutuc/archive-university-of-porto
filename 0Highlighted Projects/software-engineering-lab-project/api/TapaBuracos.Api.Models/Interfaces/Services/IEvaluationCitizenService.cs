using FluentValidation.Results;
using TapaBuracos.Api.Models.Models;
using TapaBuracos.Core.Models;

namespace TapaBuracos.Api.Models.Interfaces.Services
{
    public interface IEvaluationCitizenService
    {
        Task<List<Evaluation>> ObtainUserEvaluationsAsync(string userId);
        Task<ValidationResult> RegisterReviewAsync(NewEvaluationDTO evaluation);
    }
}
