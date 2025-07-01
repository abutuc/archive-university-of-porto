using Coelho.Arc.Constantinople.DependencyInjection;
using Coelho.Arc.Constantinople.Interfaces;

namespace Coelho.Arc.Bosporus.Firestore.Configurations
{
    public class Configuration
    {
        public static string FirestoreConnection => DependencyManager.Instance.GetInstance<IConfigurationManager>().GetConfiguration("FirestoreConnection");
    }
}
