package p01_variable

fun main() {
    var number1 = 10L // long number1 = 10L;
    number1 = 5L

    val number2 = 10L // final long number2 = 10L;
//    number2 = 5L 수정 불가

    var number3: Long? = 1_000L // Long number3 = 1_000L;
    number3 = null

    var person: Person = Person("최윤정") // Person person = new Person("최윤정");
}

class Person(var name: String) {

}