using TapaBuracos.Core.Models;

namespace TapaBuracos.Core.Interfaces.Repositories
{
    public interface IMunicipalityRepository
    {
        Task AssociateMunicipalityAsync(Municipality municipality);
        Task<Municipality> FindByIdAsync(string id);
    }
}
