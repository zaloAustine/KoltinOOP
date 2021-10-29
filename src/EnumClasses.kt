

interface DoColor{
    fun doColor()
}

enum class Color(val colorName:String,val colorValue:String):DoColor{
    RED("","") {
        override fun doColor() {

        }
    },
    GREEN("",""){
        override fun doColor() {

        }
    },
    BLUE("",""){
        override fun doColor() {

        }
    }
}