package Command

class  ConcreteCommand(receiver: Receiver): Command(receiver){
    override fun execute() {
        this.receiver.action()
    }
}