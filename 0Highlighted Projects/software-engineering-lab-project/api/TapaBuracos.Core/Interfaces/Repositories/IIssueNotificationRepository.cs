using TapaBuracos.Core.Interfaces.Models;
using TapaBuracos.Core.Models;

namespace TapaBuracos.Core.Interfaces.Repositories;

public interface IIssueNotificationRepository
{
    Task CreateIssueNotification(IIssueNotification issueNotification);
    Task MarkIssueNotificationAsRead(string issueNotificationId);
    Task<IEnumerable<IssueNotification>> GetUserUnreadIssueNotifications(string userId);
    Task DeleteIssueNotification(string issueNotificationId);
}