package Esercizio2.exceptions;

public class KilometersLessThanOne extends RuntimeException {
    public KilometersLessThanOne(String message) {
        super(message);
    }
}
