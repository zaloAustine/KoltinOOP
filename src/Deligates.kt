import kotlin.properties.Delegates

class StudentHeavy {

}

class Student{
    // only called when accessed
    val heavy by lazy {StudentHeavy()}

    var marks:Int by Delegates.observable(50){_,old,new  ->
        println("old : $old new : $new")
    }

    var age:Int by Delegates.vetoable(12){_,old,new ->
        println("old : $old new : $new")
        new >= 40
    }
}

class Test{
    fun test(){
        val student = Student()
        student.heavy

    }
}