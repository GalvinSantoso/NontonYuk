package Singleton;

import java.util.Vector;

import model.Movie;

public class movieList {
	
	private Vector<Movie> movieVector = new Vector<>();
	
	  private movieList() {
		  
	  }

	  private static movieList instance = null;

	  public static movieList getInstance() {
	    if (instance == null) {
	      instance = new movieList();
	    }
	    return instance;
	  }
	  
	  public void add(Movie movie) {
		  movieVector.add(movie);
	  }
	  
	  public void show() {
		  if(movieVector.isEmpty()) {
			  System.out.println("There's no Movie !");
		  }
		  for (Movie movie : movieVector) {
			  String divider = "+===========================================================================================================================+";
				String format = "| %-5s | %-35s | %-10s | %-11s | %-35s |\n";
				System.out.println(divider);
				System.out.printf(format, "ID", "Name", "Date", "Genre", "Description");
				System.out.println(divider);
				String format2 = "| %-5s | %-35s | %-10s | %-10s |";
				System.out.printf(format2, movie.getMovieID(), movie.getMovieName(), movie.getReleaseDate(), movie.getGenre(), movie.getDescription());
				System.out.println(divider);
				System.out.println(divider);
		}
	  }

	}

