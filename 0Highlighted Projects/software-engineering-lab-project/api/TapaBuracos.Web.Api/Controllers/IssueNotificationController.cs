using Microsoft.AspNetCore.Mvc;
using Coelho.Arc.Thessaloniki.Helpers;

using Swashbuckle.AspNetCore.Annotations;
using TapaBuracos.Core.Interfaces.Services;
using TapaBuracos.Core.Models;

namespace TapaBuracos.Web.Api.Controllers;

[SwaggerTag("Issue Notification operations")]
[Route("api/[controller]")]
[ApiController]
public class IssueNotificationController : ControllerBase
{
    protected IIssueNotificationService Service { get; }

    public IssueNotificationController(IIssueNotificationService service)
    {
        Service = service;
    }

    [HttpGet("GetUserIssueNotifications/{userId}")]
    [SwaggerOperation(Summary = "Get all the current active issues")]
    [SwaggerResponse(200, "Operation completed", typeof(List<IssueNotification>))]
    [SwaggerResponse(500, "Internal server error", typeof(ErrorResponse))]
    public async Task<IActionResult> GetUserIssueNotifications(string userId)
    {
        var result = await Service.GetUserUnreadIssueNotifications(userId);
        return Ok(result);
    }
    
    [HttpPost("MarkIssueNotificationAsRead/{notificationId}")]
    [SwaggerOperation(Summary = "Mark issue notification as read")]
    [SwaggerResponse(200, "Operation completed", typeof(void))]
    [SwaggerResponse(500, "Internal server error", typeof(ErrorResponse))]
    public async Task<IActionResult> MarkIssueNotificationAsRead(string notificationId)
    {
        await Service.MarkIssueNotificationAsRead(notificationId);
        return Ok();
    }
    
    
    
}