package p15_collection

fun main() {
    // 불변
    val numbers1 = setOf(100, 200)

    for (number in numbers1) {
        println(number)
    }

    for ((index, value) in numbers1.withIndex()) {
        println("$index $value")
    }

    // 가변
    val numbers2 = mutableSetOf(100, 200)
    numbers2.add(300)

    for (number in numbers2) {
        println(number)
    }

    for ((index, value) in numbers2.withIndex()) {
        println("$index $value")
    }
}
