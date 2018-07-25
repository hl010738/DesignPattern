package Iterator

/*
    迭代器模式 Iterator Pattern
 */

fun main(args: Array<String>) {
    var aggregate = ConcreteAggregate()

    aggregate.setAggregate(0, "a")
    aggregate.setAggregate(1, "b")
    aggregate.setAggregate(2, "c")
    aggregate.setAggregate(3, "d")

    var iterator = aggregate.createIterator()

    println("First element: ${iterator.first()}")

    while (iterator.hasNext()){
        println(iterator.next())
    }

}