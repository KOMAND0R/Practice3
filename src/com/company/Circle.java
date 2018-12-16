package com.company;

public class Circle extends Shape
{
    protected double radius;

    Circle()
    {
        this.radius = 1;
        this.color = "White";
        this.filled = false;
    }
    Circle(double r)
    {
        this.radius = r;
        this.color = "White";
        this.filled = false;
    }
    Circle(double r, String c, boolean f)
    {
        this.radius = r;
        this.color = c;
        this.filled = f;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public double getRadius()
    {
        return radius;
    }

    public double getArea()
    {
        return 3.14*radius*radius;
    }
    public double getPerimeter()
    {
        return 6.28*radius;
    }
    public String toString()
    {
        String s = "Радиус кргуа: " + radius + "\n";
        s += "Площадь: " + getArea() + "\n";
        s += "Периметр: " + getPerimeter() + "\n";
        s += "Цвет круга: " + color + "\n";
        s += "Заполненность: " + filled + "\n";
        return s;
    }
}
