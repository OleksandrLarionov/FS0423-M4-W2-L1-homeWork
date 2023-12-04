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
            try {
                int input = Integer.parseInt(scanner.nextLine());

                System.out.print("Inserisci la posizione (0 e 4): ");
                int posizione = Integer.parseInt(scanner.nextLine());

                array[posizione] = input;

                System.out.println("il nuovo array");
                stampaArray(array);

                if (input == 0) break;

            } catch (NumberFormatException ex) {
                log.error("hai inserito una stringa");
            } catch (ArrayIndexOutOfBoundsException ex) {
                log.error("sei fori dall'array");
            }
        }
        scanner.close();
    }

    private static int[] arrayDiNumeriRandom(int arrayLenght) {
        Random randomNumbers = new Random();
        int[] array = new int[arrayLenght];
        for (int i = 0; i < arrayLenght; i++) {
            array[i] = randomNumbers.nextInt(1, 11);
        }
        return array;
    }

    private static void stampaArray(int[] ilMioArray) {
        System.out.println("Array attuale: " + Arrays.toString(ilMioArray));
    }
}
