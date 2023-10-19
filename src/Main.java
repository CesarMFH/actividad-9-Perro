import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Perro perro1 = new Perro();
        System.out.print("Ingrese el nombre del primer perro: ");
        perro1.setNombre(scanner.nextLine());

        System.out.print("Ingrese la raza del primer perro: ");
        perro1.setRaza(scanner.nextLine());

        boolean edadValida = false;
        while (!edadValida) {
            try {
                System.out.print("Ingrese la edad del primer perro: ");
                perro1.setEdad(Integer.parseInt(scanner.nextLine()));
                edadValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido para la edad.");
            }
        }

        Perro perro2 = new Perro();
        System.out.print("Ingrese el nombre del segundo perro: ");
        perro2.setNombre(scanner.nextLine());

        System.out.print("Ingrese la raza del segundo perro: ");
        perro2.setRaza(scanner.nextLine());

        edadValida = false;
        while (!edadValida) {
            try {
                System.out.print("Ingrese la edad del segundo perro: ");
                perro2.setEdad(Integer.parseInt(scanner.nextLine()));
                edadValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido para la edad.");
            }
        }

        scanner.close();

        // Invocar los métodos para cada perro
        perro1.comer("croquetas", 300);
        System.out.println(perro1.getNombre() + " dice: " + perro1.ladrar());

        perro2.comer("premios", 400);
        System.out.println(perro2.getNombre() + " dice: " + perro2.ladrar());
    }
}