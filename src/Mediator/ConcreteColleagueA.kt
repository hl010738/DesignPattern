package Mediator

class ConcreteColleagueA(name: String): Colleague(name){
    override fun receive(from: String, message: String) {
        println("To ConcreteColleagueA:")
        super.receive(from, message)
    }
}