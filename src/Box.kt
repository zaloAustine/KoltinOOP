class Box constructor(
            private val length:Int,
            private val width:Int,
            private val height:Int
){

  init {
      // called after primary constructor
      println("called init")

  }

    // secondary constructor
    constructor(color:String = "Red"):this(0,0,0){

    }

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
