class Box {

    private val length:Int = 10

    private val width:Int = 20

    private val height:Int = 5

    val volume
        get() = length*width*height

    var boxName:String? = null
    set(value){
        if (value != null) {
            if(value.length < 3){
                println("Name cannot be less that 3 characters")
            }else{
                field = value
            }
        }else{
            field = "Name cannot be Empty"
        }
    }

     fun fillContent(){
        println("Filled Box")
    }

     fun openBox(){
        println("Box Open")
    }
}
