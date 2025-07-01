using Bogus;
using Coelho.Arc.Constantinople.DependencyInjection;
using FluentAssertions;
using TapaBuracos.Tests.Application;
using TapaBuracos.Citizen.Interfaces.Repositories;
using TapaBuracos.Core.Enums;
using TapaBuracos.Tests.TypeInitializers;
using Coelho.Arc.Bosporus.Firestore.Repositories;
using TapaBuracos.Persistence.Models;

namespace TapaBuracos.Tests.UnitTests.Repositories
{
    public class IssueCitizenRepositoryTests : UnitModel, IClassFixture<TestInitializer>
    {        
        protected IIssueCitizenRepository Repository { get; }
        public IssueCitizenRepositoryTests(TestInitializer initializer) : base(initializer)
        {
            Repository = DependencyManager.Instance.GetInstance<IIssueCitizenRepository>();
        }

        [Fact]
        public async Task RegisterNewIssue_GeneratedRandomly_ShouldRegisterWithoutErrors()
        {
            //Arrange
            var issue = new Faker<IssueInitializer>().CustomInstantiator((f) => new IssueInitializer(Guid.NewGuid().ToString(), f.PickRandom<IssueType>(), string.Empty, new LocationInitializer(f.Random.Double(-90, 90), f.Random.Double(-90, 90)), f.Lorem.Sentence(), [Guid.NewGuid().ToString()], DateTime.Now, IssueStatus.New, Guid.NewGuid().ToString(), 1, f.Image.PlaceImgUrl(), string.Empty, string.Empty, null, null, f.PickRandom<Priority>(), [Guid.NewGuid().ToString()]))
                                                     .Generate();

            //Act
            await Repository.RegisterIssueAsync(issue);
            
            //Assert
            var recoveredIssue = await Repository.FindIssueById(issue.Id);
            recoveredIssue.Should().NotBeNull();
            recoveredIssue.Id.Should().BeEquivalentTo(issue.Id);
            recoveredIssue.Type.Should().Be(issue.Type);
            recoveredIssue.Location.Should().BeEquivalentTo(issue.Location);
            recoveredIssue.Description.Should().BeEquivalentTo(issue.Description);
            recoveredIssue.ReporterIds.Should().BeEquivalentTo(issue.ReporterIds);
            recoveredIssue.Status.Should().Be(issue.Status);
            recoveredIssue.MunicipalityId.Should().BeEquivalentTo(issue.MunicipalityId);
            recoveredIssue.DateReported.Date.Should().Be(issue.DateReported.Date);
            recoveredIssue.Occurrences.Should().Be(issue.Occurrences);

            //CleanUp
            await DeleteIssue(issue.Id);
        }

        [Fact]
        public async Task CheckIfDuplicatedIssueAsync_ShouldReturnTrue_WhenDuplicateExists()
        {
            //Arrange
            var issue = new Faker<IssueInitializer>().CustomInstantiator((f) => new IssueInitializer(Guid.NewGuid().ToString(), f.PickRandom<IssueType>(), string.Empty, new LocationInitializer(f.Random.Double(-90, 90), f.Random.Double(-90, 90)), f.Lorem.Sentence(), [Guid.NewGuid().ToString()], DateTime.Now, IssueStatus.New, Guid.NewGuid().ToString(), 1, f.Image.PlaceImgUrl(), string.Empty, string.Empty, null, null, f.PickRandom<Priority>(), [Guid.NewGuid().ToString()]))
                                                     .Generate();

            await Repository.RegisterIssueAsync(issue);
            issue = issue.DeviateLocationByMetersReturningDeviatedIssue(100);
            
            //Act
            var result = await Repository.CheckIfDuplicatedIssueAsync(issue);
            
            //Assert
            result.Should().BeTrue();

            //CleanUp
            await DeleteIssue(issue.Id);
        }
        
        [Fact]
        public async Task CheckIfDuplicatedIssueAsync_ShouldReturnFalse_WhenNoDuplicateExists()
        {
            //Arrange
            var issue = new Faker<IssueInitializer>().CustomInstantiator((f) => new IssueInitializer(Guid.NewGuid().ToString(), f.PickRandom<IssueType>(), string.Empty, new LocationInitializer(f.Random.Double(-90, 90), f.Random.Double(-90, 90)), f.Lorem.Sentence(), [Guid.NewGuid().ToString()], DateTime.Now, IssueStatus.New, Guid.NewGuid().ToString(), 1, f.Image.PlaceImgUrl(), string.Empty, string.Empty, null, null, f.PickRandom<Priority>(), [Guid.NewGuid().ToString()]))
                                                     .Generate();
            await Repository.RegisterIssueAsync(issue);
            issue = issue.DeviateLocationByMetersReturningDeviatedIssue(5000000);
            
            //Act
            var result = await Repository.CheckIfDuplicatedIssueAsync(issue);

            //Assert
            result.Should().BeFalse();

            //CleanUp
            await DeleteIssue(issue.Id);
        }
        
        [Fact]
        public async Task ApproveIssueAsync_ShouldApproveIssue_WhenOccurrencesMeetOrExceedThreshold()
        {
            //Arrange
            var issue = new Faker<IssueInitializer>().CustomInstantiator((f) => new IssueInitializer(Guid.NewGuid().ToString(), f.PickRandom<IssueType>(), string.Empty, new LocationInitializer(f.Random.Double(-90, 90), f.Random.Double(-90, 90)), f.Lorem.Sentence(), [Guid.NewGuid().ToString()], DateTime.Now, IssueStatus.New, Guid.NewGuid().ToString(), 1, f.Image.PlaceImgUrl(), string.Empty, string.Empty, null, null, f.PickRandom<Priority>(), [Guid.NewGuid().ToString()]))
                                                     .Generate();

            await Repository.RegisterIssueAsync(issue);
            
            for (var i = 0; i < 5; i++)
            {
                await Repository.IncrementIssueOccurenceAsync(issue.Id);
            }

            //Act
            await Repository.ApproveIssueAsync(issue.Id);

            //Assert
            var updatedIssue = await Repository.FindIssueById(issue.Id);
            updatedIssue.Status.Should().Be(IssueStatus.Approved);

            //CleanUp
            await DeleteIssue(issue.Id);
        }

        [Fact]
        public async Task ObtainIssues_AtAnyGivenTime_ShouldReturnAListContainingAtLeastOneItem()
        {
            //Arrange
            var issue = new Faker<IssueInitializer>().CustomInstantiator((f) => new IssueInitializer(Guid.NewGuid().ToString(), f.PickRandom<IssueType>(), string.Empty, new LocationInitializer(f.Random.Double(-90, 90), f.Random.Double(-90, 90)), f.Lorem.Sentence(), [Guid.NewGuid().ToString()], DateTime.Now, IssueStatus.New, Guid.NewGuid().ToString(), 1, f.Image.PlaceImgUrl(), string.Empty, string.Empty, null, null, f.PickRandom<Priority>(), [Guid.NewGuid().ToString()]))
                                                     .Generate();

            await Repository.RegisterIssueAsync(issue);

            //Act
            var result = await Repository.ObtainActiveIssuesAsync();

            //Assert
            result.Should().NotBeNullOrEmpty();
            result.Should().Contain(i => i.Id == issue.Id);
            
            // Cleanup
            await DeleteIssue(issue.Id);
        }

        [Fact]
        public async Task ObtainUserIssues_AtAnyGivenTime_ShouldReturnAListContainingAtLeastOneItem()
        {
            //Arrange
            var issue = new Faker<IssueInitializer>().CustomInstantiator((f) => new IssueInitializer(Guid.NewGuid().ToString(), f.PickRandom<IssueType>(), string.Empty, new LocationInitializer(f.Random.Double(-90, 90), f.Random.Double(-90, 90)), f.Lorem.Sentence(), [Guid.NewGuid().ToString()], DateTime.Now, IssueStatus.New, Guid.NewGuid().ToString(), 1, f.Image.PlaceImgUrl(), string.Empty, string.Empty, null, null, f.PickRandom<Priority>(), [Guid.NewGuid().ToString()]))
                                                     .Generate();

            await Repository.RegisterIssueAsync(issue);

            //Act
            var result = await Repository.ObtainUserIssues(issue.ReporterIds.FirstOrDefault());

            //Assert
            result.Should().NotBeNullOrEmpty();
            result.Should().Contain(i => i.Id == issue.Id);
            
            // Cleanup
            await DeleteIssue(issue.Id);
        }

        [Fact]
        public async Task ApproveIssueAsync_ShouldNotApproveIssue_WhenOccurrencesBelowThreshold()
        {
            // Test setup and assertions for when the issue exists but occurrences are below the threshold
        }

        [Fact]
        public async Task ApproveIssueAsync_ShouldDoNothing_WhenIssueDoesNotExist()
        {
            // Test setup and assertions for when no document matches the issueId
        }
        
        [Fact]
        public async Task IncrementIssueOccurrenceAsync_ShouldIncrementOccurrences_WhenIssueExists()
        {
            // Test setup and assertions for when the issue document exists and the occurrences are incremented
        }

        [Fact]
        public async Task IncrementIssueOccurrenceAsync_ShouldDoNothing_WhenIssueDoesNotExist()
        {
            // Test setup and assertions for when no document matches the provided issueId
        }

        private async Task DeleteIssue(string issueId)
        {
            await ((FirestoreRepositoryBase<IssuePersistence>)Repository).DeleteAsync(issueId);
        }
    }
}

