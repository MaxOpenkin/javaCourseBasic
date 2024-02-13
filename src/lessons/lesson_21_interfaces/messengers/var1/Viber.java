package lessons.lesson_21_interfaces.messengers.var1;

public class Viber extends Messenger{
    @Override
    void sendMessage() {
        System.out.println("Отправляем сообщение в Viber");
    }

    @Override
    void getMessage() {
        System.out.println("Принимаем сообщение в Viber");
    }
}
