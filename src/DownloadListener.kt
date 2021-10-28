

interface DownloadListener {
    fun onDownloadStarted()
    fun onDownloadCompleted(file: String)
    fun onProgressUpdate(progress :Int)
}

class DownloadManager{

     var downloadListener:DownloadListener? = null

    fun downloadFiles(file:String){
        downloadListener?.onDownloadStarted()

        for(i in 1..10){
            Thread.sleep(600)
            downloadListener?.onProgressUpdate(1*10)
        }
        downloadListener?.onDownloadCompleted(file)
    }
}



class App :DownloadListener{

    fun setUp(){
        val downloadManager = DownloadManager()
        downloadManager.downloadListener = this
        downloadManager.downloadFiles("zalo.m")

    }
    override fun onDownloadStarted() {
        println("Started")
    }

    override fun onDownloadCompleted(file: String) {
        println("completed")

    }

    override fun onProgressUpdate(progress: Int) {
        println("$progress downloaded %")

    }

}