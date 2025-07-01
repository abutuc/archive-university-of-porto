using FluentValidation.Results;
using TapaBuracos.Core.Enums;
using TapaBuracos.Core.Helpers;
using TapaBuracos.Core.Interfaces.Filters;
using TapaBuracos.Core.Interfaces.Repositories;
using TapaBuracos.Core.Models;
using TapaBuracos.Municipality.Interfaces.Repositories;
using TapaBuracos.Municipality.Interfaces.Services;
using TapaBuracos.Municipality.Models;

namespace TapaBuracos.Municipality.Services
{
    public class IssueMunicipalityService : IIssueMunicipalityService
    {
        protected IIssueMunicipalityRepository Repository { get; }
        protected Coelho.Arc.Constantinople.Interfaces.IValidator<InitializeIssueResolutionVO> InitializeIssueResolutionVOValidator { get; }
        protected Coelho.Arc.Constantinople.Interfaces.IValidator<ConcludeIssueVO> ConcludeIssueVOValidator { get; }
        protected IMunicipalityRepository MunicipalityRepository { get; }

		public IssueMunicipalityService(IIssueMunicipalityRepository repository, Coelho.Arc.Constantinople.Interfaces.IValidator<InitializeIssueResolutionVO> initializeIssueResolutionVOValidator, Coelho.Arc.Constantinople.Interfaces.IValidator<ConcludeIssueVO> concludeIssueVOValidator, IMunicipalityRepository municipalityRepository)
		{
			Repository = repository;
			InitializeIssueResolutionVOValidator = initializeIssueResolutionVOValidator;
			ConcludeIssueVOValidator = concludeIssueVOValidator;
			MunicipalityRepository = municipalityRepository;
		}
		public async Task<Issue> ObtainIssueAsync(string issueId, string municipalityId)
        {
            return await Repository.ObtainIssueAsync(issueId, municipalityId);
        }
        [Obsolete("Method is here only for retrocompatibility and will be removed in the future")]
        public async Task<List<Issue>> ObtainIssuesAsync(string municipalityId)
        {
            return await Repository.ObtainIssuesAsync(municipalityId);
        }

        public async Task<List<Issue>> ObtainIssuesAsync(string municipalityId, IIssueFilter filter, Coelho.Arc.Constantinople.Interfaces.IPaginator paginator)
        {
            return await Repository.ObtainIssuesAsync(municipalityId, filter, paginator);
        }

        public async Task<List<Issue>> ObtainIssuesAsync(IIssueFilter filter, Coelho.Arc.Constantinople.Interfaces.IPaginator paginator)
        {
            return await Repository.ObtainIssuesAsync(filter, paginator);
        }

        public async Task<ValidationResult> InitiateResolutionAsync(InitializeIssueResolutionVO initializeIssueResolutionVO)
        {
            var validationResults = await InitializeIssueResolutionVOValidator.ValidateAsync(initializeIssueResolutionVO);
            if (!validationResults.IsValid)
                return validationResults;
            await Repository.InitiateResolutionAsync(initializeIssueResolutionVO);
            return validationResults;
        }

        public async Task<ValidationResult> ConcludeResolutionAsync(ConcludeIssueVO concludeIssueVO)
        {
            var validationResults = await ConcludeIssueVOValidator.ValidateAsync(concludeIssueVO);
            if (!validationResults.IsValid)
                return validationResults;
            await Repository.ConcludeResolutionAsync(concludeIssueVO);
            return validationResults;
        }

        public async Task<MunicipalityIssueReportDTO> GenerateIssueReportAsync(string municipalityId,
            MunicipalityIssueInterval issueInterval)
        {
            var municipality = await MunicipalityRepository.FindByIdAsync(municipalityId);
            var issues = await Repository.ObtainMunicipalityIssuesBetweenIntervalAsync(municipality.PostalCodes, issueInterval);

            var numberOfReportedIssues = issues.Count;

            var totalResponseTime = issues
                .Where(issue => issue.DateApproved.HasValue)
                .Aggregate(TimeSpan.Zero, (sum, issue) => sum + (issue.DateApproved.Value - issue.DateReported));

            var numberOfApprovedIssues = issues.Count(issue => issue.DateApproved.HasValue);
            var averageResponseTimes = numberOfReportedIssues > 0 && numberOfApprovedIssues > 0
                ? TimeSpan.FromTicks(totalResponseTime.Ticks / numberOfApprovedIssues) 
                : TimeSpan.Zero;

            var resolvedIssuesCount = issues.Count(issue => issue.Status == IssueStatus.Resolved);
            var resolutionRate = numberOfReportedIssues > 0
                ? ((resolvedIssuesCount / numberOfReportedIssues) * 100).ToString("F2") + "%"
                : "0%";
            
            var reportedCounts = issues
                .GroupBy(issue => issue.DateReported.Date)
                .ToDictionary(g => g.Key, g => g.Count());

            var resolvedCounts = issues
                .Where(issue => issue.Status == IssueStatus.Resolved && issue.DateResolved.HasValue)
                .GroupBy(issue => issue.DateResolved.Value.Date)
                .ToDictionary(g => g.Key, g => g.Count());
            
            var allDates = reportedCounts.Keys
                .Union(resolvedCounts.Keys)
                .OrderBy(date => date)
                .ToList();

            var graphData = new List<(string, int)>();
            int cumulativeReported = 0, cumulativeResolved = 0;

            foreach (var date in allDates)
            {
                cumulativeReported += reportedCounts.ContainsKey(date) ? reportedCounts[date] : 0;
                cumulativeResolved += resolvedCounts.ContainsKey(date) ? resolvedCounts[date] : 0;

                var differential = cumulativeReported - cumulativeResolved;
                graphData.Add((date.ToString("yyyy-MM-dd"), differential));
            }

            return new MunicipalityIssueReportDTO(numberOfReportedIssues, averageResponseTimes, resolutionRate, graphData);
            
        }
    }
}
