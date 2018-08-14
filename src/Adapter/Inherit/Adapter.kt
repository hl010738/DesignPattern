package Adapter.Inherit

class Adapter: Target, ConcreteAdaptee(){
    override fun doSomething() {
        super.output()
    }
}