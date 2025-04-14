public class StatisticsCalculator {
    public static void main(String[] args) {
        // Verificam daca avem suficiente argumente
        if (args.length < 3) {
            System.out.println("Eroare: Aplicatia necesita cel putin trei argumente (doua numere intregi si unul real).");
            System.out.println("Exemplu: java StatisticsCalculator 10 20 3.5");
            return;
        }

        try {
            // Conversie din String in tipuri primitive
            int firstNumber = Integer.parseInt(args[0]);
            int secondNumber = Integer.parseInt(args[1]);
            double thirdNumber = Double.parseDouble(args[2]);

            // Utilizam wrapper-uri pentru a demonstra conversia
            Integer firstWrapper = Integer.valueOf(firstNumber);
            Integer secondWrapper = Integer.valueOf(secondNumber);
            Double thirdWrapper = Double.valueOf(thirdNumber);

            // Calculul sumei folosind wrapper-uri si unboxing automat
            double sum = firstWrapper + secondWrapper + thirdWrapper;

            // Calculul mediei
            double average = sum / 3;

            // Calculul produsului
            double product = firstWrapper * secondWrapper * thirdWrapper;

            // Afisare rezultate
            System.out.printf("Suma: %.2f, Media: %.2f, Produsul: %.2f%n", sum, average, product);

            // Demonstratie de instructiuni de control - verificam daca produsul este pozitiv
            if (product > 0) {
                System.out.println("Produsul este un numar pozitiv.");
            } else if (product < 0) {
                System.out.println("Produsul etse un numar negativ.");
            } else {
                System.out.println("Produsul este zero.");
            }

            // Utilizam switch pentru a clasifica suma
            // Convertim suma la int pentru a o folosi in switch
            int sumCategory = (int)(sum / 10);
            switch (sumCategory) {
                case 0:
                    System.out.println("Suma este mica (sub 10).");
                    break;
                case 1:
                    System.out.println("Suma este moderata (intre 10 si 19).");
                    break;
                default:
                    System.out.println("Suma este mare (20 sau mai mult).");
                    break;
            }

        } catch (NumberFormatException e) {
            System.out.println("Eroare: Unul dintre argumente nu este un numar valid.");
            System.out.println("Asigurati-va ca primele doua argumente sunt numere intregi si al treilea este un numar real.");
        } catch (ArithmeticException e) {
            System.out.println("Eroare de calcul: " + e.getMessage());
        }
    }
}
