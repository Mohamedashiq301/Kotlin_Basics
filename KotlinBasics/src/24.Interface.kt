fun main(){
    val windows=WINDOWS()
    println(windows.OPeratingSystem())
    println(windows.buildyear())
    println(windows.buildBy())

    val mac=MAC()
    println(mac.OPeratingSystem())
    println(mac.buildyear())
    println(mac.buildBy())
}

interface Computers{
    fun OPeratingSystem():String
    fun buildyear():Int
    fun buildBy()="ABC"
}

class WINDOWS():Computers{
    override fun OPeratingSystem(): String {
        return "Windows"
    }

    override fun buildyear(): Int {
        return 2020
    }
}

class MAC():Computers{
    override fun OPeratingSystem(): String {
        return "MAC os"
    }

    override fun buildyear(): Int {
        return 2021
    }
}