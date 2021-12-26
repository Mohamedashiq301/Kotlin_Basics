fun main(){
    val windows=Windows()
    val mac=Mac()

    //println(windows.OperatingSystem())
    //println(mac.OperatingSystem())
    println(getOperatingSystem(windows))
    println(getOperatingSystem(mac))
}

fun getOperatingSystem(computer: Computer)=computer.OperatingSystem()
abstract class Computer(){
    abstract fun OperatingSystem():String
}

class Windows():Computer(){
    override fun OperatingSystem(): String {
        return "Windows"
    }
}

class Mac():Computer(){
    override fun OperatingSystem(): String {
        return "Mac"
    }
}
