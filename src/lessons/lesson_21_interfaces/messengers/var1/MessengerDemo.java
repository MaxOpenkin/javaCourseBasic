package lessons.lesson_21_interfaces.messengers.var1;

public class MessengerDemo {
    public static void main(String[] args) {
        Telegram telegram = new Telegram();
        WhatsApp whatsApp = new WhatsApp();
        Viber viber = new Viber();

        Messenger[] messengers = {telegram, whatsApp,viber};

        for (int i = 0; i < messengers.length; i++) {
            messengers[i].sendMessage();
        }
    }
}
