package Decorator

class ConcreteComponent: Component{
    override fun doSomething() {
        println("do something invoked in Concrete Component")
    }
}