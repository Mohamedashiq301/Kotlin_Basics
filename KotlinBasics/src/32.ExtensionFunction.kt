//fun main() {
//    val NumBOne = 10
//    val NumBTwo = 20
//    val NumBThree = 30
//    val NumBFour = 40
//
//    println("Addition is ${NumBOne + NumBTwo}")
//    println("Subtraction is ${NumBOne - NumBTwo}")
//    println("Multiplication is ${NumBOne * NumBTwo}")
//
//    println("Addition is ${NumBThree + NumBFour}")
//    println("Subtraction is ${NumBThree - NumBFour}")
//    println("Multiplication is ${NumBThree * NumBFour}")
//
//
//}

fun main(){
    val number=10
    number.airthmetic(20)
}
fun Int.airthmetic(numBER:Int){
    println("Addition is ${this+numBER}")
    println("Subtraction is ${this-numBER}")
    println("Mulpiction is ${this*numBER}")
}