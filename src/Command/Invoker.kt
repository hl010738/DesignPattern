package Command

class Invoker{
    private lateinit var command: Command

    fun setCommand(command: Command){
        this.command = command
    }

    fun executeCommand(){
        this.command.execute()
    }
}