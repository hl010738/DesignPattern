package ChainOfResponsibility

class ConcreteHandlerC: Handler(){
    override fun handlerRequest(request: Int) {
        if (request in 21 .. 30){
            println("${this.javaClass.name} handles $request")
        } else if (null != handler){
            this.handler.handlerRequest(request)
        }
    }

}