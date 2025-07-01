using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Coelho.Arc.Constantinople.Interfaces
{
    public interface IPaginator
    {
        int Page { get; set; }
        int TotalPages { get; set; }
        int TotalRecords { get; set; }
        int RecordsPerPage { get; set; }
    }
}
