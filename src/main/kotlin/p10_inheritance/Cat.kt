package p10_inheritance

/*
public class Cat extends Animal {

    public Cat(String species) {
        super(species, 4);
    }

    @Override
    public void move() {
        System.out.println("고양이가 사뿐 사뿐 걸어가~");
    }

}
 */

class Cat(species: String) : Animal(species, 4) {

    override fun move() {
        println("고양이가 사뿐 사뿐 걸어가~")
    }
}
