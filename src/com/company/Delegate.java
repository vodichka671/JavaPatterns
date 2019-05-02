package com.company;

public class Delegate {

    public static void main(String[] args) {
	Painter painter = new Painter();
	painter.setFigure(new Square());
	painter.draw();
    }
}
interface DrawerFigure {
    void draw();
}

class Triangle implements DrawerFigure {

    @Override
    public void draw() {
        System.out.println("Triangle");
    }
}
class Square implements DrawerFigure {

    @Override
    public void draw() {
        System.out.println("Square");
    }
}

class Painter{
    DrawerFigure figure ;

    public void setFigure(DrawerFigure figure) {
        this.figure = figure;
    }

    void draw(){
        figure.draw();
    }
}
