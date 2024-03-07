package lessons.lesson_35_dto_optional_final.finalExample.finalForClass;

public final class Base {

    private String baseInfo;

    public Base(String baseInfo) {
        this.baseInfo = baseInfo;
    }

    void printData(){
        System.out.println("Метод для распечатки данных из final класса");
    }
}
