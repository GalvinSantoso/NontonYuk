package model;

import java.sql.Date;

public class Movie {
	
	private String movieID;
	private String movieName;
	private String duration;
	private String genre;
	private String description;
	private String releaseDate;
	private String actorsName;
	
	
//	public Movie(String movieID, String movieName, String duration, String genre, String description, String releaseDate,
//			String actorsName) {
//		super();
//		this.movieID = movieID;
//		this.movieName = movieName;
//		this.duration = duration;
//		this.genre = genre;
//		this.description = description;
//		this.releaseDate = releaseDate;
//		this.actorsName = actorsName;
//	}
	
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
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getActorsName() {
		return actorsName;
	}
	public void setActorsName(String actorsName) {
		this.actorsName = actorsName;
	}
	
	

}
