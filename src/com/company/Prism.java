package com.company;

public class Prism extends Abst implements Printable {
    public Figure base;
    public Double height;


    public void print()
    {
        System.out.println("base: " + base);
        System.out.println ("height: " + height);

    }

    public Prism(Figure base, Double height) {
        this.base = base;
        this.height = height;
    }

    public Double calculatePerimeter()
    {
       Double p = 2*(base.calculatePerimeter()) + base.calculateArea()*height;
       return p;
    }
    public Double CalculateObj()
    {
        Double obj = base.calculatePerimeter() *height;
        return obj;
    }

}
