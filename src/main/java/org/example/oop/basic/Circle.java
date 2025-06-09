package org.example.oop.basic;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Setter
@Getter
public class Circle {
    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getPerimeter(){
        return radius * Math.PI * 2;
    }

    public boolean contains(Point point){
        return Point.distance(center.x, center.y, point.x, point.y) < radius;
    }

    public void translate(int dx, int dy){
        setCenter(new Point(this.center.x + dx, this.center.y + dy));
    }
}
