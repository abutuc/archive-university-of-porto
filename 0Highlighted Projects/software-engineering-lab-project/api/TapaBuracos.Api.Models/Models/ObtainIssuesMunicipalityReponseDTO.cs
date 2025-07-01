using Coelho.Arc.Constantinople.Utils;
using TapaBuracos.Core.Models;

namespace TapaBuracos.Api.Models.Models
{
    public record ObtainIssuesMunicipalityReponseDTO
    {
        public ObtainIssuesMunicipalityReponseDTO(Paginator paginator, List<Issue> issues)
        {
            Paginator = paginator;
            Issues = issues;
        }

        public Paginator Paginator { get; }
        public List<Issue> Issues { get; }
    }
}
