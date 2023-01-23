package Factory;

import model.ExclusiveTicket;
import model.GoldTicket;
import model.PremiumTicket;
import model.StandardTicket;
import model.Ticket;
import java.util.Date;
public class TicketFactory {
	
	public Ticket makeTicket(String ticketID, String movieID, String cinemaName, String passKey, Integer seatQuantity, String seatPosition, Date ticketDate, Integer ticketPrice, String ticketType) {
		if(ticketType.equals("Standard")) {
			return new StandardTicket(ticketID, movieID, cinemaName, passKey,seatQuantity, seatPosition, ticketDate, ticketPrice, ticketType);
		}else if(ticketType.equals("Gold")) {
			return new GoldTicket(ticketID, movieID, cinemaName, passKey, seatQuantity, seatPosition, ticketDate, ticketPrice, ticketType);
		}else if(ticketType.equals("Premium")) {
			return new PremiumTicket(ticketID, movieID, cinemaName, passKey, seatQuantity, seatPosition, ticketDate, ticketPrice, ticketType);
		}else if(ticketType.equals("Exclusive")) {
			return new ExclusiveTicket(ticketID, movieID, cinemaName, passKey, seatQuantity, seatPosition, ticketDate, ticketPrice, ticketType);
		}
		
		return null;
		
	}

}
