package lessons.lesson_20_abstract_inheritance.inheritance.dog;

public class BigDog extends Dog{

    private boolean isProtectDiploma;

    public BigDog(String name, String breed, boolean isProtectDiploma) {
        super(name, breed);
        this.isProtectDiploma = isProtectDiploma;
    }

    public void protect(){}

    public boolean isProtectDiploma() {
        return isProtectDiploma;
    }

    public void setProtectDiploma(boolean protectDiploma) {
        isProtectDiploma = protectDiploma;
    }
}
