using Coelho.Arc.Constantinople.DependencyInjection;
using Microsoft.Extensions.DependencyInjection;
using TapaBuracos.Persistence.Configurations;

namespace TapaBuracos.Tests.Application
{
    public class TestInitializer
    {
        public void Configure()
        {
            var serviceCollection = new ServiceCollection();
            AppInitialize.Initialize(serviceCollection)
                         .SetDependencyManager<Factory>()
                         .AddMapperProfile<MapperProfilePersistence>()
                         .Finish();
        }
    }
}
