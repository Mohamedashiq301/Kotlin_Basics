fun main(){

    //val userdetails=userDetails("Ashiq","26")

    val user:userDetails by lazy{userDetails("Ashiq","26")}
    println(user)
}

class userDetails(val FULLNAME:String,val AGE:String){
    init {
        println("My name is $FULLNAME")
        println("My age is $AGE")
    }
}