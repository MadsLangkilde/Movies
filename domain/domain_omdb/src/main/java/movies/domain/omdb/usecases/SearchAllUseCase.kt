package movies.domain.omdb.usecases

import movies.domain.omdb.OmdbRepository
import movies.domain.omdb.entities.SearchResultsEntity

class SearchAllUseCase(private val omdbRepository: OmdbRepository) {
    suspend fun execute(query: String, ignoreCache: Boolean = true) : SearchResultsEntity = omdbRepository.searchAll(query, ignoreCache)
}