package Iterator

class ConcreteAggregate: Aggregate(){

    private var list = mutableListOf<Any>()

    var count: Int = 0
        get() = this.list.size

    override fun createIterator(): Iterator {
        return ConcreteIterator(this)
    }


    operator fun set(index: Int, any: Any){
        this.list.add(index, any)
    }

    operator fun get(index: Int): Any{
        return this.list[index]
    }
}

