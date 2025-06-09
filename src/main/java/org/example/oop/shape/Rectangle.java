package org.example.oop.shape;

import java.awt.*;

public class Rectangle extends AbstractShape {
    private Point upperLeft;
    private Point bottomRight;

    public Point getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    public Rectangle(String id, String color, Point upperLeft, Point bottomRight) {
        super(id, color);
        this.upperLeft = upperLeft;
        this.bottomRight = bottomRight;
    }

    @Override
    public double getArea() {
        return (bottomRight.x - upperLeft.x) * (upperLeft.y - bottomRight.y);
    }

    @Override
    public double getPerimeter() {
        return 2.0 * ((bottomRight.x - upperLeft.x) + (upperLeft.y - bottomRight.y));
    }

    @Override
    public void move(Point point) {
        upperLeft.translate(point.x, point.y);
        bottomRight.translate(point.x, point.y);
    }

    @Override
    public void resize(double factor) {
        double newX = upperLeft.x + ((bottomRight.x - upperLeft.x) * factor);
        double newY = upperLeft.y - ((upperLeft.y - bottomRight.y) * factor);
        bottomRight.setLocation(newX, newY);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "upperLeft=" + upperLeft +
                ", bottomRight=" + bottomRight +
                ", id='" + id + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
