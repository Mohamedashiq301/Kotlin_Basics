fun main(){
    var number=10
    var numberdouble=10.0
    println(number)
    println(numberdouble)

    var number1=10
    var numberdouble1=number1.toDouble()
    println(numberdouble1)

    var num1=10
    var num2=20
    println(num1.plus(num2))


    var firstName="Mohamed"
    var lastName="Ashiq"
    var fullName="$firstName $lastName"
    println(fullName)
    println(firstName.length)
    println(firstName[0])
    println(firstName.toLowerCase())

    var details="""
        Mohamed
        Ashiq
        Engineer
        """.trimIndent()
    println(details)


}