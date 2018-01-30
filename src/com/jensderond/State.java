package com.jensderond;

public interface State {

	void create();

	void update();

	void paybooking();

	void cancel();
}