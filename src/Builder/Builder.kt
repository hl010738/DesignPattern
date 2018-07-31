package Builder

abstract class Builder{
    abstract fun buildPartA()
    abstract fun buildPartB()
    abstract fun getResult(): Product
}