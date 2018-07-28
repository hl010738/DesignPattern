package ChainOfResponsibility

class ConcreteHandlerB: Handler(){
    override fun handlerRequest(request: Int) {
        if (request in 11 .. 20){
            println("${this.javaClass.name} handles $request")
        } else if (null != handler){
            this.handler.handlerRequest(request)
        }
    }

}