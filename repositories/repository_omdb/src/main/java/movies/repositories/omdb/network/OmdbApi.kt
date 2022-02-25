package movies.repositories.omdb.network

import movies.repositories.omdb.network.model.SearchResult
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface OmdbApi {
    @GET(".")
    suspend fun searchAll(@Query("apiKey") apiKey: String, @Query("s") query: String): SearchResult
}