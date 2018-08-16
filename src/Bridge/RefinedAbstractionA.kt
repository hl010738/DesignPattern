package Bridge

class RefinedAbstractionA: Abstraction(){
    override fun method(string: String) {
        this.implementer.doSomething(string)
    }
}