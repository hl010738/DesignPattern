package Composite.TransparentMode

interface Component {
    fun dosomething()

    fun add(component: Component)

    fun remove(component: Component)

    fun getAll(): List<Component>?
}