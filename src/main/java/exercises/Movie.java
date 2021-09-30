package exercises;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movie_details")
public class Movie {

	@Id
	@Column(name="id")
	private String movieId;
	@Column(name="name")
	private String movieName;
	
	private String language;
	private Integer releasedIN;
	private Integer revenueInDollars;

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Integer getReleasedIN() {
		return releasedIN;
	}

	public void setReleasedIN(Integer releasedIN) {
		this.releasedIN = releasedIN;
	}

	public Integer getRevenueInDollars() {
		return revenueInDollars;
	}

	public void setRevenueInDollars(Integer revenueInDollars) {
		this.revenueInDollars = revenueInDollars;
	}

}
