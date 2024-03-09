package lessons.lesson_38_nestedClas_lambda.anonimousClasses;

public class ErrorMonitoringModule implements MonitoringSystem {
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг контроля за ошибками в системе стартовал!");
    }
}
