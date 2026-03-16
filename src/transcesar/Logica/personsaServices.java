package trancesar.Logica;

import java.util.ArrayList;
import transcesar.Modelo.Persona;
import transcesar.Persistencia.personaDAO;

public class personsaServices {
    
     private personaDAO personaDAO = new personaDAO();
     
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
            String direccion = null;
        Persona nueva = new Persona(id, nombre, apellido, telefono, edad, direccion);
        personaDAO.guardar(nueva);
        
        return "Persona registrada con éxito";
        
        
    }
        
         // Buscar persona
         public Persona buscarPersona(String id) {
         return personaDAO.buscarPorId(id);
    }   
        // Listar todas
        public ArrayList<Persona> listarPersonas() {
        return personaDAO.obtenerTodas();
    }
        
        // Eliminar
        public boolean eliminarPersona(String id) {
        return personaDAO.eliminar(id);
    }
    
    
    
    
}