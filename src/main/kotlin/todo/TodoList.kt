package todo

import data.TodoState
import kotlin.system.exitProcess

class TodoList(val todoState: TodoState, val todoService: TodoService) {

    fun todos() {
        when(todoState) {
            TodoState.ADD -> {
                print(" New Item: ")
                val todo = readLine()!!
                todoService.addTodo(todo)
            }

            TodoState.GET -> {
                    println( todoService.todoModel)
            }

            TodoState.DELETE -> {
                print("Enter todo id: ")
                val id = readLine()!!.toInt()
                todoService.deleteTodos(id-1)
            }

            TodoState.COMPLETED -> {
                print("Enter todo id: ")
                val id = readLine()!!.toInt()
                todoService.markAsCompleted(id)
            }

            TodoState.EXIT -> {
                exitProcess(0)
            }
        }
    }
}