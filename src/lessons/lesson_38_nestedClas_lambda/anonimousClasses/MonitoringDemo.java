package lessons.lesson_38_nestedClas_lambda.anonimousClasses;

public class MonitoringDemo {
    public static void main(String[] args) {
        GeneralIndicatorsMonitoringModule generalModule = new GeneralIndicatorsMonitoringModule();
        ErrorMonitoringModule errorModule = new ErrorMonitoringModule();
        SecurityMonitoringModule securityModule = new SecurityMonitoringModule();

        generalModule.startMonitoring();
        errorModule.startMonitoring();
        securityModule.startMonitoring();
    }
}
