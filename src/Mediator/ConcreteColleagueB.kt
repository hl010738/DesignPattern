package Mediator

class ConcreteColleagueB(name: String): Colleague(name){
    override fun receive(from: String, message: String) {
        println("To ConcreteColleagueB:")
        super.receive(from, message)
    }
}