
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
    
        // READ - Buscar por ID
        public Persona buscarPorId(String id) {
        for (Persona p : personas) {
            if (p.getId().equals(id)) {
                return p;
                 }
             }
        return null; // No encontrado
       }
        
        // READ - Obtener todas las listas
        public ArrayList<Persona> obtenerTodas() {
        return personas;
        }
    
    
    
}
