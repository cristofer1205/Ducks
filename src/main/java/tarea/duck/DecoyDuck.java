package tarea.duck;

import fly.behavior.FlyNoWay;
import quack.behavior.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a real decoy duck");
    }
}
