package Ejercicio1;

public class main {
    public static void main(String[] args) {
    	
        LibroDigital libro = new LibroDigital("El Eternauta");
        Audiolibro audiolibro = new Audiolibro("Rayuela");

        libro.mostrarDescripcion();
        audiolibro.mostrarDescripcion();
    }
}