package post

data class Comments(
    private val count: Long,
    private val canPost: Boolean,
    private val groupsCanPost: Boolean,
    private val canClose: Boolean,
    private val canOpen: Boolean,
    private val canDeleteAllPostsUsers: Boolean,
    private val sort: SortComments
) {
}