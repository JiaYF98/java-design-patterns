package example;

public class Client {
    public static void main(String[] args) {
        LoggerFactory loggerFactory = (LoggerFactory)XMLUtil.getBean();
        Logger logger = loggerFactory.createLogger();
        logger.writeLog();
    }
}