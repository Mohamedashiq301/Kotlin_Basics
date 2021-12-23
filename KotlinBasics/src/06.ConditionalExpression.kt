fun main(){
    var age=25

    if (age<=20){
        println("Kid")
    }else if (age>=20 && age<=50){
        println("Adult")
    }else{
        println("Old")
    }

    var age1=60
    var type:String

    if (age1<20){
        type="kid"
    }else if (age1>20 && age1<50){
        type="Adult"
    }else {
        type="Old"
    }
    println(type)


    var age2=35
    var type1:String

    type1=if (age2<20){
        "Kid"
    }else if (age2>20 && age2<50){
        "Adult"
    }else{
        "Old"
    }
    println(type1)

    type=when(age){
        10->"Ten"
        25->"TwentyFive"
        else->"No valid number"
    }
    println(type)

}