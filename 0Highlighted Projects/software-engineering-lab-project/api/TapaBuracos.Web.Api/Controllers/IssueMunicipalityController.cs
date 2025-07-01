using Coelho.Arc.Thessaloniki.Helpers;
using FluentValidation.Results;
using Microsoft.AspNetCore.Mvc;
using Swashbuckle.AspNetCore.Annotations;
using TapaBuracos.Api.Models.Models;
using TapaBuracos.Citizen.Models;
using TapaBuracos.Core.Helpers;
using TapaBuracos.Core.Models;
using TapaBuracos.Municipality.Models;

namespace TapaBuracos.Web.Api.Controllers
{
    [SwaggerTag("Issue operations (municipality related)")]
    [Route("api/[controller]")]
    [ApiController]
    public class IssueMunicipalityController : ControllerBase
    {
        protected TapaBuracos.Api.Models.Interfaces.Services.IIssueMunicipalityService Service { get; }
        public IssueMunicipalityController(TapaBuracos.Api.Models.Interfaces.Services.IIssueMunicipalityService service)
        {
            Service = service;
        }

        [HttpGet("ObtainIssues/{municipalityId}")]
        [SwaggerOperation(Summary = "Obtain all issues that the municipality should be able to see and manage")]
        [SwaggerResponse(200, "Issues obtained", typeof(List<Issue>))]
        [SwaggerResponse(500, "Internal server error", typeof(ErrorResponse))]
        public async Task<IActionResult> ObtainIssues(string municipalityId)
        {
            var issues = await Service.ObtainIssuesAsync(municipalityId);
            return Ok(issues);
        }

        [HttpPost("ObtainPaginatedIssues/{municipalityId}")]
        [SwaggerOperation(Summary = "Obtain all issues that the municipality should be able to see and manage with filter options")]
        [SwaggerResponse(200, "Issues obtained", typeof(ReportIssueResponseDTO))]
        [SwaggerResponse(500, "Internal server error", typeof(ErrorResponse))]
        public async Task<IActionResult> ObtainIssues(string municipalityId, [FromBody] ObtainIssuesMunicipalityRequestDTO request)
        {
            var result = await Service.ObtainIssuesAsync(municipalityId, request);
            return Ok(result);
        }

        [HttpPost("ObtainIssuesByPostalCodes/")]
        [SwaggerOperation(Summary = "Obtain all issues that the municipality should be able to see and manage with filter options")]
        [SwaggerResponse(200, "Issues obtained", typeof(ReportIssueResponseDTO))]
        [SwaggerResponse(500, "Internal server error", typeof(ErrorResponse))]
        public async Task<IActionResult> ObtainIssuesByPostalCodes([FromBody] ObtainIssuesMunicipalityRequestDTO request)
        {
            var result = await Service.ObtainIssuesAsync(request);
            return Ok(result);
        }

        [HttpGet("ObtainIssue/{municipalityId}/{issueId}")]
        [SwaggerOperation(Summary = "Obtain one specific issue that the municipality should be able to see and manage")]
        [SwaggerResponse(200, "Issues obtained", typeof(List<Issue>))]
        [SwaggerResponse(500, "Internal server error", typeof(ErrorResponse))]
        public async Task<IActionResult> ObtainIssues(string municipalityId, string issueId)
        {
            var issue = await Service.ObtainIssueAsync(issueId, municipalityId);
            return Ok(issue);
        }

        [HttpPost("InitializeResolution")]
        [SwaggerOperation(Summary = "Initialize the resolution of the specified Issue passing all the relevant information on the request body")]
        [SwaggerResponse(200, "Resolution has been initilialized", typeof(ValidationResult))]
        [SwaggerResponse(500, "Internal server error", typeof(ErrorResponse))]
        public async Task<IActionResult> InitializeResolution([FromBody] InitializeIssueResolutionVO vo)
        {
            var r = await Service.InitiateResolutionAsync(vo);
            return Ok(r);
        }

        [HttpPost("ConcludeResolution")]
        [SwaggerOperation(Summary = "Concludes the resolution of the specified Issue passing all the relevant information on the request body")]
        [SwaggerResponse(200, "Resolution has been concluded", typeof(ValidationResult))]
        [SwaggerResponse(500, "Internal server error", typeof(ErrorResponse))]
        public async Task<IActionResult> ConcludeResolution([FromBody] ConcludeIssueVO vo)
        {
            var r = await Service.ConcludeResolutionAsync(vo);
            return Ok(r);
        }
        
        [HttpPost("IssueReporting/{municipalityId}")]
        [SwaggerOperation(Summary = "Generates a Issue Report Structure given a specific date interval for a municipality")]
        [SwaggerResponse(200, "Report Generation was concluded", typeof(MunicipalityIssueReportDTO))]
        [SwaggerResponse(500, "Internal server error", typeof(ErrorResponse))]
        public async Task<IActionResult> GenerateIssueReport(string municipalityId, [FromBody] MunicipalityIssueInterval issueInterval)
        {
            var report = await Service.GenerateIssueReport(municipalityId, issueInterval);
            return Ok(report);
        }
    }
}
