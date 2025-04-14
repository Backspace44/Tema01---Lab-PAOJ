import java.util.Objects;

/**
 * Clasa imutabila care reprezinta un student
 * Implementeaza Comparable pentru a permite sortarea studentilor
 */
public final class Student implements Comparable<Student> {
    private final String nume;
    private final int varsta;
    private final double medie;

    /**
     * Constructor care initializeaza toate atributele
     */
    public Student(String nume, int varsta, double medie) {
        this.nume = nume;
        this.varsta = varsta;
        this.medie = medie;
    }

    // Metode getter (nu exista setter-e pentru ca este o clasa imutabila)
    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public double getMedie() {
        return medie;
    }

    /**
     * Implementarea metodei compareTo din interfata Comparable
     * Compara studentii in functie de medie (descrescator)
     */
    @Override
    public int compareTo(Student other) {
        // Comparare descrescatoare dupa medie
        return Double.compare(other.medie, this.medie);
    }

    /**
     * Suprascrierea metodei equals din clasa Object
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student student = (Student) obj;
        return varsta == student.varsta &&
                Double.compare(student.medie, medie) == 0 &&
                Objects.equals(nume, student.nume);
    }

    /**
     * Suprascrierea metodei hashCode din clasa Object
     */
    @Override
    public int hashCode() {
        return Objects.hash(nume, varsta, medie);
    }

    /**
     * Suprascrierea metodei toString din clasa Object
     */
    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", medie=" + medie +
                '}';
    }
}