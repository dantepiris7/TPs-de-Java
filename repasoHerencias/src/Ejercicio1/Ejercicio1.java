package Ejercicio1;

public class Ejercicio1 {

	public static class Persona {
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
    }

    public static class Empleado extends Persona {
        private double salario;

        public Empleado(String nombre, int edad, double salario) {
            super(nombre, edad);  // permite al constructor heredar de Persona
            this.salario = salario;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public void mostrarDatos() {
            System.out.println("Nombre: " + getNombre());
            System.out.println("Edad: " + getEdad());
            System.out.println("Salario: " + salario);
        }
    }

    public static void main(String[] args) {

        Empleado emp = new Empleado("Dante Piris", 18, 250000.0);
        emp.mostrarDatos();
    }
}
