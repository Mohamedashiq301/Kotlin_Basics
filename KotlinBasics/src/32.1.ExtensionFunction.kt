fun main(){
    "Ashiq".midvalue()
}
fun String.midvalue(){
    if (this.length%2==0){
        println("It has no mid value")
    }else{
        println(this[this.length%2])
    }
}