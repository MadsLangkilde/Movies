package movies.domain.omdb

import movies.domain.omdb.entities.SearchResultsEntity

interface OmdbRepository {
    suspend fun searchAll(query: String, ignoreCache: Boolean = true) : SearchResultsEntity
}