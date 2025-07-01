using Google.Cloud.Firestore;

namespace TapaBuracos.Persistence.Models
{
    [FirestoreData]
    public class LocationPersistence
    {
        public LocationPersistence() { }

        public LocationPersistence(float latitude, float longitude)
        {
            Latitude = latitude;
            Longitude = longitude;
        }

        [FirestoreProperty]
        public double Latitude { get; set; }

        [FirestoreProperty]
        public double Longitude { get; set; }


    }
}
