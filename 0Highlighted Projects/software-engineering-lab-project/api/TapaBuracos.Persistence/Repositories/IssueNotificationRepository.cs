using Coelho.Arc.Bosporus.Firestore.Repositories;
using Google.Cloud.Firestore;
using Mapster;
using TapaBuracos.Core.Interfaces.Repositories;
using TapaBuracos.Core.Interfaces.Models;
using TapaBuracos.Core.Models;
using TapaBuracos.Persistence.Models;

namespace TapaBuracos.Persistence.Repositories;

public class IssueNotificationRepository : FirestoreRepositoryBase<IssueNotificationPersistence>, IIssueNotificationRepository
{
    protected override string CollectionName => "IssueNotifications";

    public IssueNotificationRepository(FirestoreDb database) : base(database)
    {
    }

    public async Task CreateIssueNotification(IIssueNotification issueNotification)
    {
        var persistence = issueNotification.Adapt<IssueNotificationPersistence>();
        await AddAsync(persistence);
    }

    public async Task MarkIssueNotificationAsRead(string issueNotificationId)
    {
        var document = await Collection.Document(issueNotificationId).GetSnapshotAsync();

        if (!document.Exists) return;

        var update = new Dictionary<string, object>
        {
            { nameof(IssueNotificationPersistence.ReadNotification), true }
        };

        await document.Reference.UpdateAsync(update);
    }

    public async Task<IEnumerable<IssueNotification>> GetUserUnreadIssueNotifications(string userId)
    {
        var query = Collection.WhereEqualTo(nameof(IssueNotificationPersistence.UserId), userId).WhereEqualTo(nameof(IssueNotificationPersistence.ReadNotification), false);
        var snapshot = await query.GetSnapshotAsync();
        List<IssueNotificationPersistence> result = [];
        foreach (var d in snapshot.Documents) result.Add(d.ConvertTo<IssueNotificationPersistence>());
        return result.Adapt<IEnumerable<IssueNotification>>();
    }

    public async Task DeleteIssueNotification(string issueNotificationId)
    {
        await DeleteAsync(issueNotificationId);
    }
    
}