package com.jensderond.States;


public abstract class State {

	public void create() {
		throw new UnsupportedOperationException();
	}

	public void update() {
		throw new UnsupportedOperationException();
	}

	public void checkPaymentStatus() {
		throw new UnsupportedOperationException();
	}

	public void payBooking() {
		throw new UnsupportedOperationException();
	}

	public void cancel() {
		throw new UnsupportedOperationException();
	}
}