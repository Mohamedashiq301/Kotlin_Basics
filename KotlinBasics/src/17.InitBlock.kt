fun main(){
    val person=Person("Ashiq")
}
class Person(val name:String){
    init {
        println("Initializer 2 called")
    }
    init {
        println("Initializer called")
    }
//    constructor(fullNAMe:String,age:Int):this("fullNAMe"){
//        println("Secondary constructor called")
//    }
}