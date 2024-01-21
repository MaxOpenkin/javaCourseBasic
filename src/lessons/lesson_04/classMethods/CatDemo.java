package lessons.lesson_04.classMethods;

public class CatDemo {

    public static void main(String[] args) {

        // Экземпляр 1 класса кошка, выводим возраст и функции мяукать и праздновать ДР:
        // В скобках метода ДР, где добавили текст, прописываем текст в двойных ковычках:

        Cat myCat = new Cat();

        myCat.age = 5;
        myCat.catMeow();
        myCat.catBirthday("ДЕНЬ РОЖДЕНИЯ МОЕЙ КОШКИ!");

        System.out.println(myCat.age);

        // Экземпляр 2 класса кошка, выводим возраст и функцию праздновать ДР:
        // В скобках метода ДР, где добавили текст, прописываем текст в двойных ковычках:

        Cat myCat2 = new Cat();
        myCat2.age = 2;
        myCat2.catBirthday("ДЕНЬ РОЖДЕНИЯ ВТОРОЙ КОШКИ");


    }
}
