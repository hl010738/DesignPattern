package Iterator

abstract class Iterator{
    abstract fun first(): Any?
    abstract fun next(): Any?
    abstract fun hasNext(): Boolean
    abstract fun currentItem(): Any?
}