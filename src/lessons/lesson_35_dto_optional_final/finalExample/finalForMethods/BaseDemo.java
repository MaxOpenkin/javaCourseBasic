package lessons.lesson_35_dto_optional_final.finalExample.finalForMethods;

import lessons.lesson_35_dto_optional_final.finalExample.finalForMethods.Base;
import lessons.lesson_35_dto_optional_final.finalExample.finalForMethods.BaseChild;

public class BaseDemo {
    public static void main(String[] args) {
        Base base = new Base();
        BaseChild baseChild = new BaseChild();

        base.printData();
        baseChild.printData();
    }
}
