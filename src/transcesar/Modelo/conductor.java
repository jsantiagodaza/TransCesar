
package transcesar.Modelo;



public class Conductor extends Persona {
    private String numeroLicencia;
    private String categoriaLicencia;

    public Conductor(String cedula, String nombre, String numeroLicencia, String categoriaLicencia) {
        super(cedula, nombre);
        this.numeroLicencia = numeroLicencia;
        this.categoriaLicencia = categoriaLicencia;
    }
 
    
    
    
}
