fun main(){
    //Loops-going through again and again untill condition is matched
    //For/Which

    val list= listOf("Ashiq","Suhail","Azar")
    //println(list)

    for (name in list){
        println(list)
    }

    for (number:Int in 0..100){
        print(number)
    }
    println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&")
    for (number:Int in 0 until 100){
        print(number)
    }
    println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&")
    for (number:Int in 0 until 100 step 5){
        print(number)
    }
    println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&")
    for (number:Int in 0 until 100 step 7){
        println(number)
    }
    println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&")
    for (number:Int in 100 downTo 0 step 2){
        println(number)
    }
    println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&")
    for (index in list.indices){
        println(list[index])
    }
    println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&")
    for ((index,value) in list.withIndex()){
        println(index)
        println(value)
    }
}