using FluentValidation;
using TapaBuracos.Core.Models;

namespace TapaBuracos.Core.Validators
{
    public class EvaluationValidator : Coelho.Arc.Constantinople.Validators.AbstractValidator<Evaluation>
    {
        public override void Configure()
        {
            RuleFor(e => e.Id).NotEmpty()
                              .WithMessage("{PropertyName} should not be empty");

            RuleFor(e => e.UserId).NotEmpty()
                                  .WithMessage("{PropertyName} should not be empty");

            RuleFor(e => e.Rating).Cascade(CascadeMode.Stop)
                                  .GreaterThan(0)
                                  .WithMessage("{PropertyName} should be at least 1")
                                  .LessThanOrEqualTo(5)
                                  .WithMessage("{PropertyName} should be less than 6");
        }
    }
}
