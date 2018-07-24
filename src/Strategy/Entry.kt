package Strategy

/*
    Strategy Pattern 策略模式
 */
fun main(args: Array<String>) {
    var context = Context()

    context.add(1)
    context.add(9)
    context.add(-3)
    context.add(-1)

    //context.setStrategy(QuickSortStrategy())
    context.setStrategy(BubbleSortStrategy())
    context.sort()
    context.display()
}