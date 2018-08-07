package SimpleFactory

abstract class Product {
    lateinit var name: String
    lateinit var password: String
    lateinit var type: String

    fun show(){
        println("name: $name")
        println("password: $password")
        println("type: $type")
    }
}