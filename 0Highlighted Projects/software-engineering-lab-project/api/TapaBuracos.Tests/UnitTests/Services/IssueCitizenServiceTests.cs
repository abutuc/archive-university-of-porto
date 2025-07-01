using Coelho.Arc.Constantinople.DependencyInjection;
using FluentAssertions;
using FluentValidation.Results;
using Moq;
using TapaBuracos.Citizen.Interfaces.Repositories;
using TapaBuracos.Citizen.Interfaces.Services;
using TapaBuracos.Citizen.Services;
using TapaBuracos.Core.Interfaces.Models;
using TapaBuracos.Core.Interfaces.Services;
using TapaBuracos.Tests.Application;

namespace TapaBuracos.Tests.UnitTests.Services
{
    public class IssueCitizenServiceTests : UnitModel, IClassFixture<TestInitializer>
    {
        protected IIssueCitizenService Service { get; }
        public IssueCitizenServiceTests(TestInitializer initializer) : base(initializer)
        {
            Service = DependencyManager.Instance.GetInstance<IIssueCitizenService>();
        }

        [Fact]
        public async Task RegisterNewIssue_GeneratedRandomly_ShouldReturnFalseFromService()
        {
            //Arrange
            var repoMock = new Mock<IIssueCitizenRepository>();
            var municipalityServiceMock = new Mock<IMunicipalityService>();
            var validatorMock = new Mock<Coelho.Arc.Constantinople.Interfaces.IValidator<IIssue>>();
            validatorMock.Setup(v => v.ValidateAsync(It.IsAny<IIssue>())).ReturnsAsync((IIssue issue) => new ValidationResult());
            var notificationServiceMock = new Mock<IIssueNotificationService>();
            var mockedService = new IssueCitizenService(repoMock.Object, validatorMock.Object, municipalityServiceMock.Object, notificationServiceMock.Object);

            //Act
            var result = await mockedService.ReportIssueAsync(It.IsAny<IIssue>());

            //Assert
            result.IsDuplicatedIssue.Should().BeFalse();
            repoMock.Verify(r => r.RegisterIssueAsync(It.IsAny<IIssue>()), Times.Once);
            repoMock.Verify(r => r.CheckIfDuplicatedIssueAsync(It.IsAny<IIssue>()), Times.Once);
            validatorMock.Verify(v => v.ValidateAsync(It.IsAny<IIssue>()), Times.Once);
        }

        [Fact]
        public async Task RegisterNewIssue_GeneratedRandomly_ShouldReturnTrueFromService()
        {
            //Arrange]
            var municipalityServiceMock = new Mock<IMunicipalityService>();
            var repoMock = new Mock<IIssueCitizenRepository>();
            repoMock.Setup(r => r.CheckIfDuplicatedIssueAsync(It.IsAny<IIssue>())).ReturnsAsync((IIssue issue) => true);
            var validatorMock = new Mock<Coelho.Arc.Constantinople.Interfaces.IValidator<IIssue>>();
            validatorMock.Setup(v => v.ValidateAsync(It.IsAny<IIssue>())).ReturnsAsync((IIssue issue) => new ValidationResult());
            var notificationServiceMock = new Mock<IIssueNotificationService>();
            var mockedService = new IssueCitizenService(repoMock.Object, validatorMock.Object, municipalityServiceMock.Object, notificationServiceMock.Object);

            //Act
            var result = await mockedService.ReportIssueAsync(It.IsAny<IIssue>());

            //Assert
            result.IsDuplicatedIssue.Should().BeTrue();
            repoMock.Verify(r => r.RegisterIssueAsync(It.IsAny<IIssue>()), Times.Never);
            repoMock.Verify(r => r.CheckIfDuplicatedIssueAsync(It.IsAny<IIssue>()), Times.Once);
            validatorMock.Verify(v => v.ValidateAsync(It.IsAny<IIssue>()), Times.Once);
        }

        [Fact]
        public async Task RegisterNewIssue_GeneratedRandomly_ShouldThrowInvalidOperationException()
        {
            //Arrange
            var repoMock = new Mock<IIssueCitizenRepository>();
            var municipalityServiceMock = new Mock<IMunicipalityService>();
            var validatorMock = new Mock<Coelho.Arc.Constantinople.Interfaces.IValidator<IIssue>>();
            validatorMock.Setup(v => v.ValidateAsync(It.IsAny<IIssue>())).ReturnsAsync((IIssue issue) =>
            {
                var validation = new ValidationResult();
                validation.Errors.Add(new ValidationFailure("mock", "lorem"));
                return validation;
            });
            var notificationServiceMock = new Mock<IIssueNotificationService>();
            var mockedService = new IssueCitizenService(repoMock.Object, validatorMock.Object, municipalityServiceMock.Object, notificationServiceMock.Object);

            //Act            
            var result = await mockedService.ReportIssueAsync(It.IsAny<IIssue>());

            //Assert
            //await action.Should().ThrowAsync<InvalidOperationException>();
            result.ValidationResult.IsValid.Should().BeFalse();
            repoMock.Verify(r => r.RegisterIssueAsync(It.IsAny<IIssue>()), Times.Never);
            repoMock.Verify(r => r.CheckIfDuplicatedIssueAsync(It.IsAny<IIssue>()), Times.Never);
            validatorMock.Verify(v => v.ValidateAsync(It.IsAny<IIssue>()), Times.Once);
        }
    }
}
