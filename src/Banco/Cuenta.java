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

    public double getSaldo() {
        return -1.0; // Devuelve un valor erróneo para que la prueba falle (FASE RED)[cite: 3]
    }

    public void ingresar(double x) {
        // Sin implementar
    }

    public void retirar(double x) {
        // Sin implementar
    }
}