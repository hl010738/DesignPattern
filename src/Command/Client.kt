package Command


/*
    Command Pattern 命令模式
 */

fun main(args: Array<String>) {
    var receiver = Receiver()
    var command = ConcreteCommand(receiver)
    var invoker = Invoker()

    invoker.setCommand(command)
    invoker.executeCommand()  //执行相应的命令
}