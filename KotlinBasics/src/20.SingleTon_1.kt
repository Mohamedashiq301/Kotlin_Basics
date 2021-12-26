fun main(){
    //Singleton-same instance throughout
    //Object will not have init and constructor

    println(USERPROFILE.add(
        30,
        20
    ))
}

object USERPROFILE{
    fun add(numBer1:Int,numBer2:Int)=numBer1.plus(numBer2)
}