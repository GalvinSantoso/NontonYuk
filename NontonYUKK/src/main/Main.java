package main;

import java.util.Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.UUID;

import Builder.MovieBuilder;
import Facade.GeneratorFacade;
import Factory.TicketFactory;
import Singleton.MovieList;
import Singleton.TicketHistory;
import adapter.PriceAdapter;
import model.Admin;
import model.Customer;
import model.Movie;
import model.Ticket;
import model.User;

public class Main {
	Scanner scan = new Scanner(System.in);
	GeneratorFacade MF = new GeneratorFacade();
	int countMovieID = 0; 
	int countTicketID = 0;
	int countUserID = 0;
	int countAdminID = 0;
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	

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
		User customer = loginUser("Customer");
		System.out.println("Welcome " + customer.getUsername() + " !!!!");
		int chooseMenu = 0;
		while (true) {
			MovieList list = MovieList.getInstance();
			list.show(dateFormat);
			System.out.println("");
			System.out.println("User Menu");
			System.out.println("==========");
			System.out.println("1. Buy Ticket");
			System.out.println("2. View Ticket");
			System.out.println("3. Exit");
			System.out.print(">> ");
			chooseMenu = scan.nextInt();
			scan.nextLine();
			if (chooseMenu > 4 || chooseMenu < 0) {
				continue;
			}
			switch (chooseMenu) {
			case 1:
				buyTicket();
				break;
			case 2:
				viewTicket();
				break;
			case 3:
				return;
			}
		}
	}


	public void buyTicket() {
		
		TicketFactory ticketfactory = new TicketFactory();
		String ticketID, cinemaName = null, passKey, seatPosition = null, ticketDate = null, ticketType = null, chooseTicket;
		Integer seatQuantity, ticketPrice = 40000;
		Date date = null;

		
		System.out.print("Choose Your Ticket by MovieID : ");
		chooseTicket = scan.nextLine();
		MovieList list = MovieList.getInstance();
		TicketHistory history = TicketHistory.getInstance();
		for (Movie movielist : list.getMovieVector()) {
			if (movielist.getMovieID().equals(chooseTicket)) {
				do {
					System.out.print("input Cinema Location [Taman Anggrek | Central Park | Grand Indonesia | Plaza indonesia | Gandaria City]: ");
					cinemaName = scan.nextLine();
				} while (!(cinemaName.equals("Taman Anggrek") || cinemaName.equals("Central Park") || cinemaName.equals("Grand Indonesia") || cinemaName.equals("Plaza indonesia") || cinemaName.equals("Gandaria City")));
				do {
					System.out.print("input Seat Quantity [1-100]: ");
					seatQuantity = scan.nextInt();
				} while (seatQuantity < 1 || seatQuantity > 100);
				do {
					System.out.print("input Seat Position [A-Z][1-10] : ");
					seatPosition = scan.nextLine();
				} while (seatPosition.length() < 1 || seatPosition.length() > 100);
				boolean condition = true;
				do {
					System.out.print("Movie Release Date [Format : yyyy-MM-dd] : ");
					ticketDate = scan.nextLine();
					try {
						date = dateFormat.parse(ticketDate);
						condition = false;
					} catch (ParseException e) {
						condition = true;
					}
				} while (condition);
				
				System.out.println("===== Ticket Type Description =====");
				System.out.println("Standard : No Benefits");
				System.out.println("Gold : 1 Free Beverages included");
				System.out.println("Premium :  1 Free Beverages and Food included");
				System.out.println("Exclusive : 1 Free Beverages and Food with Reclying Seats included");
				do {
					System.out.print("input Ticket Type [Standard | Gold | Premium | Exclusive]: ");
					ticketType = scan.nextLine();
				} while (!(ticketType.equals("Standard") || ticketType.equals("Gold") || ticketType.equals("Premium")
						|| ticketType.equals("Exclusive")));
				
				ticketID = MF.idGeneratorTicket();	
				passKey = MF.PassKeyGenerator();
				
				ticketPrice = ticketPrice * seatQuantity;
				PriceAdapter priceAdapter = new PriceAdapter(ticketPrice);
				ticketPrice = priceAdapter.getPrice(ticketType);
				System.out.println("------------------------");
				System.out.println("Total Price : ");
				System.out.println(ticketPrice);
				System.out.println("------------------------");
				String confirmorder;
				System.out.println("Confirm Order? (Y/N)");
				confirmorder = scan.nextLine();
				if (confirmorder.equals("Y")) {
					history.add(ticketfactory.makeTicket(ticketID, chooseTicket, cinemaName, passKey, seatQuantity,
							seatPosition, date, ticketPrice, ticketType));
				} else if (confirmorder.equals("N")) {
					return;
				}

			}
		}
	}

	public void viewTicket() {
		TicketHistory history = TicketHistory.getInstance();
		history.show(dateFormat);
		scan.nextLine();
	}

	public User loginUser(String user) {
		String userID = "";
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
			System.out.print("input your email address [contain @ and ends with .com]: ");
			userEmail = scan.nextLine();
		} while (!(userEmail.contains("@") && userEmail.endsWith(".com")));
		do {
			System.out.print("input phone [must start with 08] : ");
			userPhone = scan.nextLine();
		} while (!userPhone.startsWith("08"));

		if (user.equals("Admin")) {
			userID = MF.idGeneratorAdmin();
		} else if (user.equals("Customer")) {
			userID = MF.idGeneratorCustomer();
		}

		System.out.println("\nLogin Successfull!!!");
		System.out.println("press enter to continue..");
		scan.nextLine();
		return new User(userID, username, userAddress, userEmail, userPhone);

	}


	

	public void adminMenu() {

		User admin = loginUser("Admin");
		System.out.println("Welcome Admin " + admin.getUsername() + " !!!!");
		int chooseMenu = 0;
		while (true) {
			MovieList list = MovieList.getInstance();
			list.show(dateFormat);
			System.out.println();
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
			}
			if (chooseMenu == 4) {
				break;
			}
		}

	}

	public void addMovie() {

		String movieName;
		String duration;
		String genre;
		String description;
		String releaseDate;
		Date date = null;
		String actorsName;
		MovieList list = MovieList.getInstance();
		System.out.println();
		System.out.println("------Add New Movie------");
		System.out.println("==========================");
		do {
			System.out.print("Enter Movie Name [Must be around 1 - 100 characters] : ");
			movieName = scan.nextLine();
		} while (movieName.length() < 1 && movieName.length() > 100);

		do {
			System.out.print("Duration of the Movie [60 | 120 | 180 | Minutes] : ");
			duration = scan.nextLine();
		} while (!(duration.equals("60") || duration.equals("120") || duration.equals("180")));

		do {
			System.out.print("Movie Genre [Horror | Fiction | Fantasy | Drama | Action]: : ");
			genre = scan.nextLine();
		} while (!(genre.equals("Horror") || genre.equals("Fiction") || genre.equals("Fantasy") || genre.equals("Drama")
				|| genre.equals("Action")));

		do {
			System.out.print("Movie Description [Must be around 1 - 100 characters] : ");
			description = scan.nextLine();
		} while ((description.length() < 1) && (description.length() > 100));

		boolean condition = true;
		do {
			System.out.print("Movie Release Date [Format : yyyy-MM-dd] : ");
			releaseDate = scan.nextLine();
			try {
				date = dateFormat.parse(releaseDate);
				condition = false;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				condition = true;
			}
		} while (condition);
		
		do {
			System.out.print("Movie Actors Name [Must be around 1 - 100 characters] : ");
			actorsName = scan.nextLine();
		} while ((actorsName.length() < 1) && (actorsName.length() > 100));

		String id = MF.idGeneratorMovie();

		MovieBuilder builder = new MovieBuilder();
		Movie movie = builder.reset().buildMovieID(id).buildMovieName(movieName).buildDuration(duration)
				.buildGenre(genre).buildDescription(description).buildReleaseDate(date)
				.buildActorsName(actorsName).build();
		list.add(movie);
	}

	public void removeMovie() {
		MovieList list = MovieList.getInstance();
		System.out.println("List Movies Available : ");
		System.out.println("------Remove Movie------");
		System.out.println("=========================");
		int number = 0;
		do {
			System.out.print("Choose number movie that you want to remove : ");
			number = scan.nextInt();
			scan.nextLine();
		} while (number < 0 || number > list.getMovieVector().size());
		list.remove(number);
	}

	public void editMovie() {

		String movieName;
		String duration;
		String genre;
		String description;
		String releaseDate;
		String actorsName;
		int number = 0;
		Date date = null;
		MovieList list = MovieList.getInstance();

		System.out.println("------Edit Movie------");
		System.out.println("=========================");
		do {
			System.out.print("Choose number movie that you want to edit : ");
			number = scan.nextInt();
			scan.nextLine();
		} while (number < 0 || number > list.getMovieVector().size());
		do {
			System.out.print("Edit Movie Name [Must be around 1 - 100 characters] : ");
			movieName = scan.nextLine();
		} while ((movieName.length() < 1) && (movieName.length() > 100));

		do {
			System.out.print("Edit Duration of the Movie [60 | 120 | 180 | Minutes] : ");
			duration = scan.nextLine();
		} while (!(duration.equals("60") || duration.equals("120") || duration.equals("180")));

		do {
			System.out.print("Movie Genre [Horror | Fiction | Fantasy | Drama | Action]: : ");
			genre = scan.nextLine();
		} while (!(genre.equals("Horror") || genre.equals("Fiction") || genre.equals("Fantasy") || genre.equals("Drama")
				|| genre.equals("Action")));

		do {
			System.out.print("Movie Description [Must be around 1 - 100 characters] : ");
			description = scan.nextLine();
		} while ((description.length() < 1) && (description.length() > 100));

		boolean condition = true;
		do {
			System.out.print("Movie Release Date [Format : yyyy-MM-dd] : ");
			releaseDate = scan.nextLine();
			try {
				date = dateFormat.parse(releaseDate);
				condition = false;
			} catch (ParseException e) {
				condition = true;
			}
		} while (condition);

		do {
			System.out.print("Movie Actors Name [Must be around 1 - 100 characters] : ");
			actorsName = scan.nextLine();
		} while ((actorsName.length() < 1) && (actorsName.length() > 100));

		list.getMovieVector().get(number - 1).setMovieName(movieName);
		list.getMovieVector().get(number - 1).setDuration(duration);
		list.getMovieVector().get(number - 1).setGenre(genre);
		list.getMovieVector().get(number - 1).setDescription(description);
		list.getMovieVector().get(number - 1).setReleaseDate(date);
		list.getMovieVector().get(number - 1).setActorsName(actorsName);

	}

	public Main() {
		int chooseMenuUtama = 0;
		while (true) {
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
	}

	public static void main(String[] args) {
		new Main();
	}

}
