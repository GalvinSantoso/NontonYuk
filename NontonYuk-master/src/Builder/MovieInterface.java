package Builder;

import model.Movie;

public interface MovieInterface {
	
	    public MovieInterface reset();
	    public MovieInterface buildMovieID(String movieID);
	    public MovieInterface buildMovieName(String movieName);
	    public MovieInterface buildDuration(String duration);
	    public MovieInterface buildGenre(String genre);
	    public MovieInterface buildDescription(String description);
	    public MovieInterface buildReleaseDate(String releaseDate);
	    public MovieInterface buildActorsName(String actorsName);
	    public Movie build();

	    
}
