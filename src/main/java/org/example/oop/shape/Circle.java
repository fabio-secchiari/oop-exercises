package org.example.oop.shape;

import java.awt.*;

public class Circle extends AbstractShape {
    private Point center;
    private double radius;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String id, String color, Point point, double radius) {
        super(id, color);
        center = point;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return radius*2*Math.PI;
    }

    @Override
    public void move(Point movement) {
        center.translate(movement.x, movement.y);
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                ", id='" + id + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
