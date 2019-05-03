package com.company;

public class Builder {
    public static void main(String[] args){
    CarBuildeDirector director = new CarBuildeDirector(new CarBuilderImpl());
        System.out.println(director.construct().toString());
    }
}
class Car{
    String model;
    String number;

    public Car() {
        model = "Ford Mondeo";
        number = "AA88012HM";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car [model = " + model + ", number = " + number + "]";
    }
}

interface CarBuilder {
    Car build();
    CarBuilder setModel(String model);
    CarBuilder setNumber(String number);
}

class CarBuilderImpl implements CarBuilder{
    Car carTemp = new Car();
    @Override
    public Car build() {
       Car car = new Car();
       car.setModel(carTemp.getModel());
       car.setNumber(carTemp.getNumber());
       return car;
    }

    @Override
    public CarBuilder setModel(String model) {
      this.carTemp.setModel(model);
      return this;

    }

    @Override
    public CarBuilder setNumber(String number) {
        this.carTemp.setNumber(number);
        return this;
    }
}

class CarBuildeDirector{
    CarBuilder builder = new CarBuilderImpl();
    CarBuildeDirector(CarBuilder builder){
        this.builder = builder;
    }
    Car construct(){
        return builder.setModel("Name").setNumber("123").build();
    }
}
