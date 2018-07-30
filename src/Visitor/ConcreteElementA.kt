package Visitor

class ConcreteElementA: Element(){
    override fun accept(visitor: Visitor) {
        visitor.visitConcreteElementA(this)
    }
}