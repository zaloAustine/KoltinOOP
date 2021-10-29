
sealed class Data{
    data class Success(val data:String):Data()
    data class Error(val error:String):Data()
    object Loading :Data()
}


fun getData():Data{
    return Data.Success("data")
}