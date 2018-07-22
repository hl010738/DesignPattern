package Observer

/*
    观察者模式(Observer)
 */

fun main(args: Array<String>) {

    var subject = ConcreteSubject()

    var observer1 = ConcrecteOberver()
    var observer2 = ConcrecteOberver()
    var observer3 = ConcrecteOberver()

    subject.attach(observer1)
    subject.attach(observer2)
    subject.attach(observer3)

    subject.invoke()

    println("-----------------")

    subject.detach(observer2)
    subject.detach(observer3)

    subject.invoke()
}