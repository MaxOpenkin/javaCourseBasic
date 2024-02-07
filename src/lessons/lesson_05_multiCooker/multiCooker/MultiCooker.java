package lessons.lesson_05_multiCooker.multiCooker;

public class MultiCooker {

    String producer;
    String model;
    int power;
    int volume;

    String dish;
    int currentProgramNumber;
    int programNumbers;
    String nameProgram;
    int timeForProgram;

    // Конструктор, инициализирующий основные характеристики мультиварки:

    public MultiCooker(String producer, String model, int power, int volume) {
        this.producer = producer;
        this.model = model;
        this.power = power;
        this.volume = volume;
    }

    // Метод для изменения текущей программы готовки.
    // Принимает новый номер программы (newProgramNumber) и новое название программы (newProgram).
    // Выводит сообщение о смене программы:

    public void changeProgram(int newProgramNumber, String newProgram) {
        this.currentProgramNumber = newProgramNumber;
        this.nameProgram = newProgram;
        System.out.println("Программу готовки переключили на: " + nameProgram + "( программа номер: " + currentProgramNumber + ")");
    }

    // Метод для замены текущего блюда. Принимает новое название блюда (newDish).
    // Выводит сообщение о замене блюда и указывает текущую программу готовки:

    public void changeDish(String newDish) {
        this.dish = newDish;
        System.out.println("В мультиварку поместили новые продукты для приготовления: " + dish + " в режиме: " + nameProgram);
    }

    // Метод toString предоставляет строковое представление объекта
    // для удобного вывода информации:

    @Override
    public String toString() {
        return "MultiCooker{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", power=" + power +
                ", volume=" + volume +
                ", dish='" + dish + '\'' +
                ", currentProgramNumber=" + currentProgramNumber +
                ", programNumbers=" + programNumbers +
                ", nameProgram='" + nameProgram + '\'' +
                ", timeForProgram=" + timeForProgram +
                '}';
    }
}
