package Iterator

/*
    迭代器模式 Iterator Pattern
 */

fun main(args: Array<String>) {
    var aggregate = ConcreteAggregate()

    aggregate[0] = "a"
    aggregate[1] = "b"
    aggregate[2] = "c"
    aggregate[3] = "d"

    var iterator = aggregate.createIterator()

    println("First element: ${iterator.first()}")

    while (iterator.hasNext()){
        println(iterator.next())
    }

}