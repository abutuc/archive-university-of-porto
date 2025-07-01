using Coelho.Arc.Constantinople.Interfaces;
using Microsoft.Extensions.DependencyInjection;
using System.ComponentModel;

namespace Coelho.Arc.Constantinople.DependencyInjection
{
    public abstract class DependencyManager : IDependencyManager
    {
        public static IDependencyManager Instance { get; protected internal set; }
        protected IServiceCollection ServiceCollection { get; }
        internal IServiceProvider ServiceProvider { get; private set; }
        public DependencyManager(IServiceCollection services)
        {
            ServiceCollection = services;
        }
        public IEnumerable<T> GetAllInstances<T>()
        {
            return ServiceProvider.GetServices<T>();
        }

        public T GetInstance<T>()
        {
            return ServiceProvider.GetService<T>();
        }

        public virtual IDisposable CreateScope()
        {
            return ServiceProvider.CreateScope();
        }

        public void FinishConfiguration()
        {
            Configure();
            ServiceProvider = ServiceCollection.BuildServiceProvider();
        }
        public abstract void Configure();
    }

    public abstract class DepndencyManager<T> : DependencyManager where T : IDependencyManager, new()
    {
        public static T Initialize()
        {
            if (Instance != null)
                throw new InvalidOperationException("The dependency manager has been initialized already.");
            var instance = new T();
            Instance = instance;
            return instance;
        }
        protected DepndencyManager() : base(new ServiceCollection())
        {
        }
        protected DepndencyManager(IServiceCollection services) : base(services)
        {
        }
    }
}
