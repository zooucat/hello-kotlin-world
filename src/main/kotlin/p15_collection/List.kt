package p15_collection

/*
final List<Integer> numbers = Arrays.asList(100, 200);

// 하나를 가져오기
System.out.println(numbers.get(0));

// for each
for (int number : numbers) {
    System.out.println(number);
}

// 전통적인 for문
for (int i = 0; i < numbers.size(); i++) {
    System.out.printf("%s %s", i, numbers.get(i));
}
 */

fun main() {
    // 불변
    val numbers1 = listOf(100, 200)

    println(numbers1[0])

    for (number in numbers1) {
        println(number)
    }

    for ((index, value) in numbers1.withIndex()) {
        println("$index $value")
    }

    // 가변
    val numbers2 = mutableListOf(100, 200)
    numbers2.add(300)

    println(numbers2[2])

    for (number in numbers2) {
        println(number)
    }

    for ((index, value) in numbers2.withIndex()) {
        println("$index $value")
    }

    val emptyList = emptyList<Int>()
    printNumbers(emptyList())
}

private fun printNumbers(numbers: List<Int>) {

}
