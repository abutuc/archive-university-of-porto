using Coelho.Arc.Constantinople.DependencyInjection;
using Coelho.Arc.Constantinople.Interfaces;
using Coelho.Arc.Constantinople.Utils;
using FluentValidation.Results;
using Moq;
using TapaBuracos.Core.Enums;
using TapaBuracos.Core.Helpers;
using TapaBuracos.Core.Models;
using TapaBuracos.Municipality.Interfaces.Repositories;
using TapaBuracos.Municipality.Models;
using TapaBuracos.Municipality.Services;
using FluentAssertions;
using TapaBuracos.Api.Models.Filters;
using TapaBuracos.Citizen.Services;
using TapaBuracos.Core.Interfaces.Repositories;
using TapaBuracos.Core.Validators;
using TapaBuracos.Tests.Application;

namespace TapaBuracos.Tests.UnitTests.Services
{
    public class EvaluationCitizenServiceTests : UnitModel, IClassFixture<TestInitializer>
    {
        private readonly Mock<IEvaluationRepository> _repositoryMock;
        private readonly Mock<Coelho.Arc.Constantinople.Interfaces.IValidator<Evaluation>> _validatorMock;
        private readonly EvaluationCitizenService _service;

        public EvaluationCitizenServiceTests(TestInitializer initializer) : base(initializer)
        {
            _repositoryMock = new Mock<IEvaluationRepository>();
            _validatorMock = new Mock<Coelho.Arc.Constantinople.Interfaces.IValidator<Evaluation>>();
            
            _service = new EvaluationCitizenService(_repositoryMock.Object, _validatorMock.Object);
        }

        [Fact]
        public async Task ObtainUserEvaluationAsync_Should_Invoke_Repository_Method()
        {
            var userId = "UserId";
            // Arrange
            var evaluations = new List<Evaluation>
            {
                new Evaluation("EvaluationId", userId, "StringId", 1, "Comment", "Municipality")
            };

            _repositoryMock.Setup(repo => repo.ObtainUserEvaluationsAsync(userId)).ReturnsAsync(evaluations);

            // Act
            var result = await _service.ObtainUserEvaluationsAsync(userId);

            // Assert
            _repositoryMock.Verify(repo => repo.ObtainUserEvaluationsAsync(userId), Times.Once);
            result.Should().BeEquivalentTo(evaluations);
            
        }
        
        [Fact]
        public async Task RegisterReviewAsync_Should_Return_InvalidValidationResult_When_Validation_Fails()
        {
            // Arrange
            var evaluation = new Evaluation("EvaluationId", "UserId", "StringId", 1, "Comment", "Municipality");
            var invalidValidationResult = new ValidationResult(new List<ValidationFailure>
            {
                new ValidationFailure("Property", "Validation failed.")
            });

            _validatorMock.Setup(v => v.ValidateAsync(evaluation)).ReturnsAsync(invalidValidationResult);
            
            // Act
            var result = await _service.RegisterReviewAsync(evaluation);

            // Assert
            result.Should().BeEquivalentTo(invalidValidationResult);
            result.IsValid.Should().BeFalse();

            _validatorMock.Verify(v => v.ValidateAsync(evaluation), Times.Once);
            _repositoryMock.Verify(repo => repo.RegisterReviewAsync(It.IsAny<Evaluation>()), Times.Never);
        }
        
        [Fact]
        public async Task RegisterReviewAsync_Should_Invoke_Repository_When_Validation_Passes()
        {
            // Arrange
            var evaluation = new Evaluation("EvaluationId", "UserId", "StringId", 1, "Comment", "Municipality");
            var validValidationResult = new ValidationResult();

            _validatorMock
                .Setup(v => v.ValidateAsync(evaluation))
                .ReturnsAsync(validValidationResult);

            // Act
            var result = await _service.RegisterReviewAsync(evaluation);

            // Assert
            result.Should().BeEquivalentTo(validValidationResult);
            result.IsValid.Should().BeTrue();

            _validatorMock.Verify(v => v.ValidateAsync(evaluation), Times.Once);
            _repositoryMock.Verify(repo => repo.RegisterReviewAsync(evaluation), Times.Once);
        }
    }
}
