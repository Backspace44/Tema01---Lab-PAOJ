
public class Carte implements Cloneable {
    private String titlu;
    private Autor autor;
    private int anAparitie;

    public Carte(String titlu, Autor autor, int anAparitie) {
        this.titlu = titlu;
        this.autor = autor;
        this.anAparitie = anAparitie;
    }

    public Carte(Carte altaCarte) {
        this.titlu = altaCarte.titlu;
        this.autor = new Autor(altaCarte.autor.getNume(), altaCarte.autor.getPrenume());
        this.anAparitie = altaCarte.anAparitie;
    }

    // Supraincarcare: afiseaza toate detaliile cartii

    public void afiseazaDetalii() {
        System.out.println("Carte: " + titlu);
        System.out.println("Autor: " + autor.getPrenume() + " " + autor.getNume());
        System.out.println("An aparitie: " + anAparitie);
    }

    // Supraincarcare: afiseaza doar titlul si autorul

    public void afisezaDetalii(boolean formatScurt) {
        if (formatScurt) {
            System.out.println("Carte: " + titlu + " de " + autor.getPrenume() + " " + autor.getNume());
        } else {
            afiseazaDetalii();
        }
    }

    // Suprascrierea metodei toString() din clasa Object

    @Override
    public String toString() {
        return "Carte{" +
                "titlu='" + titlu + '\'' +
                ", autor ='" + autor + '\'' +
                ", anAparitie=" + anAparitie +
                '}';
    }

    // Creeaza o copie superficiala (shallow copy) a obiectului

    public Carte shallowCopy() throws CloneNotSupportedException {
        return (Carte) super.clone();
    }

    // Creeaza o copie superficiala (deep copy) a obiectului

    public Carte deepCopy() throws CloneNotSupportedException {
        Carte clona = (Carte) super.clone();
        // Cream o noua instanta a clasei Autor cu aceleasi valori
        clona.autor = new Autor(this.autor.getNume(), this.autor.getPrenume());
        return clona;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String Titlu) {
        this.titlu = titlu;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getAnAparitie() {
        return anAparitie;
    }

    public void setAnAparitie(int anAparitie) {
        this.anAparitie = anAparitie;
    }
}
