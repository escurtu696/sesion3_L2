package Banco;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    String mNumero;
    String nTitular;
    List<Movimiento> mMovimientos;
    private double saldoTemp; // Variable rápida para poner en verde la prueba[cite: 4]

    public Cuenta(String numero, String titular) {
        this.mNumero = numero;
        this.nTitular = titular;
        this.mMovimientos = new ArrayList<>();
        this.saldoTemp = 0.0;
    }

    public double getSaldo() {
        return this.saldoTemp;
    }

    public void ingresar(double x) {
        this.saldoTemp += x;
    }

    public void retirar(double x) {
        this.saldoTemp -= x;
    }
}