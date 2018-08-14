package Adapter.Inherit

open class ConcreteAdaptee(): Adaptee{
    override fun output() {
        println("From Concrete Adaptee")
    }
}