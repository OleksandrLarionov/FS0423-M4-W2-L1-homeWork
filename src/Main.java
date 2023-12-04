import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array = arrayDinumeriRandom(5);
        stampaArray(array);
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("inserisci un numero o '0'per uscire");
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 0) {
                break;
            }

            System.out.print("Inserisci la posizione (0 e 4): ");
            int posizione = Integer.parseInt(scanner.nextLine());

            controlloPosizione(posizione, array.length);
            array[posizione] = input;
            stampaArray(array);
        }
    }

    private static int[] arrayDinumeriRandom(int arrayLenght) {
        Random randomNumbers = new Random();
        int[] array = new int[arrayLenght];
        for (int i = 0; i < arrayLenght; i++) {
            array[i] = randomNumbers.nextInt(10) + 1;
        }
        return array;
    }

    private static void stampaArray(int[] ilMioArray) {
        System.out.println("Array attuale: " + Arrays.toString(ilMioArray));
    }

    private static void controlloPosizione(int posizione, int lunghezzaArray) {
        if (posizione < 0 || posizione >= lunghezzaArray) {
            throw new IllegalArgumentException("Posizione non valida. Inserisci un valore tra 0 e " + (lunghezzaArray - 1));
        }
    }
}