package todo

import source.TodoImpl
import data.TodoModel

class TodoService() {

    val todoModel = TodoImpl()

    fun addTodo(todoTitle: String) {
        val id = 1
        val newTodo = TodoModel(todoTitle, id)
        todoModel.addTodo(newTodo)
        incrementId()
    }

    fun deleteTodos(id: Int) {
        todoModel.deleteTodo(id)
        incrementId()
    }

    fun markAsCompleted(id: Int) {
        todoModel.getSingleTodo(id)
    }


    private fun incrementId() {
        var id = 1
        for (i in todoModel.getTodoList) {
            i.id = id
            id = id.inc()
        }
    }
}