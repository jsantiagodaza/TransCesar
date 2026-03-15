package transcesar.persistencia;

import Modelo.ticket;
import java.util.ArrayList;

public class ticketDAO {
    
     private ArrayList<ticket> tickets = new ArrayList<>();
     
     
        // CREATE
         public void guardar(ticket t) {
        tickets.add(t);
        System.out.println("Ticket guardado: " + t.getCodigoTicket());
    }
    
        // READ - Buscar por ID
         public ticket buscarPorId(String id) {
        for (ticket t : tickets) {
            if (t.getId().equals(id)) {
                return t;
            }
        }
        return null;
    }
         
        // READ - Buscar por código de ticket
        public ticket buscarPorCodigo(String codigo) {
        for (ticket t : tickets) {
            if (t.getCodigoTicket().equals(codigo)) {
                return t;
            }
        }
        return null;
    }
    

    
}
