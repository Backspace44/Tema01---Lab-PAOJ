// Clasa de testare pentru demonstrarea ierarhiei și polimorfismului
public class TestVehicule {
    public static void main(String[] args) {
        // Crearea unor instanțe ale claselor derivate
        Masina masina1 = new Masina("Dacia", "Logan", 2021, "manuală", 4);
        Masina masina2 = new Masina("Toyota", "Corolla", 2022, "automată", 5);
        Motocicleta moto1 = new Motocicleta("Honda", "CBR", 2023, 125, "Sport");
        Motocicleta moto2 = new Motocicleta("Harley-Davidson", "Sportster", 2020, 1200, "Cruiser");
        Bicicleta bicicleta1 = new Bicicleta("Trek", "X-Caliber", 2022, "Mountain", 24);

        // Demonstrarea upcasting-ului prin stocarea obiectelor derivate în referințe de tipul Vehicul
        Vehicul[] vehicule = new Vehicul[5];
        vehicule[0] = masina1;    // Upcasting de la Masina la Vehicul
        vehicule[1] = masina2;    // Upcasting de la Masina la Vehicul
        vehicule[2] = moto1;      // Upcasting de la Motocicleta la Vehicul
        vehicule[3] = moto2;      // Upcasting de la Motocicleta la Vehicul
        vehicule[4] = bicicleta1; // Upcasting de la Bicicleta la Vehicul

        System.out.println("Demonstrarea polimorfismului prin apelarea metodei descriere() pentru fiecare vehicul:");
        System.out.println("----------------------------------------------------------------------");

        // Parcurgerea array-ului și apelarea metodei descriere() pentru fiecare obiect
        // Aceasta demonstrează polimorfismul - aceeași metodă are comportament diferit în funcție de tipul real al obiectului
        for (int i = 0; i < vehicule.length; i++) {
            System.out.println((i + 1) + ". " + vehicule[i].descriere());
        }

        System.out.println("\nDemonstrarea verificării tipului și downcast-ului:");
        System.out.println("----------------------------------------------------------------------");

        // Demonstrăm cum putem face downcast pentru a accesa metode specifice claselor derivate
        for (Vehicul vehicul : vehicule) {
            System.out.print("Vehiculul este de tip: ");

            if (vehicul instanceof Masina) {
                System.out.println("Mașină");
                // Downcast pentru a accesa metode specifice clasei Masina
                Masina m = (Masina) vehicul;
                System.out.println("   Tip transmisie: " + m.getTipTransmisie());
                System.out.println("   Număr uși: " + m.getNumarUsi());
            } else if (vehicul instanceof Motocicleta) {
                System.out.println("Motocicletă");
                // Downcast pentru a accesa metode specifice clasei Motocicleta
                Motocicleta moto = (Motocicleta) vehicul;
                System.out.println("   Putere: " + moto.getPutereCP() + " CP");
                System.out.println("   Categorie: " + moto.getCategorie());
            } else if (vehicul instanceof Bicicleta) {
                System.out.println("Bicicletă");
                // Downcast pentru a accesa metode specifice clasei Bicicleta
                Bicicleta b = (Bicicleta) vehicul;
                System.out.println("   Tip bicicletă: " + b.getTipBicicleta());
                System.out.println("   Număr viteze: " + b.getNumarViteze());
            }
            System.out.println();
        }
    }
}