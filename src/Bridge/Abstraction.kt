package Bridge

abstract class Abstraction{

    lateinit var implementer: Implementer

    abstract fun method(string: String)


}