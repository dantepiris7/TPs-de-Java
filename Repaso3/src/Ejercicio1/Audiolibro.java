package Ejercicio1;

public class Audiolibro extends MaterialDigital {

    public Audiolibro(String titulo) {
        super(titulo);
    }

    @Override
    public void mostrarDescripcion() {
        System.out.println("Título: " + getTitulo() + ", se puede escuchar");
    }
}
