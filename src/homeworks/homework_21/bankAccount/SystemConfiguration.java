package homeworks.homework_21.bankAccount;

public class SystemConfiguration {

    private String logLevel;
    private String logPath;


    public SystemConfiguration() {
        logLevel = "INFO"; // Уровень логирования по умолчанию
        logPath = "/var/log/system.log"; // Путь к файлам логов по умолчанию
    }


    public void setLogLevel(String level) {
        if (level.equals("DEBUG") || level.equals("INFO") || level.equals("WARNING") ||
                level.equals("ERROR") || level.equals("CRITICAL")) {
            logLevel = level;
        }
    }


    public void setLogPath(String path) {
        logPath = path;
    }


    public String getLogLevel() {
        return logLevel;
    }

    public String getLogPath() {
        return logPath;
    }
}
