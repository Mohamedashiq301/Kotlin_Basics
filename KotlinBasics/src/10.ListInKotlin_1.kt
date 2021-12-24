fun main(){
    val list= mutableListOf(5,6,7,8,9,10)

    val list1=list.map {
        it*it
    }
    println(list1)

    val evenList=list.filter {
        it %2==0
    }
    println(evenList)

    val oddList=list.filter {
        it %2!=0
    }
    println(oddList)

    //slices
    //position-index
    val newlist=list.slice(indices = 0..3)
    println(newlist)

    val newlist1=list.subList(0,3)
    println(newlist1)

    val newlist2=list.take(n = 5)
    println(newlist2)

    val newlist3=list.takeLast(n=5)
    println(newlist3)

    println(list.elementAtOrNull(index = 8))
    println(list[0])

    val elist= emptyList<Int>()
    println(elist.isEmpty())
    println(list.isEmpty())
}