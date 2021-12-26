//fun main(){
//    val userOne=USer("Ashiq")
//    val userTwo=USer("Ashiq")
//    println(userOne)
//    println(userTwo)
//}
//class USer(val name:String)

//but for data

fun main(){
    val userOne=USer("Ashiq")
    //val userTwo=USer("Ashiq")
    println(userOne)
    //println(userTwo)
    //println(userOne==userTwo)

    println(userOne.component1())
    println(userOne.component2())

    val userTwo=userOne.copy(age = 45)
    println(userTwo)

    val (uName,age)=userOne
    println(uName)
    println(age)
}
data class USer(val name:String,val age:Int=30)