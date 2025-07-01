using Coelho.Arc.Thessaloniki.Helpers;
using Microsoft.AspNetCore.Mvc;
using Swashbuckle.AspNetCore.Annotations;
using TapaBuracos.Citizen.Interfaces.Services;
using TapaBuracos.Citizen.Models;
using TapaBuracos.Core.Models;

namespace TapaBuracos.Web.Api.Controllers
{
    [SwaggerTag("Issue operations (citizen related)")]
    [Route("api/[controller]")]
    [ApiController]
    public class IssueCitizenController : ControllerBase
    {
        protected IIssueCitizenService Service { get; }
        public IssueCitizenController(IIssueCitizenService service)
        {
            Service = service;
        }

        [HttpGet("ObtainActiveIssues")]
        [SwaggerOperation(Summary = "Get all the current active issues")]
        [SwaggerResponse(200, "Operation completed", typeof(List<Issue>))]
        [SwaggerResponse(500, "Internal server error", typeof(ErrorResponse))]
        public async Task<IActionResult> ObtainActiveIssues()
        {
            var result = await Service.ObtainActiveIssuesAsync();
            return Ok(result);
        }

        [HttpGet("ObtainUserIssues/{userId}")]
        [SwaggerOperation(Summary = "Get all issues associated with an specific user")]
        [SwaggerResponse(200, "Operation completed", typeof(List<Issue>))]
        [SwaggerResponse(500, "Internal server error", typeof(ErrorResponse))]
        public async Task<IActionResult> ObtainUserIssues(string userId)
        {
            var result = await Service.ObtainUserIssuesAsync(userId);
            return Ok(result);
        }

        [HttpGet("ObtainIssueDetails/{issueId}")]
        [SwaggerOperation(Summary = "Get a complete Issue")]
        [SwaggerResponse(200, "Operation completed", typeof(List<Issue>))]
        [SwaggerResponse(500, "Internal server error", typeof(ErrorResponse))]
        public async Task<IActionResult> ObtainIssueDetails(string issueId)
        {
            var result = await Service.ObtainIssue(issueId);
            return Ok(result);
        }

        [HttpPost("RegisterIssue")]
        [SwaggerOperation(Summary = "Register a new issue in the databse. The answer contains information if the request was valid and if it was detected as a duplicated issue")]
        [SwaggerResponse(200, "Operation completed", typeof(ReportIssueResponseDTO))]
        [SwaggerResponse(500, "Internal server error", typeof(ErrorResponse))]
        public async Task<IActionResult> RegisterAssociation([FromBody] Issue user)
        {
            var r = await Service.ReportIssueAsync(user);
            return Ok(r);
        }

        [HttpPost("ConfirmIncrementOfIssue/{issueId}")]
        [SwaggerOperation(Summary = "Increments the occurence amount of the specified issue")]
        [SwaggerResponse(200, "Operation completed", typeof(void))]
        [SwaggerResponse(500, "Internal server error", typeof(ErrorResponse))]
        public async Task<IActionResult> ConfirmIncrementOfIssue(string issueId)
        {
            await Service.ConfirmIncrementOfIssueAsync(issueId);
            return Ok();
        }
        
        [HttpPost("{issueId}/AddWatcher/{userId}")]
        [SwaggerOperation(Summary = "Adds user as watcher to issue")]
        [SwaggerResponse(200, "Operation completed", typeof(void))]
        [SwaggerResponse(500, "Internal server error", typeof(ErrorResponse))]
        public async Task<IActionResult> AddWatcherToIssue(string issueId, string userId)
        {
            await Service.AddWatcher(issueId, userId);
            return Ok();
        }
        
        [HttpDelete("{issueId}/RemoveWatcher/{userId}")]
        [SwaggerOperation(Summary = "Removes user as watcher to issue")]
        [SwaggerResponse(200, "Operation completed", typeof(void))]
        [SwaggerResponse(500, "Internal server error", typeof(ErrorResponse))]
        public async Task<IActionResult> RemoveWatcherFromIssue(string issueId, string userId)
        {
            await Service.RemoveWatcher(issueId, userId);
            return Ok();
        }
        
    }
}
