package Adapter.Composit

class Adapter(adaptee: Adaptee): Target{

    var adaptee = adaptee

    override fun doSomething() {
        adaptee.output()
    }
}