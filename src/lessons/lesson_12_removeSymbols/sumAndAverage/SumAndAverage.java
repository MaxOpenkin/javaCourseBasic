package lessons.lesson_12_removeSymbols.sumAndAverage;

public class SumAndAverage {
    private int sum;
    private int count;

    public SumAndAverage() {
        sum = 0;
        count = 0;
    }

    public void processNumber(int number) {
        sum += number;
        count++;
    }

    public int getSum() {
        return sum;
    }

    public double getAverage(){
        if (count == 0){
            return 0;
        }
        return (double) sum / count;
    }
}
