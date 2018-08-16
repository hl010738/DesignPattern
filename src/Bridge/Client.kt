package Bridge

/*
    桥接模式 Bridge
 */

fun main(args: Array<String>) {

    var implementer: Implementer = ConcreteImplementerA()

    var abstraction: Abstraction = RefinedAbstractionA()

    abstraction.implementer = implementer

    abstraction.method("ABC")

    implementer = ConcreteImplementerB()

    abstraction = RefinedAbstractionB()

    abstraction.implementer = implementer

    abstraction.method("123")
}