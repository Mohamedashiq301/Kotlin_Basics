//fun main(){
//    val Operations=Operations(2,5)
//    println(Operations.add())
//    println(Operations.sub())
//    println(Operations.mul())
//    println(Operations.div())
//}
//open class BaseOperations(val numBer1:Int,val numBer2:Int){
//    open fun add()=numBer1+numBer2
//    open fun sub()=numBer1-numBer2
//    open fun mul()=numBer1*numBer2
//    open fun div()=numBer1/numBer2
//}
//
//class Operations(val NUMOne:Int,val NUMTwo:Int):BaseOperations(NUMOne,NUMTwo){
//
//}

fun main(){
    val Operations=Operations(2,5,10)
    println(Operations.add())
    println(Operations.sub())
    println(Operations.mul())
    println(Operations.div())
}
open class BaseOperations(val numBer1:Int,val numBer2:Int){
    open fun add()=numBer1+numBer2
    open fun sub()=numBer1-numBer2
    open fun mul()=numBer1*numBer2
    open fun div()=numBer1/numBer2
}

class Operations(val NUMOne:Int,val NUMTwo:Int,val NUMThree:Int):BaseOperations(NUMOne,NUMTwo){
    override fun add(): Int {
        return NUMOne.plus(NUMTwo).plus(NUMThree)
    }

    override fun sub(): Int {
        return NUMOne.minus(NUMTwo).minus(NUMThree)
    }

    override fun mul(): Int {
        return NUMOne*NUMTwo*NUMThree
    }

    override fun div(): Int {
        return NUMOne/NUMTwo/NUMThree
    }
}