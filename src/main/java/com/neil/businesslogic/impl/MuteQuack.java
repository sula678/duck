package com.neil.businesslogic.impl;

import com.neil.businesslogic.QuackBehavior;

public class MuteQuack implements QuackBehavior {

	public void quack() {
		System.out.println("<< Silence >>");
	}

}
