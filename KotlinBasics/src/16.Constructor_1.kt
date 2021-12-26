fun main(){
    val Human1=Human(age = 25, fname = "Mohamed", lname = "Ashiq")
    println(Human1.myage)
    println(Human1.fullname)

    val Human2=Human(age = 23, fname = "Jaffer", lname = "Sadiq")
    println(Human2.myage)
    println(Human2.fullname)
}

//Primary Constructor
class Human(val age:Int,val fname:String,val lname:String){

    var myage=age

    val fullname="$fname $lname"
}