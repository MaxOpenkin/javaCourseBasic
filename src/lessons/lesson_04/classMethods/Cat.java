package lessons.lesson_04.classMethods;

public class Cat {

    // Какие характеристики будет иметь кошка, (Class) это Класс, задаем:
    int age;

    // Прописываем классу Cat метод (функцию) мяукать:

    public void catMeow(){
        System.out.println("Meow!!!");
    }

    // Прописываем классу Cat метод (функцию) праздновать день рождения:
    // Добавили в скобках (String textMessage) и строку println (textMessage):

    public void catBirthday(String textMessage){
        System.out.println(textMessage);
        System.out.println("У моей кошки сегодня ДР!");
        System.out.println("Ей было " + age + " лет");
        age = age + 1;
        System.out.println("А теперь ей " + age);

        // А как сделать, что бы выводилось не лет, а года (2 года).
        // Для разных кошек одним лет а другим годы.
    }

}
