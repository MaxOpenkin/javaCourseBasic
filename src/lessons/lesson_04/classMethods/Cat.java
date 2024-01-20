package lessons.lesson_04.classMethods;

public class Cat {

    int age;

    public void catMeow(){
        System.out.println("Meow!!!");
    }

    public void catBirthday (){
        System.out.println("У моей кошки сегодня ДР!");
        System.out.println("Ей было " + age + " лет");
        age = age + 1;
        System.out.println("А теперь ей " + age);

        // А как сделать, что бы выводилось не лет, а года (2 года).
        // Для разных кошек одним лет а другим годы.
    }

}
