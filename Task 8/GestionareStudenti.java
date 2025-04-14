/**
 * Clasa principala pentru demonstrarea functionalitatii
 */
public class GestionareStudenti {
    public static void main(String[] args) {
        // Crearea unui grup de studenti
        Grup<Student> grup = new Grup<>(10);

        // Adaugarea studentilor in grup
        grup.adaugaStudent(new Student("Andrei Popescu", 21, 9.5));
        grup.adaugaStudent(new Student("Maria Ionescu", 20, 9.8));
        grup.adaugaStudent(new Student("Ion Dumitrescu", 22, 8.7));
        grup.adaugaStudent(new Student("Ana Marinescu", 19, 9.2));
        grup.adaugaStudent(new Student("Vlad Grigorescu", 23, 7.9));

        // Afisarea studentilor inainte de sortare
        System.out.println("STUDENTI INAINTE DE SORTARE:");
        for (int i = 0; i < grup.getNumarStudenti(); i++) {
            System.out.println(grup.getStudent(i));
        }

        // Sortarea studentilor
        grup.sorteazaStudenti();

        // Afisarea studentilor dupa sortare
        System.out.println("\nSTUDENTI DUPA SORTARE (descrescator dupa medie):");
        for (int i = 0; i < grup.getNumarStudenti(); i++) {
            System.out.println(grup.getStudent(i));
        }

        // Cautarea unui student dupa nume
        Student studentGasit = grup.cautaStudentDupaNume("Maria Ionescu");
        if (studentGasit != null) {
            System.out.println("\nSTUDENT GASIT: " + studentGasit);
        } else {
            System.out.println("\nStudentul nu a fost gasit");
        }

        // Demonstrarea utilizarii StringBuilder
        System.out.println("\n" + grup.genereazaRaportStringBuilder());

        // Demonstrarea utilizarii StringBuffer
        System.out.println("\n" + grup.genereazaRaportStringBuffer());

        // Demonstrare String vs StringBuilder vs StringBuffer
        demonstrarePerformantaString();
    }

    /**
     * Metoda pentru demonstrarea diferentei de performanta intre String, StringBuilder si StringBuffer
     */
    private static void demonstrarePerformantaString() {

        final int iteratii = 100000;

        // Demonstrare cu String (concatenare cu +)
        long startTime = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < iteratii; i++) {
            result += "a";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Timp pentru String: " + (endTime - startTime) + " ms");

        // Demonstrare cu StringBuilder (nesincronizat)
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iteratii; i++) {
            sb.append("a");
        }
        result = sb.toString();
        endTime = System.currentTimeMillis();
        System.out.println("Timp pentru StringBuilder: " + (endTime - startTime) + " ms");

        // Demonstrare cu StringBuffer (sincronizat)
        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iteratii; i++) {
            sbf.append("a");
        }
        result = sbf.toString();
        endTime = System.currentTimeMillis();
        System.out.println("Timp pentru StringBuffer: " + (endTime - startTime) + " ms");

        System.out.println("\nConcluzii:");
        System.out.println("- String: Imutabil, creeaza un nou obiect la fiecare concatenare (ineficient pentru multe operatii)");
        System.out.println("- StringBuilder: Mutabil, nesincronizat, mai rapid pentru un singur thread");
        System.out.println("- StringBuffer: Mutabil, sincronizat, mai sigur pentru multi-threading dar mai lent decat StringBuilder");
    }
}