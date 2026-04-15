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