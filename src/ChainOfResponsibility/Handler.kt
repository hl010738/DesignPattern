package ChainOfResponsibility

abstract class Handler {

    lateinit var handler: Handler

    fun setNextHandler(handler: Handler){
        this.handler = handler
    }

    abstract fun handlerRequest(request: Int)
}