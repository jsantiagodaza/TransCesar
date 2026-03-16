
package transcesar;

import java.util.Scanner;
import transcesar.Presentacion.Menu;

public class Main {
private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
   
     int opcionPrincipal;
          opcionPrincipal = 0;
        do{
            
            opcionPrincipal = Menu.menuPrincipal();
            
            
            
            
        }while(opcionPrincipal !=4);
    }
    
}
