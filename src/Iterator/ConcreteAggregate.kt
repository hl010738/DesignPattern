package Iterator

class ConcreteAggregate: Aggregate(){

    private var list = mutableListOf<Any>()

    var count: Int = 0
        get() = this.list.size

    override fun createIterator(): Iterator {
        return ConcreteIterator(this)
    }

    override fun getAggregate(index: Int) = list[index]

    override fun setAggregate(index: Int, any: Any){
        list.add(index, any)
    }

}