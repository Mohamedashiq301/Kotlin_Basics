//fun main() {
//    val addition = DoADDITION()
//    println(addition(2, 3))
//}
//
//fun DoADDITION(): (Int, Int) -> Int {
//    return ::addNumBers
//}
//
//fun addNumBers(numbOne: Int, numbTwo: Int) {
//    numbOne.plus(numbTwo)
//}


fun main(){

    printMyName {
        println("Ashiq")
    }
}
fun printMyName(print:()->Unit){
    print()
}