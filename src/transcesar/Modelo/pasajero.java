package transcesar.Modelo;

public abstract class pasajero extends Persona {
    protected String tipo;

    public pasajero(String cedula, String nombre, String tipo) {
        super(cedula, nombre);
        this.tipo = tipo;
    }

    public String getTipo() { return tipo; }

    public abstract double calcularDescuento();

    public String toCSV() {
        return cedula + ";" + nombre + ";" + tipo;
    }
}
