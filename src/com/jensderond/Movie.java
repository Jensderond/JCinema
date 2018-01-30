package com.jensderond;

public class Movie {

	private String name;
	private int price;
	private String description;

	public Movie(String name, int price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public void getCinimaRoom() {
		// TODO - implement Movie.getCinimaRoom
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}