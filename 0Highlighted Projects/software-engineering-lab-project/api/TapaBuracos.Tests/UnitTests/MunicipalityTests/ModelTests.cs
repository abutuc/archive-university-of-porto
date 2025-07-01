using FluentAssertions;
using FluentValidation.Results;
using Newtonsoft.Json;
using TapaBuracos.Municipality.Models;

namespace TapaBuracos.Tests.UnitTests.MunicipalityTests;

public class ModelTests
{
    [Fact]
    public void MunicipalityIssueInterval_Constructor_ShouldInitializeWithAllParameters()
    {
        var municipalityIssueInterval = new MunicipalityIssueInterval(DateTime.Today, DateTime.Today.AddDays(1));

        municipalityIssueInterval.StartDate.Should().Be(DateTime.Today);
        municipalityIssueInterval.EndDate.Should().Be(DateTime.Today.AddDays(1));
    }

    [Fact]
    public void MunicipalityIssueReportDTO_Constructor_ShouldInitializeWithAllParameters()
    {
        var municipalityIssueReportDTO = new MunicipalityIssueReportDTO(0, TimeSpan.Zero, "Test", new List<(string, int)> { ("Test1", 1)});

        municipalityIssueReportDTO.NumberOfReportedIssues.Should().Be(0);
        municipalityIssueReportDTO.AverageResponseTimes.Should().Be(TimeSpan.Zero);
        municipalityIssueReportDTO.ResolutionRates.Should().Be("Test");
        municipalityIssueReportDTO.GraphData.Should().BeEquivalentTo(new List<(string, int)> { ("Test1", 1) });
    }

    [Fact]
    public void MunicipalityIssueReportDTO_Construct_ShouldInitializeWithValidationResult()
    {
        var municipalityIssueReportDTO = new MunicipalityIssueReportDTO(new ValidationResult());

        municipalityIssueReportDTO.ValidationResult.Should().BeEquivalentTo(new ValidationResult());
    }

    [Fact]
    public void Should_DeserializeUsingProtectedJsonConstructor()
    {
        var json = @"
        {
            ""numberOfReportedIssues"": 100,
            ""averageResponseTimes"": ""05:00:00"",
            ""resolutionRates"": ""80%"",
            ""graphData"": [
                { ""Item1"": ""IssueType1"", ""Item2"": 50 },
                { ""Item1"": ""IssueType2"", ""Item2"": 50 }
            ],
            ""validationResult"": null
        }";
        
        var deserialized = JsonConvert.DeserializeObject<MunicipalityIssueReportDTO>(json);
        
        deserialized.Should().NotBeNull();
        deserialized.NumberOfReportedIssues.Should().Be(100);
        deserialized.AverageResponseTimes.Should().Be(TimeSpan.FromHours(5));
        deserialized.ResolutionRates.Should().Be("80%");
        deserialized.GraphData.Should().ContainInOrder(("IssueType1", 50), ("IssueType2", 50));
        deserialized.ValidationResult.Should().BeNull();
    }

    
    
    
}