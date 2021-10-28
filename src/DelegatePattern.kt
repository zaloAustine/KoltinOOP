
class MediaFile(
    private val downloader: Downloader,
    private val player: Player
    ):Downloader,Player{

    override fun download(name: String) {
        downloader.download("Zalo")
    }

    override fun play(name: String) {
        player.play("Zalo")
    }

    fun setUp(){
        val downloader = FileDownloader(FILE_NAME)
        val player = FilePlayer(FILE_NAME)

        val mediaFile = MediaFile(downloader,player)
        mediaFile.play(FILE_NAME)
        mediaFile.download(FILE_NAME)
    }

}

class FileDownloader(private val file:String):Downloader{
    override fun download(name: String) {
        println("$file downloaded")
    }
}


class FilePlayer(private val file:String):Player{
    override fun play(name: String) {
        println("$file playing")

    }

}