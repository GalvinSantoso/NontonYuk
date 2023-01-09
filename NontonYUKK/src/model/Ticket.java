package model;

public class Ticket {
	
	private String ticketID;
	private String movieID;
	private String cinemaName;
	private String passKey;
	private Integer seatQuantity;
	private String seatPosition;
	private String ticketDate;
	private Integer ticketPrice;
	private String ticketType;
	private String benefits;
	
	public Ticket(String ticketID, String movieID, String cinemaName, String passKey, Integer seatQuantity,
			String seatPosition, String ticketDate, Integer ticketPrice, String ticketType) {
		super();
		this.ticketID = ticketID;
		this.movieID = movieID;
		this.cinemaName = cinemaName;
		this.passKey = passKey;
		this.seatQuantity = seatQuantity;
		this.seatPosition = seatPosition;
		this.ticketDate = ticketDate;
		this.ticketPrice = ticketPrice;
		this.ticketType = ticketType;
	}
	
	

	public String getBenefits() {
		return benefits;
	}



	public void setBenefits(String benefits) {
		this.benefits = benefits;
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

	public String getCinemaName() {
		return cinemaName;
	}

	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}

	public String getPassKey() {
		return passKey;
	}

	public void setPassKey(String passKey) {
		this.passKey = passKey;
	}

	public Integer getSeatQuantity() {
		return seatQuantity;
	}

	public void setSeatQuantity(Integer seatQuantity) {
		this.seatQuantity = seatQuantity;
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

	public Integer getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(Integer ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public String getTicketType() {
		return ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	
	
	
	

	


	
	
}
