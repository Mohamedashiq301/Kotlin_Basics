//fun main(){
//    val numbers= mutableListOf("One","Two","Three","Four","Five")
//    val resultnumbers=numbers.map { it.length }.filter { it>3 }
//    println(resultnumbers)
//}

fun main(){
    val numbers= mutableListOf("one","two","three","four","five")
    numbers.map { it.length }.filter { it>3 }.let {
        println(numbers)
    }

    val nullable:String?="null"
    nullable.let {
        println(nullable)
    }

    if (nullable!=null){
        println("Nullable String")
    }
}