public class TestCarte {
    public static void main(String[] args) {
        Autor autor = new Autor("Eminescu", "Mihai");

        Carte carteOriginala = new Carte("Luceafarul", autor, 1883);

        // Demonstram supraincarcarea metodei afiseazaDetalii
        System.out.println("Metoda afiseazaDetalii() fara parametri:");
        carteOriginala.afiseazaDetalii();

        System.out.println("\nMetoda afiseazaDetalii(boolean() cu parametru true:");
        carteOriginala.afiseazaDetalii(true);

        // Demonstram suprascrierea metodei toString
        System.out.println("Rezultatul metodei toString(): " + carteOriginala);

        try {
            // 1. Demonstram constructorul de copiere (deep copy)
            System.out.println("\n1. Folosind constructorul de copiere (deep copy):");
            Carte copiePrinConstructor = new Carte(carteOriginala);

            System.out.println("Original: " + carteOriginala);
            System.out.println("Copie: " + copiePrinConstructor);

            System.out.println("\nModificare nume autor in copie:");
            copiePrinConstructor.getAutor().setNume("EminescuModificat");

            System.out.println("Original dupa modificare: " + carteOriginala);
            System.out.println("Copie dupa modificare: " + copiePrinConstructor);
            System.out.println("Observatie: Originalul ramane neschimbat deoarece constructorul a creat un nou obiect Autor.");

            // Restauram numele originalului
            copiePrinConstructor.getAutor().setNume("Eminescu");

            // 2. Demonstram shallow copy
            System.out.println("\n2. Folosind metoda shallowCopy():");
            Carte copieSuperficiala = carteOriginala.shallowCopy();

            System.out.println("Original: " + carteOriginala);
            System.out.println("Copie superficiala: " + copieSuperficiala);

            System.out.println("\nModificare nume autor in copia superificiala:");
            copieSuperficiala.getAutor().setNume("EminescuModificat");

            System.out.println("Original dupa modificare: " + carteOriginala);
            System.out.println("Copie superificiala dupa modificare: " + copieSuperficiala);
            System.out.println("Observatie: Ambele referinte s-au modificat deoarece ele indica acelasi obiect Autor.");

            copieSuperficiala.getAutor().setNume("Eminescu");

            //3. Demonstram deep copy
            System.out.println("\n3. Folosind metoda deepCopy():");
            Carte copieProfunda = carteOriginala.deepCopy();

            System.out.println("Original: " + carteOriginala);
            System.out.println("Copie profunda dupa modificare: " + copieProfunda);
            System.out.println("Observatie: Originalul ramane neschimbat deaorece metoda deepCopy a creat un nou obiect Autor.");

        } catch (CloneNotSupportedException e) {
            System.out.println("Eroare la clonarea obiectului: " + e.getMessage());
        }

    }
}
