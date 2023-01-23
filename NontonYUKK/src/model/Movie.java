package model;

import java.util.Date;

public class Movie {
	
	private String movieID;
	private String movieName;
	private String duration;
	private String genre;
	private String description;
	private Date releaseDate;
	private String actorsName;
	
	

	
	public Movie() {
		
	}
	
	public String getMovieID() {
		return movieID;
	}
	public void setMovieID(String movieID) {
		this.movieID = movieID;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getActorsName() {
		return actorsName;
	}
	public void setActorsName(String actorsName) {
		this.actorsName = actorsName;
	}
	
	

}
