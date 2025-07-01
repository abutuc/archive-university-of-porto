using TapaBuracos.Core.Enums;

namespace TapaBuracos.Core.Interfaces.Filters
{
    public interface IIssueFilter
    {
        bool Newest { get; }
        string Text { get; }
        Priority? Priority { get; }
        IssueType? Type { get; }
        List<string> PostalCodes { get; }
    }
}
