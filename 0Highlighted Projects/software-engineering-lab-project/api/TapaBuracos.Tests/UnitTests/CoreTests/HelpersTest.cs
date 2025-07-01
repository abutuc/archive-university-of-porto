using FluentAssertions;
using TapaBuracos.Core.Enums;
using TapaBuracos.Tests.Application;
using TapaBuracos.Core.Helpers;
namespace TapaBuracos.Tests.UnitTests.CoreTests
{
    public class HelpersTest : UnitModel, IClassFixture<TestInitializer>
    {
        public HelpersTest(TestInitializer initializer) : base(initializer)
        {
        }

        [Fact]
        public Task CreateNewConcludeIssueVoShouldCreateNewConcludeIssueVo()
        {
            var issue = new ConcludeIssueVO("TEST", "TEST", DateTime.Today);

            issue.IssueId.Should().BeEquivalentTo("TEST");
            issue.Observations.Should().BeEquivalentTo("TEST");
            issue.DateResolved.Date.Should().Be(DateTime.Today);

            return Task.CompletedTask;
        }
        
        [Fact]
        public Task CreateNewInitializeIssueResolutionVoShouldCreateNewInitializeIssueResolutionVo()
        {
            var issue = new InitializeIssueResolutionVO("TEST", "TEST", "TEST", Priority.Low);

            issue.IssueId.Should().BeEquivalentTo("TEST");
            issue.AssignedTeam.Should().BeEquivalentTo("TEST");
            issue.Observations.Should().BeEquivalentTo("TEST");
            issue.Priority.Should().Be(Priority.Low);
            
            return Task.CompletedTask;
        }
        
    }
}

