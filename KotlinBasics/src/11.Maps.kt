fun main(){
    //Maps-Key/value pairs

    val ageMapper= mapOf("Ashiq" to 26,"suhail" to 30)
    println(ageMapper)

    println(ageMapper["Ashiq"])
    println(ageMapper.size)
    println(ageMapper.count())

    println(ageMapper.count {
        it.value>26
    })

    val newageMapper= mutableMapOf("Ashiq" to 26,"suhail" to 30)
    newageMapper.put("Azar",35)
    println(newageMapper)

    //newageMapper.clear()
    //println(newageMapper)

    newageMapper.remove("Ashiq")
    println(newageMapper)

    println(ageMapper.contains("Ashiq"))
    println(ageMapper.containsValue(30))
    println(ageMapper)

    println(newageMapper.filter {
        it.key=="Ashiq"||it.value==30
    })

    println(ageMapper.filterKeys {
        it=="Ashiq"
    })

    println(newageMapper.filterValues {
        it==30
    })
}