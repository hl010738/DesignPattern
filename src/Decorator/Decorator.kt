package Decorator

abstract class Decorator(component: Component): Component{

    var component = component

    override fun doSomething() {
        this.component.doSomething()
    }
}