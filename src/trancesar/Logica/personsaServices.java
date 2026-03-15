package trancesar.Logica;

import Modelo.persona;
import transcesar.persistencia.personaDAO;
import java.util.ArrayList;

public class personsaServices {
    
     private PersonaDAO personaDAO = new PersonaDAO();
     
              // Registrar con validaciones
        public String registrarPersona(String id, String nombre, String apellido, String telefono, int edad) {
        // Validar que no esté vacío
        if (id == null || id.trim().isEmpty()) {
            return "Error: La ID no puede estar vacía";
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            return "Error: El nombre no puede estar vacío";
        }
        
        // Validar que no exista
        if (personaDAO.existe(id)) {
            return "Error: Ya existe una persona con esa ID";
        }
        
        // Crear y guardar
        Persona nueva = new Persona(id, nombre, apellido, telefono);
        personaDAO.guardar(nueva);
        
        return "Persona registrada con éxito";
        
        
    }
    
    
    
}
