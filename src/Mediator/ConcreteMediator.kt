package Mediator

class ConcreteMediator: Mediator{

    private var map = mutableMapOf<String, Colleague>()

    override fun register(colleague: Colleague) {
        if(!map.contains(colleague.name)){
            map[colleague.name] = colleague
        }
        colleague.mediator = this
    }

    override fun send(from: String, to: String, message: String) {
        var colleague = map[to]

        if(null != colleague){
            colleague.receive(from, message)
        }
    }

}