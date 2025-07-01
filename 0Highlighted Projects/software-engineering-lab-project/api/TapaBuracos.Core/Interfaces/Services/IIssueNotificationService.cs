using TapaBuracos.Core.Interfaces.Models;
using TapaBuracos.Core.Models;

namespace TapaBuracos.Core.Interfaces.Services;

public interface IIssueNotificationService
{
    Task CreateIssueNotificationAsync(IIssueNotification issueNotification);
    Task MarkIssueNotificationAsRead(string issueNotificationId);
    Task<List<IssueNotification>> GetUserUnreadIssueNotifications(string userId);
    Task DeleteIssueNotification(string issueNotificationId);
}