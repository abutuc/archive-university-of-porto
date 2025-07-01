using Newtonsoft.Json;
using TapaBuracos.Core.Interfaces.Models;

namespace TapaBuracos.Core.Models
{
    public record Municipality : IUser
    {
        public Municipality(IUser userData)
        {
            Id = userData.Id;
            Name = userData.Name;
            Email = userData.Email;
        }

        public Municipality(string id, string name, string email, string photoUrl, int minOccurrences, List<string> postalCodes)
        {
            Id = id;
            Name = name;
            Email = email;
            PhotoUrl = photoUrl;
            MinOccurrences = minOccurrences;
            PostalCodes = postalCodes;
        }

        [JsonConstructor]
        public Municipality(string id, string name, string email, string photoUrl, int minOccurrences, List<string> postalCodes, bool blocked, DateTime? dateBlocked) : this(id, name, email, photoUrl, minOccurrences, postalCodes)
        {
            Blocked = blocked;
            DateBlocked = dateBlocked;
        }

        public string Id { get; }
        public string Name { get; }
        public string Email { get; }
        public string PhotoUrl { get; }
        public int MinOccurrences { get; }
        public List<string> PostalCodes { get; }
        public bool Blocked { get; }
        public DateTime? DateBlocked { get; }
    }
}
