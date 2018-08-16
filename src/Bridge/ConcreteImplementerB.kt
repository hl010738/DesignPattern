package Bridge

class ConcreteImplementerB: Implementer{
    override fun doSomething(string: String) {
        println("$string doSomething at ConcreteImplementerB")
    }
}