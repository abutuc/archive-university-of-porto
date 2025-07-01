using FluentAssertions;
using Newtonsoft.Json;
using TapaBuracos.Core.Interfaces.Models;

namespace TapaBuracos.Tests.UnitTests.CoreTests
{
    public class MunicipalityTests
    {
        [Fact]
        public void Constructor_ShouldInitializeFromIUser()
        {
            // Arrange
            var mockUser = new MockUser { Id = "1", Name = "Test User", Email = "test@example.com" };

            // Act
            var municipality = new global::TapaBuracos.Core.Models.Municipality(mockUser);

            // Assert
            municipality.Id.Should().Be("1");
            municipality.Name.Should().Be("Test User");
            municipality.Email.Should().Be("test@example.com");
        }

        [Fact]
        public void Constructor_ShouldInitializeWithAllParameters()
        {
            // Arrange
            var postalCodes = new List<string> { "12345", "67890" };

            // Act
            var municipality = new global::TapaBuracos.Core.Models.Municipality(
                "1", "Test Municipality", "test@example.com", "http://example.com/photo.jpg", 5, postalCodes
            );

            // Assert
            municipality.Id.Should().Be("1");
            municipality.Name.Should().Be("Test Municipality");
            municipality.Email.Should().Be("test@example.com");
            municipality.PhotoUrl.Should().Be("http://example.com/photo.jpg");
            municipality.MinOccurrences.Should().Be(5);
            municipality.PostalCodes.Should().BeEquivalentTo(postalCodes);
        }

        [Fact]
        public void JsonConstructor_ShouldInitializeWithAllParameters()
        {
            // Arrange
            var postalCodes = new List<string> { "12345", "67890" };

            // Act
            var municipality = new global::TapaBuracos.Core.Models.Municipality(
                "1", "Test Municipality", "test@example.com", "http://example.com/photo.jpg", 5, postalCodes, true, DateTime.Today
            );

            // Assert
            municipality.Blocked.Should().BeTrue();
            municipality.DateBlocked.Should().Be(DateTime.Today);
        }

        [Fact]
        public void JsonConstructor_ShouldDeserializeFromJson()
        {
            // Arrange
            var json = @"
            {
                ""id"": ""1"",
                ""name"": ""Test Municipality"",
                ""email"": ""test@example.com"",
                ""photoUrl"": ""http://example.com/photo.jpg"",
                ""minOccurrences"": 5,
                ""postalCodes"": [""12345"", ""67890""],
                ""blocked"": true,
                ""dateBlocked"": ""2024-12-03T00:00:00""
            }";

            // Act
            var municipality = JsonConvert.DeserializeObject<global::TapaBuracos.Core.Models.Municipality>(json);

            // Assert
            municipality.Id.Should().Be("1");
            municipality.Name.Should().Be("Test Municipality");
            municipality.Email.Should().Be("test@example.com");
            municipality.Blocked.Should().BeTrue();
            municipality.DateBlocked.Should().Be(DateTime.Parse("2024-12-03"));
        }

        private class MockUser : IUser
        {
            public string Id { get; set; }
            public string Name { get; set; }
            public string Email { get; set; }
        }
    }
}
