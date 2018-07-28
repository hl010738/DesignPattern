package ChainOfResponsibility

class ConcreteHandlerA: Handler(){
    override fun handlerRequest(request: Int) {
        if (request in 0..10){
            println("${this.javaClass.name} handles $request")
        } else if (null != handler){
            this.handler.handlerRequest(request)
        }
    }

}