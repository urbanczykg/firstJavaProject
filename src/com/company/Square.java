package com.company;

public class Square extends Figure implements Printable {
        public Double a;

    public Square(Double a) {
        this.a = a;
        if(a<0)
        {
            throw new RuntimeException("a should be bigger than null");
        }
    }

    public Double calculateArea()
        {
            Double o;
            o=4*a;
            return o;
        }
        public Double calculatePerimeter()
        {
            Double p;
            p=a*a;
            return p;

        }
        public void print()
        {
            System.out.println("a: " + a);
        }
}
