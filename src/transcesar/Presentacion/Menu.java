
package transcesar.Presentacion;

import java.util.Scanner;

public class Menu {
     Scanner Sc = new Scanner(System.in); //<--usaremos scanner para leer variables
   
     static int menuPrincipal() {
        Scanner Sc = new Scanner(System.in);
        int opcion = 0;
        System.out.println("\n-----------------------------------------------");
        System.out.println("|           SISTEMAS DE BUSES              |");
        System.out.println("|------------------------------------------------|");
        System.out.println("| 1.  Gestión de pasajeros                      |");
        System.out.println("| 2. Gestión de Vehículos                       |");
        System.out.println("| 3. Gestión de ticket                               |");
        System.out.println("| 4. salir                                                    |");
        System.out.println("|------------------------------------------------|");
        System.out.println(" ");
        System.out.println("seleccione(1-4):");
        opcion = Sc.nextInt();
        return (opcion);
    }
}
