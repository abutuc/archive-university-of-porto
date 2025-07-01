using Bogus;
using Coelho.Arc.Bosporus.Firestore.Repositories;
using Coelho.Arc.Constantinople.DependencyInjection;
using Coelho.Arc.Constantinople.Utils;
using FluentAssertions;
using Mapster;
using TapaBuracos.Api.Models.Filters;
using TapaBuracos.Core.Enums;
using TapaBuracos.Core.Helpers;
using TapaBuracos.Core.Models;
using TapaBuracos.Municipality.Interfaces.Repositories;
using TapaBuracos.Municipality.Models;
using TapaBuracos.Persistence.Models;
using TapaBuracos.Tests.Application;
using TapaBuracos.Tests.TypeInitializers;

namespace TapaBuracos.Tests.UnitTests.Repositories
{
    public class IssueMunicipalityTests : UnitModel, IClassFixture<TestInitializer>
    {
        private static readonly Faker faker = new();
        protected IIssueMunicipalityRepository Repository { get; }
        public IssueMunicipalityTests(TestInitializer initializer) : base(initializer)
        {
            Repository = DependencyManager.Instance.GetInstance<IIssueMunicipalityRepository>();
        }

        [Fact]
        public async Task ObtainIssue_GettingARandomlyGeneratedIssue_ShouldReturnTheIssueProperly()
        {
            //Arrange
            var generatedIssue = await GenerateANewIssueReturningTheIssue();

            //Act
            var issue = await Repository.ObtainIssueAsync(generatedIssue.Id, generatedIssue.MunicipalityId);

            //Assert
            issue.Id.Should().BeEquivalentTo(generatedIssue.Id);
            issue.Description.Should().BeEquivalentTo(generatedIssue.Description);
            issue.Location.Should().BeEquivalentTo(generatedIssue.Location);
            issue.ImageUrl.Should().BeEquivalentTo(generatedIssue.ImageUrl);
            issue.MunicipalityId.Should().BeEquivalentTo(generatedIssue.MunicipalityId);
            issue.Occurrences.Should().Be(generatedIssue.Occurrences);
            issue.ReporterIds.Should().BeEquivalentTo(generatedIssue.ReporterIds);
            issue.Status.Should().Be(generatedIssue.Status);

            //CleanUp
            await DeleteIssue(issue.Id);
        }

        [Fact]
        public async Task ObtainIssues_OfASpecificMunicipality_ShouldReturnAtLeastOneIssue()
        {
            //Arrange
            var municipalityId = Guid.NewGuid().ToString();
            for (int i = 0; i < 3; i++)
            {
                var generatedIssue = await GenerateANewIssueReturningTheIssue(municipalityId);
            }

            //Act
            var issues = await Repository.ObtainIssuesAsync(municipalityId);

            //Assert
            issues.Should().NotBeEmpty();

            //CleanUp
            foreach (var i in issues)
            {
                await DeleteIssue(i.Id);
            }
        }

        [Theory]
        [InlineData(true, false, false, false)]
        [InlineData(true, true, false, false)]
        [InlineData(true, true, true, false)]
        [InlineData(true, true, true, true)]
        [InlineData(false, true, true, true)]
        [InlineData(false, false, true, true)]
        [InlineData(false, false, false, true)]
        [InlineData(false, true, true, false)]
        [InlineData(false, true, false, false)]
        [InlineData(false, false, true, false)]
        public async Task ObtainListOfIssues_FilteredBySomeData_ShouldReturnAListWithAtLeast2Records(bool withType, bool withPriority, bool withText, bool newest)
        {
            var municipalityId = Guid.NewGuid().ToString();
            var description = faker.Lorem.Sentence();
            var type = faker.PickRandom<IssueType>();
            var priority = faker.PickRandom<Priority>();

            var issues = new Faker<IssueInitializer>().CustomInstantiator((f) => new IssueInitializer(Guid.NewGuid().ToString(), type, string.Empty, new LocationInitializer(f.Random.Double(0, 256), f.Random.Double(0, 256)), description, [Guid.NewGuid().ToString()], DateTime.Now, faker.PickRandomWithout(IssueStatus.New), municipalityId, 1, f.Image.PlaceImgUrl(), string.Empty, string.Empty, faker.Date.Recent(), null, priority, new List<string>()))
                                                      .Generate(10);

            foreach (var item in issues)
            {
                await ((FirestoreRepositoryBase<IssuePersistence>)Repository).AddAsync(item.Adapt<IssuePersistence>());
            };
            var filter = new IssueFilterDTO(newest, withText ? description : null, withPriority ? priority : null, withType ? type : null, null);
            var paginator = new Paginator(10);
            //Act
            var result = await Repository.ObtainIssuesAsync(municipalityId, filter, paginator);

            //Assert
            result.Should().NotBeEmpty().And.HaveCountGreaterThanOrEqualTo(2);
            paginator.Page.Should().BeGreaterThan(0);
            paginator.TotalRecords.Should().BeGreaterThan(0);

            //Cleanup
            foreach (var item in issues)
            {
                await ((FirestoreRepositoryBase<IssuePersistence>)Repository).DeleteAsync(item.Id);
            };
        }

        [Fact]
        public async Task InitiateResolution_Should_StartIssueResolution()
        {
            var issue = await GenerateANewIssueReturningTheIssue("municipalityId");
            
            var initiate = new InitializeIssueResolutionVO(issue.Id, "assignedTeam", "myobservations", Priority.Low);

            await Repository.InitiateResolutionAsync(initiate);

            var issueUpdated = await Repository.ObtainIssueAsync(issue.Id, "municipalityId");
            
            issueUpdated.Status.Should().Be(IssueStatus.InProgress);
            issueUpdated.MunicipalityObservations.Should().Contain(initiate.Observations);
            issueUpdated.Priority.Should().Be(initiate.Priority);

            await DeleteIssue(issue.Id);
        }

        [Fact]
        public async Task ConcludeReslution_Should_ConcludeIssueResolution()
        {
            var issue = await GenerateANewIssueReturningTheIssue("municipalityId");

            var date = DateTime.UtcNow;
            var conclude = new ConcludeIssueVO(issue.Id, "test", date);

            await Repository.ConcludeResolutionAsync(conclude);

            var issueUpdated = await Repository.ObtainIssueAsync(issue.Id, "municipalityId");

            issueUpdated.Status.Should().Be(IssueStatus.Resolved);
            issueUpdated.DateResolved.Value.Date.Should().Be(conclude.DateResolved.Date);
            issueUpdated.MunicipalityObservations.Should().Contain(conclude.Observations);

            await DeleteIssue(issue.Id);
        }

        [Fact]
        public async Task ObtainMunicipalityIssuesBetweenInterval_Should_ReturnIssuesBetweenInterval()
        {
            var municipalityId = Guid.NewGuid().ToString();
            var issue = await GenerateANewIssueReturningTheIssue(municipalityId);

            var interval = new MunicipalityIssueInterval(DateTime.UtcNow.Subtract(TimeSpan.FromDays(1)),
                DateTime.UtcNow.AddDays(1));

            var issues = await Repository.ObtainMunicipalityIssuesBetweenIntervalAsync(municipalityId, interval);

            issues.Count.Should().Be(1);
            issues[0].Id.Should().Be(issue.Id);
            
            await DeleteIssue(issue.Id);
        }
        
        
        

        private async Task<Issue> GenerateANewIssueReturningTheIssue(string municipalityId = null)
        {
            var issue = new Faker<IssueInitializer>().CustomInstantiator((f) => new IssueInitializer(Guid.NewGuid().ToString(), f.PickRandom<IssueType>(), string.Empty, new LocationInitializer(f.Random.Double(0, 256), f.Random.Double(0, 256)), f.Lorem.Sentence(), [Guid.NewGuid().ToString()], DateTime.Now, IssueStatus.Approved, municipalityId, 1, f.Image.PlaceImgUrl(), string.Empty, string.Empty, null, null, f.PickRandom<Priority>(), new List<string>()))
                                                     .Generate();

            await ((FirestoreRepositoryBase<IssuePersistence>)Repository).AddAsync(issue.Adapt<IssuePersistence>());
            return issue;
        }

        private async Task DeleteIssue(string issueId)
        {
            await ((FirestoreRepositoryBase<IssuePersistence>)Repository).DeleteAsync(issueId);
        }
    }
}
