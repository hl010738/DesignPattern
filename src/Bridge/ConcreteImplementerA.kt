package Bridge

class ConcreteImplementerA: Implementer{
    override fun doSomething(string: String) {
        println("$string doSomething at ConcreteImplementerA")
    }
}