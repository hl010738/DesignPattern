package Mediator

interface Mediator {
    fun register(colleague: Colleague)
    fun send(from: String, to:String, message: String)
}