package Ejercicio2;

public class BilleteraVirtual extends MedioPago {
    private String nombreAplicacion;

    public BilleteraVirtual(String titular, String nombreAplicacion) {
        super(titular);
        this.nombreAplicacion = nombreAplicacion;
    }

    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            System.out.println("Pago con Billetera Virtual (" + nombreAplicacion + ") de " + getTitular() + " por $" + monto);
        } else {
            System.out.println("El monto a pagar con billetera virtual debe ser mayor que cero");
        }
    }
}