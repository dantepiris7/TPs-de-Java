package Ejercicio1;

public class LibroDigital extends MaterialDigital {

    public LibroDigital(String titulo) {
        super(titulo);
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println("Título: " + getTitulo() + ", se puede leer en pantalla");
    }
}