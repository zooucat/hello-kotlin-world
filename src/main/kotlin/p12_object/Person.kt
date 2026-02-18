package p12_object

/*
public class Person {

    private static final int MIN_AGE = 1;

    public static Person newBaby(String name) {
        return new Person(name, MIN_AGE);
    }

    private String name;

    private int age;

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
 */

class Person private constructor(
    var name: String,
    var age: Int
) {

    companion object Factory : Log {
        private const val MIN_AGE: Int = 1

        @JvmStatic // Java에서 Kotlin companion object를 사용하려면 @JvmStatic을 붙여야 함
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person 클래스의 동행객체 Factory에요")
        }
    }

}
