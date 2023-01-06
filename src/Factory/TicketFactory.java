package Factory;

import model.ExclusiveTicket;
import model.GoldTicket;
import model.PremiumTicket;
import model.StandardTicket;
import model.Ticket;

public class TicketFactory {
	
	public Ticket makeTicket(String ticketID, String movieID, String cinemaID, String passKey, String seatPosition, String ticketDate, String ticketPrice, String ticketType) {
		if(ticketType.equals("Standard")) {
			return new StandardTicket(ticketID, movieID, cinemaID, passKey, seatPosition, ticketDate, ticketPrice, ticketType);
		}else if(ticketType.equals("Gold")) {
			return new GoldTicket(ticketID, movieID, cinemaID, passKey, seatPosition, ticketDate, ticketPrice, ticketType);
		}else if(ticketType.equals("Premium")) {
			return new PremiumTicket(ticketID, movieID, cinemaID, passKey, seatPosition, ticketDate, ticketPrice, ticketType);
		}else if(ticketType.equals("Exclusive")) {
			return new ExclusiveTicket(ticketID, movieID, cinemaID, passKey, seatPosition, ticketDate, ticketPrice, ticketType);
		}
		
		return null;
		
	}

}
