package p10_inheritance

/*
public abstract class Animal {

    protected final String species;
    protected final int legCount;

    public Animal(String species, int legCount) {
        this.species = species;
        this.legCount = legCount;
    }

    abstract public void move();

    public String getSpecies() {
        return species;
    }

    public int getLegCount() {
        return legCount;
    }

}
 */


abstract class Animal(protected val species: String,
                      protected open val legCount: Int) {

    abstract fun move()

}
