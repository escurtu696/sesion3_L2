package Banco;

public class Movimiento {
    public enum Signo { D, H }

    private double mImporte;
    private Signo mSigno;
    private String mDetalle;

    public Movimiento(double importe, Signo signo, String detalle) {
        this.mImporte = importe;
        this.mSigno = signo;
        this.mDetalle = detalle;
    }

    public double getImporte() {
        return mImporte;
    }

    public Signo getSigno() {
        return mSigno;
    }

    public String getDetalle() {
        return mDetalle;
    }
}