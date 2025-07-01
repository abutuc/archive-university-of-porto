using FluentValidation;
using TapaBuracos.Core.Interfaces.Models;

namespace TapaBuracos.Core.Validators
{
    public class UserValidator : Coelho.Arc.Constantinople.Validators.AbstractValidator<IUser>
    {
        public override void Configure()
        {
            RuleFor(m => m.Id).NotEmpty()
                              .WithMessage("{PropertyName} should not be null");//TODO resources

            RuleFor(m => m.Email).NotEmpty()
                                 .WithMessage("{PropertyName} should not be null")//TODO resources
                                 .EmailAddress()
                                 .WithMessage("{PropertyName} is invalid");//TODO resources

            RuleFor(m => m.Name).NotEmpty()
                                .WithMessage("{PropertyName} should not be null");//TODO resources

        }
    }
}
