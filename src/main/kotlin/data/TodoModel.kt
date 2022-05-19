package data

data class TodoModel(val title: String? = null, var id: Int, var completed: Boolean= false){
    override fun toString(): String {
        var value = " ($id) $title \n"
        if (completed) {
            value = " ($id*) $title \n"
        }

        return value
    }
    fun markComplete() {
        completed = true
    }
}
