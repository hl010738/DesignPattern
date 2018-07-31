package Builder

class ConcreteBuilderB: Builder(){

    private var product = Product()

    override fun buildPartA() {
        product.add("part x")
    }

    override fun buildPartB() {
        product.add("part y")
    }

    override fun getResult(): Product {
        return product
    }
}