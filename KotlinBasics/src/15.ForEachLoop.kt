fun main(){
    val list= listOf("Ashiq","Suhail","Azar")
    println(list)

    list.forEach { name->
        println(name)
    }

    list.forEach { name->
        if (name=="Ashiq")
            println(true)
    }
    println("&&&&&**")
    list.forEachIndexed{index, name ->
        println(index)
        println(name)
    }
}