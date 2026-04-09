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

    /**
     * Constructor principal
     */
    public Vuelo(String numeroVuelo, String origen, String destino, Avion avion) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.avion = avion;
        this.estado = "Programado";

        this.pasajeros = new ListaEnlazada<>() {};
        this.colaAbordaje = new ColaEnlazada<>();
    }

    // ================= GETTERS =================
    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getEstado() {
        return estado;
    }

    public Avion getAvion() {
        return avion;
    }

    // ================= SETTERS =================
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
        System.out.println("Pasajero enviado a cola");
    }

    public void abordarPasajero() {
        Pasajero p = colaAbordaje.desencolar();

        if (p != null) {
            System.out.println("Abordando: " + p.getNombre());
        } else {
            System.out.println("No hay pasajeros en cola");
        }
    }

    // ================= MOSTRAR =================
    public String mostrar() {
        return "=== INFORMACIÓN DEL VUELO ==="
                + "\nNúmero: " + numeroVuelo
                + "\nOrigen: " + origen
                + "\nDestino: " + destino
                + "\nEstado: " + estado
                + "\nModelo avión: " + avion.getModelo()
                + "\nMatrícula: " + avion.getMatricula();
    }
}