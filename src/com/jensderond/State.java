package com.jensderond;

public interface State {

	void create();

	void update();

	void payBooking();

	void cancel();
}