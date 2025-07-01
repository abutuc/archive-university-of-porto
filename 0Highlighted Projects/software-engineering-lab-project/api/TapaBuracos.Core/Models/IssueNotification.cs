using Newtonsoft.Json;
using TapaBuracos.Core.Enums;
using TapaBuracos.Core.Interfaces.Models;

namespace TapaBuracos.Core.Models;

public record IssueNotification : IIssueNotification
{
    [JsonConstructor]
    public IssueNotification(string id, string issueId, string issueDescription, IssueType issueType,
        string description, IssueStatus issueStatus, string userId, bool readNotification, DateTimeOffset createdDate)
    {
        Id = id;
        IssueId = issueId;
        IssueDescription = issueDescription;
        IssueType = issueType;
        Description = description;
        IssueStatus = issueStatus;
        UserId = userId;
        ReadNotification = readNotification;
        CreatedDate = createdDate;
    }
    
    public string Id { get; }
    public string IssueId { get; }
    public string IssueDescription { get; }
    public IssueType IssueType { get; }
    public string Description { get; }
    public IssueStatus IssueStatus { get; }
    public string UserId { get; }
    public bool ReadNotification { get; }
    public DateTimeOffset CreatedDate { get; }
}