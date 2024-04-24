import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir información de la persona
        System.out.println("Ingrese el primer nombre:");
        String primerNombre = scanner.nextLine();

        System.out.println("Ingrese el apellido:");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese el año de nacimiento:");
        int año = scanner.nextInt();

        System.out.println("Ingrese el mes de nacimiento:");
        int mes = scanner.nextInt();

        System.out.println("Ingrese el día de nacimiento:");
        int dia = scanner.nextInt();

        FrecuenciasCardiacas persona = new FrecuenciasCardiacas(primerNombre, apellido, año, mes, dia);

        // Imprimir información de la persona
        System.out.println("\nInformación de la persona:");
        System.out.println("Nombre: " + persona.getNombre() + " " + persona.getApellido());
        System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
        System.out.println("Edad: " + persona.obtenerEdad() + " años");

        // Calcular y mostrar frecuencia cardiaca máxima y rango esperado
        System.out.println("\nFrecuencia Cardiaca Máxima: " + persona.calcularFrecuenciaCardiacaMaxima() + " ppm");
        System.out.println("Rango de Frecuencia Cardiaca Esperada: " + persona.obtenerRangoFrecuenciaCardiacaEsperada() + " ppm");

        scanner.close();
    }
}