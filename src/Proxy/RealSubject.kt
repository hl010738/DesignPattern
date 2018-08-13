package Proxy

class RealSubject: Subject{
    override fun request() {
        println("From RealSubject")
    }
}