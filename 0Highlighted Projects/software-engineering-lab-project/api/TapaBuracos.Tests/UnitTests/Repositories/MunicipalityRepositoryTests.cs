using Coelho.Arc.Bosporus.Firestore.Repositories;
using Coelho.Arc.Constantinople.DependencyInjection;
using FluentAssertions;
using TapaBuracos.Core.Interfaces.Repositories;
using TapaBuracos.Persistence.Models;
using TapaBuracos.Tests.Application;

namespace TapaBuracos.Tests.UnitTests.Repositories;

public class MunicipalityRepositoryTests : UnitModel, IClassFixture<TestInitializer>
{
    protected IMunicipalityRepository Repository { get; }
    
    public MunicipalityRepositoryTests(TestInitializer initializer) : base(initializer)
    {
        Repository = DependencyManager.Instance.GetInstance<IMunicipalityRepository>();
    }
    
    [Fact]
    public async Task AssociateMunicipality_ShouldRegisterWithoutErrors()
    {
        // Arrange
        var municipality = new Core.Models.Municipality("test", "test", "test", "test", 2, new List<string>());

        // Act
        await Repository.AssociateMunicipalityAsync(municipality);

        // Assert
        var fetchedMunicipality = await Repository.FindByIdAsync(municipality.Id);
        
        fetchedMunicipality.Should().NotBeNull();
        
        // CleanUp
        await ((FirestoreRepositoryBase<MunicipalityPersistence>)Repository).DeleteAsync(fetchedMunicipality.Id);
    }

    [Fact] public async Task GetNonExistantMunicipalitu_ShouldReturnNull()
    {
        // Assert
        var fetchedMunicipality = await Repository.FindByIdAsync("fake");
        
        fetchedMunicipality.Should().BeNull();
    }
    
    
    
}