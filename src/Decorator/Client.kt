package Decorator

/*
    装饰模式 Decorator
 */

fun main(args: Array<String>) {
    var decorator = ConcreteDecoratorA(ConcreteDecoratorB(ConcreteComponent()))

    decorator.doSomething()
}