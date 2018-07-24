package Strategy

class BubbleSortStrategy: Strategy{
    override fun sort(list: MutableList<Int>) {
        println("Bubble Sort Strategy invoked")

        var outIndex: Int = 0
        var inIndex: Int = 0
        var temp: Int = 0
        while (outIndex < list.size) {
            inIndex = outIndex + 1
            while (inIndex < list.size) {
                if (list[outIndex] > list[inIndex]) {
                    temp = list[outIndex]
                    list[outIndex] = list[inIndex]
                    list[inIndex] = temp
                }
                inIndex++
            }
            outIndex++
        }

    }

}

