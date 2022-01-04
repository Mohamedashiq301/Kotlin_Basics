fun main() {

    Event<String>("Ashiq")
    Event(256)
    Event(true)
    Event<String>()
}

class Event<T>(value: T? = null) {
    init {
        if (value != null) {
            println(value.toString().length)
        } else {
            println("Empty String")
        }
    }
}