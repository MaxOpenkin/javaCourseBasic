package homeworks.projects_01.taskManager;

public class TaskDemo {

    public static void main(String[] args) {

        TaskManager taskManager = new TaskManager(3);

        taskManager.addTask(new Task
                (1,
                "Автосервис",
                "Отвезти машину в сервис завтра в 08:00",
                1,
                "Не выполнено")
        );

        taskManager.changeTaskStatus(1,"Выполнено");

        taskManager.createTaskFromUserInput();

        taskManager.sortTasks();

        taskManager.printTasks();

    }
}
