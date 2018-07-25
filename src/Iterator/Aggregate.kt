package Iterator

abstract class Aggregate{
    abstract fun createIterator(): Iterator
    abstract fun getAggregate(index: Int): Any
    abstract fun setAggregate(index: Int, any: Any)
}