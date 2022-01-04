//Here the class is taken from the RunScope of person class 

fun main(){
    val Info=PersonInfo("Mohamed","Ashiq").apply {
        this.address="XYZ"
        this.phoneNumber="123"
    }
    println(Info.toString())
}