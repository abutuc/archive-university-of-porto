using Moq;
using TapaBuracos.Core.Interfaces.Models;
using TapaBuracos.Core.Interfaces.Repositories;
using TapaBuracos.Core.Models;
using TapaBuracos.Core.Services;
using FluentAssertions;
using TapaBuracos.Core.Enums;

namespace TapaBuracos.Tests.UnitTests.Services
{
    public class IssueNotificationServiceTests
    {
        private readonly Mock<IIssueNotificationRepository> _repositoryMock;
        private readonly IssueNotificationService _service;

        public IssueNotificationServiceTests()
        {
            _repositoryMock = new Mock<IIssueNotificationRepository>();
            _service = new IssueNotificationService(_repositoryMock.Object);
        }

        [Fact]
        public async Task CreateIssueNotificationAsync_Should_Invoke_Repository_Method()
        {
            // Arrange
            var issueNotification = new Mock<IIssueNotification>().Object;

            // Act
            await _service.CreateIssueNotificationAsync(issueNotification);

            // Assert
            _repositoryMock.Verify(repo => repo.CreateIssueNotification(issueNotification), Times.Once);
        }

        [Fact]
        public async Task MarkIssueNotificationAsRead_Should_Invoke_Repository_Method()
        {
            // Arrange
            var issueNotificationId = "TestNotificationId";

            // Act
            await _service.MarkIssueNotificationAsRead(issueNotificationId);

            // Assert
            _repositoryMock.Verify(repo => repo.MarkIssueNotificationAsRead(issueNotificationId), Times.Once);
        }

        [Fact]
        public async Task GetUserUnreadIssueNotifications_Should_Return_Unread_Notifications()
        {
            // Arrange
            var userId = "TestUserId";
            var unreadNotifications = new List<IssueNotification>
            {
                new IssueNotification("NotificationId", "IssueId", "IssueNotificationDescription", IssueType.Accident, "IssueDescription", IssueStatus.Approved, "UserID", true, DateTimeOffset.Now),
                new IssueNotification("NotificationId2", "IssueId", "IssueNotificationDescription", IssueType.Accident, "IssueDescription", IssueStatus.Approved, "UserID", true, DateTimeOffset.Now),
            };

            _repositoryMock
                .Setup(repo => repo.GetUserUnreadIssueNotifications(userId))
                .ReturnsAsync(unreadNotifications);

            // Act
            var result = await _service.GetUserUnreadIssueNotifications(userId);

            // Assert
            result.Should().BeEquivalentTo(unreadNotifications);
            _repositoryMock.Verify(repo => repo.GetUserUnreadIssueNotifications(userId), Times.Once);
        }

        [Fact]
        public async Task DeleteIssueNotification_Should_Invoke_Repository_Method()
        {
            // Arrange
            var issueNotificationId = "TestNotificationId";

            // Act
            await _service.DeleteIssueNotification(issueNotificationId);

            // Assert
            _repositoryMock.Verify(repo => repo.DeleteIssueNotification(issueNotificationId), Times.Once);
        }
    }
}
