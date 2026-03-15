
package transcesar.Modelo;



public class conductor extends persona {
    private String licencia;
    
    public conductor(String id, String nombre, String apellido, String telefono, int edad, String direccion) {
        super(id, nombre, apellido, telefono, edad, direccion);
        
       
        
   
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public conductor(String licencia, String id, String nombre, String apellido, String telefono, int edad, String direccion) {
        super(id, nombre, apellido, telefono, edad, direccion);
        this.licencia = licencia;
    }
 
    
    
    
}
