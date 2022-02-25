package movies.domain.omdb.entities

interface SearchResultsEntity {
    val searchResults: List<MovieEntity>
    val totalResults: String
    val response: String
}
