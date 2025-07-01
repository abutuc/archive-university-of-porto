using Coelho.Arc.Constantinople.DependencyInjection;
using Coelho.Arc.Constantinople.Interfaces;
using MapsterMapper;
using TapaBuracos.Citizen.Interfaces.Repositories;
using TapaBuracos.Citizen.Interfaces.Services;
using TapaBuracos.Citizen.Persistence.Repositories;
using TapaBuracos.Citizen.Services;
using TapaBuracos.Core.Helpers;
using TapaBuracos.Core.Interfaces.Models;
using TapaBuracos.Core.Interfaces.Repositories;
using TapaBuracos.Core.Interfaces.Services;
using TapaBuracos.Core.Models;
using TapaBuracos.Core.Services;
using TapaBuracos.Core.Validators;
using TapaBuracos.Municipality.Interfaces.Repositories;
using TapaBuracos.Municipality.Interfaces.Services;
using TapaBuracos.Municipality.Persistence.Repositories;
using TapaBuracos.Municipality.Services;
using TapaBuracos.Persistence.Repositories;

namespace TapaBuracos.Web.Api.Application
{
    public class Factory : DependencyManager
    {
        public Factory(IServiceCollection services) : base(services)
        {
        }

        public override void Configure()
        {
            ServiceCollection.AddSingleton<Coelho.Arc.Constantinople.Interfaces.IConfigurationManager, Coelho.Arc.Constantinople.Utils.ConfigurationManager>()
                             .AddSingleton<IMapper>(new Mapper())
                             .AddFirestoreDb("tapa-buracos");

            //Repos
            ServiceCollection.AddScoped<IUserRepository, UserRepository>()
                             .AddScoped<IIssueCitizenRepository, IssueCitizenRepository>()
                             .AddScoped<IIssueMunicipalityRepository, IssueMunicipalityRepository>()
                             .AddScoped<IMunicipalityRepository, MunicipalityRepository>()
                             .AddScoped<IEvaluationRepository, EvaluationRepository>()
                             .AddScoped<IIssueNotificationRepository, IssueNotificationRepository>();


            //Services
            ServiceCollection.AddScoped<IUserService, UserService>()
                             .AddScoped<IIssueCitizenService, IssueCitizenService>()
                             .AddScoped<IIssueMunicipalityService, IssueMunicipalityService>()
                             .AddScoped<IMunicipalityService, MunicipalityService>()
                             .AddScoped<IEvaluationCitizenService, EvaluationCitizenService>()
                             .AddScoped<IEvaluationMunicipalityService, EvaluationMunicipalityService>()
                             .AddScoped<TapaBuracos.Api.Models.Interfaces.Services.IIssueMunicipalityService, TapaBuracos.Api.Models.Services.IssueMunicipalityService>()
                             .AddScoped<TapaBuracos.Api.Models.Interfaces.Services.IEvaluationCitizenService, TapaBuracos.Api.Models.Services.EvaluationCitizenService>()
                             .AddScoped<IIssueNotificationService, IssueNotificationService>();

            //Validators
            ServiceCollection.AddScoped<IValidator<IUser>, UserValidator>()
                             .AddScoped<IValidator<IIssue>, IssueValidator>()
                             .AddScoped<IValidator<Core.Models.Municipality>, MunicipalityValidator>()
                             .AddScoped<IValidator<InitializeIssueResolutionVO>, InitializeIssueResolutionVOValidator>()
                             .AddScoped<IValidator<ConcludeIssueVO>, ConcludeIssueVOValidator>()
                             .AddScoped<IValidator<Evaluation>, EvaluationValidator>();
        }
    }
}
