fun main(){
    //Class-a blue print
    //Object-implementation of blue print

    val personOne=person()
    val personTwo=person()

    println(personOne.age)
    personOne.myage(myage = 30)
    println(personOne.age)
    personTwo.myage(myage = 35)
    println(personTwo.age)
}
//Class
class person{
    var age=0
    //Function
    fun myage(myage:Int){
        age=myage
    }
}