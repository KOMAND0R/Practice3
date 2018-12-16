package com.company;

public class Rectangle extends Shape
{
    protected double width;
    protected double length;

    public Rectangle()
    {
        this.width = 1;
        this.length = 1;
        this.color = "White";
        this.filled = false;
    }
    public Rectangle(double w, double l)
    {
        this.width = w;
        this.length = l;
        this.color = "White";
        this.filled = false;
    }
    public Rectangle(double w, double l, String c, boolean f)
    {
        this.width = w;
        this.length = l;
        this.color = c;
        this.filled = f;
    }

    public void setWidth(double w)
    {
        this.width = w;
    }
    public void setLength(double l)
    {
        this.length = l;
    }
    public double getWidth()
    {
        return width;
    }
    public double getLength()
    {
        return length;
    }

    public double getArea()
    {
        return width*length;
    }
    public double getPerimeter()
    {
        return 2*(width+length);
    }
    public String toString()
    {
        String s = "Длина: " + length + "\n";
        s += "Ширина: " + width + "\n";
        s += "Площадь: " + getArea() + "\n";
        s += "Периметр: " + getPerimeter() + "\n";
        s += "Цвет круга: " + color + "\n";
        s += "Заполненность: " + filled + "\n";
        return s;
    }
}
