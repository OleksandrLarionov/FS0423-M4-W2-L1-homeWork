package ES1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        int[] array = arrayDiNumeriRandom(5);
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

        //        log.info("HOla");
        //        log.error("ULALA");
        scanner.close();
    }

    private static int[] arrayDiNumeriRandom(int arrayLenght) {
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
//            throw new IllegalArgumentException("Posizione non valida. Inserisci un valore tra 0 e " + (lunghezzaArray - 1));
            log.error("Posizione non valida. Inserisci un valore tra 0 e " + (lunghezzaArray - 1));
        }
    }
}