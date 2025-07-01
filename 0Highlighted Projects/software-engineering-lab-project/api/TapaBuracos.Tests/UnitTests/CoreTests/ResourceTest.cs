using FluentAssertions;
using TapaBuracos.Core.Properties;

namespace TapaBuracos.Tests.UnitTests.CoreTests
{
    public class ResourcesTest
    {
        
        [Fact]
        public void OnIssueConclusionMessageBodyStart_ShouldReturnExpectedString()
        {
            var single = new Resources();
            // Act
            var message = Resources.OnIssueConclusionMessageBodyStart;

            // Assert
            message.Should().Be("Na conclusão do problema:");
        }

        [Fact]
        public void OnIssueInitializationMessageBodyStart_ShouldReturnExpectedString()
        {
            // Act
            var message = Resources.OnIssueInitializationMessageBodyStart;

            // Assert
            message.Should().Be("Na inicialização do problema:");
        }
        
    }
}