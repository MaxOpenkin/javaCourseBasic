package homeworks.projects.taskManager;

public class TaskDemo {

    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager(3);

        System.out.println("===========================================");

        taskManager.addTask(new Task
                (
                        "Автосервис",
                        "Отвезти машину в сервис завтра в 08:00",
                        1,
                        true)
        );

        System.out.println("===========================================");

        taskManager.changeTaskStatus(1);

        System.out.println("===========================================");

        taskManager.createTaskFromUserInput();

        taskManager.sortTasks();

        System.out.println("===========================================");

        taskManager.printTasks();

    }
}
