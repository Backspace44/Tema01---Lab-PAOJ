import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Logger {
    private static Logger instance;

    // Formatul pentru timestamp
    private DateTimeFormatter formatter;

    // Constructor privat pentru a preveni instantierea din afara clasei
    private Logger() {
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    }

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Metoda pentru logarea mesajelor de tip INFO

    public static void logInfo(String mesaj) {
        Logger logger = getInstance();
        logger.log("INFO", mesaj);
    }

    // Metoda pentru logarea mesajelor de tip WARNING

    public static void logWarning(String mesaj) {
        Logger logger = getInstance();
        logger.log("WARNING", mesaj);
    }

    // Metoda pentru logarea mesajelor de tip ERROR

    public static void logError(String mesaj) {
        Logger logger = getInstance();
        logger.log("ERROR", mesaj);
    }

    // Metoda interna pentru formatarea si afisarea mesajului de log

    private void log(String tipMesaj, String mesaj) {
        LocalDateTime timestamp = LocalDateTime.now();
        String timeString = timestamp.format(formatter);
        System.out.println("[" + timeString + "][" + tipMesaj + "]: " + mesaj);
    }
}
