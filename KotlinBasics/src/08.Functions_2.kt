fun main(){
    println(greeting("Hey","Ashiq"))
    println(greeting("Hi","Ashiq"))
    println(greeting("How r u","Ashiq"))

    println(greetings("How r u","Suhail"))
}
fun greeting(greet:String,name:String):String{
    return "$greet $name"
}

fun greetings(greet: String,name: String)="$greet $name"