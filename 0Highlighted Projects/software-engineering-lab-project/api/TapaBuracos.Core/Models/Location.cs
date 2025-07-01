using Newtonsoft.Json;
using TapaBuracos.Core.Interfaces.Models;

namespace TapaBuracos.Core.Models
{
    public record Location
    {
        public Location(double latitude, double longitude)
        {
            Latitude = latitude;
            Longitude = longitude;
        }
        
        public double Latitude { get; }
        public double Longitude { get; }
    }
}
