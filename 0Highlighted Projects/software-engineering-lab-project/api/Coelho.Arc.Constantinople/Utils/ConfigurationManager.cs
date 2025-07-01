using Microsoft.Extensions.Configuration;

namespace Coelho.Arc.Constantinople.Utils
{
    public class ConfigurationManager : Interfaces.IConfigurationManager
    {
        protected virtual IConfiguration Configuration { get; }
        public string GetConfiguration(string key)
        {
            var valores = Configuration.GetSection("Values");
            var r = valores[key];
            return r;
        }
    }
}
