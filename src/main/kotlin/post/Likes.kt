package post

data class Likes(
    private val count: Long,
    private val isLiked: Boolean,
    private val canLike: Boolean
) {
}