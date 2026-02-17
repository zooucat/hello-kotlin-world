package p06_loop

fun main() {
    /*
    List<Long> numbers = Arrays.asList(1L, 2L, 3L);
    for (long number : numbers) {
        System.out.println(number);
    }
     */
    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers) {
        println(number)
    }

    /*
    for (int i = 1;  i <= 3; i++) {
        System.out.println(i);
    }
     */
    for (i in 1..3) {
        println(i)
    }

    /*
    for (int i = 3; i >= 1; i--) {
        System.out.println(i);
    }
     */
    for (i in 3 downTo 1) {
        println(i)
    }

    /*
    for (int i = 1; 1 <= 5; i += 2) {
        System.out.println(i);
    }
     */
    for (i in 1..5 step 2) {
        println(i)
    }

    /*
    int i = 1;
    while (i <= 3) {
        System.out.println(i);
        i++;
    }
     */
    var i = 1;
    while (i <= 3) {
        println(i)
        i++
    }
}
