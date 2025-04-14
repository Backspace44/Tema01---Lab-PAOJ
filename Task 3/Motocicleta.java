public class Motocicleta extends Vehicul{
    private int putereCP;
    private String categorie;

    public Motocicleta(String marca, String model, int anFabricatie, int putereCP, String categorie) {
        super(marca, model, anFabricatie);
        this.putereCP = putereCP;
        this.categorie = categorie;
    }

    // Implementarea metodei abstracte
    @Override
    public String descriere() {
        return "Motocicleta " + marca + " " + model + ", fabricata in " + anFabricatie +
                ", putere " + putereCP + " CP, categorie " + categorie + ".";
    }

    // Getteri si setteri specifici
    public int getPutereCP() {
        return putereCP;
    }

    public void setPutereCP(int putereCP) {
        this.putereCP = putereCP;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
}
