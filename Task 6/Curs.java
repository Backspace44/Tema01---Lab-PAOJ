/**
 * Clasa Curs demonstreaza relatiile de compozitie (cu Profesor) si agregare (cu studenti)
 */
public class Curs {
    // Atribute private pentru encapsulare
    private String denumire;
    private int numarCredite;
    // Compozitie: Profesorul exista doar in contextul acestui curs
    private Profesor profesor;
    // Agregare: Studentii exista independent de curs
    private String[] studenti;

    /**
     * Constructor pentru clasa Curs
     * @param denumire denumirea cursului
     * @param numarCredite numarul de credite alocat cursului
     * @param numeProfesor numele profesorului care preda cursul
     * @param specializareProfesor specializarea profesorului
     * @param codProfesor codul unic de identificare al profesorului (imutabil)
     * @param studenti array cu numele studentilor inscrisi la curs
     */
    public Curs(String denumire, int numarCredite, String numeProfesor,
                String specializareProfesor, String codProfesor, String[] studenti) {
        this.denumire = denumire;
        this.numarCredite = numarCredite;
        // Compozitie: Cream obiectul Profesor in interiorul constructorului Curs
        this.profesor = new Profesor(numeProfesor, specializareProfesor, codProfesor);
        // Agregare: Primim array-ul de studenti ca parametru (studentii exista independent)
        this.studenti = studenti;
    }

    /**
     * Getter pentru denumire
     * @return denumirea cursului
     */
    public String getDenumire() {
        return denumire;
    }

    /**
     * Setter pentru denumire
     * @param denumire noua denumire a cursului
     */
    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    /**
     * Getter pentru numarCredite
     * @return numarul de credite al cursului
     */
    public int getNumarCredite() {
        return numarCredite;
    }

    /**
     * Setter pentru numarCredite
     * @param numarCredite noul numar de credite al cursului
     */
    public void setNumarCredite(int numarCredite) {
        this.numarCredite = numarCredite;
    }

    /**
     * Getter pentru profesor
     * @return obiectul Profesor asociat cursului
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * Getter pentru array-ul de studenti
     * @return array-ul cu numele studentilor
     */
    public String[] getStudenti() {
        return studenti;
    }

    /**
     * Metoda pentru adaugarea unui student nou la curs
     * @param numeStudent numele studentului care se adauga
     */
    public void adaugaStudent(String numeStudent) {
        // Cream un nou array cu o dimensiune mai mare
        String[] nouStudenti = new String[studenti.length + 1];

        // Copiem studentii existenti
        for (int i = 0; i < studenti.length; i++) {
            nouStudenti[i] = studenti[i];
        }

        // Adaugam noul student
        nouStudenti[studenti.length] = numeStudent;

        // Actualizam referinta
        studenti = nouStudenti;
    }

    /**
     * Metoda pentru afisarea informatiilor despre curs
     */
    public void afiseazaInformatii() {
        System.out.println("Curs: " + denumire);
        System.out.println("Numar credite: " + numarCredite);
        System.out.println("Profesor: " + profesor.getNume() +
                " (Specializare: " + profesor.getSpecializare() +
                ", Cod: " + profesor.getCodIdentificare() + ")");

        System.out.println("Studenti inscrisi:");
        for (String student : studenti) {
            System.out.println("- " + student);
        }
    }
}