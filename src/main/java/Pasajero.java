public class Pasajero {
    private String nombre;
    private String documento;
    private String nacionalidad;
    private String numeroVuelo;
    private String estadoVuelo;
    private Vuelo vuelo;
    
    
     public Pasajero(String nombre, String documento, String nacionalidad) {
        this.nombre = nombre;
        this.documento = documento;
        this.nacionalidad = nacionalidad;
        this.estadoVuelo = "Sin asignar";
    }
     public void asignarVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
        this.numeroVuelo = vuelo.getNumeroVuelo();
        this.estadoVuelo = "Asignado";
    }
     public void cambiarEstadoVuelo(String estado){
         this.estadoVuelo = estado;
     }
     public String getNombre() {
        return nombre;
    }

    //agregar nombre (get, set nombre)
    //establecer id (get, set id)
    //estado de vuelo del pasajero (get,set estado)
    //asignar vuelo
    //mostrar informacion
    //
    //

    String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void cambiarEstado(String estado) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
