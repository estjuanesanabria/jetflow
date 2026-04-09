
import com.murcia.utils.Input;
import com.murcia.utils.ColaEnlazada;   
import com.murcia.utils.Menu;
//Juan Esteban Sanabria - 6014495, Katherine Ortega Contreras - 6014550
public class Aereopuerto {

private String nombre;
private Vuelo vuelo;
private Pasajero     pasajero;
private Avion avion;
private ColaEnlazada<Pasajero> colaAbordaje;
    
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
public static void main(String[] args) {

    Aereopuerto a = new Aereopuerto();

    String[] opciones = {
        "Registrar vuelo",
        "Cambiar estado del vuelo",
        "Registrar pasajero",
        "Asignar pasajero al vuelo",
        "Enviar pasajero a cola",
        "Mostrar cola",
        "Abordar pasajero",
        "Mostrar vuelo",
        "Salir"
    };

    Menu menu = new Menu(opciones, 'N', "-", "SISTEMA AEROPUERTO");

    char op;

    do {
        op = menu.select("Seleccione una opción");

        switch (op) {

            case '1':
                System.out.print("Código del vuelo: ");
                String codigo = Input.readString();

                System.out.print("Origen: ");
                String origen = Input.readString();

                System.out.print("Destino: ");
                String destino = Input.readString();

                System.out.print("Matrícula: ");
                String matricula = Input.readString();

                a.avion = new Avion("Boeing 737", 180, matricula);
                a.vuelo = new Vuelo(codigo, origen, destino, a.avion);

                System.out.println("Vuelo registrado");
                break;

            case '2':
                if (a.vuelo != null) {
                    System.out.print("Nuevo estado: ");
                    a.vuelo.setEstado(Input.readString());
                }
                break;

            case '3':
                System.out.print("Nombre: ");
                String nombre = Input.readString();

                System.out.print("Documento: ");
                String documento = Input.readString();

                System.out.print("Nacionalidad: ");
                String nacionalidad = Input.readString();

                a.pasajero = new Pasajero(nombre, documento, nacionalidad);
                System.out.println("Pasajero registrado");
                break;

            case '4':
                if (a.vuelo != null && a.pasajero != null) {
                    a.vuelo.agregarPasajero(a.pasajero);
                }
                break;

            case '5':
                if (a.vuelo != null && a.pasajero != null) {
                    a.vuelo.agregarACola(a.pasajero);
                }
                break;

            case '6':
                if (a.vuelo != null) {
                    a.vuelo.mostrarCola();
                }
                break;

            case '7':
                if (a.vuelo != null) {
                    a.vuelo.abordarPasajero();
                }
                break;

            case '8':
                if (a.vuelo != null) {
                    System.out.println(a.vuelo.mostrar());
                }
                break;
        }

    } while (op != '9');
}
//TODO VA CON LISTAS ENLAZADAS
//los metodos a usar en la clase aereopuerto son los siguientes:
//registrar vuelo, modificar vuelo
//registrar pasajero, modificar pasajero
//asignar pasajero a vuelo
//ver estado de vuelo, ver estado de pasajero
//mostrar vuelos, mostrar pasajeros
        
    }
    

