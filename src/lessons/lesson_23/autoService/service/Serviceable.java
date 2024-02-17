package lessons.lesson_23.autoService.service;

public interface Serviceable {

    void assignWork(String typeWorkDescription);
    String getWorkStatus();
    void changeWorkStatus(String newStatus);
}
