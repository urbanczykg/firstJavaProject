package com.company;

public class Circle extends Figure implements Printable {
    public double radius;
    public final double pi=3.14;

    public Circle(double radius) {
        this.radius = radius;
        if(radius<0)
        {
            throw new ArithmeticException("radius should be bigger than null");
        }
    }

    public Double calculateArea()
    {
        Double o;
        o=2*radius*pi;
        return o;
    }
    public Double calculatePerimeter()
    {
        Double p;
        p=radius*radius*pi;
        return p;
    }
    public void print()
    {
        System.out.println(" radius: " + radius);
    }

}
