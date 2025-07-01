using Coelho.Arc.Constantinople.Utils;
using TapaBuracos.Api.Models.Filters;

namespace TapaBuracos.Api.Models.Models
{
    public record ObtainIssuesMunicipalityRequestDTO
    {
        public ObtainIssuesMunicipalityRequestDTO(Paginator paginator, IssueFilterDTO filter)
        {
            Paginator = paginator;
            Filter = filter;
        }

        public Paginator Paginator { get; }
        public IssueFilterDTO Filter { get; }
    }
}
