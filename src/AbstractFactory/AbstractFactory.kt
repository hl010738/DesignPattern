package AbstractFactory

abstract class AbstractFactory{
    abstract fun createProductA(): AbstractProductA
    abstract fun createProductB(): AbstractProductB
}