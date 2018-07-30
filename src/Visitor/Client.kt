package Visitor


/*
    访问者模式 Visitor
 */

fun main(args: Array<String>) {
    var objectStructure = ObjectStructure()

    objectStructure.attach(ConcreteElementA())
    objectStructure.attach(ConcreteElementB())

    var a: Visitor = ConcreteVisitorA()
    var b: Visitor = ConcreteVisitorB()

    objectStructure.accept(a)

    objectStructure.accept(b)
}