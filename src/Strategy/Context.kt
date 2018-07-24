package Strategy

class Context{
    private var list: MutableList<Int> = mutableListOf()
    private lateinit var strategy: Strategy

    fun setStrategy(strategy: Strategy){
        this.strategy = strategy
    }

    fun sort(){
        this.strategy.sort(this.list)
    }

    fun add(i: Int){
        list.add(i)
    }

    fun display(){
        this.list.forEach { println(it) }
    }
}