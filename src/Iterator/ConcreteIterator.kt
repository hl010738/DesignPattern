package Iterator

class ConcreteIterator(aggregate: ConcreteAggregate): Iterator(){

    private var aggregate: ConcreteAggregate = aggregate

    private var position: Int = 0

    override fun first(): Any? {
        return aggregate.getAggregate(0)
    }

    override fun next(): Any? {
        return aggregate.getAggregate(position++)
    }

    override fun hasNext(): Boolean {
        return position != aggregate.count
    }

    override fun currentItem(): Any? {
        return aggregate.getAggregate(position)
    }
}