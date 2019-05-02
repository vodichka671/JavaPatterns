package com.company;

public class Facade {

    public static void main(String[] args){
        Computer computer = new Computer(new Power(),new HDD(), new DVDRom());
        computer.copy();
    }
}

class Computer {
    Power power;
    HDD hdd;
    DVDRom dvd;


    public Computer(Power power, HDD hdd, DVDRom dvd) {
        this.power = power;
        this.hdd = hdd;
        this.dvd = dvd;
    }
    void copy (){
        power.powerOn();
        dvd.loadDisc();
        dvd.unloadDisc();
        hdd.copyFromDisc(dvd);
    }

}
class Power{
    void powerOn(){
        System.out.println("Power on");
    }
    void powerOff(){
        System.out.println("Power off");
    }
}
class DVDRom{
    public boolean flag = false;
    boolean loadDisc(){
        return flag = true;
    }
    boolean unloadDisc(){
        return flag = false;
    }

}
class HDD {
    void copyFromDisc(DVDRom rom){
        if (rom.flag){
            System.out.println("Copy from disc");
        }
        else {
            System.out.println("No disc inside DVDrom");
        }
    }

}
