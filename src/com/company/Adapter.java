package com.company;

public class Adapter {
    public static void main(String[] args){

    }
}
interface  VectorGraphics{
    void drawLine();
    void drawSquare();
}

class RasterGraphics{
    void drawWierdLine(){
        System.out.println("draw woerd line");
    }
    void drawWierdSquare(){
        System.out.println("draw wierd square");
    }

}

class AdapterRaster extends RasterGraphics implements VectorGraphics{

    @Override
    public void drawLine() {
        drawWierdLine();
    }

    @Override
    public void drawSquare() {
        drawWierdSquare();
    }
}

class AdapterRaster2 implements VectorGraphics{
    RasterGraphics graphics = new RasterGraphics();
    @Override
    public void drawLine() {
        graphics.drawWierdLine();
    }

    @Override
    public void drawSquare() {
        graphics.drawWierdSquare();
    }
}