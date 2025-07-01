using Coelho.Arc.Constantinople.Interfaces;
using Mapster;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TapaBuracos.Api.Models.Models;
using TapaBuracos.Core.Models;

namespace TapaBuracos.Api.Models.Configurations
{
    public class MapperProfileApi : IMapperProfile
    {
        public MapperProfileApi()
        {
            TypeAdapterConfig<NewEvaluationDTO, Evaluation>.NewConfig().MapToConstructor(true).Map(m => m.Id, r => Guid.NewGuid().ToString());
        }
    }
}
