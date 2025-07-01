using Coelho.Arc.Constantinople.DependencyInjection;
using TapaBuracos.Core.Interfaces.Models;
using TapaBuracos.Tests.Application;

namespace TapaBuracos.Tests.UnitTests.Validators
{
    public class IssueValidatorTest : UnitModel, IClassFixture<TestInitializer>
    {
        protected Coelho.Arc.Constantinople.Interfaces.IValidator<IIssue> Validator { get; }
        public IssueValidatorTest(TestInitializer initializer) : base(initializer)
        {
            Validator = DependencyManager.Instance.GetInstance<Coelho.Arc.Constantinople.Interfaces.IValidator<IIssue>>();
        }

        [Fact]
        public async Task Validate_RandomIssue_ShouldBeValid()
        {
            //TODO
        }
    }
}
