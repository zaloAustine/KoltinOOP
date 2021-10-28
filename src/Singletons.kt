

class Manager private constructor(){

    companion object{
        private var instance:Manager? = null

        fun getInstance() = synchronized(this){
            if(instance == null){
                instance = Manager()
            }else{
                instance
            }
        }
    }
}