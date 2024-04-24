import java.time.LocalDate;
import java.time.Period;

public class FrecuenciasCardiacas {

    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

    // Constructor
    public FrecuenciasCardiacas(String nombre, String apellido, int anio, int mes, int dia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = LocalDate.of(anio, mes, dia);
    }

    // Método para calcular la edad
    public int obtenerEdad() {
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    }

    // Método para calcular la frecuencia cardíaca máxima
    public int calcularFrecuenciaCardiacaMaxima() {
        return 220 - this.obtenerEdad();
    }

    // Método para calcular el rango de frecuencia cardíaca esperada
    public String obtenerRangoFrecuenciaCardiacaEsperada() {
        int maxima = this.calcularFrecuenciaCardiacaMaxima();
        double limiteInferior = maxima * 0.50;
        double limiteSuperior = maxima * 0.85;
        return String.format("%.0f - %.0f", limiteInferior, limiteSuperior);
    }

    // Método para imprimir la información de la persona
    public void imprimirInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Fecha de Nacimiento: " + this.fechaNacimiento);
        System.out.println("Edad: " + this.obtenerEdad());
        System.out.println("Frecuencia Cardíaca Máxima: " + this.calcularFrecuenciaCardiacaMaxima());
        System.out.println("Rango de Frecuencia Cardíaca Esperada: " + this.obtenerRangoFrecuenciaCardiacaEsperada());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}


