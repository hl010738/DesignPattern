package observer

class ConcrecteOberver: Observer{
    override fun update(any: Any) {
        println("Recieve: $any")
    }
}