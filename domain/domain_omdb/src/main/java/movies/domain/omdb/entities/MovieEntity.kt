package movies.domain.omdb.entities

interface MovieEntity {
    val title: String
    val year: Long
    val imdbID: String
    val type: String
    val poster: String
}
