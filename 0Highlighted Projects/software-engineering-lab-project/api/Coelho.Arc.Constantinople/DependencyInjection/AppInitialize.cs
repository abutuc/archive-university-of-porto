using Coelho.Arc.Constantinople.Interfaces;
using Microsoft.Extensions.DependencyInjection;

namespace Coelho.Arc.Constantinople.DependencyInjection
{
    public class AppInitialize
    {
        public static AppInitialize Initialize(IServiceCollection services)
        {
            return new AppInitialize(services);
        }
        protected internal DependencyManager Instance { get; set; }
        protected internal IServiceCollection Services { get; }

        protected AppInitialize(IServiceCollection services)
        {
            Services = services;
        }

        public AppInitialize SetDependencyManager<T>() where T : IDependencyManager
        {
            Instance = (DependencyManager)Activator.CreateInstance(typeof(T), Services);
            DependencyManager.Instance = Instance;
            return this;
        }

        public AppInitialize AnnexDependencyManager<T>() where T : IDependencyManager
        {
            throw new NotImplementedException("At this point it's not yet possible to Annex another DependencyManager");
        }

        public AppInitialize AddMapperProfile<T>() where T : IMapperProfile
        {
            Activator.CreateInstance(typeof(T));
            return this;
        }

        public void Finish()
        {
            Instance.FinishConfiguration();
        }
    }
}
