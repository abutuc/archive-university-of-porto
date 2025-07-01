using Newtonsoft.Json;
using TapaBuracos.Core.Enums;
using TapaBuracos.Core.Interfaces.Filters;

namespace TapaBuracos.Api.Models.Filters
{
    public record IssueFilterDTO : IIssueFilter
    {
        [JsonConstructor]
        public IssueFilterDTO(bool newest, string text, Priority? priority, IssueType? type, List<string> postalCodes)
        {
            Newest = newest;
            Text = text;
            Priority = priority;
            Type = type;
            PostalCodes = postalCodes;
        }
        public bool Newest { get; }
        public string Text { get; }
        public Priority? Priority { get; }
        public IssueType? Type { get; }
        public List<string> PostalCodes { get; set; }
    }
}
