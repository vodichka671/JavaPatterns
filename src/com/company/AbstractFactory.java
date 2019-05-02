package com.company;

public class AbstractFactory {
    public static void main(String[] args){
        RobotFactory factory = new ToshibaFactory();
        Head head = factory.getHead();
        Hand hand = factory.getHand();
        Legs legs = factory.getLegs();
        head.think();
        hand.grab();
        legs.goTo();
    }
}
interface Hand{
    void grab();
}
interface Head{
    void think();
}
interface Legs{
    void goTo();
}

interface RobotFactory{
    Hand getHand();
    Head getHead();
    Legs getLegs();
}

class SonyHand implements Hand{

    @Override
    public void grab() {
        System.out.println("Grab with Sony hand");
    }
}
class SonyHead implements Head{

    @Override
    public void think() {
        System.out.println("Think with Sony Head");
    }
}
class SonyLegs implements Legs{

    @Override
    public void goTo() {
        System.out.println("Go to Sony factory");
    }
}

class ToshibaHand implements Hand{

    @Override
    public void grab() {
        System.out.println("Grab with Toshiba hand");
    }
}
class ToshibaHead implements Head{

    @Override
    public void think() {
        System.out.println("Think with Toshiba Head");
    }
}
class ToshibaLegs implements Legs{

    @Override
    public void goTo() {
        System.out.println("Go to Toshiba factory");
    }
}

class SonyFactory implements RobotFactory{

    @Override
    public Hand getHand() {
        return new SonyHand();
    }

    @Override
    public Head getHead() {
        return new SonyHead();
    }

    @Override
    public Legs getLegs() {
        return new SonyLegs();
    }
}
class ToshibaFactory implements RobotFactory{

    @Override
    public Hand getHand() {
        return new ToshibaHand();
    }

    @Override
    public Head getHead() {
        return new ToshibaHead();
    }

    @Override
    public Legs getLegs() {
        return new ToshibaLegs();
    }
}
