package p14_variousclass

fun main() {
    val dto1 = PersonDto("최윤정", 20)
    val dto2 = PersonDto("최윤정", 20)
    println(dto1 == dto2)
    println(dto1)
}

/*
public class PersonDto {

    private final String name;
    private final int age;

    public PersonDto(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonDto that = (PersonDto) o;
        return age == that.age && Objects.equals(name, that.name)
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "PersonDto(" +
                "name='" + name + '\'' +
                ", age=" + age +
                ')';
    }
}
 */

data class PersonDto(val name: String,
                     val age: Int)
