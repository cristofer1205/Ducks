package tarea.duck;

import fly.behavior.FlyNoWay;
import quack.behavior.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a real rubberduck");
    }
}
