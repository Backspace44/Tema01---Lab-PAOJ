import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Citirea unei liste de numere de la utilizator
        System.out.println("Introduceti cel putin 5 numere intregi separate prin spatiu:");
        String input = scanner.nextLine();

        // Impartirea sirului de intrare in cuvinte individuale
        String[] numberStrings = input.split(" ");

        // Verificam daca utilizatorul a introdus suficiente numere
        if (numberStrings.length < 5) {
            System.out.println("Eroare: Trebuie sa introduceti cel putin 5 numere.");
            scanner.close();
            return;
        }

        // Conversia sirurilor in numere intregi si stocarea lor intr-un array
        int[] numbers = new int[numberStrings.length];
        Integer[] wrappedNumbers = new Integer[numberStrings.length]; // Array de wrapper-uri

        try {
            for (int i = 0; i < numberStrings.length; i++) {
                // Conversia String -> Integer (wrapper) -> int (primitiv)
                Integer wrappedValue = Integer.valueOf(numberStrings[i]);
                numbers[i] = wrappedValue.intValue(); // Unboxing explicit
                wrappedNumbers[i] = wrappedValue;
            }
        } catch (NumberFormatException e) {
            System.out.println("Eroare: Toti termenii introdusi trebuie sa fie numere intregi valide.");
            scanner.close();
            return;
        }

        // Afisarea array-ului initial
        System.out.println("Array-ul initial: " + Arrays.toString(numbers));

        // Pastram primul numar pentru a-l cauta mai tarziu
        int firstNumber = numbers[0];

        // Sortarea array-ului
        Arrays.sort(numbers);

        // Afisarea array-ului sortat, demonstrand modificarea prin referinta
        System.out.println("Array-ul sortat: " + Arrays.toString(numbers));

        // Demonstram conversia intre array-ul de primitive si cel de wrapper-uri
        System.out.println("Conversia intre tipuri:");
        for (int i = 0; i < numbers.length; i++) {
            // Conversia int (primitiv) -> Integer (wrapper)
            wrappedNumbers[i] = Integer.valueOf(numbers[i]);
            System.out.println("Elementul " + i + ": primitiv=" + numbers[i] +
                               ", wrapper=" + wrappedNumbers[i]);
        }

        // Cautarea primului numar folosind binarySearch
        int position = Arrays.binarySearch(numbers, firstNumber);

        if (position >= 0) {
            System.out.println("\nPrimul numar introdus (" + firstNumber +
                                ") a fost gasit la pozitia " + position + " in array-ul sortat.");
        } else {
            System.out.println("\nPrimul numar introdus (" + firstNumber +
                               ") nu a fost gasit in array-ul sortat.");
        }

        scanner.close();
    }
}
