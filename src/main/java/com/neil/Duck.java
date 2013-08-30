package com.neil;

import com.neil.businesslogic.FlyBehavior;
import com.neil.businesslogic.QuackBehavior;

public abstract class Duck {
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;

	public Duck() {
	}

	public abstract void display();

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
}