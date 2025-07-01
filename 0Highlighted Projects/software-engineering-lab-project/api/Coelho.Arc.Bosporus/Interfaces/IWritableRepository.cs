using Coelho.Arc.Bosporus.Models;

namespace Coelho.Arc.Bosporus.Interfaces
{
    public interface IWritableRepository<T> where T : IEntity
    {
        Task AddAsync(T entity);
        // Task UpdateAsync(T entity);
        Task DeleteAsync(string id);
    }
}
