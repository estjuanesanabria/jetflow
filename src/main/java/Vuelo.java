import com.murcia.utils.ListaEnlazada;
import com.murcia.utils.ColaEnlazada;

public class Vuelo {

    private String numeroVuelo;
    private String origen;
    private String destino;
    private String estado;
    private Avion avion;

    private ListaEnlazada<Pasajero> pasajeros;
    private ColaEnlazada<Pasajero> colaAbordaje;

    // ================= CONSTRUCTOR BASE =================
    public Vuelo(String numeroVuelo, Avion avion) {
        this.numeroVuelo = numeroVuelo;
        this.avion = avion;
        this.estado = "Programado";

        pasajeros = new ListaEnlazada<>() {};
        colaAbordaje = new ColaEnlazada<>();
    }

    // ================= SOBRECARGA =================
    public Vuelo(String numeroVuelo, String origen, String destino, Avion avion) {
        this(numeroVuelo, avion);
        this.origen = origen;
        this.destino = destino;
    }

    // ================= GETTERS =================
    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // ================= PASAJEROS =================
    public void agregarPasajero(Pasajero p) {
        pasajeros.add(p);
        System.out.println("Pasajero agregado al vuelo");
    }

    public void agregarACola(Pasajero p) {
        colaAbordaje.encolar(p);
        System.out.println("Pasajero agregado a cola");
    }

    public void abordarPasajero() {
        Pasajero p = colaAbordaje.desencolar();

        if (p != null) {
            System.out.println("Abordando: " + p.getNombre());
        } else {
            System.out.println("No hay pasajeros en cola");
        }
    }

    // ================= MOSTRAR COLA =================
    public void mostrarCola() {
        ColaEnlazada<Pasajero> auxiliar = new ColaEnlazada<>();
        Pasajero p = colaAbordaje.desencolar();

        if (p == null) {
            System.out.println("No hay pasajeros en cola");
            return;
        }

        while (p != null) {
            System.out.println(p.getNombre());
            auxiliar.encolar(p);
            p = colaAbordaje.desencolar();
        }

        p = auxiliar.desencolar();

        while (p != null) {
            colaAbordaje.encolar(p);
            p = auxiliar.desencolar();
        }
    }

    // ================= MOSTRAR INFO =================
    public String mostrar() {
        return """
               === INFORMACION DEL VUELO ===
               N\u00famero: """ + numeroVuelo
                + "\nOrigen: " + origen
                + "\nDestino: " + destino
                + "\nEstado: " + estado
                + "\nAvión: " + avion.getModelo()
                + "\nMatrícula: " + avion.getMatricula();
    }
}
/**
 * Clase que representa un vuelo dentro del sistema de aeropuerto.
 * Permite gestionar la informacion del vuelo, incluyendo su numero,
 * origen, destino, estado y el avion asociado.
 *
 * Tambien administra la lista de pasajeros y la cola de abordaje
 * utilizando estructuras de datos como lista enlazada y cola.
 *
 * Atributos:
 * numeroVuelo: identificador unico del vuelo.
 * origen: ciudad de salida del vuelo.
 * destino: ciudad de llegada del vuelo.
 * estado: estado actual del vuelo (programado, retrasado, etc).
 * avion: objeto que representa el avion asignado al vuelo.
 * pasajeros: lista enlazada que almacena los pasajeros del vuelo.
 * colaAbordaje: cola que gestiona el orden de abordaje de los pasajeros.
 *
 * Constructores:
 * Inicializan el vuelo con sus datos basicos y estructuras necesarias.
 *
 * Metodos:
 * getNumeroVuelo(): retorna el numero del vuelo.
 * setEstado(): permite cambiar el estado del vuelo.
 * agregarPasajero(): agrega un pasajero a la lista del vuelo.
 * agregarACola(): agrega un pasajero a la cola de abordaje.
 * abordarPasajero(): permite abordar al siguiente pasajero en la cola.
 * mostrarCola(): muestra los pasajeros en orden de abordaje.
 * mostrar(): retorna la informacion general del vuelo.
 */