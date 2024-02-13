package lessons.lesson_20_abstract_inheritance.abstraction.animals;

public class Fish extends Animal{

    private boolean eatable;

    public boolean isEatable() {
        return eatable;
    }

    @Override
    void breath() {
        System.out.println("Gills");
    }
}
