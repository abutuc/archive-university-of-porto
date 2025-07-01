using FluentAssertions;
using Newtonsoft.Json;
using TapaBuracos.Persistence.Models;

namespace TapaBuracos.Tests.UnitTests.Models
{
    public class MunicipalityPersistenceTests
    {
        [Fact]
        public void Constructor_Should_Initialize_Properties_To_Default()
        {
            // Act
            var municipalityPersistence = new MunicipalityPersistence();

            // Assert
            municipalityPersistence.Id.Should().BeNull();
            municipalityPersistence.Name.Should().BeNull();
            municipalityPersistence.Email.Should().BeNull();
            municipalityPersistence.PhotoUrl.Should().BeNull();
            municipalityPersistence.MinOccurrences.Should().Be(0);
            municipalityPersistence.PostalCodes.Should().BeNull();
            municipalityPersistence.Blocked.Should().BeFalse();
            municipalityPersistence.DateBlocked.Should().BeNull();
        }

        [Fact]
        public void Properties_Should_Be_Set_And_Retrieved_Correctly()
        {
            // Arrange
            var id = "TestId";
            var name = "Test Municipality";
            var email = "test@example.com";
            var photoUrl = "http://example.com/photo.jpg";
            var minOccurrences = 5;
            var postalCodes = new List<string> { "12345", "67890" };
            var blocked = true;
            var dateBlocked = DateTime.UtcNow;

            // Act
            var municipalityPersistence = new MunicipalityPersistence
            {
                Id = id,
                Name = name,
                Email = email,
                PhotoUrl = photoUrl,
                MinOccurrences = minOccurrences,
                PostalCodes = postalCodes,
                Blocked = blocked,
                DateBlocked = dateBlocked
            };

            // Assert
            municipalityPersistence.Id.Should().Be(id);
            municipalityPersistence.Name.Should().Be(name);
            municipalityPersistence.Email.Should().Be(email);
            municipalityPersistence.PhotoUrl.Should().Be(photoUrl);
            municipalityPersistence.MinOccurrences.Should().Be(minOccurrences);
            municipalityPersistence.PostalCodes.Should().BeEquivalentTo(postalCodes);
            municipalityPersistence.Blocked.Should().Be(blocked);
            municipalityPersistence.DateBlocked.Should().Be(dateBlocked);
        }

        [Fact]
        public void Should_Serialize_And_Deserialize_Correctly()
        {
            // Arrange
            var municipalityPersistence = new MunicipalityPersistence
            {
                Id = "TestId",
                Name = "Test Municipality",
                Email = "test@example.com",
                PhotoUrl = "http://example.com/photo.jpg",
                MinOccurrences = 5,
                PostalCodes = new List<string> { "12345", "67890" },
                Blocked = true,
                DateBlocked = DateTime.UtcNow
            };

            // Act
            var serialized = JsonConvert.SerializeObject(municipalityPersistence);
            var deserialized = JsonConvert.DeserializeObject<MunicipalityPersistence>(serialized);

            // Assert
            deserialized.Should().BeEquivalentTo(municipalityPersistence);
        }
    }
}
