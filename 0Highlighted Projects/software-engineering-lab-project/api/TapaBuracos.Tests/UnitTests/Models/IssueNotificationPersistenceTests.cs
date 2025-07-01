using FluentAssertions;
using Newtonsoft.Json;
using TapaBuracos.Core.Enums;
using TapaBuracos.Persistence.Models;

namespace TapaBuracos.Tests.UnitTests.Models
{
    public class IssueNotificationPersistenceTests
    {
        [Fact]
        public void Constructor_Should_Initialize_Properties_To_Default()
        {
            // Act
            var issueNotificationPersistence = new IssueNotificationPersistence();

            // Assert
            issueNotificationPersistence.Id.Should().BeNull();
            issueNotificationPersistence.IssueId.Should().BeNull();
            issueNotificationPersistence.IssueDescription.Should().BeNull();
            issueNotificationPersistence.IssueType.Should().Be(default(IssueType));
            issueNotificationPersistence.Description.Should().BeNull();
            issueNotificationPersistence.IssueStatus.Should().Be(default(IssueStatus));
            issueNotificationPersistence.UserId.Should().BeNull();
            issueNotificationPersistence.ReadNotification.Should().BeFalse();
            issueNotificationPersistence.CreatedDate.Should().Be(default(DateTimeOffset));
        }

        [Fact]
        public void Properties_Should_Be_Set_And_Retrieved_Correctly()
        {
            // Arrange
            var id = "TestId";
            var issueId = "TestIssueId";
            var issueDescription = "Test Issue Description";
            var issueType = IssueType.Accident;
            var description = "Test Description";
            var issueStatus = IssueStatus.Approved;
            var userId = "TestUserId";
            var readNotification = true;
            var createdDate = DateTimeOffset.UtcNow;

            // Act
            var issueNotificationPersistence = new IssueNotificationPersistence
            {
                Id = id,
                IssueId = issueId,
                IssueDescription = issueDescription,
                IssueType = issueType,
                Description = description,
                IssueStatus = issueStatus,
                UserId = userId,
                ReadNotification = readNotification,
                CreatedDate = createdDate
            };

            // Assert
            issueNotificationPersistence.Id.Should().Be(id);
            issueNotificationPersistence.IssueId.Should().Be(issueId);
            issueNotificationPersistence.IssueDescription.Should().Be(issueDescription);
            issueNotificationPersistence.IssueType.Should().Be(issueType);
            issueNotificationPersistence.Description.Should().Be(description);
            issueNotificationPersistence.IssueStatus.Should().Be(issueStatus);
            issueNotificationPersistence.UserId.Should().Be(userId);
            issueNotificationPersistence.ReadNotification.Should().Be(readNotification);
            issueNotificationPersistence.CreatedDate.Should().Be(createdDate);
        }

        [Fact]
        public void Should_Serialize_And_Deserialize_Correctly()
        {
            // Arrange
            var issueNotificationPersistence = new IssueNotificationPersistence
            {
                Id = "TestId",
                IssueId = "TestIssueId",
                IssueDescription = "Test Issue Description",
                IssueType = IssueType.Accident,
                Description = "Test Description",
                IssueStatus = IssueStatus.Approved,
                UserId = "TestUserId",
                ReadNotification = true,
                CreatedDate = DateTimeOffset.UtcNow
            };

            // Act
            var serialized = JsonConvert.SerializeObject(issueNotificationPersistence);
            var deserialized = JsonConvert.DeserializeObject<IssueNotificationPersistence>(serialized);

            // Assert
            deserialized.Should().BeEquivalentTo(issueNotificationPersistence);
        }
    }
}
