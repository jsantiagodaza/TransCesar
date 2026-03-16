
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
            }
        }while(opcionPrincipal !=4);
    }
    
}
