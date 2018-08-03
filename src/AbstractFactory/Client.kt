package AbstractFactory

class Client(factory: AbstractFactory){
    private var a: AbstractProductA = factory.createProductA()
    private var b: AbstractProductB = factory.createProductB()

    fun run(){
        b.interact(a)
    }
}

/*
    抽象工厂模式 Abstract Factory
 */

fun main(args: Array<String>) {
    var factory1 = ConcreteFactory1()
    var client1 = Client(factory1)
    client1.run()

    var factory2 = ConcreteFactory2()
    var client2 = Client(factory2)
    client2.run()
}