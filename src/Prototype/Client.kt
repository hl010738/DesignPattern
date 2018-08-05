package Prototype


/*
    原型模式 Prototype
 */

fun main(args: Array<String>) {

    var c1 = ConcretePrototype("A")
    var c2 = c1.clone() as ConcretePrototype

    println("Cloned: ${c2.id}")
}