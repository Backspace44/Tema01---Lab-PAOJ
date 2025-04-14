// Clasa de baza Animal
abstract class Animal {
    public abstract void sunet();
}

// Clasa intermediara Mamifer
abstract class Mamifer extends Animal {
    protected String nume;

    public Mamifer(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }
}

// Clasa concreta Caine
class Caine extends Mamifer {
    public Caine(String nume) {
        super(nume);
    }

    @Override
    public void sunet() {
        System.out.println(nume + " latra: Ham! Ham!");
    }

    // Metoda specifica clasei Caine
    public void latra() {
        System.out.println(nume + " latra puternic: HAM! HAM! HAM!");
    }

    public void aduBatul() {
        System.out.println(nume + " aduce batul.");
    }
}

// Clasa concreta Pisica
class Pisica extends Mamifer {
    public Pisica(String nume) {
        super(nume);
    }

    @Override
    public void sunet() {
        System.out.println(nume + " miauna: Miau! Miau!");
    }

    // Metoda specifica clasei Pisica
    public void miauna() {
        System.out.println(nume + " miauna incet: miau... miau...");
    }

    public void toarce() {
        System.out.println(nume + " toarce: Prrr... Prrr...");
    }
}

public class TestAnimale {
    public static void main(String[] args) {
        // Crearea obiectelor de tip Caine si Pisica, stocate in variabile de tip Animal (upcasting)
        Animal animal1 = new Caine("Rex");
        Animal animal2 = new Pisica("Mitzi");
        Animal animal3 = new Caine("Bruno");
        Animal animal4 = new Pisica("Kitty");

        // Crearea unei colectii de animale
        Animal[] animale = {animal1, animal2, animal3, animal4};

        // Parcurgerea colectiei si verificarea tipului real al fiecarui obiect
        System.out.println("--- Parcurgem colectia de animale ---");
        for (Animal animal : animale) {
            // Apelarea metodei sunet() din clasa de baza
            animal.sunet();

            // Verificarea tipului cu instanceof si downcasting
            if (animal instanceof Caine) {
                // Downcasting - conversia de la tipul Animal la tipul Caine
                Caine caine = (Caine) animal;
                System.out.println("  Este un caine!");
                caine.latra();
                caine.aduBatul();
            } else if (animal instanceof Pisica) {
                // Downcasting - conversia de la tipul Animal la tipul Pisica
                Pisica pisica = (Pisica) animal;
                System.out.println("  Este o pisica!");
                pisica.miauna();
                pisica.toarce();
            }

            System.out.println(); // Linie goala pentru separare
        }
    }
}