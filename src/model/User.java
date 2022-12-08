package model;

public class User {

	private String userID;
	private String username;
	private String userAddress;
	private String userEmail;
	private String userPhone;

	public User(String userID, String username, String userAddress, String userEmail, String userPhone) {
		super();
		this.userID = userID;
		this.username = username;
		this.userAddress = userAddress;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

}
