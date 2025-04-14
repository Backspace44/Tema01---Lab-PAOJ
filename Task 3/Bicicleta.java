// O a treia clasa derivata pentru a demonstra polimorfismul cu mai multe clase
public class Bicicleta extends Vehicul {
    // Atribute specifice pentru bicicleta
    private String tipBicicleta;
    private int numarViteze;

    // Constructor
    public Bicicleta(String marca, String model, int anFabricatie, String tipBicicleta, int numarViteze) {
        super(marca, model, anFabricatie);
        this.tipBicicleta = tipBicicleta;
        this.numarViteze = numarViteze;
    }

    // Implementarea metodei abstracte
    @Override
    public String descriere() {
        return "Bicicleta " + marca + " " + model + ", fabricata in " + anFabricatie +
                ", tip " + tipBicicleta + ", " + numarViteze + " viteze.";
    }

    // Getteri si setteri specifici
    public String getTipBicicleta() {
        return tipBicicleta;
    }

    public void setTipBicicleta(String tipBicicleta) {
        this.tipBicicleta = tipBicicleta;
    }

    public int getNumarViteze() {
        return numarViteze;
    }

    public void setNumarViteze(int numarViteze) {
        this.numarViteze = numarViteze;
    }
}