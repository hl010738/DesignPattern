package Memento


/*
    备忘录模式 Memento
 */

fun main(args: Array<String>) {
    var originator = Originator("zhangsan", "123456", 12.5)

    println(originator.toString())

    var careTaker = CareTaker()
    careTaker.memento = originator.saveMemento()

    originator.name = "lisi"
    originator.phone = "654321"
    originator.buget = 22.6

    println(originator.toString())

    originator.restoreMemento(careTaker.memento)
    println(originator)
}