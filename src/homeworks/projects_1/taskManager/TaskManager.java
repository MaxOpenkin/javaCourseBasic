package homeworks.projects_1.taskManager;

import lessons.lesson_06_scanner_Random.scanner.UserInput;

public class TaskManager {

    private Task[] tasks;
    private Task[] completedTasks;
    private int size = 0;
    private int completedSize = 0;

    UserInput userInput = new UserInput();


    // Конструктор класса с инициализацией массивов задач с разными статусами определенной ёмкости:
    public TaskManager(int capacity) {
        tasks = new Task[capacity];
        completedTasks = new Task[capacity];
    }


    public Task createTaskFromUserInput() {
        if (size >= tasks.length) {
            System.out.println("Массив задач полон. Невозможно добавить новую задачу.");
        }
        //int id = userInput.inputInteger("Введите ID задачи: ");
        String taskTitle = userInput.inputText("Введите название задачи: ");
        String taskDescription = userInput.inputText("Введите описание задачи: ");
        int priority = userInput.inputInteger("Введите приоритет задачи (целое число): ");
        boolean isStatus = false;
        Task newTask = new Task(taskTitle, taskDescription, priority, isStatus);
        tasks[size++] = newTask;
        String statusMessage = isStatus ? "выполнена" : "не выполнена";
        System.out.println("Задача успешно добавлена. ID задачи: " + newTask.getId() + ", статус задачи: " + statusMessage);
        return newTask;
    }


    public void addTask(Task task) {
        if (size < tasks.length) {
            tasks[size] = task;
            size++;
            System.out.println("Задача успешно добавлена: " + task);
        } else {
            System.out.println("Массив задач полон. Невозможно добавить новую задачу.");
        }
    }


    public void changeTaskStatus(int id) {
        for (int i = 0; i < size; i++) {
            if (tasks[i].getId() == id) {
                tasks[i].setStatus(true); // Отмечаем задачу как выполненную
                // Перемещаем задачу в массив выполненных задач
                completedTasks[completedSize++] = tasks[i];
                // Удаление задачи из активных
                System.arraycopy(tasks, i + 1, tasks, i, size - i - 1);
                size--;
                System.out.println("Задача с ID " + id + " выполнена и перемещена в список выполненных задач.");
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
            System.out.println("Список активных задач пуст.");
        } else {
            System.out.println("Активные задачи:");
            for (int i = 0; i < size; i++) {
                String statusMessage = tasks[i].getStatus() ? "выполнена" : "не выполнена";
                System.out.println(
                        "ID: " + tasks[i].getId()
                        + ", Название: " + tasks[i].getTaskTitle()
                        + ", Описание: " + tasks[i].getTaskDescription()
                        + ", Приоритет: " + tasks[i].getPriority()
                        + ", Статус: " + statusMessage);
            }
        }

        if (completedSize == 0) {
            System.out.println("Список выполненных задач пуст.");
        } else {
            System.out.println("Выполненные задачи:");
            for (int i = 0; i < completedSize; i++) {
                System.out.println(
                        "ID: " + completedTasks[i].getId()
                        + ", Название: " + completedTasks[i].getTaskTitle()
                        + ", Описание: " + completedTasks[i].getTaskDescription()
                        + ", Приоритет: " + completedTasks[i].getPriority()
                        + ", Статус: выполнена");
            }
        }

    }
}
