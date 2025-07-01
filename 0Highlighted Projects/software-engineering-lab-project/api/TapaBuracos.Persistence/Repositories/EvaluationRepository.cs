using Coelho.Arc.Bosporus.Firestore.Repositories;
using Google.Cloud.Firestore;
using Mapster;
using TapaBuracos.Core.Interfaces.Repositories;
using TapaBuracos.Core.Models;
using TapaBuracos.Persistence.Models;

namespace TapaBuracos.Persistence.Repositories
{
    public class EvaluationRepository : FirestoreRepositoryBase<EvaluationPersistence>, IEvaluationRepository
    {
        protected override string CollectionName => "Evaluations";
        public EvaluationRepository(FirestoreDb database) : base(database)
        {
        }
        public async Task<List<Evaluation>> ObtainUserEvaluationsAsync(string userId)
        {
            var snapshot = await Collection.WhereEqualTo(nameof(EvaluationPersistence.UserId), userId)
                                           .GetSnapshotAsync();

            if (snapshot.Documents.Count == 0) return null;

            List<EvaluationPersistence> result = [];
            foreach (var d in snapshot.Documents) result.Add(d.ConvertTo<EvaluationPersistence>());
            return result.Adapt<List<Evaluation>>();
        }

        public async Task RegisterReviewAsync(Evaluation evaluation)
        {
            var persistence = evaluation.Adapt<EvaluationPersistence>();
            await AddAsync(persistence);
        }

        public async Task<List<Evaluation>> ObtainEvaluationsOfMunicipalityAsync(string municipalityId)
        {
            var snapshot = await Collection.WhereEqualTo(nameof(EvaluationPersistence.MunicipalityId), municipalityId)
                                           .GetSnapshotAsync();

            if (snapshot.Documents.Count == 0) return null;

            List<EvaluationPersistence> result = [];
            foreach (var d in snapshot.Documents) result.Add(d.ConvertTo<EvaluationPersistence>());
            return result.Adapt<List<Evaluation>>();
        }

        public async Task<List<Evaluation>> ObtainEvaluationsByIssueAndMunicipalityAsync(string issueId, string municipalityId)
        {
            var snapshot = await Collection.WhereEqualTo(nameof(EvaluationPersistence.MunicipalityId), municipalityId)
                                           .WhereEqualTo(nameof(EvaluationPersistence.IssueId), issueId)
                                           .GetSnapshotAsync();

            if (snapshot.Documents.Count == 0) return null;

            List<EvaluationPersistence> result = [];
            foreach (var d in snapshot.Documents) result.Add(d.ConvertTo<EvaluationPersistence>());
            return result.Adapt<List<Evaluation>>();
        }
    }
}
