using FluentValidation.Results;
using TapaBuracos.Core.Interfaces.Models;
using TapaBuracos.Core.Models;

namespace TapaBuracos.Core.Interfaces.Services
{
    public interface IMunicipalityService
    {
        Task<ValidationResult> RegisterAssociationAsync(IUser user);
        Task<Municipality> FindByIdAsync(string id);
    }
}
