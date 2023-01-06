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
		User customer = loginUser("Customer");
		System.out.println("Welcome " + customer.getUsername() + " !!!!");
		int chooseMenu = 0;
		while (true) {
			MovieList list = MovieList.getInstance();
			list.show();
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
		
	}
	
	public void viewTicket() {

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
			System.out.print("input your email address [contain @ & .]: ");
			userEmail = scan.nextLine();
		} while (!(userEmail.contains("@") && userEmail.contains(".")));
		do {
			System.out.print("input phone [must start with 08] : ");
			userPhone = scan.nextLine();
		} while (!userPhone.startsWith("08"));
		
		if(user.equals("Admin")) {
			userID = idGenerator("AD");
		}
		else if(user.equals("Customer")) {
			userID = idGenerator("CU");
		}

		System.out.println("\nLogin Successfull!!!");
		System.out.println("press enter to continue..");
		scan.nextLine();
		return new User(userID, username, userAddress, userEmail, userPhone);
		
	}

		
	public String idGenerator(String idString) {
		String id="";
		int count = 0;
		int num1 = count/100;
		int num2 = count/10 - num1*10;
		int num3 = count%10;
		id = idString +num1+num2+num3;
		count++;
		return id;
	}
	
	
	public void adminMenu() {

		User admin = loginUser("Admin");
		System.out.println("Welcome Admin " + admin.getUsername() + " !!!!");
		System.out.println();
		int chooseMenu = 0;
		while (true) {
			MovieList list = MovieList.getInstance();
			list.show();
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
		MovieList list = MovieList.getInstance();
		
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
		
			
		String id = idGenerator("MO");
		
		MovieBuilder builder = new MovieBuilder();
		Movie movie = builder.reset().buildMovieID(id).buildMovieName(movieName).buildDuration(duration).buildGenre(genre).buildDescription(description).buildReleaseDate(releaseDate).buildActorsName(actorsName).build();
		list.add(movie);
	}
	
	public void removeMovie(){
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
		} while (!(genre.equals("Horror") || genre.equals("Fiction") || genre.equals("Fantasy") || genre.equals("Drama") || genre.equals("Action")));
		
		do {
			System.out.print("Movie Description [Must be around 1 - 100 characters] : ");
			description = scan.nextLine();
		} while ((description.length() < 1) && (description.length() > 100));
		
		do {
			System.out.print("Movie Release Date [Must be around 1 - 100 characters] : ");
			releaseDate = scan.nextLine();
		} while (releaseDate.length() < 1 && releaseDate.length() > 100);
		
		do {
			System.out.print("Movie Actors Name [Must be around 1 - 100 characters] : ");
			actorsName = scan.nextLine();
		} while ((actorsName.length() < 1) && (actorsName.length() > 100));	
		
		list.getMovieVector().get(number-1).setMovieName(movieName);
		list.getMovieVector().get(number-1).setDuration(duration);
		list.getMovieVector().get(number-1).setGenre(genre);
		list.getMovieVector().get(number-1).setDescription(description);
		list.getMovieVector().get(number-1).setReleaseDate(releaseDate);
		list.getMovieVector().get(number-1).setActorsName(actorsName);
		
		
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

