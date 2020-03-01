package post

data class Reposts(
    private val canCreateRepost: Boolean,
    private val pagesIdPost: Long?,
    private val count: Long,
    private val userIsReposted: Boolean
) {
}