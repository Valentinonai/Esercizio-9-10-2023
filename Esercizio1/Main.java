package Esercizio1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array = fillArray();
        Scanner input = new Scanner(System.in);

        Exit:
        while (true) {
            try {

                System.out.println("Inserisci l'indice dell'array di cinque elementi da visualizzare");
                int n = Integer.parseInt(input.nextLine()) - 1;

                if (n == -1) break Exit;
                else System.out.println("Il numero in posizione " + n + " è: " + array[n]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posizione dell'array inesistente");

            } catch (NumberFormatException e) {
                System.out.println("Non hai inserito un valore valido");

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public static int[] fillArray() {
        int[] array = new int[5];
        Random x = new Random();
        for (int i = 0; i < array.length; i++) {
            int n = x.nextInt(1, 10);

            for (int j = 0; j < i; j++) {
                if (array[j] == n) {
                    i--;
                    break;
                }
            }
            array[i] = n;

        }
        return array;
    }
}
