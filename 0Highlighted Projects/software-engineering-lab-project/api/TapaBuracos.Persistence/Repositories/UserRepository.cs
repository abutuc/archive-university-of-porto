using Coelho.Arc.Bosporus.Firestore.Repositories;
using Google.Cloud.Firestore;
using Mapster;
using TapaBuracos.Core.Interfaces.Models;
using TapaBuracos.Core.Interfaces.Repositories;
using TapaBuracos.Core.Models;
using TapaBuracos.Persistence.Models;

namespace TapaBuracos.Persistence.Repositories
{
    public class UserRepository : FirestoreRepositoryBase<UserPersistence>, IUserRepository
    {
        protected override string CollectionName => "Users";
        public UserRepository(FirestoreDb database) : base(database)
        {
        }

        public async Task<User> FindByEmailAsync(string email)
        {
            var snapshot = await Collection.WhereEqualTo(nameof(UserPersistence.Email), email)
                                           .GetSnapshotAsync();
            
            if (snapshot.Documents.Count == 0) return null;

            var result = snapshot.First().ConvertTo<UserPersistence>();
            return result.Adapt<User>();
        }

        public async Task<User> FindById(string id)
        {
            var user = await GetAsync(id);
            if (user == null) return null;
            return user.Adapt<User>();
        }

        public async Task RegisterAssociationAsync(IUser user)
        {
            var persistence = user.Adapt<UserPersistence>();
            await AddAsync(persistence);
        }

        public async Task DeleteUserById(string id)
        {
            await DeleteAsync(id);
        }
    }
}
