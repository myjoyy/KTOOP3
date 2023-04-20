fun main() {


    val audio = Audio("Artist", "Title")
    val media = AudioAttachment("audio", audio)  //для наглядности

    //Не получается прицепить данные из класса Audio в класс Attachment
    //Или я вообще зря пошел по пути интерфейса Attachment и нужно было в Abstrasct?

    val post = Post(
        1, 0L, 0L, arrayOf(media), null, "content", false, 0, 0, "Simple",
        true, true, false, false, false
    )

    WallService.add(post)
    WallService.printAll()
}