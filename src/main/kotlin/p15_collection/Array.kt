package p15_collection

/*
int[] array = {100, 200};

for (int i = 0; i < array.length; i++) {
    System.out.printf("%s %s", i, array[i]);
}
 */

fun main() {
    var array = arrayOf(100, 200)
    array = array.plus(300)

    for (i in array.indices) {
        println("$i ${array[i]}")
    }

    for ((index, value) in array.withIndex()) {
        println("$index $value")
    }
}
