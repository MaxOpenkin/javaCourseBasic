package lessons.lesson_20_abstract_inheritance.inheritance.students;

public class SeniorDeveloper extends MiddleDeveloper{

    void mentoring(){
        System.out.println("Mentoring");
    }

    void solveProblem(){
        System.out.println("Problem solver");
    }

    @Override
    void code(){
        System.out.println("Simple coding");
    }

    @Override
    void learn() {
        System.out.println("Fast learning");
    }
}
