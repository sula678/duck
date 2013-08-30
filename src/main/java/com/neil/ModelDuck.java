package com.neil;

import com.neil.businesslogic.impl.FlyNoWay;
import com.neil.businesslogic.impl.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
	    flyBehavior = new FlyNoWay();
	    quackBehavior = new Quack();		
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
