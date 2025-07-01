using Coelho.Arc.Constantinople.DependencyInjection;
using Coelho.Arc.Constantinople.Interfaces;
using FluentAssertions;
using TapaBuracos.Core.Enums;
using TapaBuracos.Core.Helpers;
using TapaBuracos.Core.Interfaces.Models;
using TapaBuracos.Core.Models;
using TapaBuracos.Tests.Application;

namespace TapaBuracos.Tests.UnitTests.CoreTests;

public class ValidatorsTest : UnitModel, IClassFixture<TestInitializer>
{
    protected IValidator<ConcludeIssueVO> Validator { get; }
    
    protected IValidator<InitializeIssueResolutionVO> InitializeIssueResolutionValidator { get; }
    
    protected IValidator<IIssue> IssueValidator { get; }
    
    protected IValidator<Core.Models.Municipality> MunicipalityValidator { get;  }
    
    public ValidatorsTest(TestInitializer initializer) : base(initializer)
    {
        Validator = DependencyManager.Instance.GetInstance<IValidator<ConcludeIssueVO>>();
        InitializeIssueResolutionValidator =
            DependencyManager.Instance.GetInstance<IValidator<InitializeIssueResolutionVO>>();
        IssueValidator = DependencyManager.Instance.GetInstance<IValidator<IIssue>>();
        MunicipalityValidator = DependencyManager.Instance.GetInstance<IValidator<Core.Models.Municipality>>();
    }
    
    [Fact]
    public async Task Should_HaveValidationError_When_IssueIdIsEmpty()
    {
        // Arrange
        var model = new ConcludeIssueVO(string.Empty, "Test observation", DateTime.Today);

        // Act
        var result = await Validator.ValidateAsync(model);
        
        result.IsValid.Should().BeFalse();
        result.Errors.Should().Contain(v => v.PropertyName == nameof(model.IssueId));
        
    }

    [Fact]
    public async Task Should_NotHaveValidationError_When_IssueIdIsValid()
    {
        // Arrange
        var model = new ConcludeIssueVO("ValidId", "Test observation", DateTime.Today);

        // Act
        var result = await Validator.ValidateAsync(model);

        // Assert
        result.IsValid.Should().BeTrue();
    }

    [Fact]
    public async Task Should_HaveValidationError_When_DateResolvedIsBeforeToday()
    {
        // Arrange
        var model = new ConcludeIssueVO("ValidId", "Test observation", DateTime.Today.AddDays(-1));

        var result = await Validator.ValidateAsync(model);
        
        result.IsValid.Should().BeFalse();
        
        result.Errors.Should().Contain(v => v.PropertyName == nameof(model.DateResolved));
    }

    [Fact]
    public async Task Should_NotHaveValidationError_When_DateResolvedIsTodayOrAfter()
    {
        // Arrange
        var modelToday = new ConcludeIssueVO("ValidId", "Test observation", DateTime.Today);
        var modelFuture = new ConcludeIssueVO("ValidId", "Test observation", DateTime.Today.AddDays(1));

        // Act & Assert
        
        // Act
        var result1 = await Validator.ValidateAsync(modelToday);

        var result2 = await Validator.ValidateAsync(modelFuture);

        result1.IsValid.Should().BeTrue();
        result2.IsValid.Should().BeTrue();
    }
    
    [Fact]
    public async Task Should_NotHaveValidationError_When_IssueResolutionIdIsValid()
    {
        var model = new InitializeIssueResolutionVO("ValidID", "ValidTeam", "ValidObservations", Priority.High);

        var result = await InitializeIssueResolutionValidator.ValidateAsync(model);

        result.IsValid.Should().BeTrue();
    }


    [Fact]
    public async Task Should_HaveValidationError_When_IssueResolutionIdIsEmpty()
    {
        var model = new InitializeIssueResolutionVO(String.Empty, "ValidTeam", "ValidObservations", Priority.High);

        var result = await InitializeIssueResolutionValidator.ValidateAsync(model);

        result.IsValid.Should().BeFalse();
        result.Errors.Should().Contain(v => v.PropertyName == nameof(model.IssueId));
    }
    
    [Fact]
    public async Task Should_NotHaveValidationError_When_IssueResolutionTeamIsValid()
    {
        var model = new InitializeIssueResolutionVO("ValidID", "ValidTeam", "ValidObservations", Priority.High);

        var result = await InitializeIssueResolutionValidator.ValidateAsync(model);

        result.IsValid.Should().BeTrue();
    }


    [Fact]
    public async Task Should_HaveValidationError_When_IssueResolutionTeamIsEmpty()
    {
        var model = new InitializeIssueResolutionVO("ValidID", String.Empty, "ValidObservations", Priority.High);

        var result = await InitializeIssueResolutionValidator.ValidateAsync(model);

        result.IsValid.Should().BeFalse();
        result.Errors.Should().Contain(v => v.PropertyName == nameof(model.AssignedTeam));
    }
    
    [Fact]
    public async Task Issue_Should_NotHaveValidationError_When_AllFieldsAreValid()
    {
        var issue = new Issue(
            id: "ValidID",
            type: IssueType.Pothole,
            otherTypeDescription: "None",
            location: new Location(0,0), 
            description: "Valid Description",
            reporterIds: new List<string> { "Reporter1" },
            dateReported: DateTimeOffset.Now,
            status: IssueStatus.New,
            municipalityId: "ValidMunicipalityId",
            occurrences: 1,
            imageUrl: "http://validurl.com/image.jpg",
            assignedTeam: "TeamA",
            municipalityObservations: "Observation",
            dateApproved: DateTimeOffset.Now,
            dateResolved: null,
            priority: Priority.High,
            watchers: new List<string> {"test"}
        );
        
        var result = await IssueValidator.ValidateAsync(issue);

        result.IsValid.Should().BeTrue();
    }

    [Fact]
    public async Task Issue_Should_HaveValidationError_When_IdIsEmpty()
    {
        
        var issue = new Issue(
            id: string.Empty,
            type: IssueType.Pothole,
            otherTypeDescription: "None",
            location: new Location(0,0), 
            description: "Valid Description",
            reporterIds: new List<string> { "Reporter1" },
            dateReported: DateTimeOffset.Now,
            status: IssueStatus.New,
            municipalityId: "ValidMunicipalityId",
            occurrences: 1,
            imageUrl: "http://validurl.com/image.jpg",
            assignedTeam: "TeamA",
            municipalityObservations: "Observation",
            dateApproved: DateTimeOffset.Now,
            dateResolved: null,
            priority: Priority.High,
            watchers: new List<string> {"test"}
        );
        
        var result = await IssueValidator.ValidateAsync(issue);

        result.IsValid.Should().BeFalse();
        result.Errors.Should().Contain(v => v.PropertyName == nameof(issue.Id));
    }

    [Fact]
    public async Task Issue_Should_HaveValidationError_When_LocationIsNull()
    {
        var issue = new Issue(
            id: "ValidID",
            type: IssueType.Pothole,
            otherTypeDescription: "None",
            location: null, 
            description: "Valid Description",
            reporterIds: new List<string> { "Reporter1" },
            dateReported: DateTimeOffset.Now,
            status: IssueStatus.New,
            municipalityId: "ValidMunicipalityId",
            occurrences: 1,
            imageUrl: "http://validurl.com/image.jpg",
            assignedTeam: "TeamA",
            municipalityObservations: "Observation",
            dateApproved: DateTimeOffset.Now,
            dateResolved: null,
            priority: Priority.High,
            watchers: new List<string> {"test"}
        );
        
        var result = await IssueValidator.ValidateAsync(issue);

        result.IsValid.Should().BeFalse();
        result.Errors.Should().Contain(v => v.PropertyName == nameof(issue.Location));
    }
    
    [Fact]
    public async Task Issue_Should_HaveValidationError_When_ReporterIdsIsEmpty()
    {
        var issue = new Issue(
            id: "ValidID",
            type: IssueType.Pothole,
            otherTypeDescription: "None",
            location: new Location(0,0), 
            description: "Valid Description",
            reporterIds: new List<string>(),
            dateReported: DateTimeOffset.Now,
            status: IssueStatus.New,
            municipalityId: "ValidMunicipalityId",
            occurrences: 1,
            imageUrl: "http://validurl.com/image.jpg",
            assignedTeam: "TeamA",
            municipalityObservations: "Observation",
            dateApproved: DateTimeOffset.Now,
            dateResolved: null,
            priority: Priority.High,
            watchers: new List<string> {"test"}
        );
        
        var result = await IssueValidator.ValidateAsync(issue);

        result.IsValid.Should().BeFalse();
        result.Errors.Should().Contain(v => v.PropertyName == nameof(issue.ReporterIds));
    }
    
    [Fact]
    public async Task Issue_Should_HaveValidationError_When_DateReportedIsMinValue()
    {
        var issue = new Issue(
            id: "ValidID",
            type: IssueType.Pothole,
            otherTypeDescription: "None",
            location: new Location(0,0), 
            description: "Valid Description",
            reporterIds: new List<string> { "Reporter1" },
            dateReported: DateTime.MinValue,
            status: IssueStatus.New,
            municipalityId: "ValidMunicipalityId",
            occurrences: 1,
            imageUrl: "http://validurl.com/image.jpg",
            assignedTeam: "TeamA",
            municipalityObservations: "Observation",
            dateApproved: DateTimeOffset.Now,
            dateResolved: null,
            priority: Priority.High,
            watchers: new List<string> {"test"}
        );
        
        var result = await IssueValidator.ValidateAsync(issue);

        result.IsValid.Should().BeFalse();
        result.Errors.Should().Contain(v => v.PropertyName == nameof(issue.DateReported));
    }
    
    [Fact]
    public async Task Issue_Should_HaveValidationError_When_MunicipalityIdIsEmpty()
    {
        var issue = new Issue(
            id: "ValidID",
            type: IssueType.Pothole,
            otherTypeDescription: "None",
            location: new Location(0,0), 
            description: "Valid Description",
            reporterIds: new List<string> { "Reporter1" },
            dateReported: DateTimeOffset.Now,
            status: IssueStatus.New,
            municipalityId: String.Empty,
            occurrences: 1,
            imageUrl: "http://validurl.com/image.jpg",
            assignedTeam: "TeamA",
            municipalityObservations: "Observation",
            dateApproved: DateTimeOffset.Now,
            dateResolved: null,
            priority: Priority.High,
            watchers: new List<string> {"test"}
        );
        
        var result = await IssueValidator.ValidateAsync(issue);

        result.IsValid.Should().BeFalse();
        result.Errors.Should().Contain(v => v.PropertyName == nameof(issue.MunicipalityId));
    }
    
    [Fact]
    public async Task Issue_Should_HaveValidationError_When_OccurencesIsZero()
    {
        var issue = new Issue(
            id: "ValidID",
            type: IssueType.Pothole,
            otherTypeDescription: "None",
            location: new Location(0,0), 
            description: "Valid Description",
            reporterIds: new List<string> { "Reporter1" },
            dateReported: DateTimeOffset.Now,
            status: IssueStatus.New,
            municipalityId: "bala",
            occurrences: 0,
            imageUrl: "http://validurl.com/image.jpg",
            assignedTeam: "TeamA",
            municipalityObservations: "Observation",
            dateApproved: DateTimeOffset.Now,
            dateResolved: null,
            priority: Priority.High,
            watchers: new List<string> {"test"}
        );
        
        var result = await IssueValidator.ValidateAsync(issue);

        result.IsValid.Should().BeFalse();
        result.Errors.Should().Contain(v => v.PropertyName == nameof(issue.Occurrences));
    }
    
    
    [Fact]
    public async Task Municipality_Should_NotHaveValidationError_When_Valid()
    {
        var municipality = new Core.Models.Municipality(
            "ValidID",
            "ValidName",
            "ValidEmai@gmail.com",
            "ValidPhoto",
            0,
            new List<string> { "Reporter1" }
            );
        
        var result = await MunicipalityValidator.ValidateAsync(municipality);

        result.IsValid.Should().BeTrue();
    }
    
    [Fact]
    public async Task Municipality_Should_HaveValidationError_When_IDIsEmpty()
    {
        var municipality = new Core.Models.Municipality(
            String.Empty,
            "ValidName",
            "ValidEmail@gmail.com",
            "ValidPhoto",
            0,
            new List<string> { "Reporter1" }
        );
        
        var result = await MunicipalityValidator.ValidateAsync(municipality);

        result.IsValid.Should().BeFalse();
        result.Errors.Should().Contain(v => v.PropertyName == nameof(municipality.Id));
    }
    
    [Fact]
    public async Task Municipality_Should_HaveValidationError_When_NameIsEmpty()
    {
        var municipality = new Core.Models.Municipality(
            "ValidId",
            String.Empty,
            "ValidEmail@gmail.com",
            "ValidPhoto",
            0,
            new List<string> { "Reporter1" }
        );
        
        var result = await MunicipalityValidator.ValidateAsync(municipality);

        result.IsValid.Should().BeFalse();
        result.Errors.Should().Contain(v => v.PropertyName == nameof(municipality.Name));
    }
    
    [Fact]
    public async Task Municipality_Should_HaveValidationError_When_EmailIsEmpty()
    {
        var municipality = new Core.Models.Municipality(
            "ValidId",
            "ValidName",
            String.Empty,
            "ValidPhoto",
            0,
            new List<string> { "Reporter1" }
        );
        
        var result = await MunicipalityValidator.ValidateAsync(municipality);

        result.IsValid.Should().BeFalse();
        result.Errors.Should().Contain(v => v.PropertyName == nameof(municipality.Email));
    }
    
    [Fact]
    public async Task Municipality_Should_HaveValidationError_When_EmailIsInvalid()
    {
        var municipality = new Core.Models.Municipality(
            "ValidId",
            "ValidName",
            "InvalidEmail",
            "ValidPhoto",
            0,
            new List<string> { "Reporter1" }
        );
        
        var result = await MunicipalityValidator.ValidateAsync(municipality);

        result.IsValid.Should().BeFalse();
        result.Errors.Should().Contain(v => v.PropertyName == nameof(municipality.Email));
    }
    
}