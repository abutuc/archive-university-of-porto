using Coelho.Arc.Thessaloniki.Helpers;
using Microsoft.AspNetCore.Mvc;
using Swashbuckle.AspNetCore.Annotations;
using TapaBuracos.Core.Models;
using TapaBuracos.Municipality.Interfaces.Services;

namespace TapaBuracos.Web.Api.Controllers
{
    [SwaggerTag("Evaluations operations (municipality related)")]
    [Route("api/[controller]")]
    [ApiController]
    public class EvaluationMunicipalityController : ControllerBase
    {
        protected IEvaluationMunicipalityService Service { get; }
        public EvaluationMunicipalityController(IEvaluationMunicipalityService service)
        {
            Service = service;
        }

        [HttpGet("ObtainEvaluationsOfMunicipality/{municipalityId}")]
        [SwaggerOperation(Summary = "Get all the evaluations targeting issues of a specific municipality")]
        [SwaggerResponse(200, "Operation completed", typeof(List<Evaluation>))]
        [SwaggerResponse(500, "Internal server error", typeof(ErrorResponse))]
        public async Task<IActionResult> ObtainEvaluationsOfMunicipality(string municipalityId)
        {
            var result = await Service.ObtainEvaluationsOfMunicipalityAsync(municipalityId);
            return Ok(result);
        }

        [HttpGet("ObtainEvaluationsByIssueAndMunicipality/{issueId}/{municipalityId}")]
        [SwaggerOperation(Summary = "Get all the evaluations targeting issues of a specific municipality by the municipalityId and issueId")]
        [SwaggerResponse(200, "Operation completed", typeof(List<Evaluation>))]
        [SwaggerResponse(500, "Internal server error", typeof(ErrorResponse))]
        public async Task<IActionResult> ObtainEvaluationsByIssueAndMunicipality(string issueId, string municipalityId)
        {
            var result = await Service.ObtainEvaluationsByIssueAndMunicipalityAsync(issueId, municipalityId);
            return Ok(result);
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
    }
}
