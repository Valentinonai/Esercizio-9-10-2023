package Esercizio2;

import Esercizio2.exceptions.KilometersLessThanOne;
import Esercizio2.exceptions.LitersEqualToZero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Exit:
        while (true) {

            try {
                System.out.println("1:continua  0:Esci");
                int num = Integer.parseInt(input.nextLine());
                if (num == 1) {

                    try {
                        System.out.println("Inserisci il numero di chilometri percorsi");
                        double km = Double.parseDouble(input.nextLine());
                        System.out.println("Inserisci il numero di litri consumati");
                        double l = Double.parseDouble(input.nextLine());
                        System.out.println("Il consumo km/l è: " + calc(km, l));
                    } catch (NumberFormatException e) {
                        System.out.println("Non hai inserito un valore numerico");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                } else break Exit;
            } catch (NumberFormatException e) {
                System.out.println("Non hai inserito un valore numerico");
            }
        }
        input.close();
    }

    public static double calc(double km, double l) {
        if (l <= 0) throw new LitersEqualToZero("Il numero di litri non può essere inferiore a uno");
        else if (km <= 0) throw new KilometersLessThanOne("I km percorsi non possono essere inferiori a uno");
        else return km / l;
    }
}
