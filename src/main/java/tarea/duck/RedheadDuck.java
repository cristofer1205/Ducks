package tarea.duck;


import fly.behavior.FlyWithWings;
import quack.behavior.Quack;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real redhead duck");
    }
}
