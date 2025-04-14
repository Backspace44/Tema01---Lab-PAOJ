import java.util.Arrays;

/**
 * Clasa generica pentru gestionarea unui grup de studenti
 */
public class Grup<T extends Student> {
    private T[] studenti;
    private int numarStudenti;
    private final int capacitate;

    /**
     * Constructor care initializeaza array-ul de studenti
     */
    @SuppressWarnings("unchecked")
    public Grup(int capacitate) {
        this.capacitate = capacitate;
        // Folosim cast pentru a crea un array generic
        this.studenti = (T[]) new Student[capacitate];
        this.numarStudenti = 0;
    }

    /**
     * Adauga un student in grup
     */
    public boolean adaugaStudent(T student) {
        if (numarStudenti >= capacitate) {
            return false; // Grup plin
        }

        studenti[numarStudenti++] = student;
        return true;
    }

    /**
     * Cauta un student dupa nume
     */
    public T cautaStudentDupaNume(String nume) {
        for (int i = 0; i < numarStudenti; i++) {
            if (studenti[i].getNume().equals(nume)) {
                return studenti[i];
            }
        }
        return null; // Student negasit
    }

    /**
     * Sorteaza studentii folosind Arrays.sort()
     * Foloseste implementarea metodei compareTo din clasa Student
     */
    public void sorteazaStudenti() {
        Arrays.sort(studenti, 0, numarStudenti);
    }

    /**
     * Returneaza numarul de studenti din grup
     */
    public int getNumarStudenti() {
        return numarStudenti;
    }

    /**
     * Returneaza studentul de la indexul dat
     */
    public T getStudent(int index) {
        if (index < 0 || index >= numarStudenti) {
            throw new IndexOutOfBoundsException("Index invalid: " + index);
        }
        return studenti[index];
    }

    /**
     * Genereaza un raport text detaliat folosind StringBuilder (concatenare eficienta)
     */
    public String genereazaRaportStringBuilder() {
        StringBuilder sb = new StringBuilder();
        sb.append("Numar total de studenti: ").append(numarStudenti).append("\n\n");

        for (int i = 0; i < numarStudenti; i++) {
            sb.append("Student #").append(i + 1).append(":\n");
            sb.append("  Nume: ").append(studenti[i].getNume()).append("\n");
            sb.append("  Varsta: ").append(studenti[i].getVarsta()).append(" ani\n");
            sb.append("  Medie: ").append(String.format("%.2f", studenti[i].getMedie())).append("\n\n");
        }

        sb.append("==========================================\n");
        sb.append("Media generala a grupului: ").append(String.format("%.2f", calculeazaMedieGrup())).append("\n");

        return sb.toString();
    }

    /**
     * Genereaza un raport text detaliat folosind StringBuffer (thread-safe, sincronizat)
     */
    public String genereazaRaportStringBuffer() {
        StringBuffer sb = new StringBuffer();
        sb.append("Numar total de studenti: ").append(numarStudenti).append("\n\n");

        for (int i = 0; i < numarStudenti; i++) {
            sb.append("Student #").append(i + 1).append(":\n");
            sb.append("  Nume: ").append(studenti[i].getNume()).append("\n");
            sb.append("  Varsta: ").append(studenti[i].getVarsta()).append(" ani\n");
            sb.append("  Medie: ").append(String.format("%.2f", studenti[i].getMedie())).append("\n\n");
        }

        sb.append("==========================================\n");
        sb.append("Media generala a grupului: ").append(String.format("%.2f", calculeazaMedieGrup())).append("\n");

        return sb.toString();
    }

    /**
     * Calculeaza media generala a grupului
     */
    private double calculeazaMedieGrup() {
        if (numarStudenti == 0) {
            return 0.0;
        }

        double sumaMedias = 0.0;
        for (int i = 0; i < numarStudenti; i++) {
            sumaMedias += studenti[i].getMedie();
        }

        return sumaMedias / numarStudenti;
    }
}