public class Pasajero {

    private String nombre;
    private String documento;
    private String nacionalidad;
    private String estado;
    private Vuelo vuelo;

    /**
     * Constructor
     */
    public Pasajero(String nombre, String documento, String nacionalidad) {
        this.nombre = nombre;
        this.documento = documento;
        this.nacionalidad = nacionalidad;
        this.estado = "Registrado";
    }

    // ================= GETTERS =================
    public String getNombre() {
        return nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getEstado() {
        return estado;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    // ================= SETTERS =================
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void asignarVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
        this.estado = "Asignado a vuelo";
    }

    // ================= MOSTRAR =================
    public String mostrar() {
        String infoVuelo = (vuelo != null)
                ? vuelo.getNumeroVuelo()
                : "Sin vuelo";

        return "=== PASAJERO ==="
                + "\nNombre: " + nombre
                + "\nDocumento: " + documento
                + "\nNacionalidad: " + nacionalidad
                + "\nEstado: " + estado
                + "\nVuelo: " + infoVuelo;
    }
}