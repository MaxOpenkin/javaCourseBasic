package lessons.lesson_38_nestedClas_lambda.anonimousClasses;

public class SecurityMonitoringModule implements MonitoringSystem{
    @Override
    public void startMonitoring() {
        System.out.println("Мониторинг контроля безопасности стартовал!");
    }
}
