package movies.repositories.omdb.network

import movies.repositories.omdb.network.model.SearchResult
import movies.repositories.repository_base.BaseServerConnector

class OmdbServerConnector(private val apiKey: String) : BaseServerConnector<OmdbApi>() {
    override fun getBaseUrl()  = "http://www.omdbapi.com/"
    override fun getClazz(): Class<OmdbApi> = OmdbApi::class.java
    suspend fun searchAll(query: String): SearchResult {
        val r = api!!.searchAll(apiKey, query)
        return r
    }
}