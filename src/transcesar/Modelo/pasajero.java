
package transcesar.Modelo;

import java.time.LocalDate;

public class pasajero{
    
    private String id;
    private String nombre;
    private String apellido;
    private String telefono;
    private int edad;
    private String direccion;   
    private String idticket;

    public pasajero(String id, String nombre, String apellido, String telefono, int edad, String direccion, String idticket) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
        this.direccion = direccion;
        this.idticket = idticket;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIdticket() {
        return idticket;
    }

    public void setIdticket(String idticket) {
        this.idticket = idticket;
    }
    
    
    
      
    
    
    
}