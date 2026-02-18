package p10_inheritance

/*
public final class Penguin extends Animal implements Flyable, Swimable {

    private final int wingCount;

    public Penguin(String species) {
        super(species, 2);
        this.wingCount = 2;
    }

    @Override
    public void move() {
        System.out.println("펭귄이 움직입니다~ 꿱꿱");
    }

    @Override
    public int getLegCount() {
        return super.getLegCount() + this.wingCount;
    }

    @Override
    public void act() {
       Swimable.super.act();
       Flyable.super.act();
    }

}
 */

class Penguin(species: String) : Animal(species, 2), Flyable, Swimable {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 움직입니다~ 꿱꿱")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override val swimAbility: Int
        get() = 5

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }
}
