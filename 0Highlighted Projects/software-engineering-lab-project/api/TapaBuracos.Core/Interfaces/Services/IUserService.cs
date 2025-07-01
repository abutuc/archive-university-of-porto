using FluentValidation.Results;
using TapaBuracos.Core.Interfaces.Models;
using TapaBuracos.Core.Models;

namespace TapaBuracos.Core.Interfaces.Services
{
    public interface IUserService
    {
        Task<ValidationResult> RegisterAssociationAsync(IUser user);
        Task<User> FindByEmailAsync(string email);
        Task<User> FindById(string id);
    }
}
