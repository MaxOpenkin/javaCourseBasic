package lessons.lesson_38_nestedClas_lambda.lambda;

public class AvgExample1 {
    public static void main(String[] args) {
        IAverage average = (a, b, c) -> (a + b + c) / 3.0;

        System.out.println("Our average value: " + average.avg(10,12,20));
    }
}