package com.company;

import sun.security.provider.SHA;

import java.util.ArrayList;
import java.util.List;

public class Composite {
    public static void main(String[] args){
        CompositeReal composite = new CompositeReal();
        CompositeReal composite2 = new CompositeReal();

        composite.addComponent(new Trianglle());
        composite.addComponent(new Squarre());

        composite2.addComponent(new Circle());

        composite.addComponent(composite2);
        //composite2.addComponent(composite);
        composite.draw();
    }
}

    interface Shape {
        void draw();
    }

    class Circle implements Shape {
        @Override
        public void draw() {
            System.out.println("I am Circle");
        }
    }
    class Squarre implements Shape {
        @Override
        public void draw() {
            System.out.println("I am Square");
        }
    }

    class Trianglle implements Shape {
        @Override
        public void draw() {
            System.out.println("I am Triangle");
        }
    }

    class CompositeReal implements Shape{
        List<Shape> components = new ArrayList<>();
        void addComponent(Shape component) {
            this.components.add(component);
        }

        void removeComponent(Shape component){
            this.components.remove(component);
        }
        @Override
        public void draw() {
            this.components.forEach(Shape::draw);
        }
    }
