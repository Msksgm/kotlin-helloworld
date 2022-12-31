package hellowrldkotlin

class Greed (val name: String){
    fun hello(){
        println("Hello $name")
    }
}

fun main(args: Array<String>) {
    val greed = Greed("Kotlin")
    greed.hello()
}
