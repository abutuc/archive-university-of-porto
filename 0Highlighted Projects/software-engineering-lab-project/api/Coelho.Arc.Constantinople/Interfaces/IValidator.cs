using FluentValidation.Results;

namespace Coelho.Arc.Constantinople.Interfaces
{
    public interface IValidator<T>
    {
        //TODO change return type to custom validation result
        public Task<ValidationResult> ValidateAsync(T entity);
    }
}
