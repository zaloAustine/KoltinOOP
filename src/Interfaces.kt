

interface Downloader{
    fun download(name:String)
}


interface Player {
    fun play(name:String)
}

class Video :Downloader,Player{
    override fun download(name: String) {

    }

    override fun play(name: String) {

    }


}