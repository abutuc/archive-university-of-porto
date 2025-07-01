using FluentValidation;
using TapaBuracos.Core.Helpers;

namespace TapaBuracos.Core.Validators
{
    public class ConcludeIssueVOValidator : Coelho.Arc.Constantinople.Validators.AbstractValidator<ConcludeIssueVO>
    {
        public override void Configure()
        {
            RuleFor(vo => vo.IssueId).NotEmpty()
                                     .WithMessage("{PropertyName} should not be empty");

            RuleFor(vo => vo.DateResolved).GreaterThanOrEqualTo(DateTime.Today)
                                          .WithMessage("{PropertyName} is invalid");
        }
    }
}
