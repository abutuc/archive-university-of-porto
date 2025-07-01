using Coelho.Arc.Constantinople.DependencyInjection;

namespace TapaBuracos.Tests.Application
{
    public class UnitModel
    {
        private bool initialized { get; set; }
        //TODO: add TestOutputHelper
        protected readonly IDisposable scope;
        public UnitModel(TestInitializer initializer)
        {
            initializer.Configure();
            scope = DependencyManager.Instance.CreateScope();
        }

        public virtual void Dispose()
        {
            scope.Dispose();
        }
    }
}
