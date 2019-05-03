package com.company;

public class Prototype {
    public static void main(String[] args){
        Human h = new Human(18,"Artem");
        try {
            Human h1 = (Human) h.clone();
            System.out.println(h +"\n" +h1);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
class Human implements Cloneable{
    int age;
    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
     return "Human [age = " + age + ", name = " + name + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Human(this.age,this.name);
    }
}
