package com.neil.resource;

import com.neil.Duck;
import com.neil.MallardDuck;
import com.neil.ModelDuck;
import com.neil.businesslogic.impl.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
	Duck mallardDuck = new MallardDuck();
	mallardDuck.performQuack();
	mallardDuck.performFly();
	mallardDuck.swim();
	mallardDuck.display();

	System.out.println("========\n========");
	
	Duck modelDuck = new ModelDuck();
	modelDuck.performFly();
	modelDuck.setFlyBehavior(new FlyRocketPowered());
	modelDuck.performFly();
    }
}