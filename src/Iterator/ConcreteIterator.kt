package Iterator

class ConcreteIterator(aggregate: ConcreteAggregate): Iterator(){

    private var aggregate: ConcreteAggregate = aggregate

    private var position: Int = 0

    override fun first(): Any? {
        return aggregate[0]
    }

    override fun next(): Any? {
        return aggregate[position++]
    }

    override fun hasNext(): Boolean {
        return position != aggregate.count
    }

    override fun currentItem(): Any? {
        return aggregate[position]
    }
}