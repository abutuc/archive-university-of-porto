using TapaBuracos.Core.Models;

namespace TapaBuracos.Tests.TypeInitializers
{
    internal record LocationInitializer : Location
    {
        public LocationInitializer(double latitude, double longitude) : base(latitude, longitude)
        {
        }
    }
}
