package com.jensderond;


public abstract class State {

	void create() {
		throw new UnsupportedOperationException();
	}

	void update() {
		throw new UnsupportedOperationException();
	}

	void payBooking() {
		throw new UnsupportedOperationException();
	}

	void cancel() {
		throw new UnsupportedOperationException();
	}
}