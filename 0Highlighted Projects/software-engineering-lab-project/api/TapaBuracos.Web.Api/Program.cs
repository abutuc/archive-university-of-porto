using Coelho.Arc.Constantinople.DependencyInjection;
using System.Reflection;
using TapaBuracos.Api.Models.Configurations;
using TapaBuracos.Persistence.Configurations;
using TapaBuracos.Web.Api.Application;

var builder = WebApplication.CreateBuilder(args);


// Add services to the container.

builder.Services.AddControllers().AddNewtonsoftJson();
// Learn more about configuring Swagger/OpenAPI at https://aka.ms/aspnetcore/swashbuckle
builder.Services.AddEndpointsApiExplorer();
builder.Services.AddSwaggerGen();

//builder.Services.AddFirestoreDb("tapa-buracos");
AppInitialize.Initialize(builder.Services)
             .SetDependencyManager<Factory>()
             .AddMapperProfile<MapperProfilePersistence>()
             .AddMapperProfile<MapperProfileApi>()
             .Finish();

#if DEBUG
builder.Host.UseDefaultServiceProvider(s => s.ValidateOnBuild = true);
#endif

var app = builder.Build();
// Configure the HTTP request pipeline.
if (app.Environment.IsDevelopment())
{
    app.UseDeveloperExceptionPage();
}
app.UseSwagger();

app.UseSwaggerUI(c =>
{
    var assemblyInfo = typeof(Program).Assembly.GetName();
    c.SwaggerEndpoint("/swagger/v1/swagger.json", $"{assemblyInfo.Name} {assemblyInfo.Version}");
});

app.UseHttpsRedirection();
//app.UseExceptionHandler("/error");

app.UseAuthorization();

app.MapControllers();

app.Run();
