package com.jensderond;

public interface State {

	void get();

	void update();

	void rollback();

}