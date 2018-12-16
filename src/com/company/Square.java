package com.company;

public class Square extends Rectangle
{
    public Square()
    {
        this.width = 1;
        this.length = 1;
        this.color = "White";
        this.filled = false;
    }
    public Square(double s)
    {
        this.width = s;
        this.length = s;
        this.color = "White";
        this.filled = false;
    }
    public Square(double s, String c, boolean f)
    {
        this.width = s;
        this.length = s;
        this.color = c;
        this.filled = f;
    }

    public void setSide(double side)
    {
        super.setLength(length);
        super.setWidth(width);
    }
    public void setWidth(double width)
    {
        super.setWidth(width);
    }
    public void setLength(double length)
    {
        super.setLength(length);
    }
    public double getSide()
    {
        return super.getWidth();
    }

    public String toString()
    {
        String s = "Сторона: " + length + "\n";
        s += "Площадь: " + getArea() + "\n";
        s += "Периметр: " + getPerimeter() + "\n";
        s += "Цвет круга: " + color + "\n";
        s += "Заполненность: " + filled + "\n";
        return s;
    }
}
