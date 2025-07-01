using Coelho.Arc.Bosporus.Models;

namespace Coelho.Arc.Bosporus.Interfaces
{
    public interface IReadableRepository<T> where T : IEntity
    {
        Task<T> GetAsync(string id);
        // Task<IEnumerable<T>> GetAllAsync();
    }
}
