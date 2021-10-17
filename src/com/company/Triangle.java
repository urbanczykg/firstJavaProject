package com.company;

public class Triangle extends Figure implements Printable {

   public Double height;
   public Double a;
   public Double b;
   public Double c;

    public Triangle(Double height, Double a, Double b, Double c) {
        this.height = height;
        this.a = a;
        this.b = b;
        this.c = c;
        if(a>(b+c) || b>(a+c) || c>(b+a) )
        {
            throw new RuntimeException("all of side should be bigger than sum of previous ones");
        }
        if(a<0 || b<0 || c<0)
        {
            throw new RuntimeException("a,b,c should be bigger than null");
        }
    }

    public Double calculateArea()
    {
        Double o;
        o=a+b+c;
        return o;
    }
    public Double calculatePerimeter()
    {
        Double p;
        Double z=(a+b+c)/2;
        p=Math.sqrt(z*(z-a)*(z-b)*(z-c));
        return p;
    }
    public void print()
    {
        System.out.println("height: " + height);
        System.out.println("a: " + a);
        System.out.println("b: "+ b);
        System.out.println("c: " + c);
    }
}
