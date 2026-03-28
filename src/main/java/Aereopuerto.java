
import com.murcia.utils.Input;

//Juan Esteban Sanabria - 6014495, Katherine Ortega Contreras - 6014550
public class Aereopuerto {

private String nombre;
private Vuelo vuelo;
private Pasajero pasajero;
private Avion avion;
    
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
    //registrar pasajero
    public void registrarPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
        System.out.println("Pasajero registrado: " + pasajero.getNombre());
    }
    //Modificasr estado del pasajero    
        public void modificarEstadoPasajero(String estado) {
        if (pasajero != null) {
            pasajero.cambiarEstado(estado);
            System.out.println("Estado del pasajero cambiado a: " + estado);
        } else {
            System.out.println("No hay pasajero registrado.");
        }
    }
    public void asignarPasajeroAVuelo() {
        if (pasajero != null && vuelo != null) {
            pasajero.asignarVuelo(vuelo);
            System.out.println("Pasajero asignado al vuelo correctamente");
        } else {
            System.out.println("Debe registrar vuelo y pasajero primero");
        }
    }
    
public void mostrar() {
        System.out.println("\n=== DATOS ===");

        if (vuelo != null) {
            System.out.println(vuelo.mostrar());
        } else {
            System.out.println("No hay vuelo");
        }

        if (pasajero != null) {
            System.out.println(pasajero.mostrar());
        } else {
            System.out.println("No hay pasajero");
        }
    }
//TODO VA CON LISTAS ENLAZADAS
//los metodos a usar en la clase aereopuerto son los siguientes:
//registrar vuelo, modificar vuelo
//registrar pasajero, modificar pasajero
//asignar pasajero a vuelo
//ver estado de vuelo, ver estado de pasajero
//mostrar vuelos, mostrar pasajeros
        
    }
    

