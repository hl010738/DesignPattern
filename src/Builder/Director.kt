package Builder

class Director{
    fun build(builder: Builder){
        builder.buildPartA()
        builder.buildPartB()
    }
}