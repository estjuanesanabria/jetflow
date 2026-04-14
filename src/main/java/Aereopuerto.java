import com.murcia.utils.Input;
import com.murcia.utils.Menu;

// Juan Esteban Sanabria - 6014495
// Katherine Ortega Contreras - 6014550
public class Aereopuerto {

    private Vuelo vuelo;
    private Pasajero pasajero;
    private Avion avion;

    public Aereopuerto() {
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

                case '1': {
                    System.out.print("Código del vuelo: ");
                    

                    System.out.print("Origen: ");
                    

                    System.out.print("Destino: ");
                    

                    System.out.print("Matrícula del avión: ");
                    String matricula = null;
                    

                    a.avion = new Avion("Boeing 737", 180, matricula);
                    a.vuelo = new Vuelo(codigo, origen, destino, a.avion);

                    System.out.println("Vuelo registrado correctamente");
                    break;
                }


                 case '2': {
                    if (a.vuelo != null) {
                        System.out.print("Nuevo estado del vuelo: ");
                        String estado = null;
                        
                        a.vuelo.setEstado(estado);
                        System.out.println("Estado actualizado");
                    } else {
                        System.out.println("No hay vuelo registrado");
                    }
                    break;
                }

                case '3': {
    String nombre = Input.next("Nombre: ");
    String documento = Input.next("Documento: ");
    String nacionalidad = Input.next("Nacionalidad: ");

    a.pasajero = new Pasajero(nombre, documento, nacionalidad);

    System.out.println("Pasajero registrado");
    break;
}

                case '4': {
                    if (a.vuelo != null && a.pasajero != null) {
                        a.vuelo.agregarPasajero(a.pasajero);
                    } else {
                        System.out.println("Debe registrar vuelo y pasajero");
                    }
                    break;
                }

                case '5': {
                    if (a.vuelo != null && a.pasajero != null) {
                        a.vuelo.agregarACola(a.pasajero);
                    } else {
                        System.out.println("Debe registrar vuelo y pasajero");
                    }
                    break;
                }

                case '6': {
                    if (a.vuelo != null) {
                        a.vuelo.mostrarCola();
                    } else {
                        System.out.println("No hay vuelo registrado");
                    }
                    break;
                }

                case '7': {
                    if (a.vuelo != null) {
                        a.vuelo.abordarPasajero();
                    } else {
                        System.out.println("No hay vuelo registrado");
                    }
                    break;
                }

                case '8': {
                    if (a.vuelo != null) {
                        System.out.println(a.vuelo.mostrar());
                    } else {
                        System.out.println("No hay vuelo registrado");
                    }
                    break;
                }

                case '9': {
                    System.out.println("Saliendo del sistema...");
                    break;
                }

                default: {
                    System.out.println("Opción inválida");
                }
            }

        } while (op != '9');
    }
}
//TODO VA CON LISTAS ENLAZADAS
//los metodos a usar en la clase aereopuerto son los siguientes:
//registrar vuelo, modificar vuelo
//registrar pasajero, modificar pasajero
//asignar pasajero a vuelo
//ver estado de vuelo, ver estado de pasajero
//mostrar vuelos, mostrar pasajeros
        
    
    

