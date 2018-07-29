package Mediator

abstract class Colleague(name: String) {
    var mediator = ConcreteMediator()

    var name: String = name

    fun send(to: String, message: String){
        mediator.send(name, to, message)
    }

    open fun receive(from: String, message: String){

        println("$from to $name : $message")

    }
}