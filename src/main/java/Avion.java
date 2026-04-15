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
/**
 * Clase que representa un avion dentro del sistema.
 * Esta clase almacena la informacion basica de un avion,
 * incluyendo su modelo, capacidad y matricula, y se utiliza
 * para asociar un avion a un vuelo dentro del sistema.
 *
 * Atributos:
 * modelo: representa el modelo del avion.
 * capacidad: indica la cantidad maxima de pasajeros que puede transportar.
 * matricula: identificador unico del avion.
 *
 * Constructor:
 * Inicializa un avion con su modelo, capacidad y matricula.
 *
 * Metodos:
 * getModelo(): retorna el modelo del avion.
 * getMatricula(): retorna la matricula del avion.
 */