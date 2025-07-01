using Coelho.Arc.Thessaloniki.Helpers;
using FluentValidation.Results;
using Microsoft.AspNetCore.Mvc;
using Swashbuckle.AspNetCore.Annotations;
using TapaBuracos.Api.Models.Models;
using TapaBuracos.Core.Models;

namespace TapaBuracos.Web.Api.Controllers
{
    [SwaggerTag("Evaluations operations (citizen related)")]
    [Route("api/[controller]")]
    [ApiController]
    public class EvaluationCitizenController : ControllerBase
    {
        protected TapaBuracos.Api.Models.Interfaces.Services.IEvaluationCitizenService Service { get; }
        public EvaluationCitizenController(TapaBuracos.Api.Models.Interfaces.Services.IEvaluationCitizenService service)
        {
            Service = service;
        }

        [HttpGet("ObtainUserEvaluations/{userId}")]
        [SwaggerOperation(Summary = "Get all the evaluations made by a specific user")]
        [SwaggerResponse(200, "Operation completed", typeof(List<Evaluation>))]
        [SwaggerResponse(500, "Internal server error", typeof(ErrorResponse))]
        public async Task<IActionResult> ObtainUserEvaluations(string userId)
        {
            var result = await Service.ObtainUserEvaluationsAsync(userId);
            return Ok(result);
        }

        [HttpPost("RegisterUserEvaluation")]
        [SwaggerOperation(Summary = "Saves the user evaluation")]
        [SwaggerResponse(200, "Operation completed", typeof(ValidationResult))]
        [SwaggerResponse(500, "Internal server error", typeof(ErrorResponse))]
        public async Task<IActionResult> RegisterUserEvaluation([FromBody] NewEvaluationDTO evaluation)
        {
            var result = await Service.RegisterReviewAsync(evaluation);
            return Ok(result);
        }
    }
}
