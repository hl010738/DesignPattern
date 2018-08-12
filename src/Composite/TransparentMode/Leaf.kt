package Composite.TransparentMode

class Leaf: Component {
    override fun add(component:  Component) {
    }

    override fun remove(component: Component) {
    }

    override fun getAll(): List<Component>? {
        return null
    }

    override fun dosomething() {
        println("Leaf")
    }
}