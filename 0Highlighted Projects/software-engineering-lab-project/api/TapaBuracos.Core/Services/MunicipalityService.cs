using FluentValidation.Results;
using TapaBuracos.Core.Interfaces.Models;
using TapaBuracos.Core.Interfaces.Repositories;
using TapaBuracos.Core.Interfaces.Services;
using TapaBuracos.Core.Models;

namespace TapaBuracos.Core.Services
{
    public class MunicipalityService : IMunicipalityService
    {
        protected IMunicipalityRepository Repository { get; }
        protected Coelho.Arc.Constantinople.Interfaces.IValidator<Municipality> Validator { get; }
        public MunicipalityService(IMunicipalityRepository repository, Coelho.Arc.Constantinople.Interfaces.IValidator<Municipality> validator)
        {
            Repository = repository;
            Validator = validator;
        }
        public async Task<ValidationResult> RegisterAssociationAsync(IUser user)
        {
            var municipality = new Municipality(user);
            var validationResults = await Validator.ValidateAsync(municipality);
            if (!validationResults.IsValid)
                return validationResults;
            await Repository.AssociateMunicipalityAsync(municipality);
            return validationResults;
        }

        public async Task<Municipality> FindByIdAsync(string id)
        {
            return await Repository.FindByIdAsync(id);
        }
    }
}
