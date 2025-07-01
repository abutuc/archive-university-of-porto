using Coelho.Arc.Constantinople.Interfaces;

namespace TapaBuracos.Tests.Application
{
    public class ConfigurationManager : IConfigurationManager
    {
        public string GetConfiguration(string key)
        {
            var value = System.Configuration.ConfigurationManager.AppSettings[key];
            return value;
        }
    }
}
