package Composite.SaveMode

class Composite: Component {

    var list = mutableListOf<Component>()

    fun add(component: Component){
        list.add(component)
    }

    fun remove(component: Component){
        list.remove(component)
    }

    fun getAll(): List<Component>{
        return list
    }

    override fun dosomething() {
        println("Composite")
        list.forEach { it.dosomething() }
    }
}