package movies.repositories.omdb

import movies.domain.omdb.OmdbRepository
import movies.domain.omdb.entities.SearchResultsEntity
import movies.repositories.omdb.network.OmdbServerConnector

class OmdbRepositoryImpl(private val serverConnector: OmdbServerConnector) : OmdbRepository {
    override suspend fun searchAll(query: String, ignoreCache: Boolean) : SearchResultsEntity {
        // TODO: Implement cache layer (Realm)
        return serverConnector.searchAll(query)
    }
}