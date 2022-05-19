import data.TodoState
import todo.TodoList
import todo.TodoService

fun main(args: Array<String>) {

    val todoList = TodoService()
    println("Select a command: ")
    showAllCommands()
    while (true){

        findStateByInput(readLine()!!)?.let { TodoList(it, todoList).todos() }
    }

}


fun findStateByInput(input: String): TodoState? {
    return TodoState.values().find { state -> state.value == input }
}

private fun showAllCommands() {
    println("   a              add todo \n" +
            "   d [id]         delete todo with id \n" +
            "   g              get all todos \n\n" +
            "   c [id]         mark todo with id as done/undone \n" +
            "   exit           exit")
}