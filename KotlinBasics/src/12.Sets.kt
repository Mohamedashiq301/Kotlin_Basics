fun main(){
    //set is like list
    //Set is a collection of unique datas

    val name= setOf("Ashiq","MindOrks","Student")
    println(name)

    val cities= mutableSetOf("Erode","Coimbatore")
    println(cities)
    cities.add("Tirupur")
    println(cities)

    println(name union cities)
    println(name intersect cities)
}