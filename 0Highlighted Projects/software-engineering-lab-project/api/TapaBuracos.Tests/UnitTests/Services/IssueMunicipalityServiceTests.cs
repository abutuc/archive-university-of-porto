using FluentValidation.Results;
using Moq;
using TapaBuracos.Api.Models.Services;
using TapaBuracos.Core.Models;
using TapaBuracos.Municipality.Models;
using Coelho.Arc.Constantinople.Utils;
using FluentAssertions;
using TapaBuracos.Api.Models.Filters;
using TapaBuracos.Api.Models.Interfaces.Services;
using TapaBuracos.Api.Models.Models;
using TapaBuracos.Core.Enums;
using TapaBuracos.Core.Helpers;
using TapaBuracos.Tests.Application;

namespace TapaBuracos.Tests.UnitTests.Services
{
    public class IssueMunicipalityServiceTests : UnitModel, IClassFixture<TestInitializer>
    {
        protected IIssueMunicipalityService Service { get; }
        private readonly Mock<Municipality.Interfaces.Services.IIssueMunicipalityService> _serviceDomainMock;

        public IssueMunicipalityServiceTests(TestInitializer initializer) : base(initializer)
        {
            _serviceDomainMock = new Mock<Municipality.Interfaces.Services.IIssueMunicipalityService>();
            Service = new IssueMunicipalityService(_serviceDomainMock.Object);
        }

        [Fact]
        public async Task ConcludeResolutionAsync_Should_Invoke_ServiceDomain_Method()
        {
            // Arrange
            var concludeIssueVO = new ConcludeIssueVO("IssueId", "Observations", DateTime.Now);
            var validationResult = new ValidationResult();
            _serviceDomainMock.Setup(s => s.ConcludeResolutionAsync(concludeIssueVO))
                              .ReturnsAsync(validationResult);

            // Act
            var result = await Service.ConcludeResolutionAsync(concludeIssueVO);

            // Assert
            _serviceDomainMock.Verify(s => s.ConcludeResolutionAsync(concludeIssueVO), Times.Once);
            result.Should().BeEquivalentTo(validationResult);
        }

        [Fact]
        public async Task InitiateResolutionAsync_Should_Invoke_ServiceDomain_Method()
        {
            // Arrange
            var initializeIssueResolutionVO = new InitializeIssueResolutionVO("IssueId", "Team", "Observations", Priority.High);
            var validationResult = new ValidationResult();
            _serviceDomainMock.Setup(s => s.InitiateResolutionAsync(initializeIssueResolutionVO))
                              .ReturnsAsync(validationResult);

            // Act
            var result = await Service.InitiateResolutionAsync(initializeIssueResolutionVO);

            // Assert
            _serviceDomainMock.Verify(s => s.InitiateResolutionAsync(initializeIssueResolutionVO), Times.Once);
            result.Should().BeEquivalentTo(validationResult);
        }

        [Fact]
        public async Task ObtainIssueAsync_Should_Invoke_ServiceDomain_Method()
        {
            // Arrange
            var issueId = "ValidIssueId";
            var municipalityId = "ValidMunicipalityId";
            var issue = new Issue(issueId, IssueType.Pothole, null, null, "Description", new List<string> { "ReporterId" },
                                  DateTimeOffset.Now, IssueStatus.New, municipalityId, 1, null, null, null, null, null, Priority.Low, new List<string> { "ReporterId" });
            _serviceDomainMock.Setup(s => s.ObtainIssueAsync(issueId, municipalityId))
                              .ReturnsAsync(issue);

            // Act
            var result = await Service.ObtainIssueAsync(issueId, municipalityId);

            // Assert
            _serviceDomainMock.Verify(s => s.ObtainIssueAsync(issueId, municipalityId), Times.Once);
            result.Should().BeEquivalentTo(issue);
        }

        [Fact]
        public async Task ObtainIssuesAsync_ObsoleteMethod_Should_Invoke_ServiceDomain_Method()
        {
            // Arrange
            var municipalityId = "ValidMunicipalityId";
            var issues = new List<Issue> { new Issue("IssueId", IssueType.Pothole, null, null, "Description", new List<string> { "ReporterId" },
                                                      DateTimeOffset.Now, IssueStatus.New, municipalityId, 1, null, null, null, null, null, Priority.Low, new List<string> { "ReporterId" }) };
            _serviceDomainMock.Setup(s => s.ObtainIssuesAsync(municipalityId))
                              .ReturnsAsync(issues);

            // Act
            var result = await Service.ObtainIssuesAsync(municipalityId);

            // Assert
            _serviceDomainMock.Verify(s => s.ObtainIssuesAsync(municipalityId), Times.Once);
            result.Should().BeEquivalentTo(issues);
        }

        [Fact]
        public async Task ObtainIssuesAsync_WithFilter_Should_Invoke_ServiceDomain_Method()
        {
            // Arrange
            var municipalityId = "ValidMunicipalityId";
            var requestDTO = new ObtainIssuesMunicipalityRequestDTO(new Paginator(10), new IssueFilterDTO(true, "test", null, null, null));
            var issues = new List<Issue>();
            _serviceDomainMock.Setup(s => s.ObtainIssuesAsync(municipalityId, requestDTO.Filter, requestDTO.Paginator))
                              .ReturnsAsync(issues);

            // Act
            var result = await Service.ObtainIssuesAsync(municipalityId, requestDTO);

            // Assert
            _serviceDomainMock.Verify(s => s.ObtainIssuesAsync(municipalityId, requestDTO.Filter, requestDTO.Paginator), Times.Once);
            result.Issues.Should().BeEquivalentTo(issues);
        }

        [Fact]
        public async Task GenerateIssueReport_Should_Invoke_ServiceDomain_Method()
        {
            // Arrange
            var municipalityId = "ValidMunicipalityId";
            var issueInterval = new MunicipalityIssueInterval(DateTime.Now.AddDays(-30), DateTime.Now);
            var reportDTO = new MunicipalityIssueReportDTO(10, TimeSpan.FromDays(1), "90%", new List<(string, int)> { ("Potholes", 5) });
            _serviceDomainMock.Setup(s => s.GenerateIssueReportAsync(municipalityId, issueInterval))
                              .ReturnsAsync(reportDTO);

            // Act
            var result = await Service.GenerateIssueReport(municipalityId, issueInterval);

            // Assert
            _serviceDomainMock.Verify(s => s.GenerateIssueReportAsync(municipalityId, issueInterval), Times.Once);
            result.Should().BeEquivalentTo(reportDTO);
        }
    }
}
