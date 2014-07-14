import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld
{

public String sayhello() {
    printLogs();
    System.out.println("Hello");
    return "HelloWorld";
    }
public static void printLogs(){
    Logger slf4jLogger = LoggerFactory.getLogger(HelloWorld.class);
    slf4jLogger.info(" An info from SLF4j");
}
}
