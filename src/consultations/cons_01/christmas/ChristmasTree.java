package consultations.cons_01.christmas;

public class ChristmasTree {

    String ChristmasTreeToys;

    public ChristmasTree(String christmasTreeToys) {
        this.ChristmasTreeToys = christmasTreeToys;
    }

    public void garlandSwitchOn(){
        System.out.println("Гирлянда горит!");
        System.out.println("Игрушки на ёлке: " + ChristmasTreeToys);
    }
}
