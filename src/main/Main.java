package main;

import java.util.Scanner;

import model.User;

public class Main {

	Scanner scan = new Scanner(System.in);

	public Main() {
		int chooseMenuUtama = 0;
		menuUtama();
		do {
			chooseMenuUtama = scan.nextInt();
			scan.nextLine();
		} while (chooseMenuUtama < 1 || chooseMenuUtama > 3);
		switch (chooseMenuUtama) {
		case 1:
			userMenu();
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

	public void menuUtama() {
		System.out.println("Welcome to NontonYuk App");
		System.out.println("=========================");
		System.out.println("LOGIN AS");
		System.out.println("1. User");
		System.out.println("2. Admin");
		System.out.println("3. Exit");
		System.out.print(">> ");
	}

	public void userMenu() {
		User user = loginUser();
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

				break;
			case 3:

				break;
			case 4:
				return;
			}
		}

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

	public void adminMenu() {

	}

	public User loginUser() {
		String userID;
		String username;
		String userAddress;
		String userEmail;
		String userPhone;
		System.out.println("LOGIN AS USER");
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

		userID = idGenerator("US");

		System.out.println("\nLogin Successfull!!!");
		System.out.println("press enter to continue..");
		scan.nextLine();
		return new User(userID, username, userAddress, userEmail, userPhone);

	}

	public String idGenerator(String idSTring) {
		String id = "";
		int count = 0;
		int num1 = count / 100;
		int num2 = count / 10 - num1 * 10;
		int num3 = count % 10;
		id = idSTring + num1 + num2 + num3;
		count++;
		return id;
	}

}
