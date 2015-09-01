package com.endava.movie.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name = "demo_actors")
public class Actor implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@SequenceGenerator(name = "demo_actors_id_seq", sequenceName = "demo_actors_id_seq", allocationSize = 1)
	private Long id;

	@Column(name="actor name")
	private String name;
	
	@Column(name="actor_bio")
	private String biography;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name="dream_movies_actors", joinColumns=@JoinColumn(name="id_actor"))
	private List<Movie> movies = new ArrayList<Movie>(0);

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}

	public List<Movie> getMovies() {
		return this.movies;
	}

}
