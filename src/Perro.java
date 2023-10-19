public class Perro {
    private String nombre;
    private String raza;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void comer(String tipoComida, double cantidadGramos) {
        System.out.println(nombre + " está comiendo " + tipoComida + " en cantidad de " + cantidadGramos + " gramos.");
        // Puedes realizar acciones adicionales relacionadas con la comida aquí
    }

    public String ladrar() {
        return "guau guau";
    }
}
