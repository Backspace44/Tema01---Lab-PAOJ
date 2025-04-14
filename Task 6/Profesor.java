/**
 * Clasa Profesor reprezinta un cadru didactic cu nume, specializare si un cod unic de identificare
 */
public class Profesor {
    // Atribute private pentru encapsulare
    private String nume;
    private String specializare;
    // Atribut final pentru a ilustra imutabilitatea
    private final String codIdentificare;

    /**
     * Constructor pentru clasa Profesor
     * @param nume numele profesorului
     * @param specializare specializarea profesorului
     * @param codIdentificare codul unic de identificare (imutabil)
     */
    public Profesor(String nume, String specializare, String codIdentificare) {
        this.nume = nume;
        this.specializare = specializare;
        this.codIdentificare = codIdentificare;
    }

    /**
     * Getter pentru nume
     * @return numele profesorului
     */
    public String getNume() {
        return nume;
    }

    /**
     * Setter pentru nume
     * @param nume noul nume al profesorului
     */
    public void setNume(String nume) {
        this.nume = nume;
    }

    /**
     * Getter pentru specializare
     * @return specializarea profesorului
     */
    public String getSpecializare() {
        return specializare;
    }

    /**
     * Setter pentru specializare
     * @param specializare noua specializare a profesorului
     */
    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    /**
     * Getter pentru codIdentificare
     * @return codul de identificare al profesorului (imutabil)
     */
    public String getCodIdentificare() {
        return codIdentificare;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nume='" + nume + '\'' +
                ", specializare='" + specializare + '\'' +
                ", codIdentificare='" + codIdentificare + '\'' +
                '}';
    }
}