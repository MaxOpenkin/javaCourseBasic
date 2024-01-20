package lessons.lesson_04.classMethods;

public class CatDemo {

    public static void main(String[] args) {

        Cat myCat = new Cat();

        myCat.age = 5;
        myCat.catMeow();
        myCat.catBirthday();

        System.out.println(myCat.age);

        Cat myCat2 = new Cat();
        myCat2.age = 2;
        myCat2.catBirthday();


    }
}
