using FluentAssertions;
using FluentValidation.Results;
using Moq;
using TapaBuracos.Core.Interfaces.Models;
using TapaBuracos.Core.Interfaces.Repositories;
using TapaBuracos.Core.Services;

namespace TapaBuracos.Tests.UnitTests.CoreTests;

public class MunicipalityServiceTest
{
    public class MunicipalityServiceTests
    {
        private readonly Mock<IMunicipalityRepository> _mockRepository;
        private readonly Mock<Coelho.Arc.Constantinople.Interfaces.IValidator<global::TapaBuracos.Core.Models.Municipality>> _mockValidator;
        private readonly MunicipalityService _municipalityService;

        public MunicipalityServiceTests()
        {
            _mockRepository = new Mock<IMunicipalityRepository>();
            _mockValidator = new Mock<Coelho.Arc.Constantinople.Interfaces.IValidator<global::TapaBuracos.Core.Models.Municipality>>();
            _municipalityService = new MunicipalityService(_mockRepository.Object, _mockValidator.Object);
        }

        [Fact]
        public async Task RegisterAssociationAsync_ShouldReturnValidationErrors_WhenValidationFails()
        {
            // Arrange
            var user = Mock.Of<IUser>(u => u.Id == "1" && u.Name == "Test User" && u.Email == "test@example.com");
            var failedValidationResult = new ValidationResult(new[] { new ValidationFailure("Name", "Name is required.") });

            _mockValidator
                .Setup(v => v.ValidateAsync(It.IsAny<global::TapaBuracos.Core.Models.Municipality>()))
                .ReturnsAsync(failedValidationResult);

            // Act
            var result = await _municipalityService.RegisterAssociationAsync(user);

            // Assert
            result.IsValid.Should().BeFalse();
            result.Errors.Should().ContainSingle(e => e.ErrorMessage == "Name is required.");
            _mockRepository.Verify(r => r.AssociateMunicipalityAsync(It.IsAny<global::TapaBuracos.Core.Models.Municipality>()), Times.Never);
        }

        [Fact]
        public async Task RegisterAssociationAsync_ShouldCallRepository_WhenValidationSucceeds()
        {
            // Arrange
            var user = Mock.Of<IUser>(u => u.Id == "1" && u.Name == "Test User" && u.Email == "test@example.com");
            var successfulValidationResult = new ValidationResult();

            _mockValidator
                .Setup(v => v.ValidateAsync(It.IsAny<global::TapaBuracos.Core.Models.Municipality>()))
                .ReturnsAsync(successfulValidationResult);

            _mockRepository
                .Setup(r => r.AssociateMunicipalityAsync(It.IsAny<global::TapaBuracos.Core.Models.Municipality>()))
                .Returns(Task.CompletedTask);

            // Act
            var result = await _municipalityService.RegisterAssociationAsync(user);

            // Assert
            result.IsValid.Should().BeTrue();
            _mockRepository.Verify(r => r.AssociateMunicipalityAsync(It.Is<global::TapaBuracos.Core.Models.Municipality>(m => m.Id == "1")), Times.Once);
        }

        [Fact]
        public async Task FindByIdAsync_ShouldReturnMunicipality_WhenIdExists()
        {
            // Arrange
            var expectedMunicipality = new global::TapaBuracos.Core.Models.Municipality("1", "Test Municipality", "test@example.com", "photoUrl", 5, new List<string>());
            _mockRepository
                .Setup(r => r.FindByIdAsync("1"))
                .ReturnsAsync(expectedMunicipality);

            // Act
            var result = await _municipalityService.FindByIdAsync("1");

            // Assert
            result.Should().NotBeNull();
            result.Id.Should().Be("1");
            result.Name.Should().Be("Test Municipality");
            _mockRepository.Verify(r => r.FindByIdAsync("1"), Times.Once);
        }

        [Fact]
        public async Task FindByIdAsync_ShouldReturnNull_WhenIdDoesNotExist()
        {
            // Arrange
            _mockRepository
                .Setup(r => r.FindByIdAsync("nonexistent"))
                .ReturnsAsync((global::TapaBuracos.Core.Models.Municipality)null);

            // Act
            var result = await _municipalityService.FindByIdAsync("nonexistent");

            // Assert
            result.Should().BeNull();
            _mockRepository.Verify(r => r.FindByIdAsync("nonexistent"), Times.Once);
        }
    }
}