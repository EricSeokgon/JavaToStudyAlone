package chapter11

fun main() {
    val x = 3
    if (x in 1..10) {
        println("fits in range")
    }
    for (x in 1..5) {
        print(x)
    }
}