package AbstractFactory

class ConcreteFactory2: AbstractFactory(){
    override fun createProductA(): AbstractProductA {
        return ProductA2()
    }

    override fun createProductB(): AbstractProductB {
        return ProductB2()
    }
}