package com.neil.resource;

import com.neil.Duck;
import com.neil.MallardDuck;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
	}
}