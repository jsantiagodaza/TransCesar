


package transcesar.Modelo;



public class pasajeroestudiante extends pasajero {
    
        private String institucion;
    
    public pasajeroestudiante(String id, String nombre, String apellido, String telefono, int edad, String direccion, String idticket) {
        super(id, nombre, apellido, telefono, edad, direccion, idticket);
    }

    public pasajeroestudiante(String institucion, String id, String nombre, String apellido, String telefono, int edad, String direccion, String idticket) {
        super(id, nombre, apellido, telefono, edad, direccion, idticket);
        this.institucion = institucion;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }
    
    
    
    
    
}