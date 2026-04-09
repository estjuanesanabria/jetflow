import com.murcia.utils.ListaEnlazada;
import com.murcia.utils.ColaEnlazada;

public class Vuelo {

    private String numeroVuelo;
    private String origen;
    private String destino;
    private String estado;
    private Avion avion;

    // Librerías del profe
    private ListaEnlazada<Pasajero> pasajeros;
    private ColaEnlazada<Pasajero> colaAbordaje;

    /**
     * Constructor
     */
    public Vuelo(String numeroVuelo, Avion avion) {
        this.numeroVuelo = numeroVuelo;
        this.avion = avion;
        this.origen = "Bogotá";
        this.destino = "Medellín";
        this.estado = "Programado";

        pasajeros = new ListaEnlazada<>();
        colaAbordaje = new ColaEnlazada<>();
    }

    // ================= MÉTODOS =================

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Registra pasajero en la lista del vuelo
     */
    public void agregarPasajero(Pasajero p) {
        pasajeros.add(p);
    }

    /**
     * Agrega pasajero a la cola de abordaje
     */
    public void agregarACola(Pasajero p) {
        colaAbordaje.encolar(p);
    }

    /**
     * Aborda pasajero
     */
    public Pasajero abordar() {
        return colaAbordaje.desencolar();
    }

    /**
     * Muestra datos
     */
    public String mostrar() {
        return "Vuelo: " + numeroVuelo
                + "\nOrigen: " + origen
                + "\nDestino: " + destino
                + "\nEstado: " + estado
                + "\nAvion: " + avion.getModelo()
                + "\nMatricula: " + avion.getMatricula();
    }
}