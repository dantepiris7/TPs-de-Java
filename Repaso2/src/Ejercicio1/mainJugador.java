package Ejercicio1;

public class mainJugador {
	
    public static void main(String[] args) {
    	
        Jugador j1 = new Jugador("Dan");
        Jugador j2 = new Jugador("Mati");

        System.out.println("---------- INICIO DE LA PARTIDA ----------");
        System.out.println("Jugador: " + j1.getNombre() + ", de nivel " + j1.getNivel() + ", tiene " + j1.getPuntos() + " puntos");
        System.out.println("Jugador: " + j2.getNombre() + ", de nivel " + j2.getNivel() + ", tiene " + j2.getPuntos() + " puntos");

        System.out.println(j1.getNombre() + " suma 150 puntos");
        j1.ganarPuntos(150);

        System.out.println(j2.getNombre() + " suma 80 puntos");
        j2.ganarPuntos(80);
        
        System.out.println("Se le restan puntos a " + j1.getNombre());
        j1.ganarPuntos(-50); 
        
        System.out.println(j2.getNombre() + " subió de nivel");
        j2.subirNivel();

        System.out.println("---------- RESUMEN ----------");
        System.out.println(j1.getNombre() + " terminó en el nivel " + j1.getNivel() + " con " + j1.getPuntos() + " puntos");
        System.out.println(j2.getNombre() + " terminó en el nivel " + j2.getNivel() + " con " + j2.getPuntos() + " puntos");
    }
}