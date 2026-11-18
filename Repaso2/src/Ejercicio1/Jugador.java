package Ejercicio1;

public class Jugador {

	private String nombre;
    private int nivel;
    private int puntos;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
        this.puntos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntos() {
        return puntos;
    }

    public void ganarPuntos(int cantidad) {
        if (cantidad > 0) {
            this.puntos += cantidad;
        } else {
            System.out.println("No se deben sumar puntos negativos. La cantidad de puntos debe ser positiva");
        }
    }

    public void subirNivel() {
        this.nivel++;
    }
}