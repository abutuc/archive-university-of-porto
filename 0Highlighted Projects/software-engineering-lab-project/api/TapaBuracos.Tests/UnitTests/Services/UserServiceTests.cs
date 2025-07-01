using Bogus;
using Coelho.Arc.Constantinople.DependencyInjection;
using Coelho.Arc.Constantinople.Interfaces;
using FluentAssertions;
using Moq;
using TapaBuracos.Core.Interfaces.Models;
using TapaBuracos.Core.Interfaces.Repositories;
using TapaBuracos.Core.Interfaces.Services;
using TapaBuracos.Core.Models;
using TapaBuracos.Core.Services;
using TapaBuracos.Tests.Application;

namespace TapaBuracos.Tests.UnitTests.Services
{
    public class UserServiceTests : UnitModel, IClassFixture<TestInitializer>
    {
        private static readonly Faker faker = new();
        protected IUserService Service { get; }
        public UserServiceTests(TestInitializer initializer) : base(initializer)
        {
            Service = DependencyManager.Instance.GetInstance<IUserService>();
        }

        [Fact]
        public async Task TryToGetUser_ById_ShouldOnlyCheckServiceBehavior()
        {
            //Arrange
            var repoMock = new Mock<IUserRepository>();
            var serviceWithMock = new UserService(repoMock.Object, new Mock<IValidator<IUser>>().Object);

            //Act
            await serviceWithMock.FindById(Guid.NewGuid().ToString());

            //Assert
            repoMock.Verify(r => r.FindById(It.IsAny<string>()), Times.Once);
        }

        [Fact]
        public async Task TryToGetUser_ByEmail_ShouldOnlyCheckServiceBehavior()
        {
            //Arrange
            var repoMock = new Mock<IUserRepository>();
            var serviceWithMock = new UserService(repoMock.Object, new Mock<IValidator<IUser>>().Object);

            //Act
            await serviceWithMock.FindByEmailAsync(faker.Person.Email);

            //Assert
            repoMock.Verify(r => r.FindByEmailAsync(It.IsAny<string>()), Times.Once);
        }

        [Fact]
        public async Task TryToAssociateUser_GeneratedRandomly_ShouldOnlyCheckServiceBehavior()
        {
            //Arrange
            var repoMock = new Mock<IUserRepository>();
            var validatorMock = new Mock<IValidator<IUser>>();
            validatorMock.Setup(v => v.ValidateAsync(It.IsAny<IUser>())).ReturnsAsync((IUser user) => new FluentValidation.Results.ValidationResult());
            var serviceWithMock = new UserService(repoMock.Object, validatorMock.Object);
            var user = new User(Guid.NewGuid().ToString(), faker.Person.FullName, faker.Person.Email.ToLowerInvariant());
            
            //Act
            await serviceWithMock.RegisterAssociationAsync(user);

            //Assert
            repoMock.Verify(r => r.RegisterAssociationAsync(It.IsAny<IUser>()), Times.Once);
            validatorMock.Verify(v => v.ValidateAsync(It.IsAny<IUser>()), Times.Once);
        }

        [Fact]
        public async Task TryToAssociateInvalidUser_ShouldReturnValidationResult()
        {
            var invalidUser = new User("randomId", "ValidName", String.Empty);

            var result = await Service.RegisterAssociationAsync(invalidUser);

            result.IsValid.Should().BeFalse();
        }
        
    }
}
