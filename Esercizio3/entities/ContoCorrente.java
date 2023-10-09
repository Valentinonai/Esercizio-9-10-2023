package Esercizio3.entities;

public class ContoCorrente {
    private final int maxMovimenti = 50;
    double saldo;
    private String titolare;
    private int nMovimenti;

    public ContoCorrente(double saldo, String titolare) {
        this.saldo = saldo;
        this.titolare = titolare;
        nMovimenti = 0;
    }

    public void preleva(double x) {
        if (nMovimenti < maxMovimenti) {
            saldo = saldo - x;

        } else saldo = saldo - x - 0.5;
        nMovimenti++;
    }

    public double restituisciSaldo() {
        return saldo;
    }
}
