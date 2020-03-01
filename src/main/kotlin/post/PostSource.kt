package post

data class PostSource(
    private val type: String, //vk ; widget; api; rss; sms.
    private val platform: String, //android; iphone; wphone.
    private val data: String,
    private val url: String
) {
}