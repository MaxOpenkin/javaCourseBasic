package lessons.lesson_22.task1Var2;

public class TeaProducer {

    private String producerName;

    public TeaProducer(String producerName) {
        this.producerName = producerName;
    }

    public String getProducerName() {
        return producerName;
    }

    @Override
    public String toString() {
        return "TeaProducer{" +
                "producerName='" + producerName + '\'' +
                '}';
    }
}
