package Visitor

class ConcreteElementB: Element(){
    override fun accept(visitor: Visitor) {
        visitor.visitConcreteElementB(this)
    }
}