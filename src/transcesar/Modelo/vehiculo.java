
package transcesar.Modelo;

public abstract class Vehiculo {
    protected String placa;
    protected String ruta;
    protected int capacidadMaxima;
    protected int pasajerosActuales;
    protected boolean disponible;
    protected double tarifaBase;
    
    public Vehiculo(String placa, String ruta) {
        this.placa = placa;
        this.ruta = ruta;
        this.pasajerosActuales = 0;
        this.disponible = true;
    }

    public boolean tieneCupos() {
        return pasajerosActuales < capacidadMaxima;
    }

    public int getCuposDisponibles() {
        return capacidadMaxima - pasajerosActuales;
    }

    public void agregarPasajero() {
        if (tieneCupos()) pasajerosActuales++;
    }

  
}

