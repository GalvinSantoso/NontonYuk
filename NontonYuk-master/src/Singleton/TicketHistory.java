package Singleton;

import java.util.Vector;

import model.Movie;
import model.Ticket;


public class TicketHistory {
	
	private Vector<Ticket> ticketVector = new Vector<>();
	private static TicketHistory instance = null;
	private TicketHistory() {
	}
	
	public static TicketHistory getInstance() {
	    if (instance == null) {
	      instance = new TicketHistory();
	    }
	    return instance;
	}

	public Vector<Ticket> getTicketVector() {
		return ticketVector;
	}
	
	  
	  public void show() {
		  System.out.println("===============================================================");
		  System.out.println("Ticket List                                                     ");
		  System.out.println("===============================================================");
		  if(this.ticketVector.isEmpty()) {
				System.out.println("No Ticket History");
				System.out.println("Lets Go Buy Ticket Now!!!");
				System.out.println("===============================================================");
		  }else {
				for(Ticket ticket : ticketVector) {
					System.out.println("Ticket Id: " + ticket.getTicketID());
					System.out.println("Movie ID: " + ticket.getMovieID());
					System.out.println("Cinema Name: " + ticket.getCinemaName());
					System.out.println("Pass Key: " + ticket.getPassKey());
					System.out.println("Seat Position: " + ticket.getSeatPosition());
					System.out.println("Ticket Date: " + ticket.getTicketDate());
					System.out.println("Ticket Price: " + ticket.getTicketPrice());
					System.out.println("Ticket Type: " + ticket.getTicketType());
					if(ticket.getTicketType().equals("Standard")) {
						System.out.println("Standard : No Benefits");	
					}
					else if(ticket.getTicketType().equals("Gold")) {
						System.out.println("Gold : 1 Free Beverages included");
					}
					else if(ticket.getTicketType().equals("Premium")) {
						System.out.println("Premium :  1 Free Beverages and Food included");
					}
					else if(ticket.getTicketType().equals("Exclusive")) {
						System.out.println("Exclusive : 1 Free Beverages and Food with Reclying Seats included");
					}
					System.out.println("+===============================================================+");
				}
		  }
	
		}
	
	public void add(Ticket ticket) {
		this.ticketVector.add(ticket);
	}
	

	
		  

}
