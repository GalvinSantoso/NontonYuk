package Builder;

import java.sql.Date;

import model.Movie;

public class MovieBuilder implements MovieInterface {

	private Movie movie;

	@Override
	public MovieInterface reset() {
		movie = new Movie();
		return this;
	}

	@Override
	public MovieInterface buildMovieID(String movieID) {
		movie.setMovieID(movieID);
		return this;
	}

	@Override
	public MovieInterface buildMovieName(String movieName) {
		movie.setMovieID(movieName);
		return this;
	}

	@Override
	public MovieInterface buildDuration(String duration) {
		movie.setDuration(duration);
		return this;
	}

	@Override
	public MovieInterface buildGenre(String genre) {
		movie.setGenre(genre);
		return this;
	}

	@Override
	public MovieInterface buildDescription(String description) {
		movie.setDescription(description);
		return this;
	}

	@Override
	public MovieInterface buildReleaseDate(String releaseDate) {
		movie.setReleaseDate(releaseDate);
		return this;
	}

	@Override
	public MovieInterface buildActorsName(String actorsName) {
		movie.setActorsName(actorsName);
		return this;
	}

	@Override
	public Movie build() {
		return movie;
	}
	
}
