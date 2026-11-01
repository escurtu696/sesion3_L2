package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import Banco.Cuenta;

public class CuentaTest {

    @Test
    public void testIngresarYRetirarBasico() {
        Cuenta cuenta = new Cuenta("12345", "Titular Test");
        
        cuenta.ingresar(100.0);
        assertEquals(100.0, cuenta.getSaldo()); 
        
        cuenta.retirar(50.0);
        assertEquals(50.0, cuenta.getSaldo());
    }
}