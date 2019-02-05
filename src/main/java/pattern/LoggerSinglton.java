package pattern;

public class LoggerSinglton {
    private static LoggerSinglton loggerSinglton;
    private static String logFile = "This is log file. \n\n";

    public static LoggerSinglton getLoggerSinglton() {
        if(loggerSinglton == null) {
            loggerSinglton = new LoggerSinglton();
        }

        return loggerSinglton;
    }

    private LoggerSinglton() {

    }

    public void addLogInfo(String logInfo) {
        logFile += logInfo + "\n";
    }

    public void showLogFile() {
        System.out.println(logFile);
    }
}
