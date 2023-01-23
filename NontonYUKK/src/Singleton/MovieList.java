package Singleton;

import java.text.SimpleDateFormat;
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
	  

	  
	  public void show(SimpleDateFormat dateFormat) {
		  System.out.println("");
		  System.out.println("===============================================================");
		  System.out.println("Movie List                                                     ");
		  System.out.println("===============================================================");
		  if(this.movieVector.isEmpty()) {
				System.out.println("No Movie is Airing Right Now!!!!");
				System.out.println("===============================================================");
		  }else {
				for(Movie movie : movieVector) {
					System.out.println("|id: " + movie.getMovieID());
					System.out.println("|judul: " +  movie.getMovieName());
					System.out.println("|tanggal: " + dateFormat.format(movie.getReleaseDate()));
					System.out.println("|durasi: " + movie.getDuration());
					System.out.println("|genre: " + movie.getGenre());
					System.out.println("|descripton: " +  movie.getDescription());
					System.out.println("|actors: " +  movie.getActorsName());
					System.out.println("+===============================================================+");
				}
				  System.out.println("");
		  }

		}

		public Vector<Movie> getMovieVector() {
			return movieVector;
		}

		public void remove(int number) {
			this.movieVector.remove(number-1);
		}
	  

	}

