using Coelho.Arc.Bosporus.Models;
using Google.Cloud.Firestore;
using TapaBuracos.Core.Enums;

namespace TapaBuracos.Persistence.Models
{
    [FirestoreData]
    public class IssuePersistence : IEntity
    {
        public IssuePersistence()
        {
        }

        [FirestoreDocumentId]
        public string Id { get; set; }

        [FirestoreProperty]
        public IssueType Type { get; set; }

        [FirestoreProperty]
        public string OtherTypeDescription { get; set; }

        [FirestoreProperty]
        public LocationPersistence Location { get; set; }

        [FirestoreProperty]
        public string Description { get; set; }

        [FirestoreProperty]
        public List<string> ReporterIds { get; set; }

        [FirestoreProperty]
        public DateTimeOffset DateReported { get; set; }

        [FirestoreProperty]
        public IssueStatus Status { get; set; }

        [FirestoreProperty]
        public string MunicipalityId { get; set; }

        [FirestoreProperty]
        public int Occurrences { get; set; }

        [FirestoreProperty]
        public string ImageUrl { get; set; }

        [FirestoreProperty]
        public string AssignedTeam { get; set; }

        [FirestoreProperty]
        public string MunicipalityObservations { get; set; }

        [FirestoreProperty]
        public DateTimeOffset? DateApproved { get; set; }

        [FirestoreProperty]
        public DateTimeOffset? DateResolved { get; set; }

        [FirestoreProperty]
        public Priority? Priority { get; set; }
        
        [FirestoreProperty]
        public List<string> Watchers { get; set; }
    }
}

