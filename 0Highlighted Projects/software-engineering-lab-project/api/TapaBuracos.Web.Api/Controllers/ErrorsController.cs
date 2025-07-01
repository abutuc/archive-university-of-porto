using Coelho.Arc.Thessaloniki.Helpers;
using Microsoft.AspNetCore.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using TapaBuracos.Core.Properties;

namespace TapaBuracos.Web.Api.Controllers
{
    [ApiExplorerSettings(IgnoreApi = true)]
    public class ErrorsController : ControllerBase
    {
        [Route("/error")]
        public IActionResult Error()
        {
            var errorContext = HttpContext.Features.Get<IExceptionHandlerFeature>();

            //TODO custom errors

            return StatusCode(500, new ErrorResponse("Unexpected error", "500"));
        }
    }
}

    
