using FluentValidation;
using TapaBuracos.Core.Models;

namespace TapaBuracos.Core.Validators
{
    public class MunicipalityValidator : Coelho.Arc.Constantinople.Validators.AbstractValidator<Municipality>
    {
        public override void Configure()
        {
            RuleFor(m => m.Id).NotEmpty()
                              .WithMessage("{PropertyName} should not be empty");

            RuleFor(m => m.Name).NotEmpty()
                                .WithMessage("{PropertyName} should not be empty");

            RuleFor(m => m.Email).NotEmpty()
                                 .WithMessage("{PropertyName} should not be empty")
                                 .EmailAddress()
                                 .WithMessage("{PropertyName} is invalid");

        }
    }
}
