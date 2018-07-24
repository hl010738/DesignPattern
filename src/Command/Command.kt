package Command

abstract class Command(receiver: Receiver){
    open var receiver = Receiver()

    init {
        this.receiver = receiver
    }

    abstract fun execute()
}