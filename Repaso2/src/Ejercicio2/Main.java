package Ejercicio2;

public class Main {
	
    public static void main(String[] args) {
    	
        Docente docente = new Docente("Dante Piris", 22, "Inglés");
        Preceptor preceptor = new Preceptor("Matías Mika", 22, "4to Año");

        System.out.println("Datos iniciales:");
        docente.mostrarInformacion();
        preceptor.mostrarInformacion();

        preceptor.setEdad(23);
        System.out.println("El preceptor " + preceptor.getNombre() + " ahora tiene " + preceptor.getEdad());
        preceptor.mostrarInformacion();
    }
}