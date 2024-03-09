package homeworks.homework_36.generics.boxPutGet;

public class BoxDemo {
    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();
        stringBox.put("Это типобезопасность :)");
        String value = stringBox.get();
        System.out.println(value);


        Box<Integer> integerBox = new Box<>();
        integerBox.put(123);
        Integer intValue = integerBox.get();
        System.out.println(intValue);
    }
}
