package Builder

class ConcreteBuilderA: Builder(){

    private var product = Product()

    override fun buildPartA() {
        product.add("part A")
    }

    override fun buildPartB() {
        product.add("part B")
    }

    override fun getResult(): Product {
        return product
    }
}