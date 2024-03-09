package lessons.lesson_38_nestedClas_lambda.practice.carDoor;

public class Car {

    private int doorsCount;

    public Car(int doorsCount) {
        this.doorsCount = doorsCount;
    }

    public int getCountDoor() {
        return doorsCount;
    }

    public class Door {

        private double length;

        private double height;

        private boolean isOpen;

        public Door(double length, double height) {
            this.length = length;
            this.height = height;
            this.isOpen = false;
        }

        public void open() {
            isOpen = true;
            System.out.println("Дверь открыта.");
        }

        public void close() {
            isOpen = false;
            System.out.println("Дверь закрыта.");
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public boolean isOpen() {
            return isOpen;
        }

        public void setOpen(boolean open) {
            isOpen = open;
        }
    }
}
