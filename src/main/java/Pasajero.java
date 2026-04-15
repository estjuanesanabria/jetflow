public class Pasajero {

    private String nombre;
    private String documento;
    private String nacionalidad;
    private String estado;
    private Vuelo vuelo;

    public Pasajero(String nombre, String documento, String nacionalidad) {
        this.nombre = nombre;
        this.documento = documento;
        this.nacionalidad = nacionalidad;
        this.estado = "Registrado";
    }

    public String getNombre() {
        return nombre;
    }

    public void asignarVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
        this.estado = "Asignado";
    }
}
/**
 * Clase que representa un pasajero dentro del sistema de aeropuerto.
 * Permite almacenar la informacion personal del pasajero y su relacion
 * con un vuelo dentro del sistema.
 *
 * Atributos:
 * nombre: nombre completo del pasajero.
 * documento: identificacion unica del pasajero.
 * nacionalidad: pais de origen del pasajero.
 * estado: estado del pasajero dentro del sistema (registrado, asignado, etc).
 * vuelo: objeto que representa el vuelo asignado al pasajero.
 *
 * Constructor:
 * Inicializa un pasajero con su informacion personal y estado inicial.
 *
 * Metodos:
 * getNombre(): retorna el nombre del pasajero.
 * asignarVuelo(): asigna un vuelo al pasajero y actualiza su estado.
 */