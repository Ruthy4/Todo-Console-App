package source

import data.TodoModel

interface ITodo {

    fun addTodo(todoModel: TodoModel)

    val getTodoList : MutableList<TodoModel>

    val completed: Boolean

    fun deleteTodo(id: Int)

    fun getSingleTodo(id: Int)

    fun deleteTodos(todoModel: TodoModel)


}