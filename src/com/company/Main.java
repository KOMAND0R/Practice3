package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Shape s1 = new Circle(5.5, "Red", false);
        System.out.println(s1.toString());

        Circle c1 = new Circle(4.0, "Orange", true);
        System.out.println(c1.toString());

        Rectangle r1 = new Rectangle(3.0, 2.0, "Blue", false);
        System.out.println(r1.toString());

        Square sq1 = new Square();
        System.out.println(sq1.toString());
    }
}
