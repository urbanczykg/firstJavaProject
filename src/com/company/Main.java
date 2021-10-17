package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String choice ="elo";
        Scanner scanner = new Scanner(System.in);

Integer end=0;

        do {

            System.out.println(" Please choose figure");
            choice= scanner.nextLine();
                switch (choice) {
                    case "Triangle":
                        Triangle triangle;
                        System.out.println("Please enter height :");
                        Double height1 = scanner.nextDouble();
                        System.out.println("Please enter side a");
                        Double a1 = scanner.nextDouble();
                        System.out.println("Please enter side b");
                        Double b1 = scanner.nextDouble();
                        System.out.println("Please enter side c");
                        Double c1 = scanner.nextDouble();
                        triangle = new Triangle(height1, a1, b1, c1);
                        triangle.print();
                        System.out.println("Area of Triangle: " + triangle.calculateArea());
                        System.out.println("Perimeter :  " + triangle.calculatePerimeter());
                        break;
                    case "Square":
                        Square square;
                        System.out.println("Please enter side a. ");
                        Double a = scanner.nextDouble();
                        square = new Square(a);
                        square.print();
                        System.out.println("Area of Square: " + square.calculateArea());
                        System.out.println("Perimeter :  " + square.calculatePerimeter());
                        break;
                    case "Circle":
                        Circle circle;
                        System.out.println("Please enter the radius");
                        Double radius = scanner.nextDouble();
                        circle = new Circle(radius);
                        circle.print();
                        System.out.println("Area of Circle: " + circle.calculateArea() );
                        System.out.println(" Perimeter: " + circle.calculatePerimeter());

                        break;
                    case "Prism":
                        System.out.println("please enter the base");
                        String base1 = scanner.nextLine();

                        switch(base1){
                            case "Triangle":
                                Triangle triangle1;
                                System.out.println("Please enter height :");
                                Double height2 = scanner.nextDouble();
                                System.out.println("Please enter side a");
                                Double a2 = scanner.nextDouble();
                                System.out.println("Please enter side b");
                                Double b2 = scanner.nextDouble();
                                System.out.println("Please enter side c");
                                Double c2 = scanner.nextDouble();
                                triangle1 = new Triangle(height2, a2, b2, c2);

                                System.out.println("please enter height of Prism");
                                Double heightPrism = scanner.nextDouble();
                                Prism prism;

                                prism = new Prism(triangle1,heightPrism);
                                prism.print();
                                System.out.println("obj: " +prism.CalculateObj());
                                System.out.println("p: " + prism.calculatePerimeter());

                    break;
                            case "Circle":
                                Circle circle1;
                                System.out.println("Please enter the radius");
                                Double radius1 = scanner.nextDouble();
                                circle1 = new Circle(radius1);
                                System.out.println("please enter height of Prism");
                                Double heightPrism1 = scanner.nextDouble();
                                Prism prism1;

                                prism = new Prism(circle1, heightPrism1);
                                prism.print();
                                System.out.println("obj: " +prism.CalculateObj());
                                System.out.println("p: " + prism.calculatePerimeter());
                                break;
                            case "Square":
                                Square square1;
                                System.out.println("Please enter side a. ");
                                Double a3 = scanner.nextDouble();
                                square1 = new Square(a3);
                                System.out.println("please enter height of Prism");
                                Double heightPrism2 = scanner.nextDouble();
                                Prism prism2;


                                prism = new Prism(square1, heightPrism2);
                                prism.print();
                                System.out.println("obj: " +prism.CalculateObj());
                                System.out.println("p: " + prism.calculatePerimeter());
                        }
                    default:
                        System.out.println("Would you like to close program? please write y/n");
                        String MyChoice = scanner.nextLine();
                        if(MyChoice.equals("y")) {

                            end = 1;

                        }


                }
            }
        while(end==0);
        }
}
