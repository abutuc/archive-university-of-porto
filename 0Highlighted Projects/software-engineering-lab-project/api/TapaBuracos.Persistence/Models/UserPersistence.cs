using Coelho.Arc.Bosporus.Models;
using Google.Cloud.Firestore;
using TapaBuracos.Core.Interfaces.Models;

namespace TapaBuracos.Persistence.Models
{
    [FirestoreData]
    public class UserPersistence : IEntity, IUser
    {
        public UserPersistence()
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
        public bool Blocked { get; set; }

        [FirestoreProperty]
        public DateTime? DateBlocked { get; set; }
    }
}
