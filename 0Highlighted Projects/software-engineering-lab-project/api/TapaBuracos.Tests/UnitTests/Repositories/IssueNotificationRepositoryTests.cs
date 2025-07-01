using Bogus;
using Coelho.Arc.Bosporus.Firestore.Repositories;
using Coelho.Arc.Constantinople.DependencyInjection;
using FluentAssertions;
using TapaBuracos.Core.Enums;
using TapaBuracos.Tests.Application;
using TapaBuracos.Core.Models;
using TapaBuracos.Persistence.Models;
using TapaBuracos.Core.Interfaces.Repositories;

namespace TapaBuracos.Tests.UnitTests.Repositories
{
    public class IssueNotificationRepositoryTests : UnitModel, IClassFixture<TestInitializer>
    {        
        protected IIssueNotificationRepository Repository { get; }
        
        public IssueNotificationRepositoryTests(TestInitializer initializer) : base(initializer)
        {
            Repository = DependencyManager.Instance.GetInstance<IIssueNotificationRepository>();
        }

        [Fact]
        public async Task RegisterNotificationAsync_GivenValidNotification_ShouldRegisterWithoutErrors()
        {
            // Arrange
            var notification = new Faker<IssueNotification>()
                .CustomInstantiator(f => new IssueNotification(
                    Guid.NewGuid().ToString(),
                    Guid.NewGuid().ToString(),
                    Guid.NewGuid().ToString(),
                    IssueType.Accident,
                    f.Lorem.Sentence(),
                    IssueStatus.Approved,
                    Guid.NewGuid().ToString(),
                    false,
                    DateTimeOffset.Now))
                .Generate();

            // Act
            await Repository.CreateIssueNotification(notification);

            // Assert
            var recoveredNotifications = await Repository.GetUserUnreadIssueNotifications(notification.UserId);
            recoveredNotifications.Should().ContainSingle(e => e.Id == notification.Id);

            // CleanUp
            await Repository.DeleteIssueNotification(notification.Id);
        }
        
        [Fact]
        public async Task MarkIssue_ShouldMarkAsReadSuccessfully()
        {
            // Arrange
            var notification = new Faker<IssueNotification>()
                .CustomInstantiator(f => new IssueNotification(
                    Guid.NewGuid().ToString(),
                    Guid.NewGuid().ToString(),
                    Guid.NewGuid().ToString(),
                    IssueType.Accident,
                    f.Lorem.Sentence(),
                    IssueStatus.Approved,
                    Guid.NewGuid().ToString(),
                    false,
                    DateTimeOffset.Now))
                .Generate();

            // Act
            await Repository.CreateIssueNotification(notification);

            await Repository.MarkIssueNotificationAsRead(notification.Id);
            
            
            // Assert
            var recoveredNotifications = await Repository.GetUserUnreadIssueNotifications(notification.UserId);
            recoveredNotifications.Should().BeEmpty();

            // CleanUp
            await DeleteNotification(notification.Id);
        }
        
        [Fact]
        public async Task MarkNonExistentIssue_ShouldDoNothing()
        {
            await Repository.MarkIssueNotificationAsRead("fake");
        }
        
        private async Task DeleteNotification(string notificationId)
        {
            await ((FirestoreRepositoryBase<IssueNotificationPersistence>)Repository).DeleteAsync(notificationId);
        }
    }
}
