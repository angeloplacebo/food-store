package br.edu.ifpb.padroes.service.log;

public class LogService {

    private ILogHandler logHandler;

    public LogService(ILogHandler logHandler) {
        this.logHandler = logHandler;
    }

    public void debug(String message) {
        logHandler.log("stack trace");
        logHandler.log(message);
    }

    public void info(String message) {
        logHandler.log(message);
    }
    public void error(String message) {
        logHandler.log("error");
        logHandler.log(message);
    }
}
