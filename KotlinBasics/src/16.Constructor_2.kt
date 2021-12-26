fun main(){
    val persons=persons("MohamedAshiq")
    println(persons.username)
}

//Primary constructor
class persons(val age:Int,val fname:String,val lname:String){

    //Secondary constructor
    constructor(fullname:String):this(0,fullname,""){
        username=fullname
    }

    var myage=age
    var username="$fname $lname"
}