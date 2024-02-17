package homeworks.projects_01.taskManager;

import lessons.lesson_06_scanner_Random.scanner.UserInput;

public class TaskManager {

    private Task[] tasks;
    private int size = 0;

    UserInput userInput = new UserInput();


    // Конструктор класса с инициализацией массива задач определенной ёмкости
    public TaskManager(int capacity) {
        tasks = new Task[capacity];
        size = 0;
    }


    public Task createTaskFromUserInput(){
        if (size >= tasks.length) {
            System.out.println("Массив задач полон. Невозможно добавить новую задачу.");
        }
        int id = userInput.inputInteger("Введите ID задачи: ");
        String taskTitle = userInput.inputText("Введите название задачи: ");
        String taskDescription = userInput.inputText("Введите описание задачи: ");
        int priority = userInput.inputInteger("Введите приоритет задачи (целое число): ");
        String status = userInput.inputText("Введите статус задачи: ");
        Task newTask = new Task(id, taskTitle, taskDescription, priority, status);
        tasks[size++] = newTask;
        System.out.println("Задача успешно добавлена.");
        return newTask;
    }


    public void addTask(Task task) {
        if (size < tasks.length) {
            tasks[size] = task;
            size++;
            System.out.println("Task added: " + task);
        } else {
            System.out.println("Массив задач полон. Невозможно добавить новую задачу.");
        }
    }


    public void changeTaskStatus(int id, String newStatus) {
        for (int i = 0; i < size; i++) {
            if (tasks[i].getId() == id) {
                tasks[i].setStatus(newStatus);
                System.out.println("Статус задачи с ID " + id + " изменен на \"" + newStatus + "\".");
                return;
            }
        }
        System.out.println("Задача с указанным ID не найдена.");
    }


    /*
    Для реализации метода сортировки задач с использованием алгоритма сортировки вставками,
    мы будем последовательно проходить по массиву задач, начиная со второго элемента,
    и для каждой задачи находим её место в уже отсортированной части массива,
    перемещая более низкоприоритетные задачи вправо,
    чтобы освободить место для вставки текущей задачи.
     */

    public void sortTasks() {
        for (int i = 1; i < size; i++) {
            Task currentTask = tasks[i];
            int j = i - 1;

        /* Перемещаем элементы с более низким приоритетом (меньшее число) или с более высоким приоритетом,
        но лексикографически большим названием вправо, чтобы освободить место для вставки текущей задачи
        на правильную позицию в отсортированной части массива. */

            while (j >= 0 && (tasks[j].getPriority() > currentTask.getPriority() ||
                    (tasks[j].getPriority() == currentTask.getPriority() && tasks[j].getTaskTitle().compareTo(currentTask.getTaskTitle()) > 0))) {
                tasks[j + 1] = tasks[j];
                j--;
            }
            // Вставляем текущую задачу на её место в отсортированной части массива

            tasks[j + 1] = currentTask;
        }
    }


    public void printTasks() {
        if (size == 0) {
            System.out.println("Список задач пуст.");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println("ID: " + tasks[i].getId() + ", Title: " + tasks[i].getTaskTitle() +
                    ", Description: " + tasks[i].getTaskDescription() + ", Priority: " + tasks[i].getPriority() +
                    ", Status: " + tasks[i].getStatus());
        }
    }

}
