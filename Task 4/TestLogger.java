// Clasa de test pentru demonstrarea functionalitatii SIngleton Logger

public class TestLogger {
    public static void main(String[] args) {
        System.out.println("Testarea functionalitatii Singleton Logger");
        System.out.println("------------------------------------------");

        // Demonstram ca toate mesajele sunt logate prin aceeasi instanta a clasei Logger
        Logger.logInfo("Aplicatia a pornit");
        Logger.logInfo("Se incarca configuratia");

        // Simulam o avertizare
        Logger.logWarning("Memorie disponibila redusa");

        // Simulam o eroare
        Logger.logError("Nu s-a putut deschide fisierul de configurare.");

        // Demonstram ca instanta este aceeasi verificand obiectele
        Logger primulLogger = Logger.getInstance();
        Logger alDoileaLogger = Logger.getInstance();

        System.out.println("\nVerificarea implementarii Singleton:");
        System.out.println("--------------------------------------");
        System.out.println("Prima referinta Logger: " + primulLogger);
        System.out.println("A doua referinta Logger: " + alDoileaLogger);
        System.out.println("Cele doua referinte indica acelasi obiect: " + (primulLogger == alDoileaLogger));

        // Demonstram ca putem continua sa folosim aceeasi instanta
        Logger.logInfo("Continuarea executiei aplicatiei.");
        Logger.logInfo("Aplicatia se inchide");
    }
}
