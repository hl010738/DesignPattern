package FactoryMethod

class ConcreteProductA: Product{
    override fun call() {
        println("${this.javaClass.name} call invoked")
    }
}