package Composite.TransparentMode

class Composite: Component {

    var list = mutableListOf<Component>()

    override fun add(component: Component){
        list.add(component)
    }

    override fun remove(component: Component){
        list.remove(component)
    }

    override fun getAll(): List<Component>{
        return list
    }

    override fun dosomething() {
        println("Composite")
        list.forEach { it.dosomething() }
    }
}