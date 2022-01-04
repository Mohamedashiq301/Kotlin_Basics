fun main() {
    Events<String, Int>("Ashiq", 256)
    Events(3513,"Ashiq")
    Events<String,String>("MohamedAshiq","Ashiq")
}

class Events<T, V>(value: T? = null, Data: V) {
    init {
        if (value != null) {
            println(value.toString().length)
            println(Data.toString().length)
        } else println("Empty String")
    }
}