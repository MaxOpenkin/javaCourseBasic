package lessons.lesson_20_abstract_inheritance.inheritance.students;

public class MiddleDeveloper extends JuniorDeveloper{

    void debug() {
        System.out.println("Debugging ...");
    }

    @Override
    void code(){
        System.out.println("Coding like a middle dev");
    }


}
