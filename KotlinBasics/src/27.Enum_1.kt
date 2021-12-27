fun main(){

    for (type in studenttype.values()){
        //println(type)
        println(type.name)
        println(type.ordinal)
    }
}

enum class studenttype (val type: String){

    MALE(type = "male"),
    FEMALE(type = "female")

}