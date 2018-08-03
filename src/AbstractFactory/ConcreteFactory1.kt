package AbstractFactory

class ConcreteFactory1: AbstractFactory(){
    override fun createProductA(): AbstractProductA {
        return ProductA1()
    }

    override fun createProductB(): AbstractProductB {
        return ProductB1()
    }
}