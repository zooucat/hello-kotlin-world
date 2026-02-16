package p03_type

fun main() {/*
    코틀린은 타입변환을 명시적으로 해야 한다
    int number1 = 3
    long number2 = number1
    number1 + number2 가능
     */
    val number1 = 3
    val number2: Long = number1.toLong()
    println(number1 + number2)

    val number3 = 3
    val number4 = 5
    val result = number3 / number4.toDouble()
    println(result)

    /*
    변수가 NULLABLE라면 적절한 처리가 필요함
     */
    val number5: Int? = 3
    val number6: Long = number5?.toLong() ?: 0L

    printAgeIfPerson(null)

    /*
    Person person = new Person("최윤정", 20);
    String log = String.format("사람의 이름은 %s이고 나이는 %s세 입니다.", person.getName(), person.getAge());
    */
    val person = Person("최윤정", 20)
    val log: String = "사람의 이름은 ${person.name}이고 나이는 ${person.age}세 입니다."
    println(log)

    val str1 = """
        ABC
        DEF
        ${person.name}
    """.trimIndent()
    println(str1)

    /*
    String str2 = "ABCDE";
    char ch = str.charAt(1);
     */
    val str2 = "ABCDE"
    println(str2[0])
    println(str2[2])
}

/*
public void printAgeIfPerson1(Object obj) {
    if(obj instanceof Person) {
        Person person = (Person) obj;
        System.out.println(person.getName());
    }
}
*/
fun printAgeIfPerson1(obj: Any) {
    if (obj is Person) {
        println(obj.age) // SMART CAST
    }
}

/*
public void printAgeIfPerson2(Object obj) {
    if(!(obj instanceof Person)) {
    }
}
*/
fun printAgeIfPerson2(obj: Any) {
    if (obj !is Person) {
    }
}

/*
obj가 NULLABLE 하다면?
 */
fun printAgeIfPerson(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}


class Person(var name: String, var age: Int) {

}