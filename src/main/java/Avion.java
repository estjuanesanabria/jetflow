public class Avion {

    private String modelo;
    private int capacidad;
    private String matricula;

    public Avion(String modelo, int capacidad, String matricula) {
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public String mostrar() {
        return "Modelo: " + modelo
                + "\nCapacidad: " + capacidad
                + "\nMatrícula: " + matricula;
    }
}