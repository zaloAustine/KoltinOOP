class Box {

    private val length:Int = 10
    private val width:Int = 20
    private val height:Int = 5

     fun fillContent(){
        println("Filled Box")
    }

     fun openBox(){
        println("Box Open")
    }
}

data class TestColor(private val test1:String)