/**
 * Clasa de test pentru demonstrarea accesului modificatorilor, agregarii si compozitiei
 */
public class TestAccesModificatori {
    public static void main(String[] args) {
        // Cream un array de studenti (demonstreaza agregarea)
        String[] studentiProgramare = {"Ana Popescu", "Mihai Ionescu", "Elena Vasilescu",
                "Cristian Dumitrescu", "Diana Marinescu"};

        // Cream un curs (demonstreaza compozitia, profesorul este creat in interiorul constructorului)
        Curs cursProgramare = new Curs(
                "Programare Avansata",
                6,
                "Ion Georgescu",
                "Informatica",
                "PROF123",
                studentiProgramare
        );
        
        cursProgramare.afiseazaInformatii();
        
        // Accesam si modificam proprietatile cursului
        System.out.println("Denumire curs: " + cursProgramare.getDenumire());
        System.out.println("Modificam denumirea cursului...");
        cursProgramare.setDenumire("Programare Avansata in Java");

        // Accesam si modificam proprietatile profesorului (demonstreaza compozitia)
        Profesor profesor = cursProgramare.getProfesor();
        System.out.println("Nume profesor: " + profesor.getNume());
        System.out.println("Modificam numele profesorului...");
        profesor.setNume("Andrei Georgescu");

        // incercam sa accesam codul de identificare (nu putem modifica, fiind final)
        System.out.println("Cod identificare profesor (imutabil): " + profesor.getCodIdentificare());
        // Nu putem face: profesor.setCodIdentificare("ALTCOD"); - nu exista setter pentru un camp final

        // Demonstram agregarea adaugand un nou student
        cursProgramare.adaugaStudent("Victor Popa");
        
        cursProgramare.afiseazaInformatii();
        
        System.out.println("Curs -> Profesor: Relatie de compozitie (profesorul exista doar in contextul cursului)");
        System.out.println("Curs -> Studenti: Relatie de agregare (studentii exista independent de curs)");
        System.out.println("Acces private: toate atributele sunt private si accesibile doar prin getteri si setteri");
        System.out.println("Atribut final: codIdentificare nu poate fi modificat dupa initializare");
    }
}