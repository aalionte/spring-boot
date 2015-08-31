package com.endava.movie.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "demo_movies")
public class Movie implements Serializable {

	private static final long serialVersionUID = 4333221327481526569L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@SequenceGenerator(name = "demo_movies_id_seq", sequenceName = "demo_movies_id_seq", allocationSize = 1)
	private Long id;

	@Column(name = "movie_title", nullable = false)
	private String title;

	@Column(name = "movie_release_date", nullable = false)
	private Date releaseDate;

	@Column(name = "movie_rating", nullable = false)
	private double rating;

	@Column(name = "movie_imdb_link", nullable = false)
	private String imdbLink;

	protected Movie() {
	}

	public Movie(String title, Date releaseDate, int rating, String imdbLink) {
		this.title = title;
		this.releaseDate = releaseDate;
		this.rating = rating;
		this.imdbLink = imdbLink;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getImdbLink() {
		return imdbLink;
	}

	public void setImdbLink(String imdbLink) {
		this.imdbLink = imdbLink;
	}
}
