package post

data class Post(
    private val id: Long,
    private val ownerId: Long,
    private val authorId: Long,
    private val adminId: Long?,
    private val nameAuthor: String,
    private val date: Long,
    private val textAuthor: String?,
    private val logoAuthor: Long,
    private val linkPageAuthor: Long,
    private val replyOwnerId: Long?,
    private val replyPostId: Long?,
    private val isPostPinned: Boolean = false,
    private val checkBoxPostForStatus: CheckBoxStatusPost?,
    private val friendsOnly: Boolean = false,
    private val likes: Likes,
    private val comments: Comments,
    private val reposts: Reposts,
    private val countViews: Long,
    private val lastChange: Long?,
    private val postType: String, //reply, post, copy, postPhone, suggest, postpone
    private val postSource: PostSource?,
    private val geo: Geo?,
    private val signerId: Long?,
    private val canDelete: Boolean,
    private val canEdit: Boolean,
    private val canPinned: Boolean,
    private val isAdvertising: Boolean,
    private val isBookmarked: Boolean,
    private val postponedPost: PostponedPost
) {

}