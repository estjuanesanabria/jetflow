public class Avion {

    private String modelo;
    private int capacidad;
    private String matricula;

    /**
     * Constructor principal
     */
    public Avion(String modelo, int capacidad, String matricula) {
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.matricula = matricula;
    }

    //  GETTERS 
    public String getModelo() {
        return modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getMatricula() {
        return matricula;
    }

    //  SETTERS 
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //  MOSTRAR 
    public String mostrar() {
        return "=== AVIÓN ==="
                + "\nModelo: " + modelo
                + "\nCapacidad: " + capacidad
                + "\nMatrícula: " + matricula;
    }
}