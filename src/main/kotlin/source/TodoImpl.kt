package source

import data.TodoModel

class TodoImpl : ITodo {

    val todoList = mutableListOf<TodoModel>()

    override val completed: Boolean
        get() = false

    override val getTodoList: MutableList<TodoModel>
        get() = todoList

    override fun addTodo(todoModel: TodoModel) {
        todoList.add(todoModel)
    }

    override fun deleteTodo(id: Int) {
        todoList.removeAt(id)
    }

    override fun getSingleTodo(id: Int) {
        todoList[id]
    }

    override fun deleteTodos(todoModel: TodoModel) {
        todoList.remove(todoModel)
    }

    override fun toString(): String {
        val stringBuilder = StringBuilder()
        for (item in todoList) {
            stringBuilder.append(item.toString())
        }
        return stringBuilder.toString()
    }
}