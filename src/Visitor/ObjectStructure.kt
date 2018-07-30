package Visitor

class ObjectStructure{
    var list = arrayListOf<Element>()

    fun attach(element: Element){
        list.add(element)
    }

    fun detach(element: Element){
        list.remove(element)
    }

    fun accept(visitor: Visitor){
        list.forEach { it.accept(visitor) }
    }
}