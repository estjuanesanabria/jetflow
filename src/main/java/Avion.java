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

    public String getMatricula() {
        return matricula;
    }
}