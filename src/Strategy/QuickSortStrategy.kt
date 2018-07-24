package Strategy

class QuickSortStrategy: Strategy{
    override fun sort(list: MutableList<Int>) {
        println("Quick Sort Strategy invoked")
        list.sorted()
    }

}