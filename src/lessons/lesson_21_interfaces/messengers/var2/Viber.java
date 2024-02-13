package lessons.lesson_21_interfaces.messengers.var2;

public class Viber implements MessengerInterface {
    @Override
    public void sendMessage() {
        System.out.println("Отправляем сообщение в Viber");
    }

    @Override
    public void getMessage() {
        System.out.println("Принимаем сообщение в Viber");
    }
}
