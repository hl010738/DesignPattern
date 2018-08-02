package FactoryMethod

class ConcreteProductB: Product{
    override fun call() {
        println("${this.javaClass.name} call invoked")
    }

}