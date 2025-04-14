public class Masina extends Vehicul{
    private String tipTransmisie;
    private int numarUsi;

    // Constructor
    public Masina(String marca, String model, int anFabricatie, String tipTransmisie, int numarUsi) {
        super(marca, model, anFabricatie);
        this.tipTransmisie = tipTransmisie;
        this.numarUsi = numarUsi;
    }

    // Implementarea metodei abstracte
    @Override
    public String descriere() {
        return "Masina " + marca + " " + model + ", fabricata in " + anFabricatie +
                ", transmisie " + tipTransmisie + ", " + numarUsi + " usi.";
    }

    // getteri si setteri specifici
    public String getTipTransmisie() {
        return tipTransmisie;
    }

    public void setTipTransmisie(String tipTransmisie) {
        this.tipTransmisie = tipTransmisie;
    }

    public int getNumarUsi() {
        return numarUsi;
    }

    public void setNumarUsi(int numarUsi) {
        this.numarUsi = numarUsi;
    }
}
