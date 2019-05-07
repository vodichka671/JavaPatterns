package com.company;

public class Decorator {
    public static void main(String[] args){
        PrinterInterface intr = new QuotesDecoratorLeft(new QuotesDecoratorRight(new Printer("Hello")));
        intr.print();
    }
}
interface PrinterInterface{
    void print();
}

class Printer implements PrinterInterface{
    String value;
    public Printer(String value) {
        this.value = value;
    }
    @Override
    public void print() {
        System.out.print(this.value);
    }
}

abstract class AbstractDecorator implements PrinterInterface {
    PrinterInterface printer;

    public AbstractDecorator(PrinterInterface printer) {
        this.printer = printer;
    }

    @Override
    public void print() {
        printer.print();
    }
}

class QuotesDecoratorLeft extends AbstractDecorator{
    public QuotesDecoratorLeft(PrinterInterface printer) {
        super(printer);
    }

    @Override
    public void print() {
        System.out.print("\"");
        super.print();
    }
}

class QuotesDecoratorRight extends AbstractDecorator{

    public QuotesDecoratorRight(PrinterInterface printer) {
        super(printer);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("\"");
    }
}