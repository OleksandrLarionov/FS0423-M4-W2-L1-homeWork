package ES2;

import java.util.Scanner;

public class EsercizioDue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Inserisci il numero di km percorsi...");
            double kilometriPercorsi = Double.parseDouble(scanner.nextLine());

            System.out.println("Inserisci i litri di carburante consumati...");
            double carburanteConsumato = Double.parseDouble(scanner.nextLine());

            double consumo = calcoloConsumoAlKm(kilometriPercorsi, carburanteConsumato);

            System.out.println("Il consimo dell'auto è" + consumo + "km/l");

        } catch (Exception e) {
            System.err.println("Errore: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    private static void verificaLitriConsumati(double litriConsumati) throws IllegalAccessException {
        if (litriConsumati == 0) {
            throw new IllegalAccessException("non puoi aver consumato 0 litri");
        }
    }

    private static double calcoloConsumoAlKm(double kilometriPercorsi, double carburanteConsumato) {
        return kilometriPercorsi / carburanteConsumato;
    }
}
