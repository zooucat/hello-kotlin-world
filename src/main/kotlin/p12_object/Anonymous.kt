package p12_object

/*
public static void main(String[] args) {

    moveSomething(new Movable() {
        @Override
        public void move() { System.out.println("움직인다."); }

        @Override
        public void fly() { System.out.println("날아간다."); }
    });

}

private static void moveSomething(Movable movable) {
    movable.move();
    movable.fly();
}
 */

fun main() {
    moveSomething(object : Movable {
        override fun move() {
            println("움직인다.")
        }

        override fun fly() {
            println("날아간다.")
        }
    })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}

interface Movable {

    fun move()

    fun fly()

}
