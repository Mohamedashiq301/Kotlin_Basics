fun main(){
    fullname("Mohamed","Ashiq")
    println(username("Mohamed","Ashiq"))
    println(add(10,20))
}
fun fullname(firstname:String,lastname:String){
    val fname="$firstname $lastname"
    println(fname)
}

fun username(Firstname: String,Lastname: String):String{
    val uname ="$Firstname $Lastname"
    return uname
}

fun add(num1:Int,num2:Int):Int{
    return num1.plus(num2)
}