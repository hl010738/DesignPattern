package Decorator

class ConcreteDecoratorB(component: Component): Decorator(component){
    override fun doSomething() {
        super.doSomething()
        doAnotherThing()
    }

    fun doAnotherThing(){
        println("do something invoked class ConcreteDecoratorB")
    }
}