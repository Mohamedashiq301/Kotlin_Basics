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
}