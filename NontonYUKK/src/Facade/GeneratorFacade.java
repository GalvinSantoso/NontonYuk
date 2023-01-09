package Facade;

import java.util.UUID;

public class GeneratorFacade {
	
	int countMovieID;
	int countTicketID;
	int countUserID;
	int countAdminID;
	
	public GeneratorFacade() {
		super();
		this.countMovieID = 0;
		this.countTicketID = 0;
		this.countUserID = 0;
		this.countAdminID = 0;
	}
	

	
	public String idGeneratorMovie() {
		Integer count = 0;
		String id = "";
		count = this.countMovieID;
		this.countMovieID++;
		
		int num1 = count / 100;
		int num2 = count / 10 - num1 * 10;
		int num3 = count % 10;
		id = "MO" + num1 + num2 + num3;
		return id;
	}
	
	public String idGeneratorCustomer() {
		Integer count = 0;
		String id = "";
		count = this.countMovieID;
		this.countMovieID++;
		
		int num1 = count / 100;
		int num2 = count / 10 - num1 * 10;
		int num3 = count % 10;
		id = "CU" + num1 + num2 + num3;
		return id;
	}
	
	public String idGeneratorAdmin() {
		Integer count = 0;
		String id = "";
		count = this.countMovieID;
		this.countMovieID++;
		
		int num1 = count / 100;
		int num2 = count / 10 - num1 * 10;
		int num3 = count % 10;
		id = "AD" + num1 + num2 + num3;
		return id;
	}
	
	public String idGeneratorTicket() {
		Integer count = 0;
		String id = "";
		count = this.countMovieID;
		this.countMovieID++;
		
		int num1 = count / 100;
		int num2 = count / 10 - num1 * 10;
		int num3 = count % 10;
		id = "TC" + num1 + num2 + num3;
		return id;
	}
	
	public String PassKeyGenerator() {
		return UUID.randomUUID().toString();
	}
	
	
	
	
	
}
