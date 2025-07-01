using Coelho.Arc.Bosporus.Models;
using Google.Cloud.Firestore;

namespace TapaBuracos.Persistence.Models
{
    [FirestoreData]
    public class MunicipalityPersistence : IEntity
    {
        public MunicipalityPersistence()
        {
        }

        [FirestoreDocumentId]
        public string Id { get; set; }

        [FirestoreProperty]
        public string Name { get; set; }

        [FirestoreProperty]
        public string Email { get; set; }

        [FirestoreProperty]
        public string PhotoUrl { get; set; }

        [FirestoreProperty]
        public int MinOccurrences { get; set; }

        [FirestoreProperty]
        public List<string> PostalCodes { get; set; }

        [FirestoreProperty]
        public bool Blocked { get; set; }

        [FirestoreProperty]
        public DateTime? DateBlocked { get; set; }
    }
}
