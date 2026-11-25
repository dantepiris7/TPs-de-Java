package Ejercicio2;

public class Main {
    public static void main(String[] args) {
    	
        Tarjeta tarjeta = new Tarjeta("Dante Piris", "4589");
        BilleteraVirtual billetera = new BilleteraVirtual("Matias Mika", "Mercado Pago");

        tarjeta.procesarPago(15000.50);
        billetera.procesarPago(8200.00);

        tarjeta.procesarPago(-500); // con monto invalido
    }
}