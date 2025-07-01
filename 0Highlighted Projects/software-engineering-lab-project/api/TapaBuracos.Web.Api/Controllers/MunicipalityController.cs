using Coelho.Arc.Thessaloniki.Helpers;
using FluentValidation.Results;
using Microsoft.AspNetCore.Mvc;
using Swashbuckle.AspNetCore.Annotations;
using TapaBuracos.Core.Interfaces.Services;
using TapaBuracos.Core.Models;

namespace TapaBuracos.Web.Api.Controllers
{
    [SwaggerTag("Municipality (as an user) operations")]
    [Route("api/[controller]")]
    [ApiController]
    public class MunicipalityController : ControllerBase
    {
        protected IMunicipalityService Service { get; }
        public MunicipalityController(IMunicipalityService service)
        {
            Service = service;
        }

        [HttpGet("GetMunicipalityById/{id}")]
        [SwaggerOperation(Summary = "Get the municipality association info filtered by the municipality id")]
        [SwaggerResponse(200, "Operation complete", typeof(Core.Models.Municipality))]
        [SwaggerResponse(500, "Internal server error", typeof(ErrorResponse))]
        public async Task<IActionResult> GetUserById(string id)
        {
            var user = await Service.FindByIdAsync(id);
            return Ok(user);
        }


        [HttpPost("RegisterAssociation")]
        [SwaggerOperation(Summary = "Register a new municipality association. This does not create a municipality user, it simply associate some useful info for later quick utilization")]
        [SwaggerResponse(200, "Operation complete", typeof(ValidationResult))]
        [SwaggerResponse(500, "Internal server error", typeof(ErrorResponse))]
        public async Task<IActionResult> RegisterAssociation([FromBody] User user)
        {
            var validationResults = await Service.RegisterAssociationAsync(user);
            return Ok(validationResults);
        }
    }
}
