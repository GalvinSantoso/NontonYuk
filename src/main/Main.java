package main;

import java.util.Scanner;

import Builder.MovieBuilder;
import Factory.TicketFactory;
import Singleton.MovieList;
import model.Admin;
import model.Customer;
import model.Movie;
import model.Ticket;
import model.User;

public class Main {

	Scanner scan = new Scanner(System.in);

	

	public void menuUtama() {
		System.out.println("Welcome to NontonYuk App");
		System.out.println("=========================");
		System.out.println("LOGIN AS");
		System.out.println("1. User");
		System.out.println("2. Admin");
		System.out.println("3. Exit");
		System.out.print(">> ");
	}

	public void customerMenu() {
//		Customer customer = (Customer) loginUser("Customer");
//		loginUser("Customer");
		User user = loginUser("Customer");
		System.out.println("Welcome " + user.getUsername() + " !!!!");
		int chooseMenu = 0;
		while (true) {
			System.out.println("User Menu");
			System.out.println("==========");
			System.out.println("1. Movie");
			System.out.println("2. Cart");
			System.out.println("3. Ticket");
			System.out.println("4. Exit");
			System.out.print(">> ");
			chooseMenu = scan.nextInt();
			scan.nextLine();
			if (chooseMenu > 4 || chooseMenu < 0) {
				continue;
			}
			switch (chooseMenu) {
			case 1:
				movieMenu();
				break;
			case 2:
				cartMenu();
				break;
			case 3:
				ticketMenu();
				break;
			case 4:
				return;
			}
		}

	}
	
	public User loginUser(String user) {
		String userID = "0";
		String username;
		String userAddress;
		String userEmail;
		String userPhone;
		System.out.print("LOGIN AS " + user);
		System.out.println();
		System.out.println("==============");
		do {
			System.out.print("input username [5 - 40 characters] : ");
			username = scan.nextLine();
		} while ((username.length() < 5) || (username.length() > 40));

		do {
			System.out.print("input address [6 - 20 characters] : ");
			userAddress = scan.nextLine();
		} while ((userAddress.length() < 6) || (userAddress.length() > 20));
		do {
			System.out.print("input your email address [contain @ & .]: ");
			userEmail = scan.nextLine();
		} while (!(userEmail.contains("@") && userEmail.contains(".")));
		do {
			System.out.print("input phone [must start with 08] : ");
			userPhone = scan.nextLine();
		} while (!userPhone.startsWith("08"));
		
//		if(user.equals("Admin")) {
//			userID = idGenerator("AD");
//		}
//		else if(user.equals("Customer")) {
//			userID = idGenerator("CU");
//		}


		System.out.println("\nLogin Successfull!!!");
		System.out.println("press enter to continue..");
		scan.nextLine();
		
		return new User(userID, username, userAddress, userEmail, userPhone) {
		};

	}

	private void ticketMenu() {
		// TODO Auto-generated method stub
//		show movie
		
		int chooseMenu = 0;
		while (true) {
			System.out.println("Your Tickets");
			System.out.println("==============");
			
			// Show Cart
			
			System.out.println("1. Show Receipt");
			System.out.println("2. Exit");
			System.out.print(">> ");
			chooseMenu = scan.nextInt();
			scan.nextLine();
			if (chooseMenu > 3 || chooseMenu < 0) {
				continue;
			}
			switch (chooseMenu) {
			case 1:
				showReceipt();
				break;
			case 2:
				return;
			}
		}
	}

	private void showReceipt() {
		// TODO Auto-generated method stub
		
	}

	private void cartMenu() {
		
		// Show Cart
		int chooseMenu = 0;
		while (true) {
			System.out.println("Shopping Cart");
			System.out.println("==============");
			
			// Show Cart
			
			System.out.println("1. Pay");
			System.out.println("2. Cancel Order");
			System.out.println("3. Exit");
			System.out.print(">> ");
			chooseMenu = scan.nextInt();
			scan.nextLine();
			if (chooseMenu > 4 || chooseMenu < 0) {
				continue;
			}
			switch (chooseMenu) {
			case 1:
				pay();
				break;
			case 2:
				cancelOrder();
				break;
			case 3:
				return;
			}
		}

//		
//		TicketFactory ticketfactory = new TicketFactory();
//		Ticket t = ticketfactory.makeTicket(ticketID, movieID, cinemaID, passKey, seatPosition, ticketDate, ticketPrice, ticketType);
//		
	}

	private void cancelOrder() {
		// TODO Auto-generated method stub
		
	}

	private void pay() {
		// TODO Auto-generated method stub
		
	}

	public void movieMenu() {
		
		String movieID;
		String noKursi;
		
		System.out.println("Movie Menu");
		System.out.println("===========");
		
//		if (menus.isEmpty()) {
//			System.out.println("there's no menu");
//		} else {
//			SHOW MOVIES -> diedit kedepannya
//			String divider = "+===========================================================================================================================+";
//			String format = "| %-5s | %-35s | %-10s | %-10s | %-11s | %-35s |\n";
//			System.out.println(divider);
//			System.out.printf(format, "ID", "Name", "Price", "Date", "Genre", "Description");
//			System.out.println(divider);
//			String format2 = "| %-5s | %-35s | %-10s | %-10s |";
//			System.out.println(divider);
//			System.out.println(divider);
		System.out.print("choose movie id: ");
		
//		}
	}

	

//	public String idGenerator(String idSTring) {
//		String id = "";
//		int count = 0;
//		int num1 = count / 100;
//		int num2 = count / 10 - num1 * 10;
//		int num3 = count % 10;
//		id = idSTring + num1 + num2 + num3;
//		count++;
//		return id;
//	}
	
	public String idGenerator() {
		String id="";
		int count = 0;
		int num1 = count/100;
		int num2 = count/10 - num1*10;
		int num3 = count%10;
		id = "MN"+num1+num2+num3;
		count++;
		return id;
	}
	
	
	public void adminMenu() {
//		Admin admin = (Admin) loginUser("Admin");
		loginUser("Admin");
		
//		System.out.println("Welcome Admin" + admin.getUsername() + " !!!!");
		System.out.println();
		int chooseMenu = 0;
		while (true) {
			System.out.println("Admin Menu");
			System.out.println("==========");
			System.out.println("1. Add Movie");
			System.out.println("2. Cancel Movie");
			System.out.println("3. Edit Movie");
			System.out.println("4. Exit");
			System.out.print(">> ");
			chooseMenu = scan.nextInt();
			scan.nextLine();
			if (chooseMenu > 4 || chooseMenu < 0) {
				continue;
			}
			switch (chooseMenu) {
			case 1:
				addMovie();
				break;
			case 2:
				removeMovie();
				break;
			case 3:
				editMovie();
				break;
			case 4:
				return;
			}
		}

	}
	
	


	public void addMovie() {
		
		String movieName;
		String duration;
		String genre;
		String description;
		String releaseDate;
		String actorsName;
		
		
		System.out.println("List Movies Available : ");
		MovieList list = MovieList.getInstance();
		list.show();
		System.out.println();
		System.out.println("------Add New Movie------");
		System.out.println("==========================");
		do {
			System.out.println("Enter Movie Name [Must be around 1 - 100 characters] : ");
			movieName = scan.nextLine();
		} while (movieName.length() < 1 && movieName.length() > 100);

		do {
			System.out.println("Duration of the Movie [60 | 120 | 180 | Minutes] : ");
			duration = scan.nextLine();
		} while (!(duration.equals("60") || duration.equals("120") || duration.equals("180")));
		
		do {
			System.out.println("Movie Genre [Horror | Fiction | Fantasy | Drama | Action]: : ");
			genre = scan.nextLine();
		} while (!(genre.equals("Horror") || genre.equals("Fiction") || genre.equals("Fantasy") || genre.equals("Drama") || genre.equals("Action")));
		
		do {
			System.out.println("Movie Description [Must be around 1 - 100 characters] : ");
			description = scan.nextLine();
		} while ((description.length() < 1) && (description.length() > 100));
		
		do {
			System.out.println("Movie Release Date [Must be around 1 - 100 characters] : ");
			releaseDate = scan.nextLine();
		} while (releaseDate.length() < 1 && releaseDate.length() > 100);
		
		do {
			System.out.println("Movie Actors Name [Must be around 1 - 100 characters] : ");
			actorsName = scan.nextLine();
		} while ((actorsName.length() < 1) && (actorsName.length() > 100));	
		
			
		String id = idGenerator();
		
		MovieBuilder builder = new MovieBuilder();
		Movie movie = builder.reset().buildMovieID(id).buildMovieName(movieName).buildDuration(duration).buildGenre(genre).buildDescription(description).buildReleaseDate(releaseDate).buildActorsName(actorsName).build();
		list.add(movie);
	}
	
	public void removeMovie(){
		
		
		String movieID;
		
		System.out.println("List Movies Available : ");
//		showMovie();
		System.out.println("------Remove Movie------");
		System.out.println("=========================");
		do {
			System.out.println("Enter Movie ID [must start with MO] : ");
			movieID = scan.nextLine();
		} while (!movieID.startsWith("MO"));
		// Remove Movie
		// -------Code Here--------
		
	}
	
	public void editMovie() {
		
		String movieName;
		Integer duration;
		String genre;
		String description;
		String releaseDate;
		String actorsName;
		String movieID;
		
		System.out.println("List Movies Available : ");
//		showMovie();
		System.out.println("------Edit Movie------");
		System.out.println("=========================");
		do {
			System.out.println("Edit Movie ID [must start with MO] : ");
			movieID = scan.nextLine();
		} while (!movieID.startsWith("MO"));
		do {
			System.out.println("Edit Movie Name [Must be around 1 - 100 characters] : ");
			movieName = scan.nextLine();
		} while (!(movieName.length() < 1) && !(movieName.length() > 100));

		do {
			System.out.println("Edit The Duration of the Movie [Between 1 to 1000 Minutes] : ");
			duration = scan.nextInt();
		} while (!(duration < 1) && !(duration > 1000));
		
		do {
			System.out.println("Edit Movie Genre [Must be around 1 - 20 characters] : ");
			genre = scan.nextLine();
		} while (!(genre.length() < 1) && !(genre.length() > 100));
		
		do {
			System.out.println("Edit Movie Release Date [Must be around 1 - 100 characters] : ");
			releaseDate = scan.next();
		} while (!(releaseDate.length() < 1) && !(releaseDate.length() > 100));
		
		do {
			System.out.println("Edit Movie Actors Name [Must be around 1 - 100 characters] : ");
			actorsName = scan.nextLine();
		} while (!(actorsName.length() < 1) && !(actorsName.length() > 100));	
	}
		
	public Main() {
		int chooseMenuUtama = 0;
		menuUtama();
		do {
			chooseMenuUtama = scan.nextInt();
			scan.nextLine();
		} while (chooseMenuUtama < 1 || chooseMenuUtama > 3);
		switch (chooseMenuUtama) {
		case 1:
			customerMenu();
			break;
		case 2:
			adminMenu();
			break;
		case 3:
			System.exit(0);
			break;
		}
	}

	public static void main(String[] args) {
		new Main();
	}
	
}

