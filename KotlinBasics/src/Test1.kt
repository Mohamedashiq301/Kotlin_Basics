import java.util.*

fun main(){
    val arr= arrayOf(5, 1, 1, 9, 7, 2, 6, 10)
    println(arr.contains(7))
    println(arr.indexOf(7))

    val arr2= arrayOf(-1,1,5,6,7)
    println(arr2.contains(-2))
    println(arr2.indexOf(-2))

    var pi=3.14
    pi= 2.0
    println(pi)

    var a: String ?= "abc"
    a = null
    print(a?.length)


}