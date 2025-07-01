using Coelho.Arc.Constantinople.Interfaces;
using FluentValidation.Results;
using TapaBuracos.Core.Interfaces.Models;
using TapaBuracos.Core.Interfaces.Repositories;
using TapaBuracos.Core.Interfaces.Services;
using TapaBuracos.Core.Models;

namespace TapaBuracos.Core.Services
{
    public class UserService : IUserService
    {
        protected IUserRepository Repository { get; }
        protected IValidator<IUser> Validator { get; }
        public UserService(IUserRepository repository, IValidator<IUser> validator)
        {
            Repository = repository;
            Validator = validator;
        }

        public async Task<User> FindByEmailAsync(string email)
        {
            return await Repository.FindByEmailAsync(email);
        }

        public async Task<User> FindById(string id)
        {
            return await Repository.FindById(id);
        }

        public async Task<ValidationResult> RegisterAssociationAsync(IUser user)
        {
            var validationResult = await Validator.ValidateAsync(user);
            if (!validationResult.IsValid)
                return validationResult;
            await Repository.RegisterAssociationAsync(user);
            return validationResult;
        }
    }
}
