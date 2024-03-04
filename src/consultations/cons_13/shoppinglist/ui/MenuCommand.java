package consultations.cons_13.shoppinglist.ui;

public interface MenuCommand {
    void executeCommand();

    String getMenuName();
    boolean shouldExit();
}
