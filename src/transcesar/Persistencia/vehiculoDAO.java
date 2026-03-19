/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transcesar.persistencia;

/**
 *
 * @author 2jcue
 */
import transcesar.Presentacion.*;
import transcesar.Modelo.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class VehiculoDAO {

    private static final String ARCHIVO_BUSETA   = "buseta.txt";
    private static final String ARCHIVO_BUS      = "bus.txt";
    private static final String ARCHIVO_MICROBUS = "microbus.txt";

    public void guardar(Vehiculo v) {
        String archivo = getArchivo(v);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
            bw.write(v.toCSV());
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Error al guardar vehiculo: " + e.getMessage());
        }
    }

    public List<Vehiculo> cargarTodos() {
        List<Vehiculo> lista = new ArrayList<>();
        lista.addAll(cargarDesdeArchivo(ARCHIVO_BUSETA,   "Buseta"));
        lista.addAll(cargarDesdeArchivo(ARCHIVO_BUS,      "Bus"));
        lista.addAll(cargarDesdeArchivo(ARCHIVO_MICROBUS, "MicroBus"));
        return lista;
    }

