package AbstractFactory

class ProductB1: AbstractProductB(){
    override fun interact(a: AbstractProductA) {
        println("${this.javaClass.name} interact with ${a.javaClass.name}")
    }
}