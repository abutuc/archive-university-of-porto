using Coelho.Arc.Bosporus.Models;
using Google.Cloud.Firestore;

namespace TapaBuracos.Persistence.Models
{
    [FirestoreData]
    public class EvaluationPersistence : IEntity
    {
        public EvaluationPersistence()
        {
        }

        [FirestoreDocumentId]
        public string Id { get; set; }
        [FirestoreProperty]
        public string UserId { get; set; }
        [FirestoreProperty]
        public string IssueId { get; set; }
        [FirestoreProperty]
        public int Rating { get; set; }
        [FirestoreProperty]
        public string Comment { get; set; }
        [FirestoreProperty]
        public string MunicipalityId { get; set; }
    }
}
