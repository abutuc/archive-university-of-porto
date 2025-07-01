using Bogus;
using Coelho.Arc.Constantinople.DependencyInjection;
using FluentAssertions;
using Grpc.Core;
using TapaBuracos.Core.Interfaces.Repositories;
using TapaBuracos.Core.Models;
using TapaBuracos.Tests.Application;

namespace TapaBuracos.Tests.UnitTests.Repositories
{
    public class UserRepositoryTests : UnitModel, IClassFixture<TestInitializer>
    {
        private readonly static Faker faker = new();
        protected IUserRepository UserRepository { get; }

        public UserRepositoryTests(TestInitializer initializer) : base(initializer)
        {
            UserRepository = DependencyManager.Instance.GetInstance<IUserRepository>();
        }

        [Theory]
        [InlineData(true)]
        [InlineData(false)]
        public async Task AssociateNewUser_GeneratedRandomly_ShouldAssociateWithoutErrors(bool shouldFindRegisteredUserByEmail)
        {
            //Arrange
            var user = new Faker<User>().CustomInstantiator(f => new User(Guid.NewGuid().ToString(), f.Person.FullName, f.Person.Email)).Generate();

            //Act
            await UserRepository.RegisterAssociationAsync(user);

            //Assert
            User recoveredUser;
            if (shouldFindRegisteredUserByEmail)
            {
                recoveredUser = await UserRepository.FindByEmailAsync(user.Email);
                recoveredUser.Should().NotBeNull("the usar should've been recovered by its email");
            }
            else
            {
                recoveredUser = await UserRepository.FindById(user.Id);
                recoveredUser.Should().NotBeNull("the user should've been recovered by its id");
            }
            recoveredUser.Should().NotBeNull();
            recoveredUser.Name.Should().BeEquivalentTo(user.Name);
            recoveredUser.Email.Should().BeEquivalentTo(user.Email);
            recoveredUser.Id.Should().BeEquivalentTo(user.Id);
            
            // Cleanup
            await UserRepository.DeleteUserById(recoveredUser.Id);
        }
        
        [Fact]
        public async Task TryToFindNonExistentUser_ByUserId_ShouldReturnNull()
        {
            //Arrange
            var id = Guid.NewGuid().ToString();

            //Act
            var user = await UserRepository.FindById(id);

            //Assert
            user.Should().BeNull();
        }

        [Fact]
        public async Task TryToFindNonExistentUser_ByUserEmail_ShouldReturnNull()
        {
            //Arrange
            var email = faker.Person.Email.ToLower();

            //Act
            var user = await UserRepository.FindByEmailAsync(email);

            //Assert
            user.Should().BeNull();
        }

        [Fact]
        public async Task TryToAddTheSameUser_Twice_ShouldThrowRPCException()
        {
            //Arrange
            var user = new Faker<User>().CustomInstantiator(f => new User(Guid.NewGuid().ToString(), f.Person.FullName, f.Person.Email)).Generate();
            await UserRepository.RegisterAssociationAsync(user);

            //Act
            var action = async () => await UserRepository.RegisterAssociationAsync(user);

            // Assert
            await action.Should().ThrowAsync<RpcException>();
            
            // Cleanup
            await UserRepository.DeleteUserById(user.Id);
        }
        
    }
}
