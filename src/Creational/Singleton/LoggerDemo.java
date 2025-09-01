package Creational.Singleton;

public class LoggerDemo {

    public static void main(String[] args) {


        Logger log = Logger.getInstance();

        log.info("info msg");
        log.warn("warn msg");
        log.error("error msg");
    }
}
