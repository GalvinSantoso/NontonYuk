package Singleton;

import java.util.Vector;


import model.Movie;

public class MovieList {
	
	private Vector<Movie> movieVector = new Vector<>();
	
	  private MovieList() {
		  
	  }

	  private static MovieList instance = null;

	  public static MovieList getInstance() {
	    if (instance == null) {
	      instance = new MovieList();
	    }
	    return instance;
	  }
	  
	  public void add(Movie movie) {
		  movieVector.add(movie);
	  }
	  
//	  public void show() {
//		  if(movieVector.isEmpty()) {
//			  System.out.println("There's no Movie !");
//		  }
//		  for (Movie movie : movieVector) {
//			  String divider = "+===========================================================================================================================+";
//				String format = "| %-5s | %-35s | %-10s | %-11s | %-35s |\n";
//				System.out.println(divider);
//				System.out.printf(format, "ID", "Name", "Duration" ,"Date", "Genre", "Description");
//				System.out.println(divider);
//				String format2 = "| %-5s | %-15s | %-15s | %-10s |";
//				System.out.printf(format2, movie.getMovieName(), movie.getReleaseDate(), movie.getGenre(), movie.getDescription());
////				System.out.println(divider);
////				System.out.println(divider);
//		}
//	  }
	  
	  public void show() {
			for(Movie movie : movieVector) {
				System.out.println("+===============================================================+");
				System.out.println("|YourM                                                     |");
				System.out.println("|===============================================================|");
				System.out.printf("|id: %-55s|\n", movie.getMovieID());
				System.out.printf("|judul: %-55s|\n", movie.getMovieName());
				System.out.printf("|tanggal: %-54s|\n", movie.getReleaseDate());
				System.out.printf("|durasi: %-56s|\n", movie.getDuration());
				System.out.printf("|genre: %-56s|\n", movie.getGenre());
				System.out.printf("|descripton: %-54s|\n", movie.getDescription());
				System.out.println("+===============================================================+");
			}
		}

	}

