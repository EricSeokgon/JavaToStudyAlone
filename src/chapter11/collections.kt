package chapter11

fun main() {
    val items = listOf("apple", "banana", "kiwi")
    for (item in items) {
        println(item)
    }

    val items2 = listOf("apple", "banana", "kiwi")
    when {
        "orange" in items2 -> println("juicy")
        "apple" in items2 -> println("apple is fine too")
    }
}