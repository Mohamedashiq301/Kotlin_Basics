fun main(){
    val sum=numbers.add(10,20)
    println(sum)
}

class numbers(){
    companion object{
        fun add(number1:Int,Number2:Int)=number1.plus(Number2)
    }
}