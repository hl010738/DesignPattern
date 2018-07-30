package Visitor

class ConcreteVisitorB: Visitor(){
    override fun visitConcreteElementA(concreteElementA: ConcreteElementA) {
        println("${concreteElementA.javaClass.name} visited by ${this.javaClass.name}")
    }

    override fun visitConcreteElementB(concreteElementB: ConcreteElementB) {
        println("${concreteElementB.javaClass.name} visited by ${this.javaClass.name}")
    }
}