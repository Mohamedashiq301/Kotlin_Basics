class PersonInfo(val firstName:String,val lastName:String){
    var address="UnKnown"
    var phoneNumber="Unknown"

    fun getInfo()="FirstName = $firstName \nLastName = $lastName \nAddress = $address"

    override fun toString(): String {
        return "$firstName $lastName $address $phoneNumber"
    }
}
fun main(){
    val info=PersonInfo("Mohamed","Ashiq").run {
        this.address="XYZ"
        this.getInfo()
    }
    println(info)
}