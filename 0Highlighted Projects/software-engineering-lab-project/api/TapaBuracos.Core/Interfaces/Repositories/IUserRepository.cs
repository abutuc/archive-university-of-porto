using TapaBuracos.Core.Interfaces.Models;
using TapaBuracos.Core.Models;

namespace TapaBuracos.Core.Interfaces.Repositories
{
    public interface IUserRepository
    {
        Task RegisterAssociationAsync(IUser user);
        Task<User> FindByEmailAsync(string email);
        Task<User> FindById(string id);
        Task DeleteUserById(string id);
    }
}
