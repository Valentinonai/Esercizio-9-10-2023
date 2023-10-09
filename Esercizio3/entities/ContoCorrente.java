package Esercizio3.entities;

import Esercizio3.exceptions.BancaException;

public class ContoCorrente {
    protected final int maxMovimenti = 50;
    protected double saldo;
    protected String titolare;
    protected int nMovimenti;

    public ContoCorrente(String titolare, double saldo) {
        this.saldo = saldo;
        this.titolare = titolare;
        nMovimenti = 0;
    }

    public void preleva(double x) throws BancaException {
        if (nMovimenti < maxMovimenti) {
            saldo = saldo - x;

        } else saldo = saldo - x - 0.5;

        if (this.saldo < 0) throw new BancaException("Il conto è in rosso");
        nMovimenti++;
    }

    public double restituisciSaldo() {
        return saldo;
    }
}
