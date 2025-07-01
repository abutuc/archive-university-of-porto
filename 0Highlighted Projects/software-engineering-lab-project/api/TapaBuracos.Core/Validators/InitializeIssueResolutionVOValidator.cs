using FluentValidation;
using TapaBuracos.Core.Helpers;

namespace TapaBuracos.Core.Validators
{
    public class InitializeIssueResolutionVOValidator : Coelho.Arc.Constantinople.Validators.AbstractValidator<InitializeIssueResolutionVO>
    {
        public override void Configure()
        {
            RuleFor(vo => vo.IssueId).NotEmpty()
                                     .WithMessage("{PropertyName} should not be empty");

            RuleFor(vo => vo.AssignedTeam).NotEmpty()
                                          .WithMessage("{PropertyName} should not be empty");
        }
    }
}
