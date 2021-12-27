fun main(){

    val declaration=Declartion()
    declaration.setValue("Ashiq")
    println(declaration.getValue())
}

class Declartion(){

    lateinit var myName: String

    fun setValue(name:String){
        myName=name
    }

    fun getValue()=if (::myName.isInitialized)myName else "Not initialized"
}