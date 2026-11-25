package Ejercicio2;

public class Tarjeta extends MedioPago {
    private String ultimosCuatroDigitos;

    public Tarjeta(String titular, String ultimosCuatroDigitos) {
        super(titular);
        this.ultimosCuatroDigitos = ultimosCuatroDigitos;
    }

    @Override
    public void procesarPago(double monto) {
        if (monto > 0) {
            System.out.println("Pago con Tarjeta (terminada en " + ultimosCuatroDigitos + ") a nombre de " + getTitular() + " por $" + monto);
        } else {
            System.out.println("El monto a pagar con tarjeta debe ser mayor que cero");
        }
    }
}
