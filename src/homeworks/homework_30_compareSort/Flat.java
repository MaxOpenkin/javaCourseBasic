package homeworks.homework_30_compareSort;

public class Flat implements Comparable<Flat> {

    private int roomCount;
    private double flatArea;

    public Flat(int roomCount, double flatArea) {
        this.roomCount = roomCount;
        this.flatArea = flatArea;
    }

    public double getRoomCount() {
        return roomCount;
    }

    public double getFlatArea() {
        return flatArea;
    }

    @Override
    public int compareTo(Flat other) {
        int compareRooms = Integer.compare(this.roomCount, other.roomCount);
        if (compareRooms != 0) return compareRooms;
        return Double.compare(this.flatArea, other.flatArea);
    }

    @Override
    public String toString() {
        return "Flat{rooms=" + roomCount + ", area=" + flatArea + "}";
    }

}
