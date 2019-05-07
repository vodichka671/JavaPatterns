package com.company;

public class Bridge {
    public static void main(String[] args){

    }
    interface Device{
        void volumeUp();
        void volumeDown();
        void powrOn();
        void powerOff();
    }
    class Radio implements Device{

        @Override
        public void volumeUp() {
            System.out.println("Radio volume up");
        }

        @Override
        public void volumeDown() {
            System.out.println("Radio volume down");
        }

        @Override
        public void powrOn() {
            System.out.println("Radio power on");
        }

        @Override
        public void powerOff() {
            System.out.println("Radio power off");
        }
    }
    class TV implements Device{
        @Override
        public void volumeUp() {
            System.out.println("Tv volume up");
        }

        @Override
        public void volumeDown() {
            System.out.println("Tv volume down");
        }

        @Override
        public void powrOn() {
            System.out.println("Tv power on");
        }

        @Override
        public void powerOff() {
            System.out.println("Tv power off");
        }
    }

    class Remote{
        Device device;
        void togglePowerOn(){
            device.powrOn();
        }
        void togglePowerOff(){
            device.powerOff();
        }
        void toggleVolumeUp(){
            device.volumeUp();
        }
        void toggleVolumeDown(){
            device.volumeDown();
        }
    }
}
