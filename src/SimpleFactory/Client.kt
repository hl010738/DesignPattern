package SimpleFactory

/*
    简单工厂模式 Simple Factory
 */

fun main(args: Array<String>) {
    var product: Product

    product = SimpleFactory.getProduct("ABC")!!
    product.show()

    product = SimpleFactory.getProduct("123")!!
    product.show()

}