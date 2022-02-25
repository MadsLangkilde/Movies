package movies.repositories.omdb.network.model

import com.google.gson.annotations.SerializedName
import movies.domain.omdb.entities.MovieEntity
import movies.domain.omdb.entities.SearchResultsEntity

data class SearchResult(
    @SerializedName("Search") override val searchResults: List<MovieResult>,
    @SerializedName("totalResults") override val totalResults: String,
    @SerializedName("Response") override val response: String
) : SearchResultsEntity