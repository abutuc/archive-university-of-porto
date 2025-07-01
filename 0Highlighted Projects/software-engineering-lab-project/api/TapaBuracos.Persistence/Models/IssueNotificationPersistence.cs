using Coelho.Arc.Bosporus.Models;
using Google.Cloud.Firestore;
using TapaBuracos.Core.Enums;

namespace TapaBuracos.Persistence.Models;

[FirestoreData]
public class IssueNotificationPersistence : IEntity
{
    public IssueNotificationPersistence(){}
    
    [FirestoreDocumentId]
    public string Id { get; set; }
    
    [FirestoreProperty]
    public string IssueId { get; set; }
    
    [FirestoreProperty]
    public string IssueDescription { get; set; }
    
    [FirestoreProperty]
    public IssueType IssueType { get; set; }
    
    [FirestoreProperty]
    public string Description { set; get; }
    
    [FirestoreProperty]
    public IssueStatus IssueStatus { get; set; }
    
    [FirestoreProperty]
    public string UserId { get; set; }
    
    [FirestoreProperty]
    public bool ReadNotification { get; set; }
    
    [FirestoreProperty]
    public DateTimeOffset CreatedDate { get; set; }
    
}