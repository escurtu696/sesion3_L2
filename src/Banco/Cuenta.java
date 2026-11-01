package Banco;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    String mNumero;
    String nTitular;
    List<Movimiento> mMovimientos;

    public Cuenta(String numero, String titular) {
        this.mNumero = numero;
        this.nTitular = titular;
        this.mMovimientos = new ArrayList<>();
    }

    public Cuenta(String numero, String titular, double saldoInicial) {
        this(numero, titular);
        if (saldoInicial > 0) {
            ingresar(saldoInicial, "Saldo inicial");
        }
    }

    public String getNumero() {
        return mNumero;
    }

    public String getTitular() {
        return nTitular;
    }

    public List<Movimiento> getMovimientos() {
        return mMovimientos;
    }

    public double getSaldo() {
        double saldo = 0.0;
        for (Movimiento m : mMovimientos) {
            if (m.getSigno() == Movimiento.Signo.H) {
                saldo += m.getImporte();
            } else if (m.getSigno() == Movimiento.Signo.D) {
                saldo -= m.getImporte();
            }
        }
        return saldo;
    }

    public void ingresar(double x) {
        ingresar(x, "Ingreso");
    }

    public void ingresar(double x, String concepto) {
        mMovimientos.add(new Movimiento(x, Movimiento.Signo.H, concepto));
    }

    public void retirar(double x) {
        retirar(x, "Reintegro");
    }

    public void retirar(double x, String concepto) {
        if (getSaldo() - x >= -500.0) { // Límite de descubierto
            mMovimientos.add(new Movimiento(x, Movimiento.Signo.D, concepto));
        } else {
            System.err.println("Fondos insuficientes (saldo " + getSaldo() + "€) para el reintegro de " + x + "€");
        }
    }
}