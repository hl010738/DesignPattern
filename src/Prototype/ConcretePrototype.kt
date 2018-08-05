package Prototype

class ConcretePrototype(id: String): Prototype(id){

    init {
        this.id = id
    }

    override fun clone(): Prototype {
        return ConcretePrototype(this.id)
    }
}