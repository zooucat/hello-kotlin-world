package p09_class

fun main() {
    val person1 = Person("zooucat", 20)
    println(person1.name)
    println(person1.isAdult)
    person1.age = 10
    println(person1.age)
    println(person1.isAdult)

    val person2 = Person("최윤정")
    println(person2.age)
}

/*
public class Person {
    private final String name;
    private int age;

    public Person(String name, int age) {
        if (age <= 0) {
            throw new IllegalArgumentException(String.format("나이는 %s일 수 없습니다."));
        }
        this.name = name;
        this.age = age;
    }

    public Person(String name) {
        this(name, 1);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public boolean isAdult() {
        return this.age >= 20
    }
}
 */

class Person(name: String = "홍길동", var age: Int = 1) {

    var name = name
        get() = field.uppercase() // backing field
        set(name) {
            field = name.uppercase()
        }

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    val isAdult: Boolean
        get() = this.age >= 20

}
