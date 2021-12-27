fun main(){

    //pair-collection 2 variables
    //triple-collection of three variables

    val pair=Pair<String,String>("Mohamed","Ashiq")
    val pairTwo=Pair<String,Int>("Ashiq",26)
    val list=pairTwo.toList()

    println(pair)
    println(pair.first)
    println(pair.second)
    println(list)

    val triple=Triple<String,String,Int>("Mohamed","Ashiq",26)
    val listOne=triple.toList()
    println(triple)
    println(triple.first)
    println(triple.second)
    println(triple.third)
    println(listOne[0])
    println(listOne[1])
    println(listOne[2])

}