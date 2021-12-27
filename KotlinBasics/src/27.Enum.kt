//fun main(){
//    //Enum means Enumeration
//    val StudentOne=Student("Ashiq",StudentType.MALE)
//    val StudentTwo=Student("Sweety",StudentType.FEMALE)
//}
//
//class Student(val name:String,val type:StudentType){
//    init {
//        println("$name is $type")
//    }
//}
//enum class StudentType{
//    MALE,
//    FEMALE
//}

fun main(){
    val StudentOne=Student("Ashiq",StudentType.MALE)
    val StudentTwo=Student("Sweety",StudentType.FEMALE)
}

class Student(val name:String,val type:StudentType){
    init {
        println("$name is ${type.type}")
    }
}

//male,female
enum class StudentType(val type:String){
    MALE(type = "male"),
    FEMALE(type = "female")
}