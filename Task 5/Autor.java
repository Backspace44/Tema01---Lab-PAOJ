// Clasa Autor folosita pentru a demonstra diferenta intre copii superficiale si profunde

public class Autor {
    private String nume;
    private String prenume;

    public Autor(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    @Override
    public String toString() {
        return prenume + " " + nume;
    }
}
