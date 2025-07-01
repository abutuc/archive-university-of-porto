using Bogus;
using Coelho.Arc.Bosporus.Firestore.Repositories;
using Coelho.Arc.Constantinople.DependencyInjection;
using FluentAssertions;
using TapaBuracos.Tests.Application;
using TapaBuracos.Core.Models;
using TapaBuracos.Persistence.Models;
using TapaBuracos.Core.Interfaces.Repositories;

namespace TapaBuracos.Tests.UnitTests.Repositories
{
    public class EvaluationRepositoryTests : UnitModel, IClassFixture<TestInitializer>
    {        
        protected IEvaluationRepository Repository { get; }
        
        public EvaluationRepositoryTests(TestInitializer initializer) : base(initializer)
        {
            Repository = DependencyManager.Instance.GetInstance<IEvaluationRepository>();
        }

        [Fact]
        public async Task RegisterReviewAsync_GivenValidEvaluation_ShouldRegisterWithoutErrors()
        {
            // Arrange
            var evaluation = new Faker<Evaluation>()
                .CustomInstantiator(f => new Evaluation(
                    Guid.NewGuid().ToString(),
                    Guid.NewGuid().ToString(),
                    Guid.NewGuid().ToString(),
                    f.Random.Int(1, 5),
                    f.Lorem.Sentence(),
                    Guid.NewGuid().ToString()))
                .Generate();

            // Act
            await Repository.RegisterReviewAsync(evaluation);

            // Assert
            var recoveredEvaluations = await Repository.ObtainUserEvaluationsAsync(evaluation.UserId);
            recoveredEvaluations.Should().ContainSingle(e => e.Id == evaluation.Id);

            // CleanUp
            await DeleteEvaluation(evaluation.Id);
        }

        [Fact]
        public async Task ObtainUserEvaluationsAsync_ShouldReturnEvaluationsForSpecificUser()
        {
            // Arrange
            var evaluation = new Faker<Evaluation>()
                .CustomInstantiator(f => new Evaluation(
                    Guid.NewGuid().ToString(),
                    Guid.NewGuid().ToString(),
                    Guid.NewGuid().ToString(),
                    f.Random.Int(1, 5),
                    f.Lorem.Sentence(),
                    Guid.NewGuid().ToString()))
                .Generate();

            await Repository.RegisterReviewAsync(evaluation);

            // Act
            var evaluations = await Repository.ObtainUserEvaluationsAsync(evaluation.UserId);

            // Assert
            evaluations.Should().NotBeNullOrEmpty();
            evaluations.Should().Contain(e => e.Id == evaluation.Id);

            // CleanUp
            await DeleteEvaluation(evaluation.Id);
        }

        [Fact]
        public async Task ObtainEvaluationsOfMunicipalityAsync_ShouldReturnEvaluationsForSpecificMunicipality()
        {
            // Arrange
            var evaluation = new Faker<Evaluation>()
                .CustomInstantiator(f => new Evaluation(
                    Guid.NewGuid().ToString(),
                    Guid.NewGuid().ToString(),
                    Guid.NewGuid().ToString(),
                    f.Random.Int(1, 5),
                    f.Lorem.Sentence(),
                    Guid.NewGuid().ToString()))
                .Generate();

            await Repository.RegisterReviewAsync(evaluation);

            // Act
            var evaluations = await Repository.ObtainEvaluationsOfMunicipalityAsync(evaluation.MunicipalityId);

            // Assert
            evaluations.Should().NotBeNullOrEmpty();
            evaluations.Should().Contain(e => e.Id == evaluation.Id);

            // CleanUp
            await DeleteEvaluation(evaluation.Id);
        }

        [Fact]
        public async Task ObtainEvaluationsByIssueAndMunicipalityAsync_ShouldReturnEvaluationsForSpecificIssueAndMunicipality()
        {
            // Arrange
            var evaluation = new Faker<Evaluation>()
                .CustomInstantiator(f => new Evaluation(
                    Guid.NewGuid().ToString(),
                    Guid.NewGuid().ToString(),
                    Guid.NewGuid().ToString(),
                    f.Random.Int(1, 5),
                    f.Lorem.Sentence(),
                    Guid.NewGuid().ToString()))
                .Generate();

            await Repository.RegisterReviewAsync(evaluation);

            // Act
            var evaluations = await Repository.ObtainEvaluationsByIssueAndMunicipalityAsync(evaluation.IssueId, evaluation.MunicipalityId);

            // Assert
            evaluations.Should().NotBeNullOrEmpty();
            evaluations.Should().Contain(e => e.Id == evaluation.Id);

            // CleanUp
            await DeleteEvaluation(evaluation.Id);
        }


        [Fact]
        public async Task ObtainEvaluations_OnNonExistentMunicipality_ShouldReturnNull()
        {
            var result = await Repository.ObtainEvaluationsOfMunicipalityAsync("fake");
            result.Should().BeNull();
        }
        
        [Fact]
        public async Task ObtainEvaluations_OnNonExistentUser_ShouldReturnNull()
        {
            var result = await Repository.ObtainUserEvaluationsAsync("fake");
            result.Should().BeNull();
        }
        
        [Fact]
        public async Task ObtainEvaluations_OnNonExistentIssueAndMunicipality_ShouldReturnNull()
        {
            var result = await Repository.ObtainEvaluationsByIssueAndMunicipalityAsync("fake", "fake");
            result.Should().BeNull();
        }
        
        
        private async Task DeleteEvaluation(string evaluationId)
        {
            await ((FirestoreRepositoryBase<EvaluationPersistence>)Repository).DeleteAsync(evaluationId);
        }
    }
}
