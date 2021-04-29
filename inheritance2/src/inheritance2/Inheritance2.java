
package inheritance2;


public class Inheritance2 {

    public static void main(String[] args) {
       
        
        Logger logger = new Logger();
        logger.Log();
        Logger filelogger = new FileLogger();
        filelogger.Log();
        Logger databaselogger = new DatabaseLogger();
        databaselogger.Log();
        Logger emaiLogger = new EmailLogger();
        emaiLogger.Log();
    }
    
}
