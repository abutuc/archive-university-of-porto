using Coelho.Arc.Bosporus.Interfaces;
using Coelho.Arc.Bosporus.Models;
using Google.Cloud.Firestore;
using Google.Cloud.Firestore.V1;
using Grpc.Core;
using System.Reflection;

namespace Coelho.Arc.Bosporus.Firestore.Repositories
{
    public abstract class FirestoreRepositoryBase<T> : IReadableRepository<T>, IWritableRepository<T> where T : IEntity
    {
        protected abstract string CollectionName { get; }
        //protected string Connection => Configurations.Configuration.FirestoreConnection;
        protected CollectionReference Collection { get; }
        protected FirestoreDb Database { get; set; }
        public FirestoreRepositoryBase(FirestoreDb database)
        {
            Database = database;
            Collection = Database.Collection(CollectionName);
        }
        public async Task AddAsync(T entity)
        {
            var documentReference = Collection.Document(entity.Id);
            await documentReference.CreateAsync(entity);
        }

        public async Task DeleteAsync(string id)
        {
            var reference = Collection.Document(id);
            await reference.DeleteAsync();
        }

        /*public async Task<IEnumerable<T>> GetAllAsync()
        {
            var snapshot = await Collection.GetSnapshotAsync();
            List<T> result = [];
            foreach (var d in snapshot.Documents) result.Add(d.ConvertTo<T>());
            return result;
        }*/

        public async Task<T> GetAsync(string id)
        {
            var document = await Collection.Document(id).GetSnapshotAsync();
            return document.ConvertTo<T>();
        }

        /*//TODO: Very bad implementation. Maybe it's better to force the implementation of this method...
        public async Task UpdateAsync(T entity)
        {
            var document = Collection.Document(entity.Id);
            var propertiesDictionary = entity.GetType()
                                             .GetProperties(BindingFlags.Instance | BindingFlags.Public)
                                             .ToDictionary(prop => new FieldPath(prop.Name), prop => (object)prop.GetValue(entity, null));
            await document.UpdateAsync(propertiesDictionary);
        }*/
    }
}
