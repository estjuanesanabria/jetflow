//Juan Esteban Sanabria - 6014495, Katherine Ortega Contreras - 6014550



public class Aereopuerto {

private String nombre;
private Vuelo vuelo;
private Pasajero pasajero;
private Avion avion;
    public static void main(String[] args) {
    }
          // Registrar vuelo
    public void registrarVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
        System.out.println("Vuelo registrado: " + vuelo.getNumeroVuelo());// void
    }

    // Modificar estado del vuelo
    public void modificarEstadoVuelo(String estado) {
        if (vuelo != null) {
            vuelo.setEstado(estado);
            System.out.println("Estado del vuelo cambiado a: " + estado);
        } else {
            System.out.println("No hay vuelo registrado.");
        }
    }

//los metodos a usar en la clase aereopuerto son los siguientes:
//registrar vuelo, modificar vuelo
//registrar pasajero, modificar pasajero
//asignar pasajero a vuelo
//ver estado de vuelo, ver estado de pasajero
//mostrar vuelos, mostrar pasajeros
        
    }
    

