package lessons.lesson_21_interfaces.messengers.var1;

public class Telegram  extends Messenger{
    @Override
    void sendMessage() {
        System.out.println("Отправляем сообщение в Telegram");
    }

    @Override
    void getMessage() {
        System.out.println("Принимаем сообщение в Telegram");
    }
}
