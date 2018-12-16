package com.company;

public abstract class Shape
{
    protected String color;
    protected boolean filled;

    public Shape()
    {
        this.color = "White";
        this.filled = false;
    }
    public Shape(String c, boolean f)
    {
        this.color = c;
        this.filled = f;
    }

    public void setColor(String c)
    {
        this.color = c;
    }
    public void setFilled(boolean f)
    {
        this.filled = f;
    }

    public String getColor()
    {
        return color;
    }
    public boolean getFilled()
    {
        return filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
