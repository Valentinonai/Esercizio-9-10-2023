package Esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        int[] array = fillArray();
        Scanner input = new Scanner(System.in);

        log.info(Arrays.toString(array));

        Exit:
        while (true) {
            try {

                log.info("Inserisci l'indice dell'array di cinque elementi da visualizzare");
                int n = Integer.parseInt(input.nextLine()) - 1;

                if (n == -1) break Exit;
                else log.info("Il numero in posizione " + n + " è: " + array[n]);

            } catch (ArrayIndexOutOfBoundsException e) {
                log.info("Posizione dell'array inesistente");

            } catch (NumberFormatException e) {
                log.info("Non hai inserito un valore valido");

            } catch (Exception e) {
                log.info(e.getMessage());
            }
        }
        input.close();

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
