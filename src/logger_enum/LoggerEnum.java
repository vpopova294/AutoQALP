package logger_enum;

public class LoggerEnum {




    public enum LoggerLevel {
        INFO,
        DEBUG,
        WARN,
        ERROR;
    }

    public void log(LoggerLevel level, String message) {
        switch (level) {
            case DEBUG:
                System.out.println(message);
                break;
            case ERROR:
                System.out.println(message);
                break;
        }
    }
}
