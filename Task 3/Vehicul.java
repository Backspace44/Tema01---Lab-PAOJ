// Clasa abstracta Vehicul
public abstract class Vehicul {
    // Atribute comune tuturor vehciulelor
    protected String marca;
    protected String model;
    protected int anFabricatie;

    // Constructor
    public Vehicul(String marca, String model, int anFabricatie) {
        this.marca = marca;
        this.model = model;
        this.anFabricatie = anFabricatie;
    }

    // Metoda abstracta ce va fi implementata de clasele derivate
    public abstract String descriere();

    // Getteri si setteri
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }
}
