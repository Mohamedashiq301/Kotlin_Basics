import java.util.*

fun main(){
    val array= arrayOf(1,2,3,4)
    println(Arrays.toString(array))
    println(array[0])
    println(array[3])

    println(array.first())
    println(array.last())

    array.set(1,20)
    println(Arrays.toString(array))

    println(array.indexOf(4))
}