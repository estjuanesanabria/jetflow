/**
 * Representa un avión
 */
public class Avion {

    private String modelo;
    private int capacidad;
    private String matricula;

    /**
     * Constructor
     */
    public Avion(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.matricula = matricula;

    }
 public String getMatricula() {
        return matricula;
    }
    /**
     * Muestra información del avión
     */
    public String mostrar() {
        return "Modelo: " + modelo +
               " | Capacidad: " + capacidad +
               " | Matrícula: " + matricula;
    }
  //establecer modelo(get, set modelo)
    //establecer matricula (get , set matricula)
    //establecer capacidad (get, set capacidad)
    //mostrar informacion
    

}
