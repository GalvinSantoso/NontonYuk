package model;

public class Ticket {
	
	private String ticketID;
	private String movieID;
	private String cinemaID;
	private String passKey;
	private String seatPosition;
	private String ticketDate;
	private String ticketPrice;
	private String ticketType;
	
	
	public Ticket(String ticketID, String movieID, String cinemaID, String passKey, String seatPosition,
			String ticketDate, String ticketPrice, String ticketType) {
		super();
		this.ticketID = ticketID;
		this.movieID = movieID;
		this.cinemaID = cinemaID;
		this.passKey = passKey;
		this.seatPosition = seatPosition;
		this.ticketDate = ticketDate;
		this.ticketPrice = ticketPrice;
		this.ticketType = ticketType;
	}
	public String getTicketID() {
		return ticketID;
	}
	public void setTicketID(String ticketID) {
		this.ticketID = ticketID;
	}
	public String getMovieID() {
		return movieID;
	}
	public void setMovieID(String movieID) {
		this.movieID = movieID;
	}
	public String getCinemaID() {
		return cinemaID;
	}
	public void setCinemaID(String cinemaID) {
		this.cinemaID = cinemaID;
	}
	public String getPassKey() {
		return passKey;
	}
	public void setPassKey(String passKey) {
		this.passKey = passKey;
	}
	public String getSeatPosition() {
		return seatPosition;
	}
	public void setSeatPosition(String seatPosition) {
		this.seatPosition = seatPosition;
	}
	public String getTicketDate() {
		return ticketDate;
	}
	public void setTicketDate(String ticketDate) {
		this.ticketDate = ticketDate;
	}
	public String getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public String getTicketType() {
		return ticketType;
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	


	
	
}
