
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
            switch (opcionPrincipal){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }while(opcionPrincipal !=4);
    }
    
}
