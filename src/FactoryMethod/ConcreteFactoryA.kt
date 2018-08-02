package FactoryMethod

class ConcreteFactoryA: Factory{
    override fun createProduct(): Product {
        var concreteProductA = ConcreteProductA()
        println("${this.javaClass.name} created ${concreteProductA.javaClass.name}")
        return concreteProductA
    }
}