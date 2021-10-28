 abstract class BaseCoffeeMachine(
    private val price:Double,
    private val color:String){

     abstract val brand:String
     abstract fun makeCoffee(types: String):String

     fun machineInfo():String{
         return "Coffee machine Price: $price Color: $color"
     }
}

 class PremiumCoffeeMachine constructor(
     price:Double,
     color:String,
 ) : BaseCoffeeMachine(price,color){

     override val brand: String
     get() = "Brand X"

     override fun makeCoffee(types: String): String {
        return "Making $types is ready"
     }
 }


 class SimpleCoffeeMachine constructor(
     price:Double,
     color:String,
 ) : BaseCoffeeMachine(price,color){

     override val brand: String
         get() = "Brand Y"

     override fun makeCoffee(types: String): String {
         Thread.sleep(4000)
         return "Making $types is ready"
     }
 }