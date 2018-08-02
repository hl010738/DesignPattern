package FactoryMethod

/*
    工厂方法模式 Factory Pattern
 */

fun main(args: Array<String>) {
    var product: Product
    var factory: Factory

    factory = ConcreteFactoryA()
    product = factory.createProduct()
    product.call()

    factory = ConcreteFactoryB()
    product = factory.createProduct()
    product.call()
}