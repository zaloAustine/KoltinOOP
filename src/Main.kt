
    fun main(){

        val pc = PremiumCoffeeMachine(24.6,"Black")
        val coffee = pc.makeCoffee("Cappuccino")
        val info = pc.machineInfo()

        val sc = SimpleCoffeeMachine(24.6,"Black")
        val simpleCoffee = pc.makeCoffee("Cappuccino")
        val simpleInfo = pc.machineInfo()

    }



//    abstract class
//    ...define class without actual implementation