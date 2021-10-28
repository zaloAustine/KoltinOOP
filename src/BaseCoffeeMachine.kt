 open class BaseCoffeeMachine(
    private val price:Double,
    private val color:String){


     open fun makeCoffee(){

    }
}

 class PremiumCoffeeMachine constructor(
                             private val price:Double,
                             private val color:String
                             ) : BaseCoffeeMachine(price,color){

       fun makeCappuccino(){
           println("making Cappuccino")
       }

     override fun makeCoffee(){
         println("making Cappuccino")
     }
 }