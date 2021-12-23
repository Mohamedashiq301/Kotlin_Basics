fun main(){
    SayHi()
    SayHi("Ashiq")

    var heybye:String=SayBye()
    println(heybye)
}
fun SayHi(){
    println("Hey")
}
fun SayHi(name:String){
    println(name)
}

fun SayBye():String{
    return "HeyBye"
}
