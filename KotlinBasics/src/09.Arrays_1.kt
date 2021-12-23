import java.util.*

fun main() {
    val array = arrayOf(1, 2, 3, 4, 5)
    val sumofArray = array.sum()
    println(sumofArray)
    println(array.maxOrNull())
    println(array.minOrNull())
    println(array.count())
//for sorting array
    val array1 = arrayOf(1, 2, 98, 70, 100, 3002, 200)
    val sortedarray=array1.sortedArray()
    println(Arrays.toString(sortedarray))

    //where we need to find an element which is divisible by 100
    val number=array1.find {
        it %100==0
    }
    println(number)
}