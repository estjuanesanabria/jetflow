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