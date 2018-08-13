package Proxy

class ProxySubject: Subject{

    private var realSubject = RealSubject()

    override fun request() {
        println("Before Request")
        realSubject.request()
        println("After Request")
    }
}