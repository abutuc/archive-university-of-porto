using FluentValidation;
using TapaBuracos.Core.Interfaces.Models;

namespace TapaBuracos.Core.Validators
{
    public class IssueValidator : Coelho.Arc.Constantinople.Validators.AbstractValidator<IIssue>
    {
        public override void Configure()
        {
            RuleFor(m => m.Id).NotEmpty()
                              .WithMessage("{PropertyName} should not be null");//TODO resources

            RuleFor(m => m.Location).NotNull()
                                    .WithMessage("{PropertyName} should not be null");//TODO resources

            RuleFor(m => m.ReporterIds).NotEmpty()
                                       .WithMessage("{PropertyName} should not be null");//TODO resources

            RuleFor(m => m.DateReported).NotEqual(DateTime.MinValue)
                                        .WithMessage("{PropertyName} should not be null");//TODO resources

            RuleFor(m => m.MunicipalityId).NotEmpty()
                                          .WithMessage("{PropertyName} should not be null");//TODO resources

            //TODO: keep this validation?
            RuleFor(m => m.Occurrences).GreaterThan(0)
                                       .WithMessage("{PropertyName} should not be null");//TODO resources
        }
    }
}
