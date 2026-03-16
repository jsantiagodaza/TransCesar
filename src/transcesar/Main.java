
package transcesar;

import java.util.Scanner;
import transcesar.Presentacion.Menu;
import static transcesar.Presentacion.Menu.menuPersonas;
import static transcesar.Presentacion.Menu.menuTickets;
import static transcesar.Presentacion.Menu.menuVehiculos;

public class Main {
private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
   
     int opcionPrincipal;
          opcionPrincipal = 0;
        do{
            
            opcionPrincipal = Menu.menuPrincipal();
            switch (opcionPrincipal){
                case 1:
                    menuPersonas();
                    break;
                case 2:
                    menuVehiculos();
                    break;
                case 3:
                    menuTickets();
                    break;
                case 4:
                    System.out.println("Nos vemos!, cerrando sistema...");
                    break;
                default:
                    System.out.println("Esa opción no existe, eliga una válida.5");
            }
        }while(opcionPrincipal !=4);
        scanner.close(); //cerramos el scanner 
    }
    
       public static void menuPersonas() {
        int opcion;
        do {
          
            System.out.println("\n|          GESTIÓN DE PERSONAS         |");
            System.out.println("| 1 --> Registrar                                          |");
            System.out.println("| 2 --> Listar Todas las personas              |");
            System.out.println("| 3 --> Buscar Persona por cedula            |");
            System.out.println("| 4 --> Eliminar Nota               |");
            System.out.println("| 0 --> Volver                      |");
            System.out.print("| Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
             
            }
        } while (opcion != 0);
    }
}
