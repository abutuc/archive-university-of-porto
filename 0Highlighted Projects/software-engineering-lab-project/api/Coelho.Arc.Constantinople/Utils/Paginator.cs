using Coelho.Arc.Constantinople.Interfaces;
using Newtonsoft.Json;

namespace Coelho.Arc.Constantinople.Utils
{
    public class Paginator : IPaginator
    {
        public Paginator(int recordsPerPage)
        {
            RecordsPerPage = recordsPerPage;
            if (Page == 0)
                Page = 1;
        }

        [JsonConstructor]
        public Paginator(int page, int totalPages, int totalRecords, int recordsPerPage) : this(page)
        {
            TotalPages = totalPages;
            TotalRecords = totalRecords;
            RecordsPerPage = recordsPerPage;
        }

        public int Page { get; set; }
        public int TotalPages { get; set; }
        public int TotalRecords { get; set; }
        public int RecordsPerPage { get; set; }
    }
}
