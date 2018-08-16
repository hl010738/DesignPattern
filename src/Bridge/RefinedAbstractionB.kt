package Bridge

class RefinedAbstractionB: Abstraction(){
    override fun method(string: String) {
        this.implementer.doSomething(string)
    }
}