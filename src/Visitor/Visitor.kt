package Visitor

abstract class Visitor{
    abstract fun visitConcreteElementA(concreteElementA: ConcreteElementA)
    abstract fun visitConcreteElementB(concreteElementB: ConcreteElementB)
}