using Google.Cloud.Firestore;

namespace TapaBuracos.Citizen.Persistence.Helpers
{
    internal class GeoLocator
    {
        ////TODO: for new it searches based on miles, but it'd be better to switch to meters. However needs to find scale 1 meter in degress first
        //public static (GeoPoint LowerPoint, GeoPoint UpperPoint) GetLowerAndUpperPointsByDistanceInMiles(double latitude, double longitude, double distance)
        //{
        //    // ~1 mile of lat and lon in degrees
        //    double lat = 0.0144927536231884;
        //    double lon = 0.0181818181818182;

        //    double lowerLat = latitude - (lat * distance);
        //    double lowerLon = longitude - (lon * distance);

        //    double upperLat = latitude + (lat * distance);
        //    double upperLon = longitude + (lon * distance);

        //    return (new GeoPoint(lowerLat, lowerLon), new GeoPoint(upperLat, upperLon));
        //}

        //public static (GeoPoint LowerPoint, GeoPoint UpperPoint) GetLowerAndUpperPointsByDistanceInMeters(double latitude, double longitude, double distance)
        //{
        //    //TODO: move to constant
        //    var distanceInMiles = distance / 1609.344;
        //    return GetLowerAndUpperPointsByDistanceInMiles(latitude, longitude, distanceInMiles);
        //}

        //TODO: for new it searches based on miles, but it'd be better to switch to meters. However needs to find scale 1 meter in degress first
        public static (double LowerLatitude, double UpperLatitude) GetLowerAndUpperLatitudesByDistanceInMiles(double latitude, double distance)
        {
            // ~1 mile of lat and lon in degrees
            double lat = 0.0144927536231884;

            double lowerLat = latitude - (lat * distance);
            double upperLat = latitude + (lat * distance);

            return (lowerLat, upperLat);
        }

        //TODO: for new it searches based on miles, but it'd be better to switch to meters. However needs to find scale 1 meter in degress first
        public static (double LowerLatitude, double UpperLatitude) GetLowerAndUpperLongitudeByDistanceInMiles(double longitude, double distance)
        {
            // ~1 mile of lat and lon in degrees
            double lon = 0.0181818181818182;

            double lowerLon = longitude - (lon * distance);
            double upperLon = longitude + (lon * distance);

            return (lowerLon, upperLon);
        }

        public static (double LowerLatitude, double UpperLatitude) GetLowerAndUpperLatitudesByDistanceInMeters(double latitude, double distance)
        {
            //TODO: move to constant
            var distanceInMiles = distance / 1609.344;
            return GetLowerAndUpperLatitudesByDistanceInMiles(latitude, distanceInMiles);
        }

        public static (double LowerLongitude, double UpperLongitude) GetLowerAndUpperLongitudesByDistanceInMeters(double longitude, double distance)
        {
            //TODO: move to constant
            var distanceInMiles = distance / 1609.344;
            return GetLowerAndUpperLongitudeByDistanceInMiles(longitude, distanceInMiles);
        }
    }
}
