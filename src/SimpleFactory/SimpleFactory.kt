package SimpleFactory

class SimpleFactory{
    companion object {
        fun getProduct(name: String): Product?{
            return when (name) {
                "123" -> ConcreteProductB()
                "ABC" -> ConcreteProductA()
                else -> null
            }
        }
    }
}