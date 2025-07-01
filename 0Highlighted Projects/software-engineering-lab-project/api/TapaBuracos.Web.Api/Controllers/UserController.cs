using Coelho.Arc.Thessaloniki.Helpers;
using FluentValidation.Results;
using Microsoft.AspNetCore.Mvc;
using Swashbuckle.AspNetCore.Annotations;
using TapaBuracos.Core.Interfaces.Services;
using TapaBuracos.Core.Models;

namespace TapaBuracos.Web.Api.Controllers
{
    [SwaggerTag("User operations")]
    [Route("api/[controller]")]
    [ApiController]
    public class UserController : ControllerBase
    {
        protected IUserService Service { get; }
        public UserController(IUserService service)
        {
            Service = service;
        }

        [HttpGet("GetUserByEmail/{email}")]
        [SwaggerOperation(Summary = "Get the user association info filtered by the user e-mail")]
        [SwaggerResponse(200, "Operation complete", typeof(User))]
        [SwaggerResponse(500, "Internal server error", typeof(ErrorResponse))]
        public async Task<IActionResult> GetUserByEmail(string email)
        {
            var user = await Service.FindByEmailAsync(email);
            return Ok(user);
        }

        [HttpGet("GetUserById/{id}")]
        [SwaggerOperation(Summary = "Get the user association info filtered by the user id")]
        [SwaggerResponse(200, "Operation complete", typeof(User))]
        [SwaggerResponse(500, "Internal server error", typeof(ErrorResponse))]
        public async Task<IActionResult> GetUserById(string id)
        {
            var user = await Service.FindById(id);
            return Ok(user);
        }

        [HttpPost("RegisterAssociation")]
        [SwaggerOperation(Summary = "Register a new user association. This does not create a user, it simply associate some useful info for leter quick utilization")]
        [SwaggerResponse(200, "Operation complete", typeof(ValidationResult))]
        [SwaggerResponse(500, "Internal server error", typeof(ErrorResponse))]
        public async Task<IActionResult> RegisterAssociation([FromBody] User user)
        {
            var validationResults = await Service.RegisterAssociationAsync(user);
            return Ok(validationResults);
        }
    }
}
