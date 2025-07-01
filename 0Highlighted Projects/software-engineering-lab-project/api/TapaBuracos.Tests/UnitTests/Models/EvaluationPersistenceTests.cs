using FluentAssertions;
using Newtonsoft.Json;
using TapaBuracos.Persistence.Models;

namespace TapaBuracos.Tests.UnitTests.Models
{
    public class EvaluationPersistenceTests
    {
        [Fact]
        public void Constructor_Should_Initialize_Properties_To_Default()
        {
            // Act
            var evaluationPersistence = new EvaluationPersistence();

            // Assert
            evaluationPersistence.Id.Should().BeNull();
            evaluationPersistence.UserId.Should().BeNull();
            evaluationPersistence.IssueId.Should().BeNull();
            evaluationPersistence.Rating.Should().Be(0);
            evaluationPersistence.Comment.Should().BeNull();
            evaluationPersistence.MunicipalityId.Should().BeNull();
        }

        [Fact]
        public void Properties_Should_Be_Set_And_Retrieved_Correctly()
        {
            // Arrange
            var id = "TestId";
            var userId = "TestUserId";
            var issueId = "TestIssueId";
            var rating = 5;
            var comment = "Test Comment";
            var municipalityId = "TestMunicipalityId";

            // Act
            var evaluationPersistence = new EvaluationPersistence
            {
                Id = id,
                UserId = userId,
                IssueId = issueId,
                Rating = rating,
                Comment = comment,
                MunicipalityId = municipalityId
            };

            // Assert
            evaluationPersistence.Id.Should().Be(id);
            evaluationPersistence.UserId.Should().Be(userId);
            evaluationPersistence.IssueId.Should().Be(issueId);
            evaluationPersistence.Rating.Should().Be(rating);
            evaluationPersistence.Comment.Should().Be(comment);
            evaluationPersistence.MunicipalityId.Should().Be(municipalityId);
        }

        [Fact]
        public void Should_Serialize_And_Deserialize_Correctly()
        {
            // Arrange
            var evaluationPersistence = new EvaluationPersistence
            {
                Id = "TestId",
                UserId = "TestUserId",
                IssueId = "TestIssueId",
                Rating = 5,
                Comment = "Test Comment",
                MunicipalityId = "TestMunicipalityId"
            };

            // Act
            var serialized = JsonConvert.SerializeObject(evaluationPersistence);
            var deserialized = JsonConvert.DeserializeObject<EvaluationPersistence>(serialized);

            // Assert
            deserialized.Should().BeEquivalentTo(evaluationPersistence);
        }
    }
}
