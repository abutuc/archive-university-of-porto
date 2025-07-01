using Coelho.Arc.Bosporus.Firestore.Repositories;
using Google.Cloud.Firestore;
using Mapster;
using TapaBuracos.Core.Interfaces.Repositories;
using TapaBuracos.Core.Models;
using TapaBuracos.Persistence.Models;

namespace TapaBuracos.Persistence.Repositories
{
    public class MunicipalityRepository : FirestoreRepositoryBase<MunicipalityPersistence>, IMunicipalityRepository
    {
        protected override string CollectionName => "Municipalities";
        public MunicipalityRepository(FirestoreDb database) : base(database)
        {
        }

        public async Task AssociateMunicipalityAsync(Municipality municipality)
        {
            var persistence = municipality.Adapt<MunicipalityPersistence>();
            await AddAsync(persistence);
        }

        public async Task<Municipality> FindByIdAsync(string id)
        {
            var municipality = await GetAsync(id);
            if (municipality == null) return null;
            return municipality.Adapt<Municipality>();
        }
    }
}
