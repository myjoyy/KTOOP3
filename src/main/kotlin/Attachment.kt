sealed interface Attachment {
    val type: String
}
class AudioAttachment(override val type: String = "Audio", audio: Audio) : Attachment

class VideoAttachment(override val type: String = "Video", video: Video) : Attachment
