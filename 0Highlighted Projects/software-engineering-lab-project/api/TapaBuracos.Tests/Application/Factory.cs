using Coelho.Arc.Constantinople.DependencyInjection;
using Coelho.Arc.Constantinople.Interfaces;
using MapsterMapper;
using Microsoft.Extensions.DependencyInjection;
using TapaBuracos.Citizen.Interfaces.Repositories;
using TapaBuracos.Citizen.Interfaces.Services;
using TapaBuracos.Citizen.Persistence.Repositories;
using TapaBuracos.Citizen.Services;
using TapaBuracos.Core.Helpers;
using TapaBuracos.Core.Interfaces.Models;
using TapaBuracos.Core.Interfaces.Repositories;
using TapaBuracos.Core.Interfaces.Services;
using TapaBuracos.Core.Services;
using TapaBuracos.Core.Validators;
using TapaBuracos.Municipality.Interfaces.Repositories;
using TapaBuracos.Municipality.Interfaces.Services;
using TapaBuracos.Municipality.Persistence.Repositories;
using TapaBuracos.Municipality.Services;
using TapaBuracos.Persistence.Repositories;

namespace TapaBuracos.Tests.Application
{
    public class Factory : DependencyManager
    {
        public Factory(IServiceCollection services) : base(services)
        {
        }

        public override void Configure()
        {
            ServiceCollection.AddSingleton<IConfigurationManager, ConfigurationManager>()
                             .AddSingleton<IMapper>(new Mapper())
                             .AddFirestoreDb("tapa-buracos");

            //Repos
            ServiceCollection.AddScoped<IUserRepository, UserRepository>()
                .AddScoped<IIssueCitizenRepository, IssueCitizenRepository>()
                .AddScoped<IIssueMunicipalityRepository, IssueMunicipalityRepository>()
                .AddScoped<IMunicipalityRepository, MunicipalityRepository>()
                .AddScoped<IIssueNotificationRepository, IssueNotificationRepository>()
                .AddScoped<IEvaluationRepository, EvaluationRepository>();

            //Services
            ServiceCollection.AddScoped<IUserService, UserService>()
                .AddScoped<IIssueMunicipalityService, IssueMunicipalityService>()
                .AddScoped<IIssueCitizenService, IssueCitizenService>()
                .AddScoped<IMunicipalityService, MunicipalityService>()
                .AddScoped<IIssueNotificationService, IssueNotificationService>();

            //Validators
            ServiceCollection.AddScoped<IValidator<IUser>, UserValidator>()
                             .AddScoped<IValidator<IIssue>, IssueValidator>()
                             .AddScoped<IValidator<Core.Models.Municipality>, MunicipalityValidator>()
                             .AddScoped<IValidator<InitializeIssueResolutionVO>, InitializeIssueResolutionVOValidator>()
                             .AddScoped<IValidator<ConcludeIssueVO>, ConcludeIssueVOValidator>();
        }

        protected internal virtual void Finish()
        {

        }

    }

    
}
