fun main(){
    var age=30
    if (age %2==0){
        println("Age is even")
    }else{
        println("Age is odd")
    }

    when{
        age %2==0->{
            println("Age is even")
        }
        age ==35->{
            println("Age is 35")
        }
        else-> println("Age is undefined")
    }

    var age1=35
    when(age1){
        1-> println("Age is 1")
        35-> println("Age is 35")
        else-> println("Age is undefined")
    }

    when(age1){
       in 10..20->{
            println("Teenager")
        }
       in 20..40->{
            println("Adult")
        }
        else-> println("Old")
    }
}