

class ArrayUtils<T>(private val array: Array<T>){
    fun findElement(element:Int,foundElement:(index:Int,element:T?)-> Unit){
        for (i in array.indices){
            if(array[i] == element){
                foundElement(i,array[i])
                return
            }
        }
        foundElement(-1,null)
        return
    }

}