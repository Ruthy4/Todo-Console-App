package data

enum class TodoState(val value: String) {
    ADD("a"),
    GET("g"),
    DELETE("d"),
    COMPLETED("c"),
    EXIT("exit")
}