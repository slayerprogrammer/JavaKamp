package inheritance2;

public class LogManager {

    public void Log(int logType) {

        if (logType == 1) {
            System.out.println("database Loglandı");
        } else if (logType == 2) {
            System.out.println("Emaile Loglandı");
        } else {
            System.out.println("File Loglandı");
        }
    }
}

// 1- Database logger
// 2- Email Logger
// 3- File Logger
// Bunların hepsi loglama işlemleri yapacak ama farklı farklı alanlara
