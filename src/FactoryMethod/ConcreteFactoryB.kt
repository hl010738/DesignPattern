package FactoryMethod

class ConcreteFactoryB: Factory{
    override fun createProduct(): Product {
        var concreteProductB = ConcreteProductB()
        println("${this.javaClass.name} created ${concreteProductB.javaClass.name}")
        return concreteProductB
    }
}