using TapaBuracos.Core.Interfaces.Repositories;
using TapaBuracos.Core.Interfaces.Services;
using TapaBuracos.Core.Interfaces.Models;
using TapaBuracos.Core.Models;

namespace TapaBuracos.Core.Services;

public class IssueNotificationService : IIssueNotificationService
{
    protected IIssueNotificationRepository Repository { get; }

    public IssueNotificationService(IIssueNotificationRepository repository)
    {
        Repository = repository;
    }

    public async Task CreateIssueNotificationAsync(IIssueNotification issueNotification)
    {
        await Repository.CreateIssueNotification(issueNotification);
    }

    public async Task MarkIssueNotificationAsRead(string issueNotificationId)
    {
        await Repository.MarkIssueNotificationAsRead(issueNotificationId);
    }

    public async Task<List<IssueNotification>> GetUserUnreadIssueNotifications(string userId)
    {
        var result = await Repository.GetUserUnreadIssueNotifications(userId);
        return result.ToList();
    }

    public async Task DeleteIssueNotification(string issueNotificationId)
    {
        await Repository.DeleteIssueNotification(issueNotificationId);
    }
    
}