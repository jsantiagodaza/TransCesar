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
    
    
    

    
}
