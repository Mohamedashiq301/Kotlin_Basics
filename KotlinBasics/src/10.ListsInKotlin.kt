fun main(){
    //lists are dynamic arrays
    //Increase and decrease the size

    //Mutable-Immutable
    //var-val

    val listone= listOf(1,2,3,4)
    //listone.add()

    val listTwo= mutableListOf(5,6,7,8)
    println(listone[0])
    println(listTwo[0])
    listTwo.add(9)
    listTwo.add(10)
    listTwo.add(11)

    println(listTwo)

    listTwo.remove(7)
    println( listTwo.contains(8))
    println(listTwo)
    println(listTwo.first())
    println(listTwo.last())

    val element=listTwo.filter {
        it %2==0
    }
    println(element)

}