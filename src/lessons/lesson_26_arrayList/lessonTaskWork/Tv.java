package lessons.lesson_26_arrayList.lessonTaskWork;

import java.util.Objects;

public class Tv {

    private String producer;

    private Integer size;

    public Tv(String producer, Integer size) {
        this.producer = producer;
        this.size = size;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "producer='" + producer + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tv tv = (Tv) o;
        return Objects.equals(producer, tv.producer) && Objects.equals(size, tv.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, size);
    }
}
