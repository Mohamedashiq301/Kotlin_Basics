fun main(){
    val numbers= mutableListOf("one","two","three","four","five")

    val finalResults=numbers
        .map { it.length }
        .also {
            println(it)
        }
        .filter { it>3 }
    println(finalResults)
}