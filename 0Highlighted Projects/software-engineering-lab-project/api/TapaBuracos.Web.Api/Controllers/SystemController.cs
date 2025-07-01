using Microsoft.AspNetCore.Mvc;
using Swashbuckle.AspNetCore.Annotations;

namespace TapaBuracos.Web.Api.Controllers
{
    [SwaggerTag("System utilities")]
    [Route("api/[controller]")]
    [ApiController]
    public class SystemController : ControllerBase
    {
        [HttpGet("Status")]
        [SwaggerOperation(Summary = "Check the application is running properly")]
        public IActionResult CheckFirestore()
        {
            return Ok("Ok");
        }
    }
}
