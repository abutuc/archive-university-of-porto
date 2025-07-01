using TapaBuracos.Core.Enums;

namespace TapaBuracos.Core.Interfaces.Models;

public interface IIssueNotification
{
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