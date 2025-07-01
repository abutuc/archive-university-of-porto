namespace Coelho.Arc.Constantinople.Interfaces
{
    public interface IDependencyManager
    {
        public T GetInstance<T>();
        public IEnumerable<T> GetAllInstances<T>();
        public IDisposable CreateScope();
    }
}
