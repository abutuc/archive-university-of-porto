using Coelho.Arc.Constantinople.DependencyInjection;
using Coelho.Arc.Constantinople.Interfaces;
using Coelho.Arc.Constantinople.Utils;
using FluentValidation.Results;
using Moq;
using TapaBuracos.Core.Enums;
using TapaBuracos.Core.Helpers;
using TapaBuracos.Core.Models;
using TapaBuracos.Municipality.Interfaces.Repositories;
using TapaBuracos.Municipality.Services;
using FluentAssertions;
using TapaBuracos.Api.Models.Filters;
using TapaBuracos.Tests.Application;
using TapaBuracos.Core.Interfaces.Repositories;

namespace TapaBuracos.Tests.UnitTests.MunicipalityTests
{
	public class IssueMunicipalityServiceTests : UnitModel, IClassFixture<TestInitializer>
    {
        private readonly Mock<IIssueMunicipalityRepository> _repositoryMock;
        private readonly Mock<IMunicipalityRepository> _municipalityRepository;
        private readonly Mock<Coelho.Arc.Constantinople.Interfaces.IValidator<InitializeIssueResolutionVO>> _initValidatorMock;
        private readonly Mock<Coelho.Arc.Constantinople.Interfaces.IValidator<ConcludeIssueVO>> _concludeValidatorMock;
        private readonly IssueMunicipalityService _service;

        public IssueMunicipalityServiceTests(TestInitializer initializer) : base(initializer)
        {
            _repositoryMock = new Mock<IIssueMunicipalityRepository>();
            _initValidatorMock = new Mock<Coelho.Arc.Constantinople.Interfaces.IValidator<InitializeIssueResolutionVO>>();
            _concludeValidatorMock = new Mock<Coelho.Arc.Constantinople.Interfaces.IValidator<ConcludeIssueVO>>();
            _municipalityRepository = new Mock<IMunicipalityRepository>();

            _service = new IssueMunicipalityService(_repositoryMock.Object, _initValidatorMock.Object, _concludeValidatorMock.Object, _municipalityRepository.Object);
        }

        [Fact]
        public async Task ObtainIssueAsync_Should_Invoke_Repository_Method()
        {
            // Arrange
            var issueId = "IssueId";
            var municipalityId = "MunicipalityId";
            var expectedIssue = new Issue(issueId, IssueType.Pothole, null, null, "Description", new List<string>(), DateTimeOffset.Now, IssueStatus.New, municipalityId, 1, null, null, null, null, null, Priority.Medium, new List<string>());

            _repositoryMock.Setup(repo => repo.ObtainIssueAsync(issueId, municipalityId)).ReturnsAsync(expectedIssue);

            // Act
            var result = await _service.ObtainIssueAsync(issueId, municipalityId);

            // Assert
            _repositoryMock.Verify(repo => repo.ObtainIssueAsync(issueId, municipalityId), Times.Once);
            result.Should().BeEquivalentTo(expectedIssue);
        }

        [Fact]
        public async Task ObtainIssuesAsync_Obsolete_Should_Invoke_Repository_Method()
        {
            // Arrange
            var municipalityId = "MunicipalityId";
            var issues = new List<Issue> { new Issue("IssueId", IssueType.Pothole, null, null, "Description", new List<string>(), DateTimeOffset.Now, IssueStatus.New, municipalityId, 1, null, null, null, null, null, Priority.Medium, new List<string>()) };

            _repositoryMock.Setup(repo => repo.ObtainIssuesAsync(municipalityId)).ReturnsAsync(issues);

            // Act
            var result = await _service.ObtainIssuesAsync(municipalityId);

            // Assert
            _repositoryMock.Verify(repo => repo.ObtainIssuesAsync(municipalityId), Times.Once);
            result.Should().BeEquivalentTo(issues);
        }
        
        [Fact]
        public async Task ObtainIssuesAsyncWithFiltering_Should_Invoke_Repository_Method()
        {
            // Arrange
            var municipalityId = "MunicipalityId";
            var filter = new IssueFilterDTO(true, null, null, null, null);
            var paging = new Paginator(1);
            var issues = new List<Issue> { new Issue("IssueId", IssueType.Pothole, null, null, "Description", new List<string>(), DateTimeOffset.Now, IssueStatus.New, municipalityId, 1, null, null, null, null, null, Priority.Medium, new List<string>()) };

            _repositoryMock.Setup(repo => repo.ObtainIssuesAsync(municipalityId, filter, paging)).ReturnsAsync(issues);

            // Act
            var result = await _service.ObtainIssuesAsync(municipalityId, filter,paging);

            // Assert
            _repositoryMock.Verify(repo => repo.ObtainIssuesAsync(municipalityId, filter, paging), Times.Once);
            result.Should().BeEquivalentTo(issues);
        }

        [Fact]
        public async Task InitiateResolutionAsync_InValidData_Should_NotInvoke_Repository_Method()
        {
            var realValidator = DependencyManager.Instance.GetInstance<IValidator<InitializeIssueResolutionVO>>();
            var localService = new IssueMunicipalityService(_repositoryMock.Object, realValidator, _concludeValidatorMock.Object, _municipalityRepository.Object);

            // Arrange
            var vo = new InitializeIssueResolutionVO(String.Empty, "Team", "Observations", Priority.High);
            
            _repositoryMock.Setup(repo => repo.InitiateResolutionAsync(vo)).Returns(Task.CompletedTask);

            // Act
            var result = await localService.InitiateResolutionAsync(vo);

            // Assert
            _repositoryMock.Verify(repo => repo.InitiateResolutionAsync(vo), Times.Never);
            result.IsValid.Should().BeFalse();
        }
        
        

        [Fact]
        public async Task ConcludeResolutionAsync_ValidData_Should_Invoke_Repository_Method()
        {
            // Arrange
            var vo = new ConcludeIssueVO("IssueId", "Observations", DateTime.Now);
            var validationResult = new ValidationResult();

            _concludeValidatorMock.Setup(v => v.ValidateAsync(vo)).ReturnsAsync(validationResult);
            _repositoryMock.Setup(repo => repo.ConcludeResolutionAsync(vo)).Returns(Task.CompletedTask);

            // Act
            var result = await _service.ConcludeResolutionAsync(vo);

            // Assert
            _concludeValidatorMock.Verify(v => v.ValidateAsync(vo), Times.Once);
            _repositoryMock.Verify(repo => repo.ConcludeResolutionAsync(vo), Times.Once);
            result.Should().BeEquivalentTo(validationResult);
        }
        
        [Fact]
        public async Task ConcludeResolutionAsync_InvalidData_Should_NotInvoke_Repository_Method()
        {
            var realValidator = DependencyManager.Instance.GetInstance<IValidator<ConcludeIssueVO>>();
            var localService = new IssueMunicipalityService(_repositoryMock.Object, _initValidatorMock.Object, realValidator, _municipalityRepository.Object);
            
            // Arrange
            var vo = new ConcludeIssueVO(string.Empty, "Observations", DateTime.Now);

            _repositoryMock.Setup(repo => repo.ConcludeResolutionAsync(vo)).Returns(Task.CompletedTask);

            // Act
            var result = await localService.ConcludeResolutionAsync(vo);

            // Assert
            _repositoryMock.Verify(repo => repo.ConcludeResolutionAsync(vo), Times.Never);
            result.IsValid.Should().BeFalse();
        }

        //[Fact]
        //public async Task GenerateIssueReportAsync_Should_Calculate_And_Return_Report()
        //{
        //    // Arrange
        //    var municipalityId = "MunicipalityId";
        //    var interval = new MunicipalityIssueInterval(DateTime.Now.AddDays(-30), DateTime.Now);
        //    var issues = new List<Issue>
        //    {
        //        new Issue("IssueId1", IssueType.Pothole, null, null, "Desc", new List<string>(), DateTimeOffset.Now.AddDays(-5), IssueStatus.Resolved, municipalityId, 1, "imageURL",  "assignedTeam", "observations", DateTimeOffset.Now.AddDays(-1), DateTimeOffset.Now.AddDays(-2), Priority.Low, new List<string>())
        //    };

        //    _repositoryMock.Setup(repo => repo.ObtainMunicipalityIssuesBetweenIntervalAsync(municipalityId, interval)).ReturnsAsync(issues);

        //    // Act
        //    var result = await _service.GenerateIssueReportAsync(municipalityId, interval);

        //    // Assert
        //    _repositoryMock.Verify(repo => repo.ObtainMunicipalityIssuesBetweenIntervalAsync(municipalityId, interval), Times.Once);
        //    result.Should().NotBeNull();
        //    result.NumberOfReportedIssues.Should().Be(1);
        //}
        
        
    }
}
