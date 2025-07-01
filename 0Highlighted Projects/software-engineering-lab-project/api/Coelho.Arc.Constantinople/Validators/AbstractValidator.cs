using FluentValidation.Results;

namespace Coelho.Arc.Constantinople.Validators
{
    public abstract class AbstractValidator<T> : FluentValidation.AbstractValidator<T>, Coelho.Arc.Constantinople.Interfaces.IValidator<T>
    {
        protected virtual bool ConfigureOnConstructor { get; }
        private bool configured;
        protected AbstractValidator()
        {
            if (ConfigureOnConstructor)
                Configure();
        }
        protected void SetConfigurations()
        {
            if (configured) return;
            Configure();
            configured = true;
        }
        public abstract void Configure();
        public async Task<ValidationResult> ValidateAsync(T entity)
        {
            Configure();
            return await this.ValidateAsync(entity, CancellationToken.None);
        }

    }
}
