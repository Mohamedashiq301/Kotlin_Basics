fun main(){
    val Humans=Humans(fullname = "Mohamed Ashiq")
    val HumansOne=Humans(age = 26)
    val HumansTwo=Humans("Mohamedashiq","Erode")
}
class Humans{
    constructor(fullname:String){
        println(fullname)
    }
    constructor(age:Int){
        println(age)
    }
    constructor(userName:String,Address:String){
        println(userName)
        println(Address)
    }
}