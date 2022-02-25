package movies.repositories.omdb.network.model

import com.google.gson.annotations.SerializedName
import movies.domain.omdb.entities.MovieEntity

data class MovieResult(
    @SerializedName("Title") override val title: String,
    @SerializedName("Year") override val year: Long,
    @SerializedName("imdbID") override val imdbID: String,
    @SerializedName("Type") override val type: String,
    @SerializedName("Poster") override val poster: String,
) : MovieEntity