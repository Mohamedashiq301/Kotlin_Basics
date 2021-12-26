fun main(){
    //Inheriting-from its parent
    val addition=Addition(20,30,25)
    println(addition.add())

}
open class BaseAddition(val NUM1:Int,val NUM2:Int){
    open fun add()=NUM1+NUM2
}

class Addition(val NUMBER1:Int,val NUMBER2:Int,val NUMBER3:Int):BaseAddition(NUMBER1,NUMBER2){
    override fun add(): Int {
        return NUMBER1.plus(NUMBER2).plus(NUMBER3)
    }
}
