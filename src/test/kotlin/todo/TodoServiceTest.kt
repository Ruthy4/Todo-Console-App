package todo

import data.TodoModel
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import source.TodoImpl

internal class TodoServiceTest {
    val todoService = TodoService()
    val todoModel = TodoImpl()

    val todo = mutableListOf(TodoModel("Eat Breakfast",1),
        TodoModel("Take a bath",2),
        TodoModel("Work",3))

    @Test
    fun `get todo item returns todo item`() {

    }

    @Test
    fun `add todo item returns successful`() {

    }

    @Test
    fun deleteTodos() {
    }

    @Test
    fun markAsCompleted() {
    }
}