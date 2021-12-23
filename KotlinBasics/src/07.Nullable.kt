fun main(){
    var name="Ashiq"
    println(name)
    //?
    var fname:String?="Ashiq"
    println(fname)
    fname=null
    println(fname)
    //This is nullable type

    var fullname:String?="Mohamed Ashiq"
    println(fullname?.length)

    fullname=null
    println(fullname?.length)

    if (fullname!=null){
        println("Not null")
    }else{
        println("Null")
    }

    //Elvis operation

    val length: Int? =fullname?.length?:0
    println(length)
}