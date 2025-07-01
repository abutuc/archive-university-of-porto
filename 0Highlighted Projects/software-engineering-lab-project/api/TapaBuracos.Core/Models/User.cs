using Newtonsoft.Json;
using TapaBuracos.Core.Interfaces.Models;

namespace TapaBuracos.Core.Models
{
    public record User : IUser
    {
        public User(string id, string name, string email)
        {
            Id = id;
            Name = name;
            Email = email;
        }

        [JsonConstructor]
        public User(string id, string name, string email, string photoUrl, bool blocked, DateTime? dateBlocked) : this(id, name, email)
        {
            PhotoUrl = photoUrl;
            Blocked = blocked;
            DateBlocked = dateBlocked;
        }

        public string Id { get; }
        public string Name { get; }
        public string Email { get; }
        public string PhotoUrl { get; }
        public bool Blocked { get; }
        public DateTime? DateBlocked { get; }
        //public Profile Profile { get; }
    }
}
