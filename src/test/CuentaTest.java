package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import Banco.Cuenta; // Importamos la clase Cuenta del paquete Banco

public class CuentaTest {

    @Test
    public void testIngresarYRetirarBasico() {
        Cuenta cuenta = new Cuenta("12345", "Titular Test");
        cuenta.ingresar(100.0);
        assertEquals(100.0, cuenta.getSaldo());

        cuenta.retirar(50.0);
        assertEquals(50.0, cuenta.getSaldo());
    }

    @Test
    public void test0014_CuentaCorrienteDescubierto() {
        Cuenta cuenta12345 = new Cuenta("12345", "Titular 1", 50.0);
        Cuenta cuenta67890 = new Cuenta("67890", "Titular 2", 0.0);

        cuenta12345.retirar(200.0);
        cuenta67890.retirar(350.0);
        cuenta12345.ingresar(100.0);
        cuenta67890.retirar(200.0);
        cuenta67890.retirar(150.0);
        cuenta12345.retirar(200.0);
        cuenta67890.ingresar(50.0);
        cuenta67890.retirar(100.0);

        assertEquals(-250.0, cuenta12345.getSaldo(), 0.001);
        assertEquals(-450.0, cuenta67890.getSaldo(), 0.001);
    }
}