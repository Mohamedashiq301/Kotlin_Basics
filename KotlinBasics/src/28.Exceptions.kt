////fun main(){
////    //Exception
////
////    val list= listOf<Int>(1,2)
////    list[3]
////}
//
//fun main(){
//    val age=26
//    if (age<30){
//        throw (MyAgeException(age))
//    }
//}
//class MyAgeException(age:Int):Exception("$age is not valid")

fun main(){
    val age=26
    try {
        getage(age)
    }catch (e:Exception){
        println(e)
    }finally {
        println("Finally is called")
    }
    println("program is working")
}
fun getage(age: Int){
    if(age<30){
        throw MyAgeException(age)
    }
}
class MyAgeException(age:Int):Exception("$age is not valid")