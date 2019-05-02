package com.company;

import java.util.Date;

public class FactoryMethod {
    public static void main(String[] args){
        WatchMaker maker = new DigitalWatchMaker();
        Watch concreteWatch = maker.createWatch();
        concreteWatch.showTime();
    }
}
interface Watch{
    void showTime();
}
class DigitalWatch implements  Watch{

    @Override
    public void showTime() {
        System.out.println(new Date());
    }
}
class RomeWatch implements Watch{

    @Override
    public void showTime() {
        System.out.println("Rome Watch time");
    }
}
interface WatchMaker{
    Watch createWatch();
}
class DigitalWatchMaker implements  WatchMaker{

    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
class RomeWatchMaker implements WatchMaker{

    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}
