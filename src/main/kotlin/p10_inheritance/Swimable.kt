package p10_inheritance

/*
public interface Swimable {

    default void act() {
        System.out.println("어푸 어푸");
    }

}
 */

interface Swimable {

    val swimAbility: Int
        get() = 3

    fun act() {
        println("어푸 어푸")
    }

}
