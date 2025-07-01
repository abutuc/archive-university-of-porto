using Coelho.Arc.Constantinople.Interfaces;
using Mapster;
using TapaBuracos.Core.Models;
using TapaBuracos.Persistence.Models;

namespace TapaBuracos.Persistence.Configurations
{
    public class MapperProfilePersistence : IMapperProfile
    {
        public MapperProfilePersistence()
        {
            TypeAdapterConfig.GlobalSettings.Default.NameMatchingStrategy(NameMatchingStrategy.Flexible);
            TypeAdapterConfig<Location, LocationPersistence>.NewConfig().MapToConstructor(true);
            TypeAdapterConfig<LocationPersistence, Location>.NewConfig().MapToConstructor(true);
            TypeAdapterConfig<UserPersistence, User>.NewConfig().MapToConstructor(true);
            TypeAdapterConfig<IssuePersistence, Issue>.NewConfig().MapToConstructor(true).Map(m => m.Location, p => p.Location.Adapt<Location>());
            TypeAdapterConfig<Issue, IssuePersistence>.NewConfig().Map(p => p.Location, m => m.Location.Adapt<LocationPersistence>());
            TypeAdapterConfig<MunicipalityPersistence, Municipality>.NewConfig().MapToConstructor(true);
            TypeAdapterConfig<Evaluation, EvaluationPersistence>.NewConfig().MapToConstructor(true);
            TypeAdapterConfig<EvaluationPersistence, Evaluation>.NewConfig().MapToConstructor(true);
        }
    }
}
