
package transcesar.persistencia;

import Modelo.Persona;
import java.util.ArrayList;

public class personaDAO {
    
       private ArrayList<Persona> personas = new ArrayList<>();
       
        // CREATE - Guardar una persona
        public void guardar(Persona p) {
        personas.add(p);
        System.out.println("Persona guardada: " + p.getNombre());
         }
    
    
    
    
}
