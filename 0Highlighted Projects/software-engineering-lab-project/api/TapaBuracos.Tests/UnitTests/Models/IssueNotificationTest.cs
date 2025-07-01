using Newtonsoft.Json;
using TapaBuracos.Core.Enums;
using FluentAssertions;
using TapaBuracos.Core.Models;

namespace TapaBuracos.Tests.UnitTests.Models
{
    public class IssueNotificationTests
    {
        [Fact]
        public void Constructor_Should_Set_All_Properties_Correctly()
        {
            // Arrange
            var id = "TestId";
            var issueId = "IssueId";
            var issueDescription = "Test Issue Description";
            var issueType = IssueType.Pothole;
            var description = "Test Description";
            var issueStatus = IssueStatus.New;
            var userId = "UserId";
            var readNotification = false;
            var createdDate = DateTimeOffset.UtcNow;

            // Act
            var issueNotification = new IssueNotification(
                id,
                issueId,
                issueDescription,
                issueType,
                description,
                issueStatus,
                userId,
                readNotification,
                createdDate
            );

            // Assert
            issueNotification.Id.Should().Be(id);
            issueNotification.IssueId.Should().Be(issueId);
            issueNotification.IssueDescription.Should().Be(issueDescription);
            issueNotification.IssueType.Should().Be(issueType);
            issueNotification.Description.Should().Be(description);
            issueNotification.IssueStatus.Should().Be(issueStatus);
            issueNotification.UserId.Should().Be(userId);
            issueNotification.ReadNotification.Should().Be(readNotification);
            issueNotification.CreatedDate.Should().Be(createdDate);
        }

        [Fact]
        public void Should_Serialize_And_Deserialize_Correctly()
        {
            // Arrange
            var id = "TestId";
            var issueId = "IssueId";
            var issueDescription = "Test Issue Description";
            var issueType = IssueType.Pothole;
            var description = "Test Description";
            var issueStatus = IssueStatus.New;
            var userId = "UserId";
            var readNotification = true;
            var createdDate = DateTimeOffset.UtcNow;

            var issueNotification = new IssueNotification(
                id,
                issueId,
                issueDescription,
                issueType,
                description,
                issueStatus,
                userId,
                readNotification,
                createdDate
            );

            // Act
            var serialized = JsonConvert.SerializeObject(issueNotification);
            var deserialized = JsonConvert.DeserializeObject<IssueNotification>(serialized);

            // Assert
            deserialized.Should().BeEquivalentTo(issueNotification);
        }
    }
}
