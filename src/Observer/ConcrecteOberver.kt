package Observer

class ConcrecteOberver: Observer{
    override fun update(any: Any) {
        println("Recieve: $any")
    }
}