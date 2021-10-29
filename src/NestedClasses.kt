


class Boxed(val width:Int,val length:Int,val height:Int){

    inner class Content(private val content: String){
        fun printContent(){
            println(content)
        }

        fun printBoxInfo(){
            println("$width $length $height")
        }
    }

}
