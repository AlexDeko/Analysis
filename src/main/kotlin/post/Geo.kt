package post

data class Geo(
    private val type: String,
    private val coordinates: String,
    private val place: String?
) {
}