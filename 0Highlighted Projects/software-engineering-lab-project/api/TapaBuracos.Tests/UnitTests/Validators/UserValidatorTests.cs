using Bogus;
using Coelho.Arc.Constantinople.DependencyInjection;
using Coelho.Arc.Constantinople.Interfaces;
using FluentAssertions;
using TapaBuracos.Core.Interfaces.Models;
using TapaBuracos.Core.Models;
using TapaBuracos.Tests.Application;

namespace TapaBuracos.Tests.UnitTests.Validators
{
    public class UserValidatorTests : UnitModel, IClassFixture<TestInitializer>
    {
        private readonly Faker faker = new();
        protected IValidator<IUser> Validator { get; }
        public UserValidatorTests(TestInitializer initializer) : base(initializer)
        {
            Validator = DependencyManager.Instance.GetInstance<IValidator<IUser>>();
        }

        [Fact]
        public async Task Validate_RandomUser_ShouldBeValid()
        {
            //Arrange
            var user = new User(Guid.NewGuid().ToString(), faker.Person.FullName, faker.Person.Email.ToLowerInvariant());

            //Act
            var validation = await Validator.ValidateAsync(user);

            //Assert
            validation.IsValid.Should().BeTrue();
        }

        [Theory]
        [InlineData(true)]
        [InlineData(false)]
        public async Task Validate_RandomUser_ShouldBeInvalid(bool withEmptyInsteadOfNullWhenApplicable)
        {
            //Arrange
            string nullOrEmpty = withEmptyInsteadOfNullWhenApplicable ? string.Empty : null;
            var user = new User(nullOrEmpty, nullOrEmpty, faker.Person.FirstName);

            //Act
            var validation = await Validator.ValidateAsync(user);

            //Assert
            validation.IsValid.Should().BeFalse();
            validation.Errors.Should().Contain(v => v.PropertyName == nameof(user.Id))
                                  .And.Contain(v => v.PropertyName == nameof(user.Name))
                                  .And.Contain(v => v.PropertyName == nameof(user.Email));
        }
    }
}
