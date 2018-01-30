package com.jensderond;

public class Ticket {

	private static int i = 1;
	private int id;
	private Movie movie;

	public Ticket(Movie movie) {
		this.id = i++;
		this.movie = movie;
	}
	public int getId() {
		return id;
	}

	public Movie getMovie() {
		return this.movie;
	}

}