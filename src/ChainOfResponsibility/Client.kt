package ChainOfResponsibility

/*
    责任链模式 Chain of Responsibility
 */

fun main(args: Array<String>) {
    var handlerA = ConcreteHandlerA()
    var handlerB = ConcreteHandlerB()
    var handlerC = ConcreteHandlerC()

    handlerA.setNextHandler(handlerB)
    handlerB.setNextHandler(handlerC)

    var list = listOf(1, 20, 5, 16, 25, 2)

    list.forEach { handlerA.handlerRequest(it) }
}